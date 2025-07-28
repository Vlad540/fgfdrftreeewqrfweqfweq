package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: y6e  reason: default package */
public final class y6e {
    public final s16 a;
    public final View b;
    public final ViewGroup c;
    public final s16 d;
    public final int e;
    public boolean f;
    public float g = -1.0f;
    public float h = -1.0f;
    public float i = -1.0f;
    public float j = -1.0f;
    public final int k;
    public final int l;
    public View m;
    public final p6 n;
    public final ebc o;
    public final t97 p;
    public t6e q;
    public Long r;

    public y6e(Integer num, q6e q6e, View view, ViewGroup viewGroup, k61 k61, int i2) {
        this.a = q6e;
        this.b = view;
        this.c = viewGroup;
        this.d = k61;
        this.e = i2;
        this.k = jjd.o(view.getContext());
        this.l = view.getContext().getResources().getDisplayMetrics().heightPixels;
        p6 p6Var = new p6(view.getContext(), 1);
        p6Var.setId(ypb.swipe_fade);
        p6Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        p6Var.setBackgroundColor(num != null ? num.intValue() : r1g.G(-16777216, 0.5f));
        this.n = p6Var;
        this.o = bm3.C(new opd(10));
        this.p = ez3.O(3, new q6e(1, this));
    }

    public final View a() {
        View view = this.m;
        if (view != null) {
            return view;
        }
        View view2 = (View) this.d.invoke();
        this.m = view2;
        return view2;
    }

    public final boolean b() {
        return this.e == 2;
    }

    public final void c(float f2) {
        Long l2 = this.r;
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{f2, 0.0f}).setDuration((long) (Math.abs(f2) * ((float) (l2 != null ? l2.longValue() : 200))));
        duration.addUpdateListener(new w6e(this, 0));
        duration.addListener(new x6e(this, f2, 0));
        duration.start();
    }

    public final void d(float f2) {
        boolean b2 = b();
        p6 p6Var = this.n;
        View view = this.b;
        ViewGroup viewGroup = this.c;
        if (b2) {
            pa2.C(viewGroup, a(), view, p6Var, f2);
        } else {
            pa2.E(viewGroup, a(), view, p6Var, f2);
        }
    }
}
