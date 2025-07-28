package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: b69  reason: default package */
public interface b69 {
    @lj4
    long now() {
        return TimeUnit.NANOSECONDS.toMillis(nowNanos());
    }

    @lj4
    long nowNanos();
}
