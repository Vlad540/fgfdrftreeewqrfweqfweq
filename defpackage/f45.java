package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;

/* renamed from: f45  reason: default package */
public abstract class f45 {
    public static cza a(Context context, n45 n45, boolean z, String str) {
        MediaMetricsManager g = tp3.g(context.getSystemService("media_metrics"));
        d88 d88 = g == null ? null : new d88(context, g.createPlaybackSession());
        if (d88 == null) {
            ez3.j0("MediaMetricsService unavailable.");
            return new cza(LogSessionId.LOG_SESSION_ID_NONE, str);
        }
        if (z) {
            n45.getClass();
            g44 g44 = n45.H0;
            g44.getClass();
            g44.Y.a(d88);
        }
        return new cza(d88.c.getSessionId(), str);
    }
}
