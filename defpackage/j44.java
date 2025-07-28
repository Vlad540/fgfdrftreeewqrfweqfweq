package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* renamed from: j44  reason: default package */
public abstract class j44 {
    /* JADX WARNING: type inference failed for: r0v2, types: [z40, java.lang.Object] */
    public static a50 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return a50.d;
        }
        ? obj = new Object();
        obj.a = true;
        obj.c = z;
        return obj.a();
    }
}
