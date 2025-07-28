package defpackage;

import android.media.metrics.LogSessionId;

/* renamed from: s28  reason: default package */
public abstract class s28 {
    public static void a(e28 e28, bza bza) {
        zya zya = bza.a;
        zya.getClass();
        LogSessionId logSessionId = zya.a;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            e28.b.setString("log-session-id", logSessionId.getStringId());
        }
    }
}
