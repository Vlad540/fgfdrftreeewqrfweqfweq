package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bs6  reason: default package */
public final class bs6 implements ch7 {
    public static final bs6 b = new bs6((Object) null);
    public static final fq3 c = new fq3(bs6.class);
    public final Object a;

    public bs6(Object obj) {
        this.a = obj;
    }

    public final void c(Runnable runnable, Executor executor) {
        a06.m(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger b2 = c.b();
            Level level = Level.SEVERE;
            b2.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final Object get() {
        return this.a;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.a + "]]";
    }

    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a;
    }
}
