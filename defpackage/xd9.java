package defpackage;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* renamed from: xd9  reason: default package */
public final class xd9 extends u2 implements kf9, fe9, a9f, p98, o98 {
    public c97 A0;
    public final ty7 B0;
    public final pwc X;
    public final mbe Y;
    public final FrgLocalVideo Z;
    public final q98 c;
    public final Context o;
    public final l8f w0;
    public p7f x0;
    public pn1 y0;
    public c97 z0;

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, o7f] */
    public xd9(lf9 lf9, q98 q98, Context context, pwc pwc, mbe mbe, FrgLocalVideo frgLocalVideo, l8f l8f, ty7 ty7) {
        super(0, (Object) lf9);
        this.c = q98;
        this.o = context;
        this.X = pwc;
        this.Y = mbe;
        this.Z = frgLocalVideo;
        this.w0 = l8f;
        this.B0 = ty7;
        ? obj = new Object();
        obj.a = true;
        this.x0 = new p7f(obj);
        ((v2) lf9).t(this);
        ((al7) q98).e = this;
    }

    public final void D1(Throwable th) {
        udd.n("xd9", "onPlaybackError");
        o7f a = this.x0.a();
        a.b = false;
        a.c = false;
        p7f p7f = new p7f(a);
        this.x0 = p7f;
        ((lf9) ((ge9) this.b)).d(p7f);
        FrgLocalVideo frgLocalVideo = this.Z;
        if (frgLocalVideo != null) {
            frgLocalVideo.Y(th);
        }
    }

    public final void G(Surface surface) {
        ((al7) this.c).q(surface);
    }

    public final void H1() {
        i16 s1;
        ((al7) this.c).m();
        FrgLocalVideo frgLocalVideo = this.Z;
        if (frgLocalVideo != null && (s1 = frgLocalVideo.s1()) != null) {
            s1.c(true, true, false);
        }
    }

    public final void K() {
        udd.n("xd9", "onTrackChanged");
    }

    public final int M0() {
        return ((al7) this.c).g();
    }

    public final void P(int i, int i2, int i3) {
        ((lf9) ((ge9) this.b)).a(i, i2);
    }

    public final int R() {
        return ((al7) this.c).i();
    }

    public final void S0() {
        i16 s1;
        udd.q("xd9", "onPlayClick");
        ((al7) this.c).n();
        FrgLocalVideo frgLocalVideo = this.Z;
        if (!(frgLocalVideo == null || (s1 = frgLocalVideo.s1()) == null)) {
            s1.c(true, true, false);
        }
        if (a()) {
            a2();
            Z1();
        }
    }

    public final void T() {
        FrgLocalVideo frgLocalVideo = this.Z;
        if (frgLocalVideo != null) {
            frgLocalVideo.T();
        }
    }

    public final void W() {
        FrgLocalVideo frgLocalVideo = this.Z;
        if (frgLocalVideo != null) {
            frgLocalVideo.getClass();
        }
    }

    public final void W0() {
        udd.n("xd9", "onMediaPlayerControllerDetach");
    }

    public final void Y0(long j) {
        ((al7) this.c).p(j);
    }

    public final void Z0() {
        c2();
        b2();
    }

    public final void Z1() {
        b2();
        if (this.x0.a) {
            nu9 n = ms9.l(2, TimeUnit.SECONDS).n(de.a());
            c97 c97 = new c97(new wd9(this, 2), new dd9(6), z3d.i);
            n.a(c97);
            this.A0 = c97;
        }
    }

    public final boolean a() {
        return ((al7) this.c).j();
    }

    public final void a2() {
        c2();
        nu9 n = ms9.l(100, TimeUnit.MILLISECONDS).n(de.a());
        c97 c97 = new c97(new wd9(this, 3), new dd9(7), z3d.i);
        n.a(c97);
        this.z0 = c97;
    }

    public final void b2() {
        tic.b(this.A0);
    }

    public final long c() {
        return ((al7) this.c).f();
    }

    public final boolean c0() {
        al7 al7 = (al7) this.c;
        if (al7.f == null) {
            return false;
        }
        n35 n35 = al7.b;
        tgd tgd = n35.a;
        uje O1 = tgd.O1();
        return (!O1.q() && O1.n(tgd.p0(), (sje) tgd.b, 0).x0) || n35.v() == -9223372036854775807L;
    }

    public final void c1() {
    }

    public final void c2() {
        tic.b(this.z0);
    }

    public final void f1() {
    }

    public final void h() {
        i16 s1;
        c2();
        b2();
        o7f a = this.x0.a();
        a.b = false;
        a.c = false;
        a.a = true;
        p7f p7f = new p7f(a);
        this.x0 = p7f;
        ((lf9) ((ge9) this.b)).d(p7f);
        FrgLocalVideo frgLocalVideo = this.Z;
        if (frgLocalVideo != null && (s1 = frgLocalVideo.s1()) != null) {
            s1.c(true, true, false);
        }
    }

    public final void i() {
        o7f a = this.x0.a();
        a.b = ((al7) this.c).j();
        p7f p7f = new p7f(a);
        this.x0 = p7f;
        ((lf9) ((ge9) this.b)).d(p7f);
    }

    public final void i0() {
        udd.n("xd9", "onRenderedFirstFrame");
        j1();
    }

    public final int i1() {
        return ((al7) this.c).h();
    }

    public final int j() {
        u2f u2f = ((al7) this.c).f;
        if (u2f == null) {
            return 0;
        }
        return u2f.j();
    }

    public final void j1() {
        udd.n("xd9", "onPlaybackPrepared");
        boolean j = ((al7) this.c).j();
        o7f a = this.x0.a();
        a.b = j;
        a.c = false;
        p7f p7f = new p7f(a);
        this.x0 = p7f;
        ((lf9) ((ge9) this.b)).d(p7f);
        if (j) {
            a2();
            Z1();
        }
    }

    public final long k() {
        return ((al7) this.c).e();
    }

    public final void k1(boolean z) {
        o7f a = this.x0.a();
        a.a = z;
        p7f p7f = new p7f(a);
        this.x0 = p7f;
        ((lf9) ((ge9) this.b)).d(p7f);
        if (!z) {
            b2();
        } else if (this.x0.b) {
            Z1();
        }
    }

    public final void l1(boolean z) {
        udd.q("xd9", "Release");
        tic.b(this.y0);
        c2();
        b2();
        al7 al7 = (al7) this.c;
        if (al7.g == this) {
            al7.t();
            al7.e = null;
            al7.q((Surface) null);
            al7.g = null;
        }
        lf9 lf9 = (lf9) ((ge9) this.b);
        ((Set) ((v2) lf9).a).remove(this);
        lf9.release();
    }

    public final void m1(int i) {
        long j = (long) i;
        q98 q98 = this.c;
        al7 al7 = (al7) q98;
        al7.p(j);
        o7f a = this.x0.a();
        al7 al72 = (al7) q98;
        a.k = al72.e();
        a.l = al72.c();
        p7f p7f = new p7f(a);
        this.x0 = p7f;
        ((lf9) ((ge9) this.b)).d(p7f);
        if (al7.j()) {
            a2();
            Z1();
        }
    }

    public final void o() {
        udd.n("xd9", "onPlaybackEnded");
        c2();
        b2();
        o7f a = this.x0.a();
        a.b = false;
        a.c = false;
        a.a = true;
        p7f p7f = new p7f(a);
        this.x0 = p7f;
        ((lf9) ((ge9) this.b)).d(p7f);
        FrgLocalVideo frgLocalVideo = this.Z;
        if (frgLocalVideo != null) {
            frgLocalVideo.X();
        }
    }

    public final View u1() {
        View view = (View) ((v2) ((lf9) ((ge9) this.b))).c;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Mvc view root is null");
    }

    public final void y0() {
        udd.n("xd9", "onPlaybackBuffering");
        o7f a = this.x0.a();
        a.c = true;
        p7f p7f = new p7f(a);
        this.x0 = p7f;
        ((lf9) ((ge9) this.b)).d(p7f);
    }
}
