package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* renamed from: k28  reason: default package */
public abstract class k28 {
    public static void a(a60 a60, Object obj) {
        i30 i30;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        c54 c54 = (c54) a60;
        if (audioDeviceInfo == null) {
            i30 = null;
        } else {
            c54.getClass();
            i30 = new i30(audioDeviceInfo);
        }
        c54.c0 = i30;
        a30 a30 = c54.y;
        if (a30 != null) {
            a30.h(audioDeviceInfo);
        }
        AudioTrack audioTrack = c54.w;
        if (audioTrack != null) {
            m44.a(audioTrack, c54.c0);
        }
    }
}
