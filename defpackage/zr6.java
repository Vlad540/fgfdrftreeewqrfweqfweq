package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: zr6  reason: default package */
public final class zr6 extends as6 implements ScheduledFuture {
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Delayed delayed = (Delayed) obj;
        return -1;
    }

    public final long getDelay(TimeUnit timeUnit) {
        return 0;
    }
}
