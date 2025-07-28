package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(g1f g1f) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) g1f.g(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = g1f.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, g1f g1f) {
        g1f.getClass();
        g1f.k(audioAttributesImplApi26.a, 1);
        g1f.j(audioAttributesImplApi26.b, 2);
    }
}
