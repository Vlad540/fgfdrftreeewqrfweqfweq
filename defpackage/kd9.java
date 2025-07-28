package defpackage;

import android.view.Surface;
import android.view.View;
import java.util.Set;

/* renamed from: kd9  reason: default package */
public final class kd9 extends u2 implements kf9, fe9, a9f, p98, o98 {
    public final ee9 X;
    public d96 Y;
    public final q98 c;
    public final bf5 o;

    public kd9(bf9 bf9, q98 q98, bf5 bf5, ee9 ee9) {
        super(0, (Object) bf9);
        this.c = q98;
        this.o = bf5;
        this.X = ee9;
        bf9.t(this);
        ((al7) q98).e = this;
    }

    public final void D1(Throwable th) {
        ee9 ee9 = this.X;
        if (ee9 != null) {
            ee9.Y(th);
        }
    }

    public final void G(Surface surface) {
        ((al7) this.c).q(surface);
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

    public final void T() {
        ee9 ee9 = this.X;
        if (ee9 != null) {
            ee9.T();
        }
    }

    public final void W() {
        ee9 ee9 = this.X;
        if (ee9 != null) {
            ee9.W();
        }
    }

    public final void W0() {
        udd.n("kd9", "onMediaPlayerControllerDetach");
    }

    public final boolean a() {
        return ((al7) this.c).j();
    }

    public final long c() {
        return ((al7) this.c).f();
    }

    public final boolean c0() {
        return false;
    }

    public final void c1() {
        ee9 ee9;
        if (this.Y != null && (ee9 = this.X) != null) {
            ee9.X();
        }
    }

    public final void f1() {
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

    public final long k() {
        return ((al7) this.c).e();
    }

    public final void l1(boolean z) {
        al7 al7 = (al7) this.c;
        if (al7.g == this) {
            al7.t();
            al7.e = null;
            al7.q((Surface) null);
            al7.g = null;
            this.Y = null;
            lf9 lf9 = (lf9) ((ge9) this.b);
            ((Set) ((v2) lf9).a).remove(this);
            lf9.release();
        }
    }

    public final View u1() {
        View view = (View) ((v2) ((lf9) ((ge9) this.b))).c;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Mvc view root is null");
    }
}
