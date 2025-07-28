package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* renamed from: ul8  reason: default package */
public final class ul8 implements b4e {
    public Drawable A0;
    public int B0 = 0;
    public final pl8 C0;
    public w0e D0;
    public MenuItem.OnMenuItemClickListener E0;
    public CharSequence F0;
    public CharSequence G0;
    public ColorStateList H0 = null;
    public PorterDuff.Mode I0 = null;
    public boolean J0 = false;
    public boolean K0 = false;
    public boolean L0 = false;
    public int M0 = 16;
    public int N0;
    public View O0;
    public o7 P0;
    public MenuItem.OnActionExpandListener Q0;
    public boolean R0 = false;
    public CharSequence X;
    public CharSequence Y;
    public Intent Z;
    public final int a;
    public final int b;
    public final int c;
    public final int o;
    public char w0;
    public int x0 = 4096;
    public char y0;
    public int z0 = 4096;

    public ul8(pl8 pl8, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.C0 = pl8;
        this.a = i2;
        this.b = i;
        this.c = i3;
        this.o = i4;
        this.X = charSequence;
        this.N0 = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public final b4e a(o7 o7Var) {
        this.O0 = null;
        this.P0 = o7Var;
        this.C0.p(true);
        o7 o7Var2 = this.P0;
        if (o7Var2 != null) {
            o7Var2.h(new lhd(21, this));
        }
        return this;
    }

    public final o7 b() {
        return this.P0;
    }

    public final boolean collapseActionView() {
        if ((this.N0 & 8) == 0) {
            return false;
        }
        if (this.O0 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.Q0;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.C0.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.L0 && (this.J0 || this.K0)) {
            drawable = drawable.mutate();
            if (this.J0) {
                um4.h(drawable, this.H0);
            }
            if (this.K0) {
                um4.i(drawable, this.I0);
            }
            this.L0 = false;
        }
        return drawable;
    }

    public final boolean e() {
        o7 o7Var;
        if ((this.N0 & 8) == 0) {
            return false;
        }
        if (this.O0 == null && (o7Var = this.P0) != null) {
            this.O0 = o7Var.d(this);
        }
        return this.O0 != null;
    }

    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.Q0;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.C0.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.M0 & 32) == 32;
    }

    public final void g(boolean z) {
        if (z) {
            this.M0 |= 32;
        } else {
            this.M0 &= -33;
        }
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.O0;
        if (view != null) {
            return view;
        }
        o7 o7Var = this.P0;
        if (o7Var == null) {
            return null;
        }
        View d = o7Var.d(this);
        this.O0 = d;
        return d;
    }

    public final int getAlphabeticModifiers() {
        return this.z0;
    }

    public final char getAlphabeticShortcut() {
        return this.y0;
    }

    public final CharSequence getContentDescription() {
        return this.F0;
    }

    public final int getGroupId() {
        return this.b;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.A0;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.B0;
        if (i == 0) {
            return null;
        }
        Drawable n = am7.n(this.C0.a, i);
        this.B0 = 0;
        this.A0 = n;
        return d(n);
    }

    public final ColorStateList getIconTintList() {
        return this.H0;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.I0;
    }

    public final Intent getIntent() {
        return this.Z;
    }

    public final int getItemId() {
        return this.a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.x0;
    }

    public final char getNumericShortcut() {
        return this.w0;
    }

    public final int getOrder() {
        return this.c;
    }

    public final SubMenu getSubMenu() {
        return this.D0;
    }

    public final CharSequence getTitle() {
        return this.X;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.Y;
        return charSequence != null ? charSequence : this.X;
    }

    public final CharSequence getTooltipText() {
        return this.G0;
    }

    public final boolean hasSubMenu() {
        return this.D0 != null;
    }

    public final boolean isActionViewExpanded() {
        return this.R0;
    }

    public final boolean isCheckable() {
        return (this.M0 & 1) == 1;
    }

    public final boolean isChecked() {
        return (this.M0 & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.M0 & 16) != 0;
    }

    public final boolean isVisible() {
        o7 o7Var = this.P0;
        return (o7Var == null || !o7Var.g()) ? (this.M0 & 8) == 0 : (this.M0 & 8) == 0 && this.P0.b();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final MenuItem setActionView(View view) {
        int i;
        this.O0 = view;
        this.P0 = null;
        if (view != null && view.getId() == -1 && (i = this.a) > 0) {
            view.setId(i);
        }
        pl8 pl8 = this.C0;
        pl8.z0 = true;
        pl8.p(true);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.y0 == c2) {
            return this;
        }
        this.y0 = Character.toLowerCase(c2);
        this.C0.p(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.M0;
        boolean z2 = z | (i & true);
        this.M0 = z2 ? 1 : 0;
        if (i != z2) {
            this.C0.p(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        int i = this.M0;
        int i2 = 2;
        if ((i & 4) != 0) {
            pl8 pl8 = this.C0;
            pl8.getClass();
            ArrayList arrayList = pl8.Y;
            int size = arrayList.size();
            pl8.w();
            for (int i3 = 0; i3 < size; i3++) {
                ul8 ul8 = (ul8) arrayList.get(i3);
                if (ul8.b == this.b && (ul8.M0 & 4) != 0 && ul8.isCheckable()) {
                    boolean z2 = ul8 == this;
                    int i4 = ul8.M0;
                    int i5 = (z2 ? 2 : 0) | (i4 & -3);
                    ul8.M0 = i5;
                    if (i4 != i5) {
                        ul8.C0.p(false);
                    }
                }
            }
            pl8.v();
        } else {
            int i6 = i & -3;
            if (!z) {
                i2 = 0;
            }
            int i7 = i6 | i2;
            this.M0 = i7;
            if (i != i7) {
                this.C0.p(false);
            }
        }
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.M0 |= 16;
        } else {
            this.M0 &= -17;
        }
        this.C0.p(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.B0 = 0;
        this.A0 = drawable;
        this.L0 = true;
        this.C0.p(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.H0 = colorStateList;
        this.J0 = true;
        this.L0 = true;
        this.C0.p(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.I0 = mode;
        this.K0 = true;
        this.L0 = true;
        this.C0.p(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.Z = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        if (this.w0 == c2) {
            return this;
        }
        this.w0 = c2;
        this.C0.p(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.Q0 = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.E0 = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.w0 = c2;
        this.y0 = Character.toLowerCase(c3);
        this.C0.p(false);
        return this;
    }

    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.N0 = i;
            pl8 pl8 = this.C0;
            pl8.z0 = true;
            pl8.p(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.X = charSequence;
        this.C0.p(false);
        w0e w0e = this.D0;
        if (w0e != null) {
            w0e.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.Y = charSequence;
        this.C0.p(false);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i = this.M0;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.M0 = i2;
        if (i != i2) {
            pl8 pl8 = this.C0;
            pl8.w0 = true;
            pl8.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.X;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final b4e setContentDescription(CharSequence charSequence) {
        this.F0 = charSequence;
        this.C0.p(false);
        return this;
    }

    public final b4e setTooltipText(CharSequence charSequence) {
        this.G0 = charSequence;
        this.C0.p(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.y0 == c2 && this.z0 == i) {
            return this;
        }
        this.y0 = Character.toLowerCase(c2);
        this.z0 = KeyEvent.normalizeMetaState(i);
        this.C0.p(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.w0 == c2 && this.x0 == i) {
            return this;
        }
        this.w0 = c2;
        this.x0 = KeyEvent.normalizeMetaState(i);
        this.C0.p(false);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.w0 = c2;
        this.x0 = KeyEvent.normalizeMetaState(i);
        this.y0 = Character.toLowerCase(c3);
        this.z0 = KeyEvent.normalizeMetaState(i2);
        this.C0.p(false);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.A0 = null;
        this.B0 = i;
        this.L0 = true;
        this.C0.p(false);
        return this;
    }

    public final MenuItem setTitle(int i) {
        setTitle((CharSequence) this.C0.a.getString(i));
        return this;
    }

    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.C0.a;
        View inflate = LayoutInflater.from(context).inflate(i, new LinearLayout(context), false);
        this.O0 = inflate;
        this.P0 = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.a) > 0) {
            inflate.setId(i2);
        }
        pl8 pl8 = this.C0;
        pl8.z0 = true;
        pl8.p(true);
        return this;
    }
}
