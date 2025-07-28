package defpackage;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* renamed from: o44  reason: default package */
public abstract class o44 {
    public static void a(AudioTrack audioTrack, cza cza) {
        aza aza = cza.b;
        aza.getClass();
        LogSessionId logSessionId = aza.a;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            audioTrack.setLogSessionId(logSessionId);
        }
    }
}
