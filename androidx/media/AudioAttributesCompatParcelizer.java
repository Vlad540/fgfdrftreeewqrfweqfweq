package androidx.media;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(g1f g1f) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.a;
        if (g1f.e(1)) {
            obj = g1f.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, g1f g1f) {
        g1f.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        g1f.i(1);
        g1f.l(audioAttributesImpl);
    }
}
