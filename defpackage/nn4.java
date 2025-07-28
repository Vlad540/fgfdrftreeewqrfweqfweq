package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.view.ViewGroup;

/* renamed from: nn4  reason: default package */
public final class nn4 extends Transition {
    public final ilc a;
    public final ilc b;
    public final PointF c = null;
    public final PointF o = null;

    public nn4(fja fja, fja fja2) {
        this.a = fja;
        this.b = fja2;
    }

    public static void a(TransitionValues transitionValues) {
        if (transitionValues.view instanceof a76) {
            transitionValues.values.put("draweeTransition:bounds", new Rect(0, 0, transitionValues.view.getWidth(), transitionValues.view.getHeight()));
        }
    }

    public static TransitionSet b(fja fja, fja fja2) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addTransition(new nn4(fja, fja2));
        return transitionSet;
    }

    public final void captureEndValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    public final void captureStartValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (!(transitionValues == null || transitionValues2 == null)) {
            Rect rect = (Rect) transitionValues.values.get("draweeTransition:bounds");
            Rect rect2 = (Rect) transitionValues2.values.get("draweeTransition:bounds");
            if (!(rect == null || rect2 == null)) {
                ilc ilc = this.a;
                ilc ilc2 = this.b;
                if (ilc == ilc2 && this.c == this.o) {
                    return null;
                }
                a76 a76 = (a76) transitionValues.view;
                hlc hlc = new hlc((fja) ilc, (fja) ilc2, rect, rect2);
                ((y66) a76.getHierarchy()).h(hlc);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.addUpdateListener(new ti0(3, hlc));
                ofFloat.addListener(new eh(this, a76, false, 3));
                return ofFloat;
            }
        }
        return null;
    }
}
