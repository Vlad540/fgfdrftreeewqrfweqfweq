package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: rd  reason: default package */
public final class rd implements em6 {
    public static final Pattern d = Pattern.compile("^bytes \\*/([0-9]+)");
    public static final Pattern e = Pattern.compile(".*filename=\".*\\.(\\w+)\".*");
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final t97 b;
    public final zpe c;

    public rd(t97 t97, zpe zpe) {
        this.b = t97;
        this.c = zpe;
    }

    public static boolean d(rd rdVar, xbc xbc, long j) {
        rdVar.getClass();
        if (xbc.o != 416) {
            return false;
        }
        String a2 = xbc.Y.a("Content-Range");
        if (a2 == null) {
            a2 = null;
        }
        if (a2 == null) {
            return false;
        }
        Matcher matcher = d.matcher(a2);
        return matcher.find() && ((long) Integer.parseInt(matcher.group(1))) == j;
    }

    public static File e(rd rdVar, File file, File file2, String str) {
        File file3;
        rdVar.getClass();
        try {
            if (!r1g.p(str)) {
                String name = file2.getName();
                int e0 = h0e.e0(name, '.', 0, 6);
                if (e0 >= 0) {
                    name = name.substring(0, e0);
                }
                file2 = new File(file2.getParentFile(), name + "." + str);
            }
            file3 = zl3.g(file2.getParentFile(), file2.getName());
            try {
                ete.r(file, file3);
                file.delete();
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e = e3;
            file3 = null;
            udd.s("rd", e.getMessage(), (Throwable) null);
            return file3;
        }
        return file3;
    }

    public static String f(rd rdVar, xbc xbc) {
        rdVar.getClass();
        String a2 = xbc.Y.a("Content-Disposition");
        if (a2 == null) {
            a2 = null;
        }
        if (r1g.p(a2)) {
            return null;
        }
        Matcher matcher = e.matcher(a2);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public static void g(rd rdVar, qd qdVar, String str) {
        rdVar.getClass();
        synchronized (qdVar.a) {
            qdVar.a.clear();
        }
        rdVar.a.remove(str);
    }

    public static void h(rd rdVar, qd qdVar, File file) {
        rdVar.getClass();
        file.delete();
        synchronized (qdVar.a) {
            try {
                Iterator it = qdVar.a.iterator();
                while (it.hasNext()) {
                    ((bm6) it.next()).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static File i(File file, String str) {
        String parent = file.getParent();
        return new File(parent, file.getName() + "_part_" + str);
    }

    public final void a(File file, String str) {
        qd qdVar = (qd) this.a.get(i(file, str).getAbsolutePath());
        if (qdVar != null) {
            qdVar.b.d();
            synchronized (qdVar.a) {
                try {
                    Iterator it = qdVar.a.iterator();
                    while (it.hasNext()) {
                        ((bm6) it.next()).d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [nn1, pd, java.lang.Object] */
    public final boolean b(String str, File file, bm6 bm6, String str2) {
        udd.p("rd", "downloadFile url = %s", new Object[]{str});
        File i = i(file, str2);
        if (this.a.containsKey(i.getAbsolutePath())) {
            qd qdVar = (qd) this.a.get(i.getAbsolutePath());
            if (qdVar != null) {
                synchronized (qdVar.a) {
                    int i2 = 0;
                    while (i2 < qdVar.a.size()) {
                        try {
                            if (((bm6) qdVar.a.get(i2)).getDownloadContext().equals(bm6.getDownloadContext())) {
                                udd.q("rd", "file already downloading in listener context, do nothing return false");
                                return false;
                            }
                            i2++;
                        } finally {
                        }
                    }
                    udd.q("rd", "file already downloading add listener and return true");
                    qdVar.a.add(bm6);
                }
            }
            return true;
        }
        try {
            s86 s86 = new s86();
            s86.q(str);
            s86.p(UUID.randomUUID().toString());
            if (i.exists() && i.length() > 0) {
                udd.q("rd", "resume download file, downloaded size: " + i.length());
                ((xe6) s86.c).f("Range", "bytes=" + i.length() + "-");
            }
            lac j = s86.j();
            y0c b2 = ((qw9) this.b.getValue()).b(j);
            qd qdVar2 = new qd(b2);
            synchronized (qdVar2.a) {
                qdVar2.a.add(bm6);
                this.a.put(i.getAbsolutePath(), qdVar2);
            }
            ? obj = new Object();
            obj.Y = this;
            obj.b = j;
            obj.c = qdVar2;
            obj.o = i;
            obj.X = file;
            obj.a = false;
            b2.e(obj);
            udd.q("rd", "start file download");
            return true;
        } catch (IllegalArgumentException unused) {
            bm6.a();
            i.delete();
            return false;
        }
    }

    public final void c(bm6 bm6) {
        if (bm6 != null) {
            for (qd qdVar : this.a.values()) {
                synchronized (qdVar.a) {
                    qdVar.a.remove(bm6);
                }
            }
        }
    }
}
