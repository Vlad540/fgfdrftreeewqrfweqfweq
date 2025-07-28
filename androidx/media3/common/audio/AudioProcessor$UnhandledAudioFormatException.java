package androidx.media3.common.audio;

public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public final h50 a;

    public AudioProcessor$UnhandledAudioFormatException(h50 h50) {
        this("Unhandled input format:", h50);
    }

    public AudioProcessor$UnhandledAudioFormatException(String str, h50 h50) {
        super(str + " " + h50);
        this.a = h50;
    }
}
