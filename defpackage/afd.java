package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: afd  reason: default package */
public final /* synthetic */ class afd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ SideSheetBehavior a;
    public final /* synthetic */ ViewGroup.MarginLayoutParams b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View o;

    public /* synthetic */ afd(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i, View view) {
        this.a = sideSheetBehavior;
        this.b = marginLayoutParams;
        this.c = i;
        this.o = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a.g0(this.b, og.c(this.c, valueAnimator.getAnimatedFraction(), 0));
        this.o.requestLayout();
    }
}
