package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: og  reason: default package */
public abstract class og {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final p85 b = new p85();
    public static final o85 c = new o85(0);
    public static final o85 d = new o85(1);
    public static final DecelerateInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return us8.g(f2, f, f3, f);
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(int i, float f, int i2) {
        return Math.round(f * ((float) (i2 - i))) + i;
    }
}
