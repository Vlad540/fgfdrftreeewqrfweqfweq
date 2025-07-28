package android.support.v4.media;

import androidx.media.AudioAttributesCompat;

public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(g1f g1f) {
        return androidx.media.AudioAttributesCompatParcelizer.read(g1f);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, g1f g1f) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, g1f);
    }
}
