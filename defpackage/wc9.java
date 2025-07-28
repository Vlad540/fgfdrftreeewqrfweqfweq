package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: wc9  reason: default package */
public final class wc9 {
    public final int a;
    public final ByteBuffer b;
    public final MediaCodec.BufferInfo c;

    public wc9(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.a = i;
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
        this.b = allocate;
        allocate.put(byteBuffer);
        allocate.limit(byteBuffer.limit());
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        this.c = bufferInfo2;
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
    }
}
