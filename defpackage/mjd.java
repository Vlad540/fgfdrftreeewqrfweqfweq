package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: mjd  reason: default package */
public final class mjd extends fdf {
    public static final DecelerateInterpolator Y0 = new DecelerateInterpolator();
    public static final AccelerateInterpolator Z0 = new AccelerateInterpolator();
    public static final kjd a1 = new kjd();
    public ljd X0;

    public final ObjectAnimator T(ViewGroup viewGroup, View view, mre mre, mre mre2) {
        if (mre2 == null) {
            return null;
        }
        int[] iArr = (int[]) mre2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return oyb.s(view, mre2, iArr[0], iArr[1], this.X0.a(view, viewGroup), this.X0.b(view, viewGroup), translationX, translationY, Y0, this);
    }

    public final ObjectAnimator U(ViewGroup viewGroup, View view, mre mre, mre mre2) {
        if (mre == null) {
            return null;
        }
        int[] iArr = (int[]) mre.a.get("android:slide:screenPosition");
        return oyb.s(view, mre, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.X0.a(view, viewGroup), this.X0.b(view, viewGroup), Z0, this);
    }

    public final void f(mre mre) {
        fdf.R(mre);
        int[] iArr = new int[2];
        mre.b.getLocationOnScreen(iArr);
        mre.a.put("android:slide:screenPosition", iArr);
    }

    public final void i(mre mre) {
        fdf.R(mre);
        int[] iArr = new int[2];
        mre.b.getLocationOnScreen(iArr);
        mre.a.put("android:slide:screenPosition", iArr);
    }
}
