package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.LongSparseArray;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.webrtc.protocol.exceptions.RtcRetryLimitExceedException;

/* renamed from: dhc  reason: default package */
public final class dhc {
    public final ghc a;
    public final AtomicReference b = new AtomicReference((Object) null);
    public final hxf c = new hxf(this);
    public final owf d = new owf(2, this);
    public final HandlerThread e;
    public final Handler f;
    public final Handler g = new Handler(Looper.getMainLooper());
    public final Handler h = new Handler(Looper.getMainLooper());
    public final rcc i = new rcc();
    public final AtomicBoolean j = new AtomicBoolean(false);
    public long k = 0;
    public final LongSparseArray l = new LongSparseArray();
    public final LinkedList m = new LinkedList();
    public final jj7 n;
    public final xwb o;

    public dhc(v4b v4b) {
        ghc ghc = (ghc) v4b.c;
        if (ghc != null) {
            this.a = ghc;
            xwb xwb = (xwb) v4b.b;
            this.o = xwb;
            this.n = new jj7(xwb);
            HandlerThread handlerThread = new HandlerThread("RtcCommExec");
            this.e = handlerThread;
            handlerThread.start();
            this.f = new Handler(handlerThread.getLooper());
            return;
        }
        throw new IllegalArgumentException("Illegal 'serializer' value: null");
    }

    public final void a() {
        this.g.removeCallbacksAndMessages((Object) null);
        LinkedList linkedList = this.m;
        linkedList.clear();
        int i2 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.l;
            if (i2 < longSparseArray.size()) {
                long keyAt = longSparseArray.keyAt(i2);
                nwf nwf = (nwf) longSparseArray.valueAt(i2);
                nwf.e = 0;
                nwf.f = 0;
                linkedList.offer(Long.valueOf(keyAt));
                i2++;
            } else {
                return;
            }
        }
    }

    public final void b() {
        Handler handler = this.h;
        jj7 jj7 = this.n;
        az3 az3 = (az3) this.b.get();
        if (az3 != null && az3.b()) {
            LinkedList linkedList = this.m;
            for (Long l2 = (Long) linkedList.poll(); l2 != null; l2 = (Long) linkedList.poll()) {
                LongSparseArray longSparseArray = this.l;
                nwf nwf = (nwf) longSparseArray.get(l2.longValue());
                if (nwf != null) {
                    try {
                        og0 t = this.a.t(nwf.b, nwf.c);
                        byte[] bArr = (byte[]) t.c;
                        int i2 = t.b;
                        boolean e2 = az3.e(i2, bArr);
                        if (e2) {
                            ahc ahc = nwf.c;
                            jj7.getClass();
                            zwf zwf = new zwf(jj7, ahc, 2);
                            Handler handler2 = (Handler) jj7.c;
                            handler2.post(zwf);
                            handler2.post(new axf(jj7, bArr, i2, 1));
                        }
                        if (e2) {
                            if (nwf.c.a()) {
                                jj7.a(nwf.c);
                                longSparseArray.remove(nwf.b);
                            }
                            handler.post(new pfe(18, nwf));
                        } else {
                            c(nwf.b);
                        }
                    } catch (Throwable th) {
                        ahc ahc2 = nwf.c;
                        jj7.getClass();
                        ((Handler) jj7.c).post(new ncd(jj7, ahc2, th, 16));
                        jj7.a(nwf.c);
                        handler.post(new zbe(nwf, 29, th));
                        longSparseArray.remove(nwf.b);
                    }
                }
            }
        }
    }

    public final void c(long j2) {
        long j3 = j2;
        LongSparseArray longSparseArray = this.l;
        nwf nwf = (nwf) longSparseArray.get(j3);
        if (nwf != null && !this.j.get()) {
            bhc bhc = nwf.d;
            long j4 = bhc.e;
            int i2 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
            rcc rcc = this.i;
            if (i2 >= 0) {
                rcc.getClass();
                long j5 = bhc.f;
                if (j5 >= 0) {
                    float f2 = bhc.g;
                    if (f2 >= 0.0f) {
                        float f3 = bhc.h;
                        if (f3 >= 0.0f) {
                            rcc.a = f3;
                            long j6 = nwf.f;
                            if (j6 >= 0) {
                                nwf.e++;
                                float max = Math.max((float) j4, Math.min((float) ((long) (((float) j6) * f2)), (float) j5));
                                long nextGaussian = (long) (max + ((float) (((Random) rcc.b).nextGaussian() * ((double) max) * ((double) rcc.a))));
                                nwf.f = nextGaussian;
                                if (nwf.e >= 0) {
                                    RtcRetryLimitExceedException rtcRetryLimitExceedException = new RtcRetryLimitExceedException();
                                    jj7 jj7 = this.n;
                                    jj7.getClass();
                                    ahc ahc = bhc.b;
                                    ((Handler) jj7.c).post(new ncd(jj7, ahc, rtcRetryLimitExceedException, 16));
                                    jj7.a(ahc);
                                    this.h.post(new zbe(nwf, 29, rtcRetryLimitExceedException));
                                    longSparseArray.remove(j3);
                                    return;
                                }
                                this.g.postDelayed(new chc(this, j3, 1), nextGaussian);
                                return;
                            }
                            throw new IllegalArgumentException(us8.i(j6, "Illegal 'latestRetryTimeout' value: "));
                        }
                        throw new IllegalArgumentException("Illegal 'retryBackoffJitter' value: " + f3);
                    }
                    throw new IllegalArgumentException("Illegal 'retryBackoffFactor' value: " + f2);
                }
                throw new IllegalArgumentException(us8.i(j5, "Illegal 'maxRetryTimeoutMs' value: "));
            }
            rcc.getClass();
            throw new IllegalArgumentException(us8.i(j4, "Illegal 'minRetryTimeoutMs' value: "));
        }
    }

    public final void d(bhc bhc) {
        if (this.j.get()) {
            this.o.log("RTCCommand", "execute on disposed");
        }
        this.f.post(new sbc(this, 5, bhc));
    }
}
