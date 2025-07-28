package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: yw4  reason: default package */
public final class yw4 implements xw4 {
    public final vn1 X;
    public final sn1 Y;
    public final AtomicBoolean Z = new AtomicBoolean(false);
    public final MediaCodec a;
    public final MediaCodec.BufferInfo b;
    public final int c;
    public final ByteBuffer o;

    public yw4(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.a = mediaCodec;
        this.c = i;
        this.o = mediaCodec.getOutputBuffer(i);
        this.b = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        this.X = hwf.f(new yr0(atomicReference, 2));
        sn1 sn1 = (sn1) atomicReference.get();
        sn1.getClass();
        this.Y = sn1;
    }

    public final MediaCodec.BufferInfo F() {
        return this.b;
    }

    public final boolean I() {
        return (this.b.flags & 1) != 0;
    }

    public final long Y() {
        return this.b.presentationTimeUs;
    }

    public final void close() {
        sn1 sn1 = this.Y;
        if (!this.Z.getAndSet(true)) {
            try {
                this.a.releaseOutputBuffer(this.c, false);
                sn1.b((Object) null);
            } catch (IllegalStateException e) {
                sn1.d(e);
            }
        }
    }

    public final ByteBuffer r() {
        if (!this.Z.get()) {
            MediaCodec.BufferInfo bufferInfo = this.b;
            int i = bufferInfo.offset;
            ByteBuffer byteBuffer = this.o;
            byteBuffer.position(i);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            return byteBuffer;
        }
        throw new IllegalStateException("encoded data is closed.");
    }

    public final long size() {
        return (long) this.b.size;
    }
}
