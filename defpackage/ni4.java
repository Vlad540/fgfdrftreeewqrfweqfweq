package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ni4  reason: default package */
public final class ni4 implements Executor {
    public final ju3 a;

    public ni4(ju3 ju3) {
        this.a = ju3;
    }

    public final void execute(Runnable runnable) {
        bw4 bw4 = bw4.a;
        ju3 ju3 = this.a;
        if (ju3.isDispatchNeeded(bw4)) {
            ju3.dispatch(bw4, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
