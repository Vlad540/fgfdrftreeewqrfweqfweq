package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: ti0  reason: default package */
public final class ti0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ti0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xi0 xi0 = (xi0) obj;
                Iterator it = xi0.D0.iterator();
                while (it.hasNext()) {
                    fme fme = (fme) it.next();
                    fme.c1 = 1.2f;
                    fme.a1 = floatValue;
                    fme.b1 = floatValue;
                    fme.d1 = og.b(0.0f, 1.0f, 0.19f, 1.0f, floatValue);
                    fme.invalidateSelf();
                }
                WeakHashMap weakHashMap = eaf.a;
                xi0.postInvalidateOnAnimation();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lw7 lw7 = ((BottomSheetBehavior) obj).i;
                if (lw7 != null) {
                    kw7 kw7 = lw7.a;
                    if (kw7.j != floatValue2) {
                        kw7.j = floatValue2;
                        lw7.X = true;
                        lw7.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((n23) obj).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                ((hlc) obj).j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                int floatValue3 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                s85 s85 = (s85) obj;
                s85.c.setAlpha(floatValue3);
                s85.o.setAlpha(floatValue3);
                s85.H0.invalidate();
                return;
            case 5:
                ((k27) obj).m = valueAnimator.getAnimatedFraction();
                return;
            case 6:
                jfd jfd = (jfd) obj;
                jfd.j1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jfd.o = (((jfd.j1 - jfd.p1) * jfd.h1) / jfd.k1) + jfd.b;
                jfd.invalidate();
                jfd.getClass();
                return;
            case 7:
                ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                return;
            default:
                ((TextInputLayout) obj).K1.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
