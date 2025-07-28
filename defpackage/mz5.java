package defpackage;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* renamed from: mz5  reason: default package */
public abstract class mz5 {
    public static boolean a(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, cza cza) {
        aza aza = cza.b;
        aza.getClass();
        LogSessionId logSessionId = aza.a;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            MediaDrm.PlaybackComponent d = mediaDrm.getPlaybackComponent(bArr);
            d.getClass();
            tp3.e(d).setLogSessionId(logSessionId);
        }
    }
}
