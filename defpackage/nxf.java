package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: nxf  reason: default package */
public final class nxf {
    public static final long E;
    public static final String[] F = {"OMX.google.", "OMX.SEC.", "c2.android"};
    public static final long G;
    public final ew A;
    public boolean B;
    public volatile boolean C;
    public int D;
    public final xwb a;
    public final joc b;
    public final byte[] c = new byte[8192];
    public final HandlerThread d;
    public final Handler e;
    public iw9 f;
    public r24 g;
    public final long h;
    public long i;
    public Integer j;
    public Integer k;
    public final AtomicInteger l;
    public final AtomicInteger m;
    public final AtomicInteger n;
    public final AtomicInteger o;
    public final AtomicInteger p;
    public final AtomicInteger q;
    public final AtomicInteger r;
    public final AtomicInteger s;
    public final AtomicInteger t;
    public final lje u;
    public final lje v;
    public final lje w;
    public final lje x;
    public final AtomicInteger y;
    public final AtomicInteger z;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        E = timeUnit.toNanos(1) / 10;
        G = timeUnit.toMillis(3);
    }

    public nxf(xwb xwb, eje eje, joc joc) {
        HandlerThread handlerThread = new HandlerThread("DecoderWrapperControl");
        this.d = handlerThread;
        this.f = null;
        this.h = -1;
        this.i = 0;
        this.l = new AtomicInteger(0);
        this.m = new AtomicInteger(0);
        this.n = new AtomicInteger(0);
        this.o = new AtomicInteger(0);
        this.p = new AtomicInteger(0);
        this.q = new AtomicInteger(0);
        this.r = new AtomicInteger(0);
        this.s = new AtomicInteger(0);
        this.t = new AtomicInteger(0);
        this.u = new lje();
        this.v = new lje();
        this.w = new lje();
        this.x = new lje();
        this.y = new AtomicInteger(0);
        this.z = new AtomicInteger(0);
        this.B = false;
        this.a = xwb;
        this.b = joc;
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper());
        this.A = new ew(eje);
    }

    public final void a() {
        if (!this.C) {
            this.C = true;
            HandlerThread handlerThread = this.d;
            Handler handler = this.e;
            pfe pfe = new pfe(19, this);
            handler.removeCallbacksAndMessages((Object) null);
            handler.post(pfe);
            handlerThread.quitSafely();
        }
    }

    public final void b() {
        iw9 iw9 = this.f;
        if (iw9 != null) {
            try {
                ((ByteArrayOutputStream) iw9.e).close();
            } catch (IOException unused) {
            }
        }
        this.f = null;
    }
}
