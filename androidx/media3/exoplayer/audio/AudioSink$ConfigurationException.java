package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;

public final class AudioSink$ConfigurationException extends Exception {
    public final xu5 a;

    public AudioSink$ConfigurationException(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, xu5 xu5) {
        super(audioProcessor$UnhandledAudioFormatException);
        this.a = xu5;
    }

    public AudioSink$ConfigurationException(xu5 xu5, String str) {
        super(str);
        this.a = xu5;
    }
}
