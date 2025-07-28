package android.support.v4.media;

import androidx.media.AudioAttributesImplBase;

public final class AudioAttributesImplBaseParcelizer extends androidx.media.AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(g1f g1f) {
        return androidx.media.AudioAttributesImplBaseParcelizer.read(g1f);
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, g1f g1f) {
        androidx.media.AudioAttributesImplBaseParcelizer.write(audioAttributesImplBase, g1f);
    }
}
