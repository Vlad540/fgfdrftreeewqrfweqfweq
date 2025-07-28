package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: eq4  reason: default package */
public enum eq4 {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    
    public final TimeUnit a;

    /* access modifiers changed from: public */
    eq4(TimeUnit timeUnit) {
        this.a = timeUnit;
    }
}
