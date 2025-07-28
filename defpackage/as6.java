package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: as6  reason: default package */
public class as6 implements ch7 {
    public static final as6 c = new as6(0, (Object) null);
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ as6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException unused) {
            runnable.toString();
            executor.toString();
        }
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                throw new ExecutionException((Throwable) this.b);
        }
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return super.toString() + "[status=SUCCESS, result=[" + this.b + "]]";
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) this.b) + "]]";
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
