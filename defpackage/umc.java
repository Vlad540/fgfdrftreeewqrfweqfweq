package defpackage;

import java.util.concurrent.Executor;

/* renamed from: umc  reason: default package */
public abstract class umc extends r15 {
    public final nu3 a;

    public umc(int i, int i2, long j) {
        String str = oee.a;
        this.a = new nu3(i, i2, j);
    }

    public final void dispatch(hu3 hu3, Runnable runnable) {
        nu3.o(this.a, runnable, false, 6);
    }

    public final void dispatchYield(hu3 hu3, Runnable runnable) {
        nu3.o(this.a, runnable, true, 2);
    }

    public final Executor n() {
        return this.a;
    }
}
