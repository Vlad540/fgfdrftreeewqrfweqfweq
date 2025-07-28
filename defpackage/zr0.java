package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zr0  reason: default package */
public final class zr0 implements xw4 {
    public final ByteBuffer a;
    public final MediaCodec.BufferInfo b;
    public final sn1 c;

    public zr0(xw4 xw4) {
        MediaCodec.BufferInfo F = xw4.F();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, F.size, F.presentationTimeUs, F.flags);
        this.b = bufferInfo;
        ByteBuffer r = xw4.r();
        MediaCodec.BufferInfo F2 = xw4.F();
        r.position(F2.offset);
        r.limit(F2.offset + F2.size);
        ByteBuffer allocate = ByteBuffer.allocate(F2.size);
        allocate.order(r.order());
        allocate.put(r);
        allocate.flip();
        this.a = allocate;
        AtomicReference atomicReference = new AtomicReference();
        hwf.f(new yr0(atomicReference, 0));
        sn1 sn1 = (sn1) atomicReference.get();
        sn1.getClass();
        this.c = sn1;
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
        this.c.b((Object) null);
    }

    public final ByteBuffer r() {
        return this.a;
    }

    public final long size() {
        return (long) this.b.size;
    }
}
