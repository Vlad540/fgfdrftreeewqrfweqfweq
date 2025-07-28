package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* renamed from: i81  reason: default package */
public final class i81 extends FrameLayout implements bi1 {
    public final /* synthetic */ CallIndicatorWidget a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i81(CallIndicatorWidget callIndicatorWidget, Context context) {
        super(context);
        this.a = callIndicatorWidget;
        setId(o1a.N);
        setBackground(new ColorDrawable(0));
        k77[] k77Arr = CallIndicatorWidget.X;
        callIndicatorWidget.getClass();
        k77 k77 = CallIndicatorWidget.X[1];
        addView((View) callIndicatorWidget.c.getValue());
        addView(CallIndicatorWidget.l0(callIndicatorWidget));
    }

    public final void a(boolean z) {
        CallIndicatorWidget callIndicatorWidget = this.a;
        CallIndicatorWidget.m0(callIndicatorWidget, true);
        float f = (float) 100;
        if (CallIndicatorWidget.l0(callIndicatorWidget).getHeight() != a24.X(dh4.c().getDisplayMetrics().density * f)) {
            z71 l0 = CallIndicatorWidget.l0(callIndicatorWidget);
            ViewGroup.LayoutParams layoutParams = l0.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.height = a24.X(f * dh4.c().getDisplayMetrics().density);
                l0.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        CallIndicatorWidget.l0(callIndicatorWidget).a(true);
    }

    public final void b(boolean z) {
        CallIndicatorWidget callIndicatorWidget = this.a;
        CallIndicatorWidget.m0(callIndicatorWidget, true);
        CallIndicatorWidget.l0(callIndicatorWidget).b(z);
    }

    public final void h(lg7 lg7, boolean z, long j) {
        CallIndicatorWidget callIndicatorWidget = this.a;
        CallIndicatorWidget.l0(callIndicatorWidget).h(lg7, z, j);
        float f = (float) 100;
        int p = me4.p(f, dh4.c().getDisplayMetrics().density, ((ync) ((m81) ((l81) callIndicatorWidget.a.getValue())).c.getValue()).a);
        int X = z ? p : a24.X(dh4.c().getDisplayMetrics().density * f);
        if (z) {
            p = a24.X(f * dh4.c().getDisplayMetrics().density);
        }
        z71 l0 = CallIndicatorWidget.l0(callIndicatorWidget);
        hg hgVar = new hg("height", X);
        ObjectAnimator ofInt = ObjectAnimator.ofInt((Object) null, hgVar, new int[]{X, p});
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new pg(l0, hgVar, 1));
        lg7.add(ofInt);
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt((Object) null, new hg("backgroundChange", 0), new int[]{0});
        ofInt2.addUpdateListener(new h81(callIndicatorWidget, z));
        lg7.add(ofInt2);
    }
}
