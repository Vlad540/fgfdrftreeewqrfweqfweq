package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* renamed from: s20  reason: default package */
public abstract class s20 {
    public static ws6 a(k20 k20) {
        ts6 i = ws6.i();
        rue g = w20.e.keySet().iterator();
        while (g.hasNext()) {
            Integer num = (Integer) g.next();
            int intValue = num.intValue();
            if (oze.a >= oze.r(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), (AudioAttributes) k20.b().b)) {
                i.a(num);
            }
        }
        i.a(2);
        return i.j();
    }

    public static int b(int i, int i2, k20 k20) {
        for (int i3 = 10; i3 > 0; i3--) {
            int t = oze.t(i3);
            if (t != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(t).build(), (AudioAttributes) k20.b().b)) {
                return i3;
            }
        }
        return 0;
    }
}
