package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: jx  reason: default package */
public final class jx implements n28 {
    public static final ArrayDeque Z = new ArrayDeque();
    public static final Object w0 = new Object();
    public final ga3 X;
    public boolean Y;
    public final MediaCodec a;
    public final HandlerThread b;
    public fx c;
    public final AtomicReference o = new AtomicReference();

    public jx(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ga3 ga3 = new ga3(1, false);
        this.a = mediaCodec;
        this.b = handlerThread;
        this.X = ga3;
    }

    public static hx a() {
        ArrayDeque arrayDeque = Z;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    hx hxVar = new hx();
                    return hxVar;
                }
                hx hxVar2 = (hx) arrayDeque.removeFirst();
                return hxVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(long j, int i, int i2, int i3) {
        c();
        hx a2 = a();
        a2.a = i;
        a2.b = 0;
        a2.c = i2;
        a2.e = j;
        a2.f = i3;
        fx fxVar = this.c;
        int i4 = oze.a;
        fxVar.obtainMessage(1, a2).sendToTarget();
    }

    public final void c() {
        RuntimeException runtimeException = (RuntimeException) this.o.getAndSet((Object) null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final void flush() {
        if (this.Y) {
            try {
                fx fxVar = this.c;
                fxVar.getClass();
                fxVar.removeCallbacksAndMessages((Object) null);
                ga3 ga3 = this.X;
                ga3.c();
                fx fxVar2 = this.c;
                fxVar2.getClass();
                fxVar2.obtainMessage(3).sendToTarget();
                ga3.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void i(int i, nw3 nw3, long j, int i2) {
        c();
        hx a2 = a();
        a2.a = i;
        a2.b = 0;
        a2.c = 0;
        a2.e = j;
        a2.f = i2;
        int i3 = nw3.f;
        MediaCodec.CryptoInfo cryptoInfo = a2.d;
        cryptoInfo.numSubSamples = i3;
        int[] iArr = (int[]) nw3.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = (int[]) nw3.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = (byte[]) nw3.b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = (byte[]) nw3.a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = nw3.c;
        if (oze.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(nw3.g, nw3.h));
        }
        this.c.obtainMessage(2, a2).sendToTarget();
    }

    public final void setParameters(Bundle bundle) {
        c();
        fx fxVar = this.c;
        int i = oze.a;
        fxVar.obtainMessage(4, bundle).sendToTarget();
    }

    public final void shutdown() {
        if (this.Y) {
            flush();
            this.b.quit();
        }
        this.Y = false;
    }

    public final void start() {
        if (!this.Y) {
            HandlerThread handlerThread = this.b;
            handlerThread.start();
            this.c = new fx(this, handlerThread.getLooper(), 1);
            this.Y = true;
        }
    }
}
