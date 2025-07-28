package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: pod  reason: default package */
public final class pod extends n7 implements nl8 {
    public m7 X;
    public WeakReference Y;
    public boolean Z;
    public Context c;
    public ActionBarContextView o;
    public pl8 w0;

    public final void a() {
        if (!this.Z) {
            this.Z = true;
            this.X.i(this);
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
        return this.w0;
    }

    public final boolean d(pl8 pl8, MenuItem menuItem) {
        return this.X.h(this, menuItem);
    }

    public final MenuInflater e() {
        return new a4e(this.o.getContext());
    }

    public final CharSequence f() {
        return this.o.getSubtitle();
    }

    public final CharSequence g() {
        return this.o.getTitle();
    }

    public final void h() {
        this.X.n(this, this.w0);
    }

    public final boolean i() {
        return this.o.K0;
    }

    public final void j(View view) {
        this.o.setCustomView(view);
        this.Y = view != null ? new WeakReference(view) : null;
    }

    public final void k(int i) {
        l(this.c.getString(i));
    }

    public final void l(CharSequence charSequence) {
        this.o.setSubtitle(charSequence);
    }

    public final void m(int i) {
        n(this.c.getString(i));
    }

    public final void n(CharSequence charSequence) {
        this.o.setTitle(charSequence);
    }

    public final void o(boolean z) {
        this.a = z;
        this.o.setTitleOptional(z);
    }

    public final void r(pl8 pl8) {
        h();
        i7 i7Var = this.o.o;
        if (i7Var != null) {
            i7Var.l();
        }
    }
}
