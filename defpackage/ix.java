package defpackage;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ix  reason: default package */
public final class ix {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public fx c;
    public final AtomicReference d = new AtomicReference();
    public final ga3 e;
    public boolean f;

    public ix(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ga3 ga3 = new ga3(0, false);
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = ga3;
    }

    public static gx b() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    gx gxVar = new gx();
                    return gxVar;
                }
                gx gxVar2 = (gx) arrayDeque.removeFirst();
                return gxVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        if (this.f) {
            try {
                fx fxVar = this.c;
                fxVar.getClass();
                fxVar.removeCallbacksAndMessages((Object) null);
                ga3 ga3 = this.e;
                synchronized (ga3) {
                    ga3.b = false;
                }
                fx fxVar2 = this.c;
                fxVar2.getClass();
                fxVar2.obtainMessage(2).sendToTarget();
                ga3.a();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }
}
