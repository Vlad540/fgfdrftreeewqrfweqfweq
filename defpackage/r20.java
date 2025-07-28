package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* renamed from: r20  reason: default package */
public abstract class r20 {
    public static int[] a() {
        ts6 i = ws6.i();
        for (int i2 : v20.e) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i2).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                i.a(Integer.valueOf(i2));
            }
        }
        i.a(2);
        return xie.H(i.j());
    }
}
