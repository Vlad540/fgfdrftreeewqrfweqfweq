package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.transition.TransitionValues;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: yl  reason: default package */
public final /* synthetic */ class yl implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yl(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.b;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                fm fmVar = (fm) obj;
                fmVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((lw7) obj2).k(floatValue);
                Drawable drawable = fmVar.N0;
                if (drawable instanceof lw7) {
                    ((lw7) drawable).k(floatValue);
                }
                Iterator it = fmVar.J0.iterator();
                if (it.hasNext()) {
                    hr1.r(it.next());
                    throw null;
                }
                return;
            case 1:
                gm1.x((bg) obj, (gm1) obj2);
                return;
            case 2:
                l03 l03 = (l03) obj;
                l03.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TransitionValues transitionValues = (TransitionValues) obj2;
                at7.j(l03.a, transitionValues.view);
                if (l03.b) {
                    double d = (double) floatValue2;
                    if (d > 0.5d && transitionValues.view.getClipBounds() != null) {
                        Rect clipBounds = transitionValues.view.getClipBounds();
                        int i = clipBounds.top;
                        if (i != 0) {
                            clipBounds.top = i - ((int) (((d - 0.5d) * ((double) transitionValues.view.getClipBounds().top)) / 0.5d));
                        }
                        if (clipBounds.bottom < transitionValues.view.getHeight()) {
                            clipBounds.bottom += (int) (((d - 0.5d) * ((double) (transitionValues.view.getHeight() - clipBounds.bottom))) / 0.5d);
                        }
                        transitionValues.view.setClipBounds(clipBounds);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                k77[] k77Arr = FakeInAppReviewBottomSheet.L0;
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj;
                fakeInAppReviewBottomSheet.getClass();
                k77[] k77Arr2 = FakeInAppReviewBottomSheet.L0;
                ValueAnimator valueAnimator2 = (ValueAnimator) obj2;
                ((ConstraintLayout) fakeInAppReviewBottomSheet.C0.T0(fakeInAppReviewBottomSheet, k77Arr2[0])).setAlpha(1.0f - valueAnimator2.getAnimatedFraction());
                ((FrameLayout) fakeInAppReviewBottomSheet.D0.T0(fakeInAppReviewBottomSheet, k77Arr2[1])).setAlpha(valueAnimator2.getAnimatedFraction());
                return;
            case 4:
                k77[] k77Arr3 = MediaKeyboardWidget.G0;
                float floatValue3 = ((Float) ((ValueAnimator) obj).getAnimatedValue()).floatValue();
                for (View view : (View[]) obj2) {
                    view.setScaleX(floatValue3);
                    view.setScaleY(floatValue3);
                }
                return;
            default:
                k77[] k77Arr4 = RecordControlsWidget.m1;
                RecordControlsWidget recordControlsWidget = (RecordControlsWidget) obj2;
                if (valueAnimator.getAnimatedFraction() > 0.5f) {
                    i7c i7c = (i7c) obj;
                    if (!i7c.a) {
                        i7c.a = true;
                        recordControlsWidget.S0();
                    }
                }
                recordControlsWidget.N0().setLinesColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
