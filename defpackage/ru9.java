package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ru9  reason: default package */
public final class ru9 extends tc3 {
    public final nv9 a;
    public final AtomicReference b = new AtomicReference();

    public ru9(ts9 ts9) {
        this.a = ts9;
    }

    public final void q(bw9 bw9) {
        qu9 qu9;
        pu9[] pu9Arr;
        pu9[] pu9Arr2;
        loop0:
        while (true) {
            AtomicReference atomicReference = this.b;
            qu9 = (qu9) atomicReference.get();
            if (qu9 != null) {
                break;
            }
            qu9 qu92 = new qu9(atomicReference);
            while (true) {
                if (atomicReference.compareAndSet(qu9, qu92)) {
                    qu9 = qu92;
                    break loop0;
                } else if (atomicReference.get() != qu9) {
                }
            }
        }
        pu9 pu9 = new pu9(bw9, qu9);
        bw9.d(pu9);
        do {
            pu9Arr = (pu9[]) qu9.get();
            if (pu9Arr == qu9.Y) {
                Throwable th = qu9.o;
                if (th != null) {
                    bw9.onError(th);
                    return;
                } else {
                    bw9.b();
                    return;
                }
            } else {
                int length = pu9Arr.length;
                pu9Arr2 = new pu9[(length + 1)];
                System.arraycopy(pu9Arr, 0, pu9Arr2, 0, length);
                pu9Arr2[length] = pu9;
            }
        } while (!qu9.compareAndSet(pu9Arr, pu9Arr2));
        if (pu9.h()) {
            qu9.a(pu9);
        }
    }

    public final void x(su9 su9) {
        qu9 qu9;
        loop0:
        while (true) {
            AtomicReference atomicReference = this.b;
            qu9 = (qu9) atomicReference.get();
            if (qu9 != null && !qu9.h()) {
                break;
            }
            qu9 qu92 = new qu9(atomicReference);
            while (true) {
                if (atomicReference.compareAndSet(qu9, qu92)) {
                    qu9 = qu92;
                    break loop0;
                } else if (atomicReference.get() != qu9) {
                }
            }
        }
        AtomicBoolean atomicBoolean = qu9.a;
        boolean z = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z = true;
        }
        try {
            su9.accept(qu9);
            if (z) {
                this.a.a(qu9);
            }
        } catch (Throwable th) {
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
            qu9 r0 = (defpackage.qu9) r0
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ru9.y():void");
    }
}
