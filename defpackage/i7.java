package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* renamed from: i7  reason: default package */
public final class i7 implements hm8 {
    public boolean A0;
    public boolean B0;
    public int C0;
    public int D0;
    public int E0;
    public boolean F0;
    public final SparseBooleanArray G0 = new SparseBooleanArray();
    public f7 H0;
    public f7 I0;
    public q36 J0;
    public g7 K0;
    public final lhd L0 = new lhd(1, this);
    public gm8 X;
    public final int Y;
    public final int Z;
    public final Context a;
    public Context b;
    public pl8 c;
    public final LayoutInflater o;
    public jm8 w0;
    public h7 x0;
    public Drawable y0;
    public boolean z0;

    public i7(Context context) {
        int i = asb.abc_action_menu_layout;
        int i2 = asb.abc_action_menu_item_layout;
        this.a = context;
        this.o = LayoutInflater.from(context);
        this.Y = i;
        this.Z = i2;
    }

    public final View a(ul8 ul8, View view, ViewGroup viewGroup) {
        im8 im8;
        View actionView = ul8.getActionView();
        int i = 0;
        if (actionView == null || ul8.e()) {
            if (view instanceof im8) {
                im8 = (im8) view;
            } else {
                im8 = (im8) this.o.inflate(this.Z, viewGroup, false);
            }
            im8.d(ul8);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) im8;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.w0);
            if (this.K0 == null) {
                this.K0 = new g7(this);
            }
            actionMenuItemView.setPopupCallback(this.K0);
            actionView = (View) im8;
        }
        if (ul8.R0) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof k7)) {
            actionView.setLayoutParams(ActionMenuView.e(layoutParams));
        }
        return actionView;
    }

    public final boolean b(w0e w0e) {
        boolean z;
        if (!w0e.hasVisibleItems()) {
            return false;
        }
        w0e w0e2 = w0e;
        while (true) {
            pl8 pl8 = w0e2.O0;
            if (pl8 == this.c) {
                break;
            }
            w0e2 = pl8;
        }
        ViewGroup viewGroup = (ViewGroup) this.w0;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof im8) && ((im8) childAt).getItemData() == w0e2.P0) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        w0e.P0.getClass();
        int size = w0e.Y.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            MenuItem item = w0e.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        f7 f7Var = new f7(this, this.b, w0e, view);
        this.I0 = f7Var;
        f7Var.h = z;
        zl8 zl8 = f7Var.j;
        if (zl8 != null) {
            zl8.o(z);
        }
        f7 f7Var2 = this.I0;
        if (!f7Var2.b()) {
            if (f7Var2.f != null) {
                f7Var2.d(0, 0, false, false);
            } else {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
        }
        gm8 gm8 = this.X;
        if (gm8 != null) {
            gm8.x(w0e);
        }
        return true;
    }

    public final boolean c() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        pl8 pl8 = this.c;
        if (pl8 != null) {
            arrayList = pl8.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.E0;
        int i4 = this.D0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.w0;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            ul8 ul8 = (ul8) arrayList.get(i5);
            int i8 = ul8.N0;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (this.F0 && ul8.R0) {
                i3 = 0;
            }
            i5++;
        }
        if (this.A0 && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.G0;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            ul8 ul82 = (ul8) arrayList.get(i10);
            int i12 = ul82.N0;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = ul82.b;
            if (z3) {
                View a2 = a(ul82, (View) null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                ul82.g(z);
            } else if ((i12 & true) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View a3 = a(ul82, (View) null, viewGroup);
                    a3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a3.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z5 &= i4 + i11 > 0;
                }
                if (z5 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z4) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        ul8 ul83 = (ul8) arrayList.get(i14);
                        if (ul83.b == i13) {
                            if (ul83.f()) {
                                i9++;
                            }
                            ul83.g(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                ul82.g(z5);
            } else {
                ul82.g(false);
                i10++;
                i2 = 2;
                z = true;
            }
            i10++;
            i2 = 2;
            z = true;
        }
        return z;
    }

    public final boolean d(ul8 ul8) {
        return false;
    }

    public final void e(gm8 gm8) {
        this.X = gm8;
    }

    public final void f(pl8 pl8, boolean z) {
        g();
        f7 f7Var = this.I0;
        if (f7Var != null && f7Var.b()) {
            f7Var.j.dismiss();
        }
        gm8 gm8 = this.X;
        if (gm8 != null) {
            gm8.f(pl8, z);
        }
    }

    public final boolean g() {
        jm8 jm8;
        q36 q36 = this.J0;
        if (q36 == null || (jm8 = this.w0) == null) {
            f7 f7Var = this.H0;
            if (f7Var == null) {
                return false;
            }
            if (f7Var.b()) {
                f7Var.j.dismiss();
            }
            return true;
        }
        ((View) jm8).removeCallbacks(q36);
        this.J0 = null;
        return true;
    }

    public final boolean h(ul8 ul8) {
        return false;
    }

    public final void i() {
        jm8 jm8;
        int i;
        ViewGroup viewGroup = (ViewGroup) this.w0;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            pl8 pl8 = this.c;
            if (pl8 != null) {
                pl8.i();
                ArrayList l = this.c.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    ul8 ul8 = (ul8) l.get(i2);
                    if (ul8.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        ul8 itemData = childAt instanceof im8 ? ((im8) childAt).getItemData() : null;
                        View a2 = a(ul8, childAt, viewGroup);
                        if (ul8 != itemData) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.w0).addView(a2, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.x0) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.w0).requestLayout();
        pl8 pl82 = this.c;
        if (pl82 != null) {
            pl82.i();
            ArrayList arrayList2 = pl82.x0;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                o7 o7Var = ((ul8) arrayList2.get(i3)).P0;
            }
        }
        pl8 pl83 = this.c;
        if (pl83 != null) {
            pl83.i();
            arrayList = pl83.y0;
        }
        if (this.A0 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((ul8) arrayList.get(0)).R0;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.x0 == null) {
                this.x0 = new h7(this, this.a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.x0.getParent();
            if (viewGroup3 != this.w0) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.x0);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.w0;
                h7 h7Var = this.x0;
                actionMenuView.getClass();
                k7 c2 = ActionMenuView.c();
                c2.a = true;
                actionMenuView.addView(h7Var, c2);
            }
        } else {
            h7 h7Var2 = this.x0;
            if (h7Var2 != null && h7Var2.getParent() == (jm8 = this.w0)) {
                ((ViewGroup) jm8).removeView(this.x0);
            }
        }
        ((ActionMenuView) this.w0).setOverflowReserved(this.A0);
    }

    public final boolean j() {
        f7 f7Var = this.H0;
        return f7Var != null && f7Var.b();
    }

    public final void k(Context context, pl8 pl8) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = pl8;
        Resources resources = context.getResources();
        if (!this.B0) {
            this.A0 = true;
        }
        int i = 2;
        this.C0 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.E0 = i;
        int i4 = this.C0;
        if (this.A0) {
            if (this.x0 == null) {
                h7 h7Var = new h7(this, this.a);
                this.x0 = h7Var;
                if (this.z0) {
                    h7Var.setImageDrawable(this.y0);
                    this.y0 = null;
                    this.z0 = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.x0.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.x0.getMeasuredWidth();
        } else {
            this.x0 = null;
        }
        this.D0 = i4;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean l() {
        pl8 pl8;
        if (!this.A0 || j() || (pl8 = this.c) == null || this.w0 == null || this.J0 != null) {
            return false;
        }
        pl8.i();
        if (pl8.y0.isEmpty()) {
            return false;
        }
        q36 q36 = new q36((Object) this, (Object) new f7(this, this.b, this.c, (View) this.x0), false, 1);
        this.J0 = q36;
        ((View) this.w0).post(q36);
        return true;
    }
}
