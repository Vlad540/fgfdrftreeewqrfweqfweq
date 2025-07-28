package androidx.media3.transformer;

import android.os.SystemClock;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;

public final class ExportException extends Exception {
    public static final d8c b;
    public final int a;

    /* JADX WARNING: type inference failed for: r0v0, types: [jn, fs6] */
    static {
        ? jnVar = new jn(4);
        jnVar.J("ERROR_CODE_FAILED_RUNTIME_CHECK", 1001);
        jnVar.J("ERROR_CODE_IO_UNSPECIFIED", 2000);
        jnVar.J("ERROR_CODE_IO_NETWORK_CONNECTION_FAILED", 2001);
        jnVar.J("ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT", 2002);
        jnVar.J("ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE", 2003);
        jnVar.J("ERROR_CODE_IO_BAD_HTTP_STATUS", 2004);
        jnVar.J("ERROR_CODE_IO_FILE_NOT_FOUND", 2005);
        jnVar.J("ERROR_CODE_IO_NO_PERMISSION", 2006);
        jnVar.J("ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED", 2007);
        jnVar.J("ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE", 2008);
        jnVar.J("ERROR_CODE_DECODER_INIT_FAILED", 3001);
        jnVar.J("ERROR_CODE_DECODING_FAILED", 3002);
        jnVar.J("ERROR_CODE_DECODING_FORMAT_UNSUPPORTED", 3003);
        jnVar.J("ERROR_CODE_ENCODER_INIT_FAILED", 4001);
        jnVar.J("ERROR_CODE_ENCODING_FAILED", 4002);
        jnVar.J("ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED", 4003);
        jnVar.J("ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED", 5001);
        jnVar.J("ERROR_CODE_AUDIO_PROCESSING_FAILED", 6001);
        jnVar.J("ERROR_CODE_MUXING_FAILED", 7001);
        jnVar.J("ERROR_CODE_MUXING_TIMEOUT", 7002);
        jnVar.J("ERROR_CODE_MUXING_APPEND", 7003);
        b = jnVar.k();
    }

    public ExportException(String str, Throwable th, int i) {
        super(str, th);
        this.a = i;
        SystemClock.elapsedRealtime();
    }

    public static ExportException a(Throwable th, int i) {
        return new ExportException("Asset loader error", th, i);
    }

    public static ExportException b(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, String str) {
        StringBuilder m = hr1.m("Audio error: ", str, ", audioFormat=");
        m.append(audioProcessor$UnhandledAudioFormatException.a);
        return new ExportException(m.toString(), audioProcessor$UnhandledAudioFormatException, 6001);
    }

    public static ExportException c(Throwable th, int i, od3 od3) {
        return new ExportException("Codec exception: " + od3, th, i);
    }

    public static ExportException d(Exception exc, int i) {
        return new ExportException("Muxer error", exc, i);
    }

    public static ExportException e(Exception exc) {
        return exc instanceof RuntimeException ? new ExportException("Unexpected runtime error", exc, 1001) : new ExportException("Unexpected error", exc, 1000);
    }
}
