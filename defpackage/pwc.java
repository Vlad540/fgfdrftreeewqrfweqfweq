package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: pwc  reason: default package */
public final class pwc {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set d = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set e = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set f = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set g = Collections.newSetFromMap(new ConcurrentHashMap());
    public final ip h;
    public final jb5 i;
    public final otf j;
    public CharSequence k;
    public int l;
    public final CopyOnWriteArraySet m = new CopyOnWriteArraySet();

    public pwc(ip ipVar, jb5 jb5, otf otf) {
        this.h = ipVar;
        this.i = jb5;
        this.j = otf;
        if (((kp) ipVar).g.getBoolean("app.send.media.as.collage", true)) {
            this.l = 3;
        } else {
            this.l = 1;
        }
    }

    public static boolean k(tk7 tk7, rwc rwc) {
        tk7 tk72 = rwc.a;
        if (tk72 == null || tk7 == null) {
            return false;
        }
        if ((tk7 instanceof mz) && (tk72 instanceof mz)) {
            return r1g.c(((mz) tk7).y0.q, ((mz) tk72).y0.q);
        }
        if (tk72.b == tk7.b) {
            return true;
        }
        return ct0.c(tk7.c(), tk72.c());
    }

    public final int a(tk7 tk7, int i2) {
        boolean j2 = j(tk7);
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if (j2) {
            return copyOnWriteArraySet.size();
        }
        rwc h2 = h(tk7);
        if (h2 != null) {
            h2.f = true;
            return g(tk7);
        }
        rwc rwc = new rwc(tk7);
        rwc.c = (kpa) this.b.get(Long.valueOf(tk7.b));
        Set<d66> set = this.e;
        if (i2 < 0 || i2 >= copyOnWriteArraySet.size()) {
            copyOnWriteArraySet.add(rwc);
            if (set != null) {
                for (d66 b2 : set) {
                    try {
                        b2.b(rwc);
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
            n();
            return copyOnWriteArraySet.size();
        }
        ArrayList arrayList = new ArrayList(copyOnWriteArraySet);
        arrayList.add(i2, rwc);
        copyOnWriteArraySet.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rwc rwc2 = (rwc) it.next();
            copyOnWriteArraySet.add(rwc2);
            if (set != null) {
                for (d66 b3 : set) {
                    try {
                        b3.b(rwc2);
                    } catch (Throwable th2) {
                        throw new RuntimeException(th2);
                    }
                }
            }
            n();
        }
        return i2 + 1;
    }

    public final int b() {
        return c().size();
    }

    public final List c() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if ((copyOnWriteArraySet instanceof Collection) && copyOnWriteArraySet.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                if (((rwc) next).f) {
                    arrayList.add(next);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return arrayList;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            rwc rwc = (rwc) it.next();
            if (rwc.f) {
                tk7 tk7 = rwc.a;
                if ((tk7 instanceof mz) && !kpa.b(rwc.c, tk7)) {
                    arrayList.add(new nz(tk7.a, tk7.a(), ((mz) tk7).y0));
                } else {
                    String f2 = f(rwc);
                    if (f2 != null) {
                        int i2 = tk7.a;
                        if (this.l == 2) {
                            i2 = 7;
                        }
                        arrayList.add(new ugd(i2, f2));
                    } else {
                        arrayList.add(l(rwc));
                    }
                }
            }
        }
        return arrayList;
    }

    public final kpa e(tk7 tk7) {
        rwc h2 = h(tk7);
        kpa kpa = h2 != null ? h2.c : null;
        return kpa == null ? (kpa) this.b.get(Long.valueOf(tk7.b)) : kpa;
    }

    public final String f(rwc rwc) {
        kpa kpa = rwc.c;
        Uri uri = kpa != null ? kpa.X : null;
        Uri uri2 = kpa != null ? kpa.Y : null;
        Uri uri3 = kpa != null ? kpa.b : null;
        Uri uri4 = kpa != null ? kpa.a : null;
        if (uri != null) {
            Uri a2 = kpa.a(kpa, rwc.a);
            try {
                otf otf = this.j;
                Bitmap F = otf.F(a2, true);
                Bitmap F2 = otf.F(uri, false);
                Canvas canvas = new Canvas(F);
                float width = ((float) F.getWidth()) / ((float) F2.getWidth());
                canvas.scale(width, width);
                canvas.drawBitmap(F2, 0.0f, 0.0f, (Paint) null);
                File a3 = ((bf5) otf.b).a("jpg");
                at7.M(a3.getAbsolutePath(), F, 100);
                return a3.getAbsolutePath();
            } catch (Exception e2) {
                udd.s("pwc", "getMediasForSend: exception", e2);
                return a2.toString();
            }
        } else if (uri2 != null) {
            return uri2.getPath();
        } else {
            if (uri3 != null) {
                return uri3.getPath();
            }
            if (uri4 != null) {
                return uri4.getPath();
            }
            return null;
        }
    }

    public final int g(tk7 tk7) {
        if (!j(tk7)) {
            return 0;
        }
        Iterator it = this.a.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            rwc rwc = (rwc) it.next();
            if (rwc.f) {
                if (k(tk7, rwc)) {
                    break;
                }
                i2++;
            }
        }
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: rwc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: rwc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: rwc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: rwc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.rwc h(defpackage.tk7 r4) {
        /*
            r3 = this;
            java.util.concurrent.CopyOnWriteArraySet r3 = r3.a
            r0 = 0
            if (r3 != 0) goto L_0x0006
            goto L_0x0026
        L_0x0006:
            java.util.Iterator r3 = r3.iterator()
        L_0x000a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r3.next()
            r2 = r1
            rwc r2 = (defpackage.rwc) r2     // Catch:{ all -> 0x001f }
            boolean r2 = k(r4, r2)     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x000a
            r0 = r1
            goto L_0x0026
        L_0x001f:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
        L_0x0026:
            rwc r0 = (defpackage.rwc) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwc.h(tk7):rwc");
    }

    public final rwc i(int i2) {
        List list;
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if (!(copyOnWriteArraySet instanceof Collection) || !copyOnWriteArraySet.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    if (((rwc) next).f) {
                        arrayList.add(next);
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            list = arrayList;
        } else {
            list = Collections.emptyList();
        }
        if (i2 < 0 || i2 >= list.size()) {
            return null;
        }
        return (rwc) list.get(i2);
    }

    public final boolean j(tk7 tk7) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if ((copyOnWriteArraySet instanceof Collection) && copyOnWriteArraySet.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            try {
                rwc rwc = (rwc) it.next();
                if (rwc.f && k(tk7, rwc)) {
                    return true;
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return false;
    }

    public final ugd l(rwc rwc) {
        int i2;
        int i3 = this.l;
        tk7 tk7 = rwc.a;
        if (i3 == 2 || (i2 = tk7.a) != 3 || rwc.b == null) {
            int i4 = tk7.a;
            String a2 = tk7.a();
            if (this.l == 2) {
                i4 = 7;
            }
            return new ugd(i4, a2);
        }
        return new g5f(i2, tk7.a(), rwc.b, r1g.p(rwc.d) ? tk7.o : rwc.d);
    }

    public final void m(rwc rwc) {
        for (mwc s1 : this.f) {
            s1.s1(rwc);
        }
    }

    public final void n() {
        for (nwc B1 : this.c) {
            B1.B1(Collections.unmodifiableSet(this.a));
        }
    }

    public final void o(tk7 tk7, File file) {
        a(tk7, this.a.size());
        rwc h2 = h(tk7);
        if (h2 != null) {
            tk7 tk72 = h2.a;
            if (tk72 instanceof mz) {
                mz mzVar = (mz) tk72;
                mzVar.getClass();
                String path = file.getPath();
                udd.q("mz", "Set downloaded file " + path);
                mzVar.B0 = file;
                String str = mzVar.y0.r;
                if (str == null || str.length() == 0) {
                    m00 j2 = mzVar.y0.j();
                    j2.m = file.getPath();
                    mzVar.y0 = j2.a();
                }
            }
            m(h2);
        }
    }

    public final void p(int i2) {
        if (b() > 1) {
            ip ipVar = this.h;
            if (i2 == 3) {
                ((kp) ipVar).i("app.send.media.as.collage", true);
            } else if (i2 == 1) {
                ((kp) ipVar).i("app.send.media.as.collage", false);
            }
        }
        this.l = i2;
        for (vd9 vd9 : this.d) {
            int i3 = this.l;
            tk7 tk7 = vd9.X;
            if (tk7 != null) {
                int i4 = tk7.a;
                if (i3 == 2) {
                    if (i4 == 1) {
                        vd9.f2(new sr1(7));
                    } else if (tk7.b()) {
                        vd9.f2(new sr1(8));
                    }
                } else if (i4 == 1) {
                    vd9.f2(new sr1(9));
                } else if (tk7.b()) {
                    vd9.f2(new sr1(10));
                }
            }
        }
    }

    public final void q(tk7 tk7, f3f f3f) {
        a(tk7, this.a.size());
        rwc h2 = h(tk7);
        if (h2 != null) {
            h2.b = f3f;
        }
        m(h2);
    }

    public final int r(tk7 tk7) {
        int i2;
        rwc rwc;
        CopyOnWriteArraySet copyOnWriteArraySet = this.m;
        if (copyOnWriteArraySet != null) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                try {
                    ((q56) it.next()).a(owc.a);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.a;
        int size = copyOnWriteArraySet2.size();
        boolean j2 = j(tk7);
        Set<d66> set = this.e;
        if (j2) {
            Iterator it2 = copyOnWriteArraySet2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    rwc = null;
                    break;
                }
                rwc = (rwc) it2.next();
                if (k(tk7, rwc)) {
                    copyOnWriteArraySet2.remove(rwc);
                    break;
                }
            }
            if (!(rwc == null || set == null)) {
                for (d66 a2 : set) {
                    try {
                        a2.a(rwc);
                    } catch (Throwable th2) {
                        throw new RuntimeException(th2);
                    }
                }
            }
            n();
            if (rwc != null && !tk7.c.equals(kpa.a(rwc.c, tk7).toString())) {
                m(rwc);
            }
            i2 = 0;
        } else {
            rwc h2 = h(tk7);
            if (h2 != null) {
                copyOnWriteArraySet2.remove(h2);
                copyOnWriteArraySet2.add(h2);
                h2.f = true;
                if (set != null) {
                    for (d66 b2 : set) {
                        try {
                            b2.b(h2);
                        } catch (Throwable th3) {
                            throw new RuntimeException(th3);
                        }
                    }
                }
                n();
                i2 = g(tk7);
            } else {
                i2 = a(tk7, size);
            }
        }
        if (copyOnWriteArraySet != null) {
            Iterator it3 = copyOnWriteArraySet.iterator();
            while (it3.hasNext()) {
                try {
                    ((q56) it3.next()).a(owc.b);
                } catch (Throwable th4) {
                    throw new RuntimeException(th4);
                }
            }
        }
        return i2;
    }
}
