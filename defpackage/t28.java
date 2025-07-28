package defpackage;

import android.media.metrics.LogSessionId;

/* renamed from: t28  reason: default package */
public abstract class t28 {
    public static void a(f28 f28, cza cza) {
        aza aza = cza.b;
        aza.getClass();
        LogSessionId logSessionId = aza.a;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            f28.b.setString("log-session-id", logSessionId.getStringId());
        }
    }
}
