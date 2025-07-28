package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: n0a  reason: default package */
public final class n0a extends LinearLayout implements mhe {
    public static final gk9 b = new gk9(14);
    public static final /* synthetic */ k77[] c;
    public final yj a = new yj(18, this);

    static {
        hc9 hc9 = new hc9(n0a.class, "isBlurEnabled", "isBlurEnabled()Ljava/lang/Boolean;");
        m7c.a.getClass();
        c = new k77[]{hc9};
    }

    public n0a(Context context) {
        super(context, (AttributeSet) null);
        setOrientation(0);
        setElevation(16.0f * dh4.c().getDisplayMetrics().density);
    }

    public final void a(pda pda, Boolean bool) {
        Context context = getContext();
        nd0 b2 = pda.b();
        Boolean bool2 = Boolean.TRUE;
        Drawable a2 = x87.a(context, b2.g, 2.0f, hhd.f(bool, bool2));
        if (!hhd.f(bool, bool2)) {
            a2.setAlpha(255);
        }
        setBackground(a2);
    }

    public final int getSelectedItemId() {
        u1 u1Var = new u1(4, this);
        while (u1Var.hasNext()) {
            View view = (View) u1Var.next();
            if (view.isSelected()) {
                Object E = hhd.E(view, wqb.tag_tab_item);
                m0a m0a = E instanceof m0a ? (m0a) E : null;
                if (m0a != null) {
                    return m0a.c;
                }
                return -1;
            }
        }
        return -1;
    }

    public final void onMeasure(int i, int i2) {
        qy6 f = nsf.f(this, getRootWindowInsets()).a.f(2);
        int i3 = 0;
        while (true) {
            if (i3 < getChildCount()) {
                int i4 = i3 + 1;
                View childAt = getChildAt(i3);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.bottomMargin = a24.X(((float) (f.d > 0 ? 4 : 12)) * dh4.c().getDisplayMetrics().density);
                        childAt.setLayoutParams(layoutParams2);
                        i3 = i4;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                float f2 = (float) 8;
                setPadding(a24.X(dh4.c().getDisplayMetrics().density * f2), getPaddingTop(), a24.X(f2 * dh4.c().getDisplayMetrics().density), getPaddingBottom());
                b.getClass();
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingTop() + getPaddingBottom() + gk9.e(this), 1073741824));
                return;
            }
        }
    }

    public final void onThemeChanged(pda pda) {
        k77 k77 = c[0];
        a(pda, (Boolean) this.a.b);
        int i = 0;
        while (true) {
            if (i < getChildCount()) {
                int i2 = i + 1;
                View childAt = getChildAt(i);
                if (childAt != null) {
                    ((sp0) childAt).w();
                    i = i2;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                return;
            }
        }
    }

    public final void setBlurEnabled(Boolean bool) {
        this.a.o1(this, c[0], bool);
    }
}
