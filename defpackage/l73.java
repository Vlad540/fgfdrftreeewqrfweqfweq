package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: l73  reason: default package */
public final class l73 extends v63 implements g73 {
    public static final k73[] X = new k73[0];
    public static final k73[] o = new k73[0];
    public final AtomicReference a = new AtomicReference(o);
    public final AtomicBoolean b = new AtomicBoolean();
    public Throwable c;

    public final void b() {
        if (this.b.compareAndSet(false, true)) {
            for (k73 k73 : (k73[]) this.a.getAndSet(X)) {
                k73.a.b();
            }
        }
    }

    public final void d(xi4 xi4) {
        if (this.a.get() == X) {
            xi4.f();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: k73[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(defpackage.g73 r7) {
        /*
            r6 = this;
            k73 r0 = new k73
            r0.<init>(r7, r6)
            r7.d(r0)
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference r1 = r6.a
            java.lang.Object r2 = r1.get()
            k73[] r2 = (defpackage.k73[]) r2
            k73[] r3 = X
            if (r2 != r3) goto L_0x0020
            java.lang.Throwable r6 = r6.c
            if (r6 == 0) goto L_0x001c
            r7.onError(r6)
            goto L_0x003a
        L_0x001c:
            r7.b()
            goto L_0x003a
        L_0x0020:
            int r3 = r2.length
            int r4 = r3 + 1
            k73[] r4 = new defpackage.k73[r4]
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r4, r5, r3)
            r4[r3] = r0
        L_0x002b:
            boolean r3 = r1.compareAndSet(r2, r4)
            if (r3 == 0) goto L_0x003b
            boolean r7 = r0.h()
            if (r7 == 0) goto L_0x003a
            r6.m(r0)
        L_0x003a:
            return
        L_0x003b:
            java.lang.Object r3 = r1.get()
            if (r3 == r2) goto L_0x002b
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l73.j(g73):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: k73[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: k73} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(defpackage.k73 r8) {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r7.a
            java.lang.Object r1 = r0.get()
            k73[] r1 = (defpackage.k73[]) r1
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
            k73[] r2 = o
            goto L_0x0031
        L_0x0022:
            int r6 = r2 + -1
            k73[] r6 = new defpackage.k73[r6]
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l73.m(k73):void");
    }

    public final void onError(Throwable th) {
        i15.c(th, "onError called with a null Throwable.");
        if (this.b.compareAndSet(false, true)) {
            this.c = th;
            for (k73 k73 : (k73[]) this.a.getAndSet(X)) {
                k73.a.onError(th);
            }
            return;
        }
        xs7.F(th);
    }
}
