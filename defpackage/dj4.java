package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: dj4  reason: default package */
public final class dj4 implements Future {
    public final xi4 a;

    public dj4(xi4 xi4) {
        this.a = xi4;
    }

    public final boolean cancel(boolean z) {
        this.a.f();
        return false;
    }

    public final Object get() {
        return null;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return false;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return null;
    }
}
