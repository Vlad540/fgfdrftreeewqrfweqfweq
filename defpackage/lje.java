package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: lje  reason: default package */
public final class lje {
    public volatile long a;
    public final et4 b = new et4();
    public volatile boolean c = false;

    public final synchronized void a() {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (this.a == 0) {
            this.a = elapsedRealtimeNanos;
            return;
        }
        long j = elapsedRealtimeNanos - this.a;
        if (!this.c) {
            this.b.b = (double) j;
            this.c = true;
        } else {
            this.b.a((double) j);
        }
        this.a = elapsedRealtimeNanos;
    }

    public final double b() {
        return ((double) TimeUnit.SECONDS.toNanos(1)) / this.b.b;
    }
}
