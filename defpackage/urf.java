package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* renamed from: urf  reason: default package */
public final class urf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View X;
    public final /* synthetic */ asf a;
    public final /* synthetic */ nsf b;
    public final /* synthetic */ nsf c;
    public final /* synthetic */ int o;

    public urf(asf asf, nsf nsf, nsf nsf2, int i, View view) {
        this.a = asf;
        this.b = nsf;
        this.c = nsf2;
        this.o = i;
        this.X = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        asf asf;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        asf asf2 = this.a;
        asf2.a.d(animatedFraction);
        float b2 = asf2.a.b();
        PathInterpolator pathInterpolator = wrf.e;
        int i = Build.VERSION.SDK_INT;
        nsf nsf = this.b;
        csf dsf = i >= 30 ? new dsf(nsf) : new csf(nsf);
        int i2 = 1;
        while (i2 <= 256) {
            if ((this.o & i2) == 0) {
                dsf.c(i2, nsf.a.f(i2));
                f = b2;
                asf = asf2;
            } else {
                qy6 f2 = nsf.a.f(i2);
                qy6 f3 = this.c.a.f(i2);
                float f4 = 1.0f - b2;
                int i3 = (int) (((double) (((float) (f2.a - f3.a)) * f4)) + 0.5d);
                int i4 = (int) (((double) (((float) (f2.b - f3.b)) * f4)) + 0.5d);
                f = b2;
                int i5 = (int) (((double) (((float) (f2.c - f3.c)) * f4)) + 0.5d);
                asf = asf2;
                int i6 = (int) (((double) (((float) (f2.d - f3.d)) * f4)) + 0.5d);
                int max = Math.max(0, f2.a - i3);
                int max2 = Math.max(0, f2.b - i4);
                int max3 = Math.max(0, f2.c - i5);
                int max4 = Math.max(0, f2.d - i6);
                if (!(max == i3 && max2 == i4 && max3 == i5 && max4 == i6)) {
                    f2 = qy6.b(max, max2, max3, max4);
                }
                dsf.c(i2, f2);
            }
            i2 <<= 1;
            b2 = f;
            asf2 = asf;
        }
        wrf.g(this.X, dsf.b(), Collections.singletonList(asf2));
    }
}
