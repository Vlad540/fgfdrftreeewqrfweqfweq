package ru.ok.messages.media.mediabar;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.WeakHashMap;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class FrgLocalVideo extends FrgLocalMedia implements ee9 {
    public q98 M1;
    public se9 N1;
    public xd9 O1;
    public SimpleDraweeView P1;
    public ty7 Q1;

    public final boolean H0(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || !this.s1) {
            return true;
        }
        f1();
        return true;
    }

    public final void I0() {
        super.I0();
        x1();
    }

    public final void L0() {
        super.L0();
        this.I1.c();
    }

    public final void O(tk7 tk7, Uri uri, int i, Uri uri2) {
        if (uri != null) {
            this.P1.setImageURI(uri);
        }
    }

    public final void T() {
        i16 s1 = s1();
        if (s1 != null) {
            s1.e();
        }
    }

    public final void X() {
        i16 s1 = s1();
        if (s1 != null) {
            s1.c(true, true, false);
        }
    }

    public final void Y(Throwable th) {
        a06.H(0, e0(), che.b(e0(), th));
    }

    public final void j1() {
        xd9 xd9 = this.O1;
        if (xd9 != null) {
            ge9 ge9 = (ge9) xd9.b;
            if (ge9 instanceof xhe) {
                ((xhe) ge9).c();
            }
        }
    }

    public final void u1() {
        if (this.O1 != null) {
            i16 s1 = s1();
            if (s1 == null || !s1.f()) {
                this.O1.k1(false);
            } else {
                this.O1.k1(true);
            }
        }
    }

    public final void v1() {
        if (this.O1 != null) {
            tk7 tk7 = this.G1;
            if (tk7 == null || ((tk7 instanceof mz) && r1g.p(((mz) tk7).y0.r))) {
                udd.q("ru.ok.messages.media.mediabar.FrgLocalMedia", "bindLocalMedia: Can't bind local media. Skip");
                ((View) this.N1.c).setVisibility(8);
                return;
            }
            udd.q("ru.ok.messages.media.mediabar.FrgLocalMedia", "bindLocalMedia: Bind local media success");
            ((View) this.N1.c).setVisibility(0);
            xd9 xd9 = this.O1;
            tk7 tk72 = this.G1;
            xd9.getClass();
            udd.p("xd9", "Bind local media %s", new Object[]{Long.valueOf(tk72.b)});
            ((al7) xd9.c).j = false;
            tic.b(xd9.y0);
            xd9.c2();
            xd9.b2();
            o7f a = xd9.x0.a();
            a.c = true;
            a.e = true;
            a.f = false;
            a.g = false;
            a.n = null;
            a.s = true;
            p7f p7f = new p7f(a);
            xd9.x0 = p7f;
            ((lf9) ((ge9) xd9.b)).d(p7f);
            boolean z = tk72 instanceof mz;
            mbe mbe = xd9.Y;
            if (z) {
                mz mzVar = (mz) tk72;
                if (r1g.p(mzVar.y0.r)) {
                    nbe nbe = (nbe) mbe;
                    yhd i = xd9.w0.c(mzVar.y0, mzVar.z0, mzVar.A0).m(nbe.a()).i(nbe.b());
                    pn1 pn1 = new pn1(new wd9(xd9, 0), 2, new wd9(xd9, 1));
                    i.k(pn1);
                    xd9.y0 = pn1;
                    return;
                }
            }
            mv9 mv9 = new mv9(1, new w48(xd9, 12, tk72));
            mbe.getClass();
            nbe nbe2 = (nbe) mbe;
            yhd i2 = mv9.m(nbe2.a()).i(nbe2.b());
            pn1 pn12 = new pn1(new wd9(xd9, 0), 2, new wd9(xd9, 1));
            i2.k(pn12);
            xd9.y0 = pn12;
        }
    }

    public final void w1() {
        x1();
        View view = (View) this.N1.c;
        if (view != null) {
            view.setVisibility(0);
        }
        this.O1 = new xd9(this.N1, this.M1, e0(), ((k93) this.t1.b).j().f, ((k93) this.t1.b).q(), this, ((k93) this.t1.b).s(), this.Q1);
        v1();
    }

    public final void x1() {
        if (this.O1 != null) {
            udd.q("ru.ok.messages.media.mediabar.FrgLocalMedia", "Release");
            ((al7) this.O1.c).m();
            this.O1.l1(false);
            this.O1 = null;
        }
    }

    public final View y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(zrb.frg_local_video, viewGroup, false);
        slideOutLayout.setSlideOutListener(this);
        slideOutLayout.setBackgroundColor(this.v1.m);
        this.M1 = c0().b();
        this.Q1 = c0() instanceof ty7 ? (ty7) c0() : null;
        this.N1 = new se9(e0(), slideOutLayout.findViewById(yqb.frg_local_video__player), ((k93) this.t1.b).c(), ((k93) this.t1.b).b());
        if (bundle != null || !this.Z.getBoolean("ru.ok.messages.extra.ANIMATED_FRAGMENT")) {
            ((View) this.N1.c).setVisibility(8);
        } else {
            this.O1 = new xd9(this.N1, this.M1, e0(), ((k93) this.t1.b).j().f, ((k93) this.t1.b).q(), this, ((k93) this.t1.b).s(), this.Q1);
            v1();
        }
        SimpleDraweeView findViewById = slideOutLayout.findViewById(yqb.frg_local_video__iv_video);
        this.P1 = findViewById;
        at7.i(findViewById, new f5(9, this));
        SimpleDraweeView simpleDraweeView = this.P1;
        if (this.H1) {
            simpleDraweeView.setTransitionName(this.G1.a());
        }
        hy5 hy5 = new hy5(2, this);
        WeakHashMap weakHashMap = eaf.a;
        t9f.u(slideOutLayout, hy5);
        r9f.c(slideOutLayout);
        return slideOutLayout;
    }

    public final void z0() {
        super.z0();
        x1();
    }
}
