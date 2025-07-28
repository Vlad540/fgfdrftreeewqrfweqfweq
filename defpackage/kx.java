package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* renamed from: kx  reason: default package */
public final class kx extends MediaCodec.Callback {
    public final Object a = new Object();
    public final HandlerThread b;
    public Handler c;
    public final xx d;
    public final xx e;
    public final ArrayDeque f;
    public final ArrayDeque g;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public long k;
    public boolean l;
    public IllegalStateException m;

    public kx(HandlerThread handlerThread) {
        this.b = handlerThread;
        this.d = new xx(3, (byte) 0);
        this.e = new xx(3, (byte) 0);
        this.f = new ArrayDeque();
        this.g = new ArrayDeque();
    }

    public final void a(MediaCodec mediaCodec) {
        synchronized (this.a) {
            this.k++;
            Handler handler = this.c;
            int i2 = mze.a;
            handler.post(new c(this, 5, mediaCodec));
        }
    }

    public final void b() {
        ArrayDeque arrayDeque = this.g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        xx xxVar = this.d;
        xxVar.b = 0;
        xxVar.c = -1;
        xxVar.o = 0;
        xx xxVar2 = this.e;
        xxVar2.b = 0;
        xxVar2.c = -1;
        xxVar2.o = 0;
        this.f.clear();
        arrayDeque.clear();
        this.j = null;
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        synchronized (this.a) {
            this.d.d(i2);
        }
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.e.d(-2);
                    this.g.add(mediaFormat);
                    this.i = null;
                }
                this.e.d(i2);
                this.f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.e.d(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }
}
