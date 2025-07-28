package androidx.media;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(g1f g1f) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = g1f.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = g1f.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = g1f.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = g1f.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, g1f g1f) {
        g1f.getClass();
        g1f.j(audioAttributesImplBase.a, 1);
        g1f.j(audioAttributesImplBase.b, 2);
        g1f.j(audioAttributesImplBase.c, 3);
        g1f.j(audioAttributesImplBase.d, 4);
    }
}
