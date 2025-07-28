package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: r1b  reason: default package */
public abstract class r1b {
    public static final long a = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    public static final long b = SystemClock.elapsedRealtimeNanos();
}
