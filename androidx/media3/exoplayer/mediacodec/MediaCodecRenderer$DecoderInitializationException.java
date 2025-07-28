package androidx.media3.exoplayer.mediacodec;

import me.leolin.shortcutbadger.BuildConfig;

public class MediaCodecRenderer$DecoderInitializationException extends Exception {
    public final String a;
    public final boolean b;
    public final p28 c;
    public final String o;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaCodecRenderer$DecoderInitializationException(xu5 xu5, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + xu5, mediaCodecUtil$DecoderQueryException, xu5.n, z, (p28) null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : BuildConfig.FLAVOR) + Math.abs(i));
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th, String str2, boolean z, p28 p28, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = p28;
        this.o = str3;
    }
}
