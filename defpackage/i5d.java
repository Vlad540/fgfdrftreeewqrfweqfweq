package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: i5d  reason: default package */
public final class i5d extends taf {
    public static final /* synthetic */ k77[] E0;
    public final e3 A0 = hwf.t();
    public final e3 B0 = hwf.t();
    public final e3 C0 = hwf.t();
    public final l05 D0 = new l05(0);
    public final grd X;
    public final t0c Y;
    public final e3 Z = hwf.t();
    public final t97 b;
    public final t97 c;
    public final t97 o;
    public final e3 w0 = hwf.t();
    public final e3 x0 = hwf.t();
    public final e3 y0 = hwf.t();
    public final e3 z0 = hwf.t();

    static {
        Class<i5d> cls = i5d.class;
        E0 = new k77[]{new hc9(cls, "loadVideoJob", "getLoadVideoJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "loadAudioJob", "getLoadAudioJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "loadGifJob", "getLoadGifJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "loadPhotoJob", "getLoadPhotoJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "loadQualityVideoJob", "getLoadQualityVideoJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "loadRoamingJob", "getLoadRoamingJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "loadGifEnablingJob", "getLoadGifEnablingJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "loadAnimojiEnablingJob", "getLoadAnimojiEnablingJob()Lkotlinx/coroutines/Job;")};
    }

    public i5d(t97 t97, t97 t972, t97 t973) {
        this.b = t97;
        this.c = t972;
        this.o = t973;
        grd a = hrd.a(hw4.a);
        this.X = a;
        this.Y = new t0c(a);
        taf.n(this, (hu3) null, (ru3) null, new y4d(this, (Continuation) null), 3);
    }

    public static final Object q(i5d i5d, Continuation continuation) {
        Object U = xs7.U(((pae) i5d.b.getValue()).b(), new z4d(i5d, (Continuation) null), continuation);
        return U == pu3.a ? U : jue.a;
    }

    public static mge t(int i, boolean z) {
        hge hge;
        if (i == -1) {
            hge = z ? new hge(taa.b) : new hge(taa.c);
        } else if (i == 0) {
            hge = new hge(taa.a);
        } else if (i != 1) {
            return new lge("");
        } else {
            hge = new hge(taa.g);
        }
        return hge;
    }

    public final qpc r() {
        return (qpc) this.c.getValue();
    }

    public final void s(int i) {
        int i2 = saa.m;
        k77[] k77Arr = E0;
        if (i == i2) {
            qod n = taf.n(this, (hu3) null, (ru3) null, new b5d(this, !((kp) r()).g.getBoolean("app.media.autoplay.gif", true), (Continuation) null), 3);
            this.B0.o1(this, k77Arr[6], n);
        } else if (i == saa.j) {
            qod n2 = taf.n(this, (hu3) null, (ru3) null, new a5d(this, !((rj) this.o.getValue()).a(), (Continuation) null), 3);
            this.C0.o1(this, k77Arr[7], n2);
        } else if (i == saa.n) {
            qod n3 = taf.n(this, (hu3) null, (ru3) null, new f5d(this, !r().m(), (Continuation) null), 3);
            this.A0.o1(this, k77Arr[5], n3);
        } else {
            int i3 = saa.o;
            l05 l05 = this.D0;
            if (i == i3) {
                taf.o(l05, l8d.e);
            } else if (i == saa.s) {
                w(0);
            } else if (i == saa.u) {
                w(1);
            } else if (i == saa.t) {
                w(-1);
            } else if (i == saa.l) {
                taf.o(l05, l8d.f);
            } else if (i == saa.g) {
                v(0);
            } else if (i == saa.i) {
                v(1);
            } else if (i == saa.h) {
                v(-1);
            } else if (i == saa.k) {
                taf.o(l05, l8d.g);
            } else if (i == saa.a) {
                u(0);
            } else if (i == saa.c) {
                u(1);
            } else if (i == saa.b) {
                u(-1);
            } else if (i == saa.p) {
                taf.o(l05, l8d.h);
            } else if (i == saa.d) {
                x(0);
            } else if (i == saa.f) {
                x(1);
            } else if (i == saa.e) {
                x(-1);
            } else if (i == saa.r) {
                taf.o(l05, l8d.i);
            } else if (i == saa.v) {
                y(n2f.WITHOUT_COMPRESS);
            } else if (i == saa.x) {
                y(n2f.OPTIMAL);
            } else if (i == saa.w) {
                y(n2f.MAXIMUM);
            } else if (i == saa.q) {
                taf.o(l05, j8d.b);
            }
        }
    }

    public final void u(int i) {
        qod n = taf.n(this, (hu3) null, (ru3) null, new c5d(this, i, (Continuation) null), 3);
        this.w0.o1(this, E0[1], n);
    }

    public final void v(int i) {
        qod n = taf.n(this, (hu3) null, (ru3) null, new d5d(this, i, (Continuation) null), 3);
        this.x0.o1(this, E0[2], n);
    }

    public final void w(int i) {
        qod n = taf.n(this, (hu3) null, (ru3) null, new e5d(this, i, (Continuation) null), 3);
        this.y0.o1(this, E0[3], n);
    }

    public final void x(int i) {
        qod n = taf.n(this, (hu3) null, (ru3) null, new g5d(this, i, (Continuation) null), 3);
        this.Z.o1(this, E0[0], n);
    }

    public final void y(n2f n2f) {
        qod n = taf.n(this, (hu3) null, (ru3) null, new h5d(this, n2f, (Continuation) null), 3);
        this.z0.o1(this, E0[4], n);
    }
}
