package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ghd  reason: default package */
public final class ghd extends dhd implements zhd {
    public static final fhd[] Y = new fhd[0];
    public static final fhd[] Z = new fhd[0];
    public Throwable X;
    public final dhd a;
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicReference c = new AtomicReference(Y);
    public Object o;

    public ghd(yhd yhd) {
        this.a = yhd;
    }

    public final void a(Object obj) {
        this.o = obj;
        for (fhd fhd : (fhd[]) this.c.getAndSet(Z)) {
            if (!fhd.get()) {
                fhd.a.a(obj);
            }
        }
    }

    public final void d(xi4 xi4) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: fhd[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(defpackage.zhd r7) {
        /*
            r6 = this;
            fhd r0 = new fhd
            r0.<init>(r7, r6)
            r7.d(r0)
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference r1 = r6.c
            java.lang.Object r2 = r1.get()
            fhd[] r2 = (defpackage.fhd[]) r2
            fhd[] r3 = Z
            if (r2 != r3) goto L_0x0022
            java.lang.Throwable r0 = r6.X
            if (r0 == 0) goto L_0x001c
            r7.onError(r0)
            goto L_0x0021
        L_0x001c:
            java.lang.Object r6 = r6.o
            r7.a(r6)
        L_0x0021:
            return
        L_0x0022:
            int r3 = r2.length
            int r4 = r3 + 1
            fhd[] r4 = new defpackage.fhd[r4]
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r4, r5, r3)
            r4[r3] = r0
        L_0x002d:
            boolean r3 = r1.compareAndSet(r2, r4)
            if (r3 == 0) goto L_0x004a
            boolean r7 = r0.get()
            if (r7 == 0) goto L_0x003c
            r6.o(r0)
        L_0x003c:
            java.util.concurrent.atomic.AtomicInteger r7 = r6.b
            int r7 = r7.getAndIncrement()
            if (r7 != 0) goto L_0x0049
            dhd r7 = r6.a
            r7.k(r6)
        L_0x0049:
            return
        L_0x004a:
            java.lang.Object r3 = r1.get()
            if (r3 == r2) goto L_0x002d
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghd.l(zhd):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: fhd[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: fhd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(defpackage.fhd r8) {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r7.c
            java.lang.Object r1 = r0.get()
            fhd[] r1 = (defpackage.fhd[]) r1
            int r2 = r1.length
            if (r2 != 0) goto L_0x000c
            return
        L_0x000c:
            r3 = 0
            r4 = r3
        L_0x000e:
            if (r4 >= r2) goto L_0x0018
            r5 = r1[r4]
            if (r5 != r8) goto L_0x0015
            goto L_0x0019
        L_0x0015:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0018:
            r4 = -1
        L_0x0019:
            if (r4 >= 0) goto L_0x001c
            return
        L_0x001c:
            r5 = 1
            if (r2 != r5) goto L_0x0022
            fhd[] r2 = Y
            goto L_0x0031
        L_0x0022:
            int r6 = r2 + -1
            fhd[] r6 = new defpackage.fhd[r6]
            java.lang.System.arraycopy(r1, r3, r6, r3, r4)
            int r3 = r4 + 1
            int r2 = r2 - r4
            int r2 = r2 - r5
            java.lang.System.arraycopy(r1, r3, r6, r4, r2)
            r2 = r6
        L_0x0031:
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L_0x0038
            return
        L_0x0038:
            java.lang.Object r3 = r0.get()
            if (r3 == r1) goto L_0x0031
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghd.o(fhd):void");
    }

    public final void onError(Throwable th) {
        this.X = th;
        for (fhd fhd : (fhd[]) this.c.getAndSet(Z)) {
            if (!fhd.get()) {
                fhd.a.onError(th);
            }
        }
    }
}
