package defpackage;

import android.os.ConditionVariable;
import com.google.android.exoplayer2.upstream.cache.Cache$CacheException;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/* renamed from: lgd  reason: default package */
public final class lgd implements bv0 {
    public static final HashSet i = new HashSet();
    public final File a;
    public final ba7 b;
    public final s39 c;
    public final HashMap d;
    public final Random e;
    public final boolean f;
    public long g;
    public Cache$CacheException h;

    public lgd(File file, ba7 ba7) {
        boolean add;
        s39 s39 = new s39(file);
        synchronized (lgd.class) {
            add = i.add(file.getAbsoluteFile());
        }
        if (add) {
            this.a = file;
            this.b = ba7;
            this.c = s39;
            this.d = new HashMap();
            this.e = new Random();
            this.f = true;
            this.g = -1;
            ConditionVariable conditionVariable = new ConditionVariable();
            new l44(this, conditionVariable, 1).start();
            conditionVariable.block();
            return;
        }
        String valueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(valueOf.length() + 46);
        sb.append("Another SimpleCache instance uses the folder: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.io.IOException, com.google.android.exoplayer2.upstream.cache.Cache$CacheException] */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.io.IOException, com.google.android.exoplayer2.upstream.cache.Cache$CacheException] */
    /* JADX WARNING: type inference failed for: r1v11, types: [java.io.IOException, com.google.android.exoplayer2.upstream.cache.Cache$CacheException] */
    public static void a(lgd lgd) {
        long j;
        s39 s39 = lgd.c;
        File file = lgd.a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (Cache$CacheException e2) {
                lgd.h = e2;
                return;
            }
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(valueOf.length() + 38);
            sb.append("Failed to list cache directory files: ");
            sb.append(valueOf);
            lgd.h = new IOException(sb.toString());
            return;
        }
        int length = listFiles.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                j = -1;
                break;
            }
            File file2 = listFiles[i2];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    new StringBuilder(String.valueOf(file2).length() + 20);
                    file2.delete();
                }
            } else {
                i2++;
            }
        }
        lgd.g = j;
        if (j == -1) {
            try {
                lgd.g = f(file);
            } catch (IOException e3) {
                String valueOf2 = String.valueOf(file);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 28);
                sb2.append("Failed to create cache UID: ");
                sb2.append(valueOf2);
                String sb3 = sb2.toString();
                oyb.b(sb3, e3);
                lgd.h = new IOException(sb3, e3);
                return;
            }
        }
        try {
            s39.f(lgd.g);
            lgd.getClass();
            lgd.h(file, true, listFiles);
            rue g2 = gt6.j(((HashMap) s39.a).keySet()).iterator();
            while (g2.hasNext()) {
                s39.g((String) g2.next());
            }
            try {
                s39.j();
            } catch (IOException e4) {
                oyb.b("Storing index file failed", e4);
            }
        } catch (IOException e5) {
            String valueOf3 = String.valueOf(file);
            StringBuilder sb4 = new StringBuilder(valueOf3.length() + 36);
            sb4.append("Failed to initialize cache indices: ");
            sb4.append(valueOf3);
            String sb5 = sb4.toString();
            oyb.b(sb5, e5);
            lgd.h = new IOException(sb5, e5);
        }
    }

    public static void e(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(valueOf.length() + 34);
            sb.append("Failed to create cache directory: ");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        }
    }

    public static long f(File file) {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0 : Math.abs(nextLong);
        String valueOf = String.valueOf(Long.toString(abs, 16));
        File file2 = new File(file, ".uid".length() != 0 ? valueOf.concat(".uid") : new String(valueOf));
        if (file2.createNewFile()) {
            return abs;
        }
        String valueOf2 = String.valueOf(file2);
        StringBuilder sb = new StringBuilder(valueOf2.length() + 27);
        sb.append("Failed to create UID file: ");
        sb.append(valueOf2);
        throw new IOException(sb.toString());
    }

    public final void b(ogd ogd) {
        s39 s39 = this.c;
        String str = ogd.a;
        s39.e(str).c.add(ogd);
        ArrayList arrayList = (ArrayList) this.d.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ba7) arrayList.get(size)).b(this, ogd);
            }
        }
        this.b.b(this, ogd);
    }

    public final synchronized void c(String str, qe4 qe4) {
        d();
        s39 s39 = this.c;
        cw0 e2 = s39.e(str);
        y54 y54 = e2.e;
        y54 b2 = y54.b(qe4);
        e2.e = b2;
        if (!b2.equals(y54)) {
            ((ew0) s39.e).q(e2);
        }
        try {
            this.c.j();
        } catch (IOException e3) {
            throw new IOException(e3);
        }
    }

    public final synchronized void d() {
        Cache$CacheException cache$CacheException = this.h;
        if (cache$CacheException != null) {
            throw cache$CacheException;
        }
    }

    public final synchronized y54 g(String str) {
        cw0 d2;
        d2 = this.c.d(str);
        return d2 != null ? d2.e : y54.c;
    }

    public final void h(File file, boolean z, File[] fileArr) {
        if (fileArr != null && fileArr.length != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z && name.indexOf(46) == -1) {
                    h(file2, false, file2.listFiles());
                } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                    ogd b2 = ogd.b(file2, -1, this.c);
                    if (b2 != null) {
                        b(b2);
                    } else {
                        file2.delete();
                    }
                }
            }
        } else if (!z) {
            file.delete();
        }
    }

    public final synchronized void i(ogd ogd) {
        cw0 d2 = this.c.d(ogd.a);
        d2.getClass();
        long j = ogd.b;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = d2.d;
            if (i2 >= arrayList.size()) {
                throw new IllegalStateException();
            } else if (((aw0) arrayList.get(i2)).a == j) {
                arrayList.remove(i2);
                this.c.g(d2.b);
                notifyAll();
            } else {
                i2++;
            }
        }
    }

    public final void j(vv0 vv0) {
        String str = vv0.a;
        s39 s39 = this.c;
        cw0 d2 = s39.d(str);
        if (d2 != null && d2.c.remove(vv0)) {
            File file = vv0.X;
            if (file != null) {
                file.delete();
            }
            s39.g(d2.b);
            ArrayList arrayList = (ArrayList) this.d.get(vv0.a);
            long j = vv0.c;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ba7 ba7 = (ba7) arrayList.get(size);
                    ba7.a.remove(vv0);
                    ba7.b -= j;
                }
            }
            ba7 ba72 = this.b;
            ba72.a.remove(vv0);
            ba72.b -= j;
        }
    }

    public final void k() {
        ArrayList arrayList = new ArrayList();
        for (cw0 cw0 : Collections.unmodifiableCollection(((HashMap) this.c.a).values())) {
            Iterator it = cw0.c.iterator();
            while (it.hasNext()) {
                vv0 vv0 = (vv0) it.next();
                if (vv0.X.length() != vv0.c) {
                    arrayList.add(vv0);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            j((vv0) arrayList.get(i2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: ogd} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r1v5, types: [vv0] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        return null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.ogd l(long r11, java.lang.String r13, long r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            r10.d()     // Catch:{ all -> 0x003f }
            s39 r0 = r10.c     // Catch:{ all -> 0x003f }
            cw0 r0 = r0.d(r13)     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x001c
            ogd r0 = new ogd     // Catch:{ all -> 0x003f }
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
            r1 = r0
            r2 = r13
            r3 = r11
            r5 = r14
            r1.<init>(r2, r3, r5, r7, r9)     // Catch:{ all -> 0x003f }
            goto L_0x0035
        L_0x001c:
            ogd r1 = r0.a(r11, r14)     // Catch:{ all -> 0x003f }
            boolean r2 = r1.o     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x0034
            java.io.File r2 = r1.X     // Catch:{ all -> 0x003f }
            long r2 = r2.length()     // Catch:{ all -> 0x003f }
            long r4 = r1.c     // Catch:{ all -> 0x003f }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0034
            r10.k()     // Catch:{ all -> 0x003f }
            goto L_0x001c
        L_0x0034:
            r0 = r1
        L_0x0035:
            boolean r14 = r0.o     // Catch:{ all -> 0x003f }
            if (r14 == 0) goto L_0x0041
            ogd r11 = r10.m(r13, r0)     // Catch:{ all -> 0x003f }
            monitor-exit(r10)
            return r11
        L_0x003f:
            r11 = move-exception
            goto L_0x0087
        L_0x0041:
            s39 r14 = r10.c     // Catch:{ all -> 0x003f }
            cw0 r13 = r14.e(r13)     // Catch:{ all -> 0x003f }
            long r14 = r0.c     // Catch:{ all -> 0x003f }
            r1 = 0
        L_0x004a:
            java.util.ArrayList r2 = r13.d     // Catch:{ all -> 0x003f }
            int r3 = r2.size()     // Catch:{ all -> 0x003f }
            if (r1 >= r3) goto L_0x007d
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x003f }
            aw0 r2 = (defpackage.aw0) r2     // Catch:{ all -> 0x003f }
            long r3 = r2.a     // Catch:{ all -> 0x003f }
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            r6 = -1
            if (r5 > 0) goto L_0x006c
            long r8 = r2.b     // Catch:{ all -> 0x003f }
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x007a
            long r3 = r3 + r8
            int r2 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x0077
            goto L_0x007a
        L_0x006c:
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x007a
            long r5 = r11 + r14
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0077
            goto L_0x007a
        L_0x0077:
            int r1 = r1 + 1
            goto L_0x004a
        L_0x007a:
            monitor-exit(r10)
            r10 = 0
            return r10
        L_0x007d:
            aw0 r13 = new aw0     // Catch:{ all -> 0x003f }
            r13.<init>(r11, r14)     // Catch:{ all -> 0x003f }
            r2.add(r13)     // Catch:{ all -> 0x003f }
            monitor-exit(r10)
            return r0
        L_0x0087:
            monitor-exit(r10)     // Catch:{ all -> 0x003f }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgd.l(long, java.lang.String, long):ogd");
    }

    public final ogd m(String str, ogd ogd) {
        File file;
        if (!this.f) {
            return ogd;
        }
        File file2 = ogd.X;
        file2.getClass();
        file2.getName();
        long currentTimeMillis = System.currentTimeMillis();
        cw0 d2 = this.c.d(str);
        TreeSet treeSet = d2.c;
        swb.h(treeSet.remove(ogd));
        file2.getClass();
        File parentFile = file2.getParentFile();
        parentFile.getClass();
        File c2 = ogd.c(parentFile, d2.a, ogd.b, currentTimeMillis);
        if (file2.renameTo(c2)) {
            file = c2;
        } else {
            new StringBuilder(String.valueOf(c2).length() + String.valueOf(file2).length() + 21);
            file = file2;
        }
        swb.h(ogd.o);
        vv0 vv0 = new vv0(ogd.a, ogd.b, ogd.c, currentTimeMillis, file);
        treeSet.add(vv0);
        ArrayList arrayList = (ArrayList) this.d.get(ogd.a);
        long j = ogd.c;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ba7 ba7 = (ba7) arrayList.get(size);
                ba7.a.remove(ogd);
                ba7.b -= j;
                ba7.b(this, vv0);
            }
        }
        ba7 ba72 = this.b;
        ba72.a.remove(ogd);
        ba72.b -= j;
        ba72.b(this, vv0);
        return vv0;
    }
}
