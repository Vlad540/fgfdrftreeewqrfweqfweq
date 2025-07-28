package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;

/* renamed from: wj1  reason: default package */
public final class wj1 extends ch {
    public final t97 z0;

    public wj1() {
        this(-1);
    }

    public static final void o(wj1 wj1, View view, boolean z) {
        wj1.getClass();
        bi1 bi1 = view instanceof bi1 ? (bi1) view : null;
        if (bi1 != null) {
            bi1.a(z);
        }
        if (z) {
            view.setClipToOutline(true);
            kjd.j(view, new Rect(0, 0, view.getWidth(), view.getHeight()), dh4.c().getDisplayMetrics().density * 0.0f);
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
        int i;
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new fg1(this, view, z, view, z, view, z, 1));
        lg7 c = hwf.c();
        if (z) {
            ((m81) ((l81) this.z0.getValue())).getClass();
            i = a24.X(((float) 174) * dh4.c().getDisplayMetrics().density);
        } else {
            i = view.getHeight();
        }
        int height = z ? view.getHeight() : 0;
        hg hgVar = new hg("bounds", i);
        int[] iArr = {i, height};
        bi1 bi1 = null;
        ObjectAnimator ofInt = ObjectAnimator.ofInt((Object) null, hgVar, iArr);
        ofInt.addUpdateListener(new pg(view, hgVar, 2));
        c.add(ofInt);
        if (view instanceof bi1) {
            bi1 = (bi1) view;
        }
        if (bi1 != null) {
            bi1.h(c, z, this.o);
        }
        animatorSet.playTogether(hwf.a(c));
    }

    public wj1(long j) {
        super(j, 2);
        this.z0 = bh1.a.c();
    }
}
