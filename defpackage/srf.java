package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: srf  reason: default package */
public final class srf extends n7 implements nl8 {
    public m7 X;
    public WeakReference Y;
    public final /* synthetic */ trf Z;
    public final Context c;
    public final pl8 o;

    public srf(trf trf, Context context, b2b b2b) {
        this.Z = trf;
        this.c = context;
        this.X = b2b;
        pl8 pl8 = new pl8(context);
        pl8.A0 = 1;
        this.o = pl8;
        pl8.X = this;
    }

    public final void a() {
        trf trf = this.Z;
        if (trf.n == this) {
            if (trf.u) {
                trf.o = this;
                trf.p = this.X;
            } else {
                this.X.i(this);
            }
            this.X = null;
            trf.g0(false);
            ActionBarContextView actionBarContextView = trf.k;
            if (actionBarContextView.C0 == null) {
                actionBarContextView.e();
            }
            trf.h.setHideOnContentScrollEnabled(trf.z);
            trf.n = null;
        }
    }

    public final View b() {
        WeakReference weakReference = this.Y;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final pl8 c() {
        return this.o;
    }

    public final boolean d(pl8 pl8, MenuItem menuItem) {
        m7 m7Var = this.X;
        if (m7Var != null) {
            return m7Var.h(this, menuItem);
        }
        return false;
    }

    public final MenuInflater e() {
        return new a4e(this.c);
    }

    public final CharSequence f() {
        return this.Z.k.getSubtitle();
    }

    public final CharSequence g() {
        return this.Z.k.getTitle();
    }

    public final void h() {
        if (this.Z.n == this) {
            pl8 pl8 = this.o;
            pl8.w();
            try {
                this.X.n(this, pl8);
            } finally {
                pl8.v();
            }
        }
    }

    public final boolean i() {
        return this.Z.k.K0;
    }

    public final void j(View view) {
        this.Z.k.setCustomView(view);
        this.Y = new WeakReference(view);
    }

    public final void k(int i) {
        l(this.Z.f.getResources().getString(i));
    }

    public final void l(CharSequence charSequence) {
        this.Z.k.setSubtitle(charSequence);
    }

    public final void m(int i) {
        n(this.Z.f.getResources().getString(i));
    }

    public final void n(CharSequence charSequence) {
        this.Z.k.setTitle(charSequence);
    }

    public final void o(boolean z) {
        this.a = z;
        this.Z.k.setTitleOptional(z);
    }

    public final void r(pl8 pl8) {
        if (this.X != null) {
            h();
            i7 i7Var = this.Z.k.o;
            if (i7Var != null) {
                i7Var.l();
            }
        }
    }
}
