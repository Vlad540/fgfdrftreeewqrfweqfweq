package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: t15  reason: default package */
public final class t15 extends AtomicReference implements Runnable, xi4 {
    public final bw1 a = new bw1(2);
    public final bw1 b = new bw1(2);

    public t15(Runnable runnable) {
        super(runnable);
    }

    public final void f() {
        if (getAndSet((Object) null) != null) {
            bw1 bw1 = this.a;
            bw1.getClass();
            bj4.a(bw1);
            bw1 bw12 = this.b;
            bw12.getClass();
            bj4.a(bw12);
        }
    }

    public final boolean h() {
        return get() == null;
    }

    public final void run() {
        bw1 bw1 = this.b;
        bw1 bw12 = this.a;
        bj4 bj4 = bj4.a;
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                runnable.run();
                lazySet((Object) null);
                bw12.lazySet(bj4);
                bw1.lazySet(bj4);
            } catch (Throwable th) {
                xs7.F(th);
                throw th;
            }
        }
    }
}
