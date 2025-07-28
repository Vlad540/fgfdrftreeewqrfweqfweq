package androidx.media3.exoplayer.audio;

public final class AudioSink$WriteException extends Exception {
    public final int a;
    public final boolean b;
    public final xu5 c;

    public AudioSink$WriteException(int i, xu5 xu5, boolean z) {
        super(wn6.h(i, "AudioTrack write failed: "));
        this.b = z;
        this.a = i;
        this.c = xu5;
    }
}
