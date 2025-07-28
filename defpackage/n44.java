package defpackage;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* renamed from: n44  reason: default package */
public abstract class n44 {
    public static void a(AudioTrack audioTrack, bza bza) {
        zya zya = bza.a;
        zya.getClass();
        LogSessionId logSessionId = zya.a;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            audioTrack.setLogSessionId(logSessionId);
        }
    }
}
