package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: p75  reason: default package */
public final class p75 extends fdf {
    public p75(int i) {
        if ((i & -4) == 0) {
            this.V0 = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.a.get("android:fade:transitionAlpha");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float W(defpackage.mre r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.HashMap r1 = r1.a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p75.W(mre, float):float");
    }

    public final ObjectAnimator T(ViewGroup viewGroup, View view, mre mre, mre mre2) {
        py1 py1 = ocf.a;
        return V(view, W(mre, 0.0f), 1.0f);
    }

    public final ObjectAnimator U(ViewGroup viewGroup, View view, mre mre, mre mre2) {
        py1 py1 = ocf.a;
        ObjectAnimator V = V(view, W(mre, 1.0f), 0.0f);
        if (V == null) {
            view.setTransitionAlpha(W(mre2, 1.0f));
        }
        return V;
    }

    public final ObjectAnimator V(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        py1 py1 = ocf.a;
        view.setTransitionAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ocf.a, new float[]{f2});
        o75 o75 = new o75(view);
        ofFloat.addListener(o75);
        t().a(o75);
        return ofFloat;
    }

    public final void i(mre mre) {
        fdf.R(mre);
        int i = job.transition_pause_alpha;
        View view = mre.b;
        Float f = (Float) view.getTag(i);
        if (f == null) {
            if (view.getVisibility() == 0) {
                py1 py1 = ocf.a;
                f = Float.valueOf(view.getTransitionAlpha());
            } else {
                f = Float.valueOf(0.0f);
            }
        }
        mre.a.put("android:fade:transitionAlpha", f);
    }
}
