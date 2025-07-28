package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: z3c  reason: default package */
public final /* synthetic */ class z3c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ z3c(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        RecordControlsWidget recordControlsWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = RecordControlsWidget.m1;
                js.D(recordControlsWidget.q0().getDrawable(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 1:
                k77[] k77Arr2 = RecordControlsWidget.m1;
                recordControlsWidget.A0().setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 2:
                k77[] k77Arr3 = RecordControlsWidget.m1;
                recordControlsWidget.M0().setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                k77[] k77Arr4 = RecordControlsWidget.m1;
                View I0 = recordControlsWidget.I0();
                ViewGroup.LayoutParams layoutParams = I0.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    I0.setLayoutParams(layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            case 4:
                k77[] k77Arr5 = RecordControlsWidget.m1;
                recordControlsWidget.A0().setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 5:
                k77[] k77Arr6 = RecordControlsWidget.m1;
                recordControlsWidget.M0().setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 6:
                k77[] k77Arr7 = RecordControlsWidget.m1;
                recordControlsWidget.N0().setLinesColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                k77[] k77Arr8 = RecordControlsWidget.m1;
                View I02 = recordControlsWidget.I0();
                ViewGroup.LayoutParams layoutParams3 = I02.getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    I02.setLayoutParams(layoutParams4);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            default:
                k77[] k77Arr9 = RecordControlsWidget.m1;
                js.D(recordControlsWidget.D0(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
