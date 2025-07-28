package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ce4  reason: default package */
public final class ce4 extends n3 implements ScheduledFuture {
    public final ScheduledFuture w0;

    public ce4(be4 be4) {
        this.w0 = be4.b(new c9(9, this));
    }

    public final void b() {
        ScheduledFuture scheduledFuture = this.w0;
        Object obj = this.a;
        scheduledFuture.cancel((obj instanceof h3) && ((h3) obj).a);
    }

    public final int compareTo(Object obj) {
        return this.w0.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.w0.getDelay(timeUnit);
    }
}
