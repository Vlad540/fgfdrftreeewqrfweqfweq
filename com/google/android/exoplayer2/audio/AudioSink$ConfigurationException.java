package com.google.android.exoplayer2.audio;

public final class AudioSink$ConfigurationException extends Exception {
    public final vu5 a;

    public AudioSink$ConfigurationException(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, vu5 vu5) {
        super(audioProcessor$UnhandledAudioFormatException);
        this.a = vu5;
    }

    public AudioSink$ConfigurationException(String str, vu5 vu5) {
        super(str);
        this.a = vu5;
    }
}
