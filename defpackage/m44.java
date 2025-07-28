package defpackage;

import android.media.AudioTrack;

/* renamed from: m44  reason: default package */
public abstract class m44 {
    public static void a(AudioTrack audioTrack, i30 i30) {
        audioTrack.setPreferredDevice(i30 == null ? null : i30.a);
    }
}
