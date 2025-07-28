package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: i93  reason: default package */
public final class i93 implements z4f {
    public static final gr E0 = new gr(1);
    public Pair A0;
    public int B0;
    public int C0 = 0;
    public long D0;
    public final n3b X;
    public final z7e Y;
    public final CopyOnWriteArraySet Z;
    public final Context a;
    public final h93 b;
    public final n4f c;
    public final v4f o;
    public xu5 w0;
    public j45 x0;
    public h8e y0;
    public m3b z0;

    public i93(pd pdVar) {
        Context context = (Context) pdVar.b;
        this.a = context;
        h93 h93 = new h93(this, context);
        this.b = h93;
        z7e z7e = (z7e) pdVar.Y;
        this.Y = z7e;
        n4f n4f = (n4f) pdVar.c;
        this.c = n4f;
        n4f.l = z7e;
        this.o = new v4f(new lhd(10, this), n4f);
        f93 f93 = (f93) pdVar.X;
        oyb.l(f93);
        this.X = f93;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.Z = copyOnWriteArraySet;
        copyOnWriteArraySet.add(h93);
    }

    public final void F(long j) {
        if (this.B0 <= 0) {
            long j2 = j - this.D0;
            v4f v4f = this.o;
            r8f r8f = v4f.g;
            if (r8f != null) {
                v4f.d.a(j2, r8f);
                v4f.g = null;
            }
            v4f.f.e(j2);
        }
    }

    public final void a(Surface surface, int i, int i2) {
        if (this.z0 != null) {
            this.z0.l(surface != null ? new p4e(surface, i, i2, 0) : null);
            this.c.h(surface);
        }
    }

    public final void b(long j, long j2) {
        i93 i93 = this;
        if (i93.B0 == 0) {
            while (true) {
                v4f v4f = i93.o;
                xx xxVar = v4f.f;
                if (xxVar.o != 0) {
                    long f = xxVar.f();
                    Long l = (Long) v4f.e.f(f);
                    n4f n4f = v4f.b;
                    if (!(l == null || l.longValue() == v4f.i)) {
                        v4f.i = l.longValue();
                        n4f.d(2);
                    }
                    n4f n4f2 = n4f;
                    xx xxVar2 = xxVar;
                    long j3 = f;
                    int a2 = v4f.b.a(f, j, j2, v4f.i, false, v4f.c);
                    lhd lhd = v4f.a;
                    if (a2 == 0 || a2 == 1) {
                        v4f.j = j3;
                        boolean z = false;
                        boolean z2 = a2 == 0;
                        long h = xxVar2.h();
                        r8f r8f = (r8f) v4f.d.f(h);
                        if (r8f != null && !r8f.equals(r8f.e) && !r8f.equals(v4f.h)) {
                            v4f.h = r8f;
                            lhd.getClass();
                            uu5 uu5 = new uu5();
                            uu5.s = r8f.a;
                            uu5.t = r8f.b;
                            uu5.m = c49.l("video/raw");
                            xu5 xu5 = new xu5(uu5);
                            i93 i932 = (i93) lhd.b;
                            i932.w0 = xu5;
                            Iterator it = i932.Z.iterator();
                            while (it.hasNext()) {
                                h93 h93 = (h93) it.next();
                                h93.p.execute(new g93(h93, h93.o, r8f));
                            }
                        }
                        long j4 = z2 ? -1 : v4f.c.c;
                        if (n4f2.e != 3) {
                            z = true;
                        }
                        n4f2.e = 3;
                        n4f2.l.getClass();
                        n4f2.g = oze.S(SystemClock.elapsedRealtime());
                        i93 i933 = (i93) lhd.b;
                        if (z && i933.A0 != null) {
                            Iterator it2 = i933.Z.iterator();
                            while (it2.hasNext()) {
                                h93 h932 = (h93) it2.next();
                                h932.p.execute(new g93(h932, h932.o, 2));
                            }
                        }
                        if (i933.x0 != null) {
                            if (i933.w0 == null) {
                                new uu5().a();
                            }
                            j45 j45 = i933.x0;
                            i933.Y.getClass();
                            j45.d(h, System.nanoTime());
                        }
                        m3b m3b = i933.z0;
                        oyb.l(m3b);
                        rc4 rc4 = (rc4) m3b.b(m3b.D0);
                        oyb.j("Calling this method is not allowed when renderFramesAutomatically is enabled", !rc4.h);
                        rc4.e.w(new fc4(rc4, j4, 1));
                    } else if (a2 == 2 || a2 == 3 || a2 == 4) {
                        v4f.j = j3;
                        xxVar2.h();
                        i93 i934 = (i93) lhd.b;
                        Iterator it3 = i934.Z.iterator();
                        while (it3.hasNext()) {
                            h93 h933 = (h93) it3.next();
                            h933.p.execute(new g93(h933, h933.o, 1));
                        }
                        m3b m3b2 = i934.z0;
                        oyb.l(m3b2);
                        rc4 rc42 = (rc4) m3b2.b(m3b2.D0);
                        oyb.j("Calling this method is not allowed when renderFramesAutomatically is enabled", !rc42.h);
                        rc42.e.w(new fc4(rc42, -2, 1));
                    } else if (a2 != 5) {
                        throw new IllegalStateException(String.valueOf(a2));
                    } else {
                        return;
                    }
                    i93 = this;
                } else {
                    return;
                }
            }
        }
    }

    public final void c(VideoFrameProcessingException videoFrameProcessingException) {
        Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            h93 h93 = (h93) it.next();
            h93.p.execute(new g5(h93, h93.o, videoFrameProcessingException, 16));
        }
    }

    public final void i(long j) {
        throw new UnsupportedOperationException();
    }

    public final void o(int i, int i2) {
        v4f v4f = this.o;
        v4f.getClass();
        r8f r8f = new r8f(i, i2);
        if (!oze.a(v4f.g, r8f)) {
            v4f.g = r8f;
        }
    }
}
