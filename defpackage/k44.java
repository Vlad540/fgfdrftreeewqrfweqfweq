package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* renamed from: k44  reason: default package */
public abstract class k44 {
    /* JADX WARNING: type inference failed for: r4v1, types: [z40, java.lang.Object] */
    public static a50 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int a = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (a == 0) {
            return a50.d;
        }
        ? obj = new Object();
        boolean z2 = oze.a > 32 && a == 2;
        obj.a = true;
        obj.b = z2;
        obj.c = z;
        return obj.a();
    }
}
