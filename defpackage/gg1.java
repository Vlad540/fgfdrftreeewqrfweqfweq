package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;

/* renamed from: gg1  reason: default package */
public final class gg1 extends ch {
    public final t97 z0;

    public gg1() {
        this(-1);
    }

    public static final void o(gg1 gg1, View view, boolean z) {
        gg1.getClass();
        zh1 zh1 = view instanceof zh1 ? (zh1) view : null;
        if (zh1 != null) {
            zh1.o(z);
        }
        if (z) {
            kjd.j(view, new Rect(0, 0, view.getWidth(), view.getHeight()), 0.0f);
        }
    }

    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (z && view2 != null) {
            p(animatorSet, view2, true);
        } else if (!z && view != null) {
            p(animatorSet, view, false);
        }
        return animatorSet;
    }

    public final void n(View view) {
    }

    public final void p(AnimatorSet animatorSet, View view, boolean z) {
        AnimatorSet animatorSet2 = animatorSet;
        View view2 = view;
        boolean z2 = z;
        animatorSet2.setInterpolator(new DecelerateInterpolator());
        fg1 fg1 = r0;
        fg1 fg12 = new fg1(this, view, z, view, z, view, z, 0);
        animatorSet2.addListener(fg1);
        lg7 c = hwf.c();
        m81 m81 = (m81) ((l81) this.z0.getValue());
        m81.getClass();
        PointF pointF = m81.b;
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f = z2 ? 0.0f : 1.0f;
        float f2 = z2 ? 1.0f : 0.0f;
        bg bgVar = new bg("bounds", f);
        boolean z3 = view2 instanceof zh1;
        zh1 zh1 = z3 ? (zh1) view2 : null;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, bgVar, new float[]{f, f2});
        eg1 eg1 = r0;
        ObjectAnimator objectAnimator = ofFloat;
        boolean z4 = z3;
        eg1 eg12 = new eg1(ofFloat, this, z, view, pointF2, zh1);
        objectAnimator.addUpdateListener(eg1);
        if (z2) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{f, f2});
            ofFloat2.setDuration(50);
            c.add(ofFloat2);
        }
        c.add(objectAnimator);
        zh1 zh12 = z4 ? (zh1) view2 : null;
        if (zh12 != null) {
            zh12.f(c, z2, this.o);
        }
        animatorSet2.playTogether(hwf.a(c));
    }

    public gg1(long j) {
        super(j, 2);
        this.z0 = bh1.a.c();
    }
}
