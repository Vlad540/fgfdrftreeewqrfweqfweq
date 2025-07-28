package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* renamed from: kee  reason: default package */
public final class kee {
    public static final kee h = new kee(new x3a(new pa3(wn6.l(new StringBuilder(), nze.g, " TaskRunner"), true)));
    public static final Logger i = Logger.getLogger(kee.class.getName());
    public int a = 10000;
    public boolean b;
    public long c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final lde f = new lde(1, (Object) this);
    public final x3a g;

    public kee(x3a x3a) {
        this.g = x3a;
    }

    public static final void a(kee kee, rde rde) {
        kee.getClass();
        byte[] bArr = nze.a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(rde.c);
        try {
            long a2 = rde.a();
            synchronized (kee) {
                kee.b(rde, a2);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (kee) {
                kee.b(rde, -1);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(rde rde, long j) {
        byte[] bArr = nze.a;
        hee hee = rde.a;
        if (hee.b == rde) {
            boolean z = hee.d;
            hee.d = false;
            hee.b = null;
            this.d.remove(hee);
            if (j != -1 && !z && !hee.a) {
                hee.d(rde, j, true);
            }
            if (!hee.c.isEmpty()) {
                this.e.add(hee);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b5, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b9, code lost:
        r1.b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bb, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00b2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.rde c() {
        /*
            r17 = this;
            r1 = r17
            byte[] r0 = defpackage.nze.a
        L_0x0004:
            java.util.ArrayList r0 = r1.e
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto L_0x000e
            return r3
        L_0x000e:
            x3a r2 = r1.g
            r2.getClass()
            long r4 = java.lang.System.nanoTime()
            java.util.Iterator r6 = r0.iterator()
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r3
        L_0x0021:
            boolean r10 = r6.hasNext()
            r11 = 1
            r12 = 0
            r14 = 0
            if (r10 == 0) goto L_0x004f
            java.lang.Object r10 = r6.next()
            hee r10 = (defpackage.hee) r10
            java.util.ArrayList r10 = r10.c
            java.lang.Object r10 = r10.get(r14)
            rde r10 = (defpackage.rde) r10
            long r14 = r10.b
            long r14 = r14 - r4
            long r14 = java.lang.Math.max(r12, r14)
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 <= 0) goto L_0x0049
            long r7 = java.lang.Math.min(r14, r7)
            goto L_0x0021
        L_0x0049:
            if (r9 == 0) goto L_0x004d
            r6 = r11
            goto L_0x0050
        L_0x004d:
            r9 = r10
            goto L_0x0021
        L_0x004f:
            r6 = 0
        L_0x0050:
            if (r9 == 0) goto L_0x0080
            byte[] r3 = defpackage.nze.a
            r3 = -1
            r9.b = r3
            hee r3 = r9.a
            java.util.ArrayList r4 = r3.c
            r4.remove(r9)
            r0.remove(r3)
            r3.b = r9
            java.util.ArrayList r4 = r1.d
            r4.add(r3)
            if (r6 != 0) goto L_0x0076
            boolean r3 = r1.b
            if (r3 != 0) goto L_0x007f
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r11
            if (r0 == 0) goto L_0x007f
        L_0x0076:
            java.lang.Object r0 = r2.b
            java.util.concurrent.ThreadPoolExecutor r0 = (java.util.concurrent.ThreadPoolExecutor) r0
            lde r1 = r1.f
            r0.execute(r1)
        L_0x007f:
            return r9
        L_0x0080:
            boolean r0 = r1.b
            if (r0 == 0) goto L_0x008f
            long r9 = r1.c
            long r9 = r9 - r4
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x008e
            r17.notify()
        L_0x008e:
            return r3
        L_0x008f:
            r1.b = r11
            long r4 = r4 + r7
            r1.c = r4
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r7 / r2
            long r2 = r2 * r4
            long r2 = r7 - r2
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x00a7
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a5
            goto L_0x00a7
        L_0x00a5:
            r2 = 0
            goto L_0x00ac
        L_0x00a7:
            int r0 = (int) r2     // Catch:{ InterruptedException -> 0x00b2 }
            r1.wait(r4, r0)     // Catch:{ InterruptedException -> 0x00b2 }
            goto L_0x00a5
        L_0x00ac:
            r1.b = r2
            goto L_0x0004
        L_0x00b0:
            r2 = 0
            goto L_0x00b9
        L_0x00b2:
            r17.d()     // Catch:{ all -> 0x00b7 }
            r2 = 0
            goto L_0x00ac
        L_0x00b7:
            r0 = move-exception
            goto L_0x00b0
        L_0x00b9:
            r1.b = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kee.c():rde");
    }

    public final void d() {
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((hee) arrayList.get(size)).b();
        }
        ArrayList arrayList2 = this.e;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            hee hee = (hee) arrayList2.get(size2);
            hee.b();
            if (hee.c.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
    }

    public final void e(hee hee) {
        byte[] bArr = nze.a;
        if (hee.b == null) {
            boolean z = !hee.c.isEmpty();
            ArrayList arrayList = this.e;
            if (!z) {
                arrayList.remove(hee);
            } else if (!arrayList.contains(hee)) {
                arrayList.add(hee);
            }
        }
        boolean z2 = this.b;
        x3a x3a = this.g;
        if (z2) {
            x3a.getClass();
            notify();
            return;
        }
        ((ThreadPoolExecutor) x3a.b).execute(this.f);
    }

    public final hee f() {
        int i2;
        synchronized (this) {
            i2 = this.a;
            this.a = i2 + 1;
        }
        return new hee(this, wn6.h(i2, "Q"));
    }
}
