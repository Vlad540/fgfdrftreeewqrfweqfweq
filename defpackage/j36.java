package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: j36  reason: default package */
public class j36 implements ch7 {
    public final ch7 a;
    public sn1 b;

    public j36(ch7 ch7) {
        ch7.getClass();
        this.a = ch7;
    }

    public static j36 a(ch7 ch7) {
        return ch7 instanceof j36 ? (j36) ch7 : new j36(ch7);
    }

    public final void c(Runnable runnable, Executor executor) {
        this.a.c(runnable, executor);
    }

    public boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    public Object get() {
        return this.a.get();
    }

    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    public final boolean isDone() {
        return this.a.isDone();
    }

    public Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }

    public j36() {
        this.a = hwf.f(new za6((Object) this));
    }
}
