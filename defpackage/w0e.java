package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: w0e  reason: default package */
public final class w0e extends pl8 implements SubMenu {
    public final pl8 O0;
    public final ul8 P0;

    public w0e(Context context, pl8 pl8, ul8 ul8) {
        super(context);
        this.O0 = pl8;
        this.P0 = ul8;
    }

    public final boolean d(ul8 ul8) {
        return this.O0.d(ul8);
    }

    public final boolean e(pl8 pl8, MenuItem menuItem) {
        return super.e(pl8, menuItem) || this.O0.e(pl8, menuItem);
    }

    public final boolean f(ul8 ul8) {
        return this.O0.f(ul8);
    }

    public final MenuItem getItem() {
        return this.P0;
    }

    public final String j() {
        ul8 ul8 = this.P0;
        int i = ul8 != null ? ul8.a : 0;
        if (i == 0) {
            return null;
        }
        return wn6.h(i, "android:menu:actionviewstates:");
    }

    public final pl8 k() {
        return this.O0.k();
    }

    public final boolean m() {
        return this.O0.m();
    }

    public final boolean n() {
        return this.O0.n();
    }

    public final boolean o() {
        return this.O0.o();
    }

    public final void setGroupDividerEnabled(boolean z) {
        this.O0.setGroupDividerEnabled(z);
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        u(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.P0.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean z) {
        this.O0.setQwertyMode(z);
    }

    public final SubMenu setHeaderIcon(int i) {
        u(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        u(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.P0.setIcon(i);
        return this;
    }
}
