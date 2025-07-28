package com.google.android.exoplayer2.audio;

public final class AudioSink$WriteException extends Exception {
    public final boolean a;
    public final vu5 b;

    public AudioSink$WriteException(int i, vu5 vu5, boolean z) {
        super(m4b.h(36, i, "AudioTrack write failed: "));
        this.a = z;
        this.b = vu5;
    }
}
