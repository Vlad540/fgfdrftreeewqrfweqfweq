package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: gm7  reason: default package */
public enum gm7 {
    c(TimeUnit.MINUTES.toSeconds(20), "MIN_20"),
    o(r1.toSeconds(1), "HOUR_1"),
    X(r1.toSeconds(3), "HOUR_3"),
    Y(r1.toSeconds(24), "HOUR_24"),
    Z(Long.MAX_VALUE, "NO_LIMIT");
    
    public final long a;
    public final long b;

    /* access modifiers changed from: public */
    gm7(long j, String str) {
        this.a = r2;
        this.b = j;
    }
}
