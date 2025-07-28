package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bx6  reason: default package */
public final class bx6 {
    public final MediaCodec a;
    public final int b;
    public final ByteBuffer c;
    public final vn1 d;
    public final sn1 e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public long g = 0;
    public boolean h = false;

    public bx6(MediaCodec mediaCodec, int i) {
        mediaCodec.getClass();
        this.a = mediaCodec;
        e07.m(i);
        this.b = i;
        this.c = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReference = new AtomicReference();
        this.d = hwf.f(new yr0(atomicReference, 5));
        sn1 sn1 = (sn1) atomicReference.get();
        sn1.getClass();
        this.e = sn1;
    }

    public final void a() {
        sn1 sn1 = this.e;
        if (!this.f.getAndSet(true)) {
            try {
                this.a.queueInputBuffer(this.b, 0, 0, 0, 0);
                sn1.b((Object) null);
            } catch (IllegalStateException e2) {
                sn1.d(e2);
            }
        }
    }

    public final void b() {
        sn1 sn1 = this.e;
        ByteBuffer byteBuffer = this.c;
        if (!this.f.getAndSet(true)) {
            try {
                this.a.queueInputBuffer(this.b, byteBuffer.position(), byteBuffer.limit(), this.g, this.h ? 4 : 0);
                sn1.b((Object) null);
            } catch (IllegalStateException e2) {
                sn1.d(e2);
            }
        }
    }
}
