package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(g1f g1f) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) g1f.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = g1f.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, g1f g1f) {
        g1f.getClass();
        g1f.k(audioAttributesImplApi21.a, 1);
        g1f.j(audioAttributesImplApi21.b, 2);
    }
}
