package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: h93  reason: default package */
public final class h93 {
    public final Context a;
    public final int b;
    public final ArrayList c;
    public uw7 d;
    public m4f e;
    public xu5 f;
    public int g;
    public long h;
    public long i;
    public boolean j;
    public long k;
    public long l;
    public boolean m;
    public long n;
    public p8f o;
    public Executor p;
    public final /* synthetic */ i93 q;

    public h93(i93 i93, Context context) {
        this.q = i93;
        this.a = context;
        this.b = oze.M(context) ? 1 : 5;
        this.c = new ArrayList();
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.o = p8f.v0;
        this.p = i93.E0;
    }

    public final void a(boolean z) {
        if (c()) {
            rc4 rc4 = (rc4) this.e;
            ew0 ew0 = rc4.e;
            ny6 ny6 = rc4.d;
            if (ny6.k != null) {
                try {
                    ew0.c();
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    v2 v2Var = ny6.k;
                    oyb.l(v2Var);
                    v2Var.v();
                    mc4 mc4 = new mc4(0, countDownLatch);
                    synchronized (v2Var.b) {
                        v2Var.c = mc4;
                    }
                    tg5 tg5 = rc4.i;
                    Objects.requireNonNull(tg5);
                    ew0.v(new mc4(1, tg5));
                    countDownLatch.await();
                    synchronized (v2Var.b) {
                        v2Var.c = null;
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        this.m = false;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        i93 i93 = this.q;
        if (i93.C0 == 1) {
            i93.B0++;
            i93.o.a();
            h8e h8e = i93.y0;
            oyb.l(h8e);
            h8e.d(new ds1(14, i93));
        }
        if (z) {
            n4f n4f = i93.c;
            u4f u4f = n4f.b;
            u4f.k = 0;
            u4f.n = -1;
            u4f.l = -1;
            n4f.h = -9223372036854775807L;
            n4f.f = -9223372036854775807L;
            n4f.d(1);
            n4f.i = -9223372036854775807L;
        }
    }

    public final void b(xu5 xu5) {
        z23 z23;
        xu5 xu52 = xu5;
        oyb.k(!c());
        i93 i93 = this.q;
        oyb.k(i93.C0 == 0);
        z23 z232 = xu52.A;
        if (z232 == null || !z232.e()) {
            z232 = z23.h;
        }
        if (z232.c != 7 || oze.a >= 34) {
            z23 = z232;
        } else {
            x23 a2 = z232.a();
            a2.c = 6;
            z23 = new z23(a2.a, a2.b, a2.c, a2.e, a2.f, a2.d);
        }
        Looper myLooper = Looper.myLooper();
        oyb.l(myLooper);
        h8e a3 = i93.Y.a(myLooper, (Handler.Callback) null);
        i93.y0 = a3;
        try {
            i93.z0 = i93.X.a(i93.a, z23, i93, new c93(a3, 0), e8c.X);
            Pair pair = i93.A0;
            if (pair != null) {
                gjd gjd = (gjd) pair.second;
                i93.a((Surface) pair.first, gjd.a, gjd.b);
            }
            i93.z0.c(0);
            i93.C0 = 1;
            this.e = i93.z0.b(0);
        } catch (VideoFrameProcessingException e2) {
            throw new VideoSink$VideoSinkException(e2, xu52);
        }
    }

    public final boolean c() {
        return this.e != null;
    }

    public final void d() {
        if (this.f != null) {
            ArrayList arrayList = new ArrayList();
            uw7 uw7 = this.d;
            if (uw7 != null) {
                arrayList.add(uw7);
            }
            arrayList.addAll(this.c);
            xu5 xu5 = this.f;
            xu5.getClass();
            m4f m4f = this.e;
            oyb.l(m4f);
            int i2 = this.g;
            z23 z23 = xu5.A;
            if (z23 == null || !z23.e()) {
                z23 = z23.h;
            }
            z23 z232 = z23;
            rc4 rc4 = (rc4) m4f;
            rc4.c(i2, arrayList, new bz5(z232, xu5.t, xu5.u, xu5.x, 0));
            this.k = -9223372036854775807L;
        }
    }

    public final void e(long j2, long j3) {
        try {
            this.q.b(j2, j3);
        } catch (ExoPlaybackException e2) {
            xu5 xu5 = this.f;
            if (xu5 == null) {
                xu5 = new uu5().a();
            }
            throw new VideoSink$VideoSinkException(e2, xu5);
        }
    }

    public final void f(Surface surface, gjd gjd) {
        i93 i93 = this.q;
        Pair pair = i93.A0;
        if (pair == null || !((Surface) pair.first).equals(surface) || !((gjd) i93.A0.second).equals(gjd)) {
            i93.A0 = Pair.create(surface, gjd);
            i93.a(surface, gjd.a, gjd.b);
        }
    }
}
