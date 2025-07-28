package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* renamed from: rle  reason: default package */
public final class rle implements hm8 {
    public pl8 a;
    public ul8 b;
    public final /* synthetic */ Toolbar c;

    public rle(Toolbar toolbar) {
        this.c = toolbar;
    }

    public final boolean b(w0e w0e) {
        return false;
    }

    public final boolean c() {
        return false;
    }

    public final boolean d(ul8 ul8) {
        Toolbar toolbar = this.c;
        View view = toolbar.A0;
        if (view instanceof i23) {
            ((i23) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.A0);
        toolbar.removeView(toolbar.z0);
        toolbar.A0 = null;
        ArrayList arrayList = toolbar.W0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        ul8.R0 = false;
        ul8.C0.p(false);
        toolbar.x();
        return true;
    }

    public final void f(pl8 pl8, boolean z) {
    }

    public final boolean h(ul8 ul8) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.z0.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.z0);
            }
            toolbar.addView(toolbar.z0);
        }
        View actionView = ul8.getActionView();
        toolbar.A0 = actionView;
        this.b = ul8;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.A0);
            }
            sle h = Toolbar.h();
            h.a = (toolbar.F0 & 112) | 8388611;
            h.b = 2;
            toolbar.A0.setLayoutParams(h);
            toolbar.addView(toolbar.A0);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (!(((sle) childAt.getLayoutParams()).b == 2 || childAt == toolbar.a)) {
                toolbar.removeViewAt(childCount);
                toolbar.W0.add(childAt);
            }
        }
        toolbar.requestLayout();
        ul8.R0 = true;
        ul8.C0.p(false);
        View view = toolbar.A0;
        if (view instanceof i23) {
            ((i23) view).onActionViewExpanded();
        }
        toolbar.x();
        return true;
    }

    public final void i() {
        if (this.b != null) {
            pl8 pl8 = this.a;
            if (pl8 != null) {
                int size = pl8.Y.size();
                int i = 0;
                while (i < size) {
                    if (this.a.getItem(i) != this.b) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            d(this.b);
        }
    }

    public final void k(Context context, pl8 pl8) {
        ul8 ul8;
        pl8 pl82 = this.a;
        if (!(pl82 == null || (ul8 = this.b) == null)) {
            pl82.d(ul8);
        }
        this.a = pl8;
    }
}
