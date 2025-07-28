package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: j28  reason: default package */
public interface j28 {
    void b(long j, int i, int i2, int i3);

    void d(int i, long j);

    int f();

    void flush();

    int g(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer getInputBuffer(int i);

    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    void h(int i);

    void i(int i, nw3 nw3, long j, int i2);

    void j(Surface surface);

    boolean k(u28 u28) {
        return false;
    }

    void p(i38 i38, Handler handler);

    void release();

    void releaseOutputBuffer(int i, boolean z);

    void setParameters(Bundle bundle);
}
