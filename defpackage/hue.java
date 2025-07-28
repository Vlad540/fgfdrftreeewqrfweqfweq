package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: hue  reason: default package */
public final class hue extends zn5 {
    public boolean A0;
    public volatile boolean X;
    public Throwable Y;
    public final AtomicReference Z = new AtomicReference();
    public final knd b = new knd(8);
    public final AtomicReference c = new AtomicReference((Object) null);
    public final boolean o = true;
    public volatile boolean w0;
    public final AtomicBoolean x0 = new AtomicBoolean();
    public final gue y0 = new gue(this);
    public final AtomicLong z0 = new AtomicLong();

    public final void b() {
        if (!this.X && !this.w0) {
            this.X = true;
            Runnable runnable = (Runnable) this.c.getAndSet((Object) null);
            if (runnable != null) {
                runnable.run();
            }
            i();
        }
    }

    public final void c(Object obj) {
        i15.c(obj, "onNext called with a null value.");
        if (!this.X && !this.w0) {
            this.b.offer(obj);
            i();
        }
    }

    public final void e(d1e d1e) {
        if (this.X || this.w0) {
            d1e.cancel();
        } else {
            d1e.i(Long.MAX_VALUE);
        }
    }

    public final void g(b1e b1e) {
        if (this.x0.get() || !this.x0.compareAndSet(false, true)) {
            vw4.b(new IllegalStateException("This processor allows only a single Subscriber"), b1e);
            return;
        }
        b1e.e(this.y0);
        this.Z.set(b1e);
        if (this.w0) {
            this.Z.lazySet((Object) null);
        } else {
            i();
        }
    }

    public final boolean h(boolean z, boolean z2, boolean z3, b1e b1e, knd knd) {
        if (this.w0) {
            knd.clear();
            this.Z.lazySet((Object) null);
            return true;
        } else if (!z2) {
            return false;
        } else {
            if (z && this.Y != null) {
                knd.clear();
                this.Z.lazySet((Object) null);
                b1e.onError(this.Y);
                return true;
            } else if (!z3) {
                return false;
            } else {
                Throwable th = this.Y;
                this.Z.lazySet((Object) null);
                if (th != null) {
                    b1e.onError(th);
                } else {
                    b1e.b();
                }
                return true;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: b1e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r18 = this;
            r6 = r18
            gue r0 = r6.y0
            int r0 = r0.getAndIncrement()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReference r0 = r6.Z
            java.lang.Object r0 = r0.get()
            b1e r0 = (b1e) r0
            r7 = 1
            r8 = r0
            r0 = r7
        L_0x0016:
            if (r8 == 0) goto L_0x00dc
            boolean r0 = r6.A0
            if (r0 == 0) goto L_0x0069
            knd r0 = r6.b
            boolean r1 = r6.o
            r1 = r1 ^ r7
        L_0x0021:
            boolean r2 = r6.w0
            r3 = 0
            if (r2 == 0) goto L_0x002d
            java.util.concurrent.atomic.AtomicReference r0 = r6.Z
            r0.lazySet(r3)
            goto L_0x00d9
        L_0x002d:
            boolean r2 = r6.X
            if (r1 == 0) goto L_0x0046
            if (r2 == 0) goto L_0x0046
            java.lang.Throwable r4 = r6.Y
            if (r4 == 0) goto L_0x0046
            r0.clear()
            java.util.concurrent.atomic.AtomicReference r0 = r6.Z
            r0.lazySet(r3)
            java.lang.Throwable r0 = r6.Y
            r8.onError(r0)
            goto L_0x00d9
        L_0x0046:
            r8.c(r3)
            if (r2 == 0) goto L_0x005e
            java.util.concurrent.atomic.AtomicReference r0 = r6.Z
            r0.lazySet(r3)
            java.lang.Throwable r0 = r6.Y
            if (r0 == 0) goto L_0x0059
            r8.onError(r0)
            goto L_0x00d9
        L_0x0059:
            r8.b()
            goto L_0x00d9
        L_0x005e:
            gue r2 = r6.y0
            int r3 = -r7
            int r7 = r2.addAndGet(r3)
            if (r7 != 0) goto L_0x0021
            goto L_0x00d9
        L_0x0069:
            knd r9 = r6.b
            boolean r0 = r6.o
            r10 = r0 ^ 1
            r11 = r7
        L_0x0070:
            java.util.concurrent.atomic.AtomicLong r0 = r6.z0
            long r12 = r0.get()
            r4 = 0
        L_0x0078:
            int r16 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r16 == 0) goto L_0x00a6
            boolean r2 = r6.X
            java.lang.Object r3 = r9.poll()
            if (r3 != 0) goto L_0x0087
            r17 = r7
            goto L_0x008a
        L_0x0087:
            r0 = 0
            r17 = r0
        L_0x008a:
            r0 = r18
            r1 = r10
            r7 = r3
            r3 = r17
            r14 = r4
            r4 = r8
            r5 = r9
            boolean r0 = r0.h(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x009a
            goto L_0x00d9
        L_0x009a:
            if (r17 == 0) goto L_0x009d
            goto L_0x00a7
        L_0x009d:
            r8.c(r7)
            r0 = 1
            long r4 = r14 + r0
            r7 = 1
            goto L_0x0078
        L_0x00a6:
            r14 = r4
        L_0x00a7:
            if (r16 != 0) goto L_0x00bb
            boolean r2 = r6.X
            boolean r3 = r9.isEmpty()
            r0 = r18
            r1 = r10
            r4 = r8
            r5 = r9
            boolean r0 = r0.h(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00bb
            goto L_0x00d9
        L_0x00bb:
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00d0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00d0
            java.util.concurrent.atomic.AtomicLong r0 = r6.z0
            long r1 = -r14
            r0.addAndGet(r1)
        L_0x00d0:
            gue r0 = r6.y0
            int r1 = -r11
            int r11 = r0.addAndGet(r1)
            if (r11 != 0) goto L_0x00da
        L_0x00d9:
            return
        L_0x00da:
            r7 = 1
            goto L_0x0070
        L_0x00dc:
            gue r1 = r6.y0
            int r0 = -r0
            int r0 = r1.addAndGet(r0)
            if (r0 != 0) goto L_0x00e6
            return
        L_0x00e6:
            java.util.concurrent.atomic.AtomicReference r1 = r6.Z
            java.lang.Object r1 = r1.get()
            r8 = r1
            b1e r8 = (b1e) r8
            r7 = 1
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hue.i():void");
    }

    public final void onError(Throwable th) {
        i15.c(th, "onError called with a null Throwable.");
        if (this.X || this.w0) {
            xs7.F(th);
            return;
        }
        this.Y = th;
        this.X = true;
        Runnable runnable = (Runnable) this.c.getAndSet((Object) null);
        if (runnable != null) {
            runnable.run();
        }
        i();
    }
}
