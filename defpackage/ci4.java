package defpackage;

import android.os.StatFs;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ci4  reason: default package */
public final class ci4 implements cd5 {
    public static final long n = TimeUnit.HOURS.toMillis(2);
    public static final long o = TimeUnit.MINUTES.toMillis(30);
    public final long a;
    public final long b;
    public long c;
    public final HashSet d;
    public long e;
    public final sqd f;
    public final bi4 g;
    public final gk9 h;
    public final gk9 i;
    public final boolean j;
    public final xu0 k;
    public final om3 l;
    public final Object m = new Object();

    /* JADX WARNING: type inference failed for: r5v4, types: [xu0, java.lang.Object] */
    public ci4(xq4 xq4, gk9 gk9, p7 p7Var, hk9 hk9, gk9 gk92, ExecutorService executorService) {
        sqd sqd;
        this.a = p7Var.b;
        long j2 = p7Var.c;
        this.b = j2;
        this.c = j2;
        sqd sqd2 = sqd.h;
        synchronized (sqd.class) {
            try {
                if (sqd.h == null) {
                    sqd.h = new sqd();
                }
                sqd = sqd.h;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.f = sqd;
        this.g = xq4;
        this.h = gk9;
        this.e = -1;
        this.i = gk92;
        ? obj = new Object();
        obj.a = false;
        obj.b = -1;
        obj.c = -1;
        this.k = obj;
        this.l = om3.X;
        this.j = false;
        this.d = new HashSet();
        new CountDownLatch(0);
    }

    public final void a() {
        synchronized (this.m) {
            try {
                this.g.e();
                this.d.clear();
            } catch (IOException | NullPointerException e2) {
                gk9 gk9 = this.i;
                e2.getMessage();
                gk9.getClass();
            }
            xu0 xu0 = this.k;
            synchronized (xu0) {
                xu0.a = false;
                xu0.c = -1;
                xu0.b = -1;
            }
        }
    }

    public final void b(long j2) {
        bi4 bi4 = this.g;
        try {
            ArrayList d2 = d(bi4.d());
            xu0 xu0 = this.k;
            long a2 = xu0.a() - j2;
            Iterator it = d2.iterator();
            int i2 = 0;
            long j3 = 0;
            while (it.hasNext()) {
                j64 j64 = (j64) it.next();
                if (j3 > a2) {
                    break;
                }
                long c2 = bi4.c(j64);
                this.d.remove(j64.a);
                if (c2 > 0) {
                    i2++;
                    j3 += c2;
                    za6.S().U();
                }
            }
            xu0.b(-j3, (long) (-i2));
            bi4.b();
        } catch (IOException e2) {
            e2.getMessage();
            this.i.getClass();
            throw e2;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bd5 c(defpackage.ov0 r9) {
        /*
            r8 = this;
            za6 r0 = defpackage.za6.S()
            r1 = 0
            java.lang.Object r2 = r8.m     // Catch:{ IOException -> 0x0042 }
            monitor-enter(r2)     // Catch:{ IOException -> 0x0042 }
            java.util.ArrayList r3 = defpackage.hhd.D(r9)     // Catch:{ all -> 0x0027 }
            r4 = 0
            r5 = r1
            r6 = r5
        L_0x000f:
            int r7 = r3.size()     // Catch:{ all -> 0x0027 }
            if (r4 >= r7) goto L_0x0029
            java.lang.Object r5 = r3.get(r4)     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0027 }
            bi4 r6 = r8.g     // Catch:{ all -> 0x0027 }
            bd5 r6 = r6.a(r9, r5)     // Catch:{ all -> 0x0027 }
            if (r6 == 0) goto L_0x0024
            goto L_0x0029
        L_0x0024:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x0027:
            r9 = move-exception
            goto L_0x003e
        L_0x0029:
            if (r6 != 0) goto L_0x0031
            java.util.HashSet r9 = r8.d     // Catch:{ all -> 0x0027 }
            r9.remove(r5)     // Catch:{ all -> 0x0027 }
            goto L_0x0039
        L_0x0031:
            r5.getClass()     // Catch:{ all -> 0x0027 }
            java.util.HashSet r9 = r8.d     // Catch:{ all -> 0x0027 }
            r9.add(r5)     // Catch:{ all -> 0x0027 }
        L_0x0039:
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            r0.U()
            return r6
        L_0x003e:
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            throw r9     // Catch:{ IOException -> 0x0042 }
        L_0x0040:
            r8 = move-exception
            goto L_0x004b
        L_0x0042:
            gk9 r8 = r8.i     // Catch:{ all -> 0x0040 }
            r8.getClass()     // Catch:{ all -> 0x0040 }
            r0.U()
            return r1
        L_0x004b:
            r0.U()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci4.c(ov0):bd5");
    }

    public final ArrayList d(Collection collection) {
        this.l.getClass();
        long currentTimeMillis = System.currentTimeMillis() + n;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            j64 j64 = (j64) it.next();
            if (j64.a() > currentTimeMillis) {
                arrayList.add(j64);
            } else {
                arrayList2.add(j64);
            }
        }
        this.h.getClass();
        Collections.sort(arrayList2, new zo4(23));
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final bd5 e(ov0 ov0, j9 j9Var) {
        boolean z;
        String encodeToString;
        jg8 g2;
        bd5 k2;
        za6 S = za6.S();
        synchronized (this.m) {
            try {
                byte[] bytes = ov0.c().getBytes(Charset.forName("UTF-8"));
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                z = false;
                instance.update(bytes, 0, bytes.length);
                encodeToString = Base64.encodeToString(instance.digest(), 11);
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            } catch (UnsupportedEncodingException e3) {
                throw new RuntimeException(e3);
            }
        }
        try {
            g2 = g(encodeToString, ov0);
            g2.D(j9Var);
            synchronized (this.m) {
                k2 = g2.k();
                this.d.add(encodeToString);
                this.k.b(k2.a.length(), 1);
            }
            k2.a.length();
            this.k.a();
            File file = (File) g2.c;
            if (!file.exists() || file.delete()) {
                z = true;
            }
            if (!z) {
                m75.a(ci4.class, "Failed to delete temp file");
            }
            S.U();
            return k2;
        } catch (IOException e4) {
            Class<ci4> cls = ci4.class;
            if (m75.a.i(6)) {
                m75.a.e(cls.getSimpleName(), "Failed inserting a file into the cache", e4);
            }
            throw e4;
        } catch (Throwable th) {
            S.U();
            throw th;
        }
    }

    public final boolean f() {
        boolean z;
        long j2;
        boolean z2;
        this.l.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        xu0 xu0 = this.k;
        synchronized (xu0) {
            z = xu0.a;
        }
        long j3 = -1;
        if (z) {
            long j4 = this.e;
            if (j4 != -1 && currentTimeMillis - j4 <= o) {
                return false;
            }
        }
        this.l.getClass();
        long currentTimeMillis2 = System.currentTimeMillis();
        long j5 = n + currentTimeMillis2;
        HashSet hashSet = (!this.j || !this.d.isEmpty()) ? this.j ? new HashSet() : null : this.d;
        try {
            boolean z3 = false;
            int i2 = 0;
            long j6 = 0;
            for (j64 j64 : this.g.d()) {
                boolean z4 = z3;
                int i3 = i2 + 1;
                if (j64.c < 0) {
                    j64.c = j64.b.a.length();
                }
                j6 += j64.c;
                if (j64.a() > j5) {
                    if (j64.c < 0) {
                        j64.c = j64.b.a.length();
                    }
                    j3 = Math.max(j64.a() - currentTimeMillis2, j3);
                    z3 = true;
                } else {
                    if (this.j) {
                        hashSet.getClass();
                        hashSet.add(j64.a);
                    }
                    z3 = z4;
                }
                i2 = i3;
            }
            if (z3) {
                this.i.getClass();
            }
            xu0 xu02 = this.k;
            synchronized (xu02) {
                j2 = xu02.c;
            }
            long j7 = (long) i2;
            if (j2 == j7) {
                if (this.k.a() == j6) {
                    z2 = true;
                    this.e = currentTimeMillis2;
                    return z2;
                }
            }
            if (this.j && this.d != hashSet) {
                hashSet.getClass();
                this.d.clear();
                this.d.addAll(hashSet);
            }
            xu0 xu03 = this.k;
            synchronized (xu03) {
                xu03.c = j7;
                xu03.b = j6;
                z2 = true;
                xu03.a = true;
            }
            this.e = currentTimeMillis2;
            return z2;
        } catch (IOException e2) {
            gk9 gk9 = this.i;
            e2.getMessage();
            gk9.getClass();
            return false;
        }
    }

    public final jg8 g(String str, ov0 ov0) {
        synchronized (this.m) {
            boolean f2 = f();
            h();
            long a2 = this.k.a();
            if (a2 > this.c && !f2) {
                xu0 xu0 = this.k;
                synchronized (xu0) {
                    xu0.a = false;
                    xu0.c = -1;
                    xu0.b = -1;
                }
                f();
            }
            long j2 = this.c;
            if (a2 > j2) {
                b((j2 * 9) / 10);
            }
        }
        return this.g.f(ov0, str);
    }

    public final void h() {
        char c2 = this.g.isExternal() ? (char) 2 : 1;
        sqd sqd = this.f;
        long a2 = this.b - this.k.a();
        sqd.a();
        sqd.a();
        ReentrantLock reentrantLock = sqd.f;
        if (reentrantLock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - sqd.e > sqd.i) {
                    sqd.a = sqd.b(sqd.a, sqd.b);
                    sqd.c = sqd.b(sqd.c, sqd.d);
                    sqd.e = SystemClock.uptimeMillis();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        StatFs statFs = c2 == 1 ? sqd.a : sqd.c;
        long availableBlocksLong = statFs != null ? statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() : 0;
        if (availableBlocksLong <= 0 || availableBlocksLong < a2) {
            this.c = this.a;
        } else {
            this.c = this.b;
        }
    }
}
