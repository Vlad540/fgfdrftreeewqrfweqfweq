package ru.ok.messages.media.attaches.fragments;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.views.fragments.FrgSlideOut;
import ru.ok.messages.views.widgets.SlideOutLayout;
import ru.ok.tamtam.nano.b;

public abstract class FrgAttachView extends FrgSlideOut {
    public xm8 G1;
    public o10 H1;
    public boolean I1;
    public boolean J1;
    public boolean K1;
    public boolean L1 = false;

    public static Bundle t1(o10 o10, xm8 xm8, boolean z, boolean z2, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("ru.ok.tamtam.extra.PHOTO_ATTACH", o10 != null ? gr8.toByteArray(b.d(o10)) : null);
        bundle.putParcelable("ru.ok.tamtam.extra.MESSAGE", new nr8(xm8));
        bundle.putBoolean("ru.ok.tamtam.extra.EXTRA_ENTER_TRANSITION", z);
        bundle.putBoolean("ru.ok.tamtam.extra.EXTRA_EXIT_TRANSITION", z2);
        bundle.putBoolean("ru.ok.tamtam.extra.START_WITH_LOW_RES", z3);
        return bundle;
    }

    public final void A1() {
        this.H1 = fu7.a(this.Z.getByteArray("ru.ok.tamtam.extra.PHOTO_ATTACH"));
        this.G1 = ((nr8) this.Z.getParcelable("ru.ok.tamtam.extra.MESSAGE")).a;
        this.I1 = this.Z.getBoolean("ru.ok.tamtam.extra.EXTRA_ENTER_TRANSITION", false);
        this.J1 = this.Z.getBoolean("ru.ok.tamtam.extra.EXTRA_EXIT_TRANSITION", false);
        this.K1 = this.Z.getBoolean("ru.ok.tamtam.extra.START_WITH_LOW_RES", false);
    }

    public final void B1(SlideOutLayout slideOutLayout, View view) {
        if (this.I1 || this.J1) {
            view.setTransitionName(this.H1.q);
        }
        if (!this.I1) {
            Z0(true);
            mif w1 = w1();
            if (w1 != null) {
                w1.m();
            }
            slideOutLayout.setSlideOutListener(this);
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [ru.ok.messages.media.attaches.ActAttachesView, android.app.Activity] */
    public final void C1() {
        v06 v1 = s1();
        if (v1 != null) {
            ? r3 = (ActAttachesView) v1;
            if (r3.v1 == 1) {
                r3.B1.d(2, "ATTACHES_SCREEN_TOGGLE_ORIENTATION");
                r3.setRequestedOrientation(0);
                return;
            }
            r3.B1.d(1, "ATTACHES_SCREEN_TOGGLE_ORIENTATION");
            r3.setRequestedOrientation(1);
        }
    }

    public final boolean D() {
        return !this.J1;
    }

    public void D1() {
    }

    public void N(int i) {
        if (this.J1) {
            androidx.fragment.app.b c0 = c0();
            c0.getClass();
            y7.a(c0);
            return;
        }
        super.N(i);
    }

    public final void P0(View view, Bundle bundle) {
        view.setBackgroundColor(-16777216);
        if (this.L1) {
            this.L1 = false;
            z1(this.a1);
        }
    }

    public final void d1(boolean z) {
        FrgAttachView.super.d1(z);
        if (this.H1 != null) {
            z1(z);
        } else {
            this.L1 = true;
        }
    }

    public final String g1() {
        return null;
    }

    public final void n1(r5 r5Var) {
        super.n1(r5Var);
        if (!(r5Var instanceof v06)) {
            throw new RuntimeException("FrgAttachView must be attached to activity that implements FrgAttachView.Listener");
        }
    }

    public final i22 u1() {
        return this.u1.f().B(this.G1.a.x0);
    }

    /* renamed from: v1 */
    public final v06 s1() {
        if (h1() != null) {
            return (v06) h1();
        }
        return null;
    }

    public final mif w1() {
        yle c0 = c0();
        if (c0 instanceof yle) {
            return c0.a();
        }
        return null;
    }

    public void x0(Menu menu, MenuInflater menuInflater) {
        MenuItem g;
        boolean z = !this.G1.a.A() && this.G1.a.c != 0 && (!this.H1.f() || this.H1.b.w0 != 0);
        mif w1 = w1();
        if (w1 != null && (g = w1.g(yqb.menu_attachments__forward)) != null) {
            g.setVisible(z);
        }
    }

    public final void x1(ove ove, j6 j6Var) {
        if (!this.I1) {
            long j = ove.c;
            ((k93) this.t1.b).getClass();
            sk7 m = nqc.a.m();
            m.getClass();
            sk7.b(m, j, true, 2).i(((nbe) ((k93) this.t1.b).q()).b()).m(((nbe) ((k93) this.t1.b).q()).a()).k(new pn1(new e44(this, 12, j6Var), 2, new yc5(18)));
        }
    }

    public void y1(boolean z) {
    }

    public abstract void z1(boolean z);
}
