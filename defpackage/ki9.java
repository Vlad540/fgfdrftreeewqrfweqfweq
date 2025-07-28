package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: ki9  reason: default package */
public final class ki9 extends OneMeDraweeView implements mhe {
    public boolean G0 = true;
    public final t97 H0 = ez3.O(3, new qk8(9, this));

    /* JADX WARNING: type inference failed for: r2v0, types: [on4, android.view.View, ki9, java.lang.Object] */
    public ki9(Context context) {
        super(context);
        setClipToOutline(true);
        z66 z66 = new z66(getResources());
        z66.d = getShimmerDrawable();
        pgc pgc = new pgc();
        pgc.b = true;
        z66.p = pgc;
        setHierarchy(z66.a());
    }

    private final ji9 getShimmerDrawable() {
        return (ji9) this.H0.getValue();
    }

    public static wcd q(pda pda) {
        c9 c9Var = new c9(21);
        wcd wcd = (wcd) c9Var.b;
        wcd.k = false;
        wcd.i = 0.0f;
        c9Var.s(pda.b().j);
        wcd.d = pda.b().i;
        c9Var.r();
        c9Var.v(a24.X(((float) 64) * dh4.c().getDisplayMetrics().density));
        return c9Var.i();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [on4, android.view.View, ki9] */
    public final void onAttachedToWindow() {
        ki9.super.onAttachedToWindow();
        setClickable(!this.G0);
        if (!this.G0) {
            getShimmerDrawable().c();
        }
    }

    public final void onDetachedFromWindow() {
        ki9.super.onDetachedFromWindow();
        if (!this.G0) {
            getShimmerDrawable().d();
        }
    }

    public final void onThemeChanged(pda pda) {
        getShimmerDrawable().b(q(pda));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, ki9] */
    public final void p(oq6 oq6, Animatable animatable) {
        this.G0 = false;
        getShimmerDrawable().d();
        setClickable(!this.G0);
    }
}
