package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: dv9  reason: default package */
public final class dv9 extends tc3 {
    public final nv9 a;
    public final AtomicReference b;
    public final vu9 c;
    public final nv9 o;

    public dv9(av9 av9, nv9 nv9, AtomicReference atomicReference, vu9 vu9) {
        this.o = av9;
        this.a = nv9;
        this.b = atomicReference;
        this.c = vu9;
    }

    public final void q(bw9 bw9) {
        this.o.a(bw9);
    }

    public final void x(su9 su9) {
        zu9 zu9;
        loop0:
        while (true) {
            AtomicReference atomicReference = this.b;
            zu9 = (zu9) atomicReference.get();
            if (zu9 != null && !zu9.h()) {
                break;
            }
            zu9 zu92 = new zu9(this.c.call(), atomicReference);
            while (true) {
                if (atomicReference.compareAndSet(zu9, zu92)) {
                    zu9 = zu92;
                    break loop0;
                } else if (atomicReference.get() != zu9) {
                }
            }
        }
        AtomicBoolean atomicBoolean = zu9.o;
        boolean z = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
        try {
            su9.accept(zu9);
            if (z) {
                this.a.a(zu9);
            }
        } catch (Throwable th) {
            ek8.a0(th);
            if (z) {
                atomicBoolean.compareAndSet(true, false);
            }
            ek8.a0(th);
            throw i15.f(th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0010 A[LOOP:0: B:4:0x0010->B:7:0x001c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y() {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r2 = r2.b
            java.lang.Object r0 = r2.get()
            zu9 r0 = (defpackage.zu9) r0
            if (r0 == 0) goto L_0x001e
            boolean r1 = r0.h()
            if (r1 == 0) goto L_0x001e
        L_0x0010:
            r1 = 0
            boolean r1 = r2.compareAndSet(r0, r1)
            if (r1 == 0) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            java.lang.Object r1 = r2.get()
            if (r1 == r0) goto L_0x0010
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dv9.y():void");
    }
}
