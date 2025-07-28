package defpackage;

import android.content.Context;
import android.graphics.Color;

/* renamed from: zs4  reason: default package */
public final class zs4 {
    public static final int f = ((int) Math.round(5.1000000000000005d));
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public zs4(Context context) {
        boolean E = bm3.E(wlb.elevationOverlayEnabled, context, false);
        int p = vx3.p(wlb.elevationOverlayColor, 0, context);
        int p2 = vx3.p(wlb.elevationOverlayAccentColor, 0, context);
        int p3 = vx3.p(wlb.colorSurface, 0, context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = E;
        this.b = p;
        this.c = p2;
        this.d = p3;
        this.e = f2;
    }

    public final int a(int i, float f2) {
        int i2;
        if (!this.a || j33.h(i, 255) != this.d) {
            return i;
        }
        float f3 = this.e;
        float min = (f3 <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p((double) (f2 / f3))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int C = vx3.C(j33.h(i, 255), min, this.b);
        if (min > 0.0f && (i2 = this.c) != 0) {
            C = j33.f(j33.h(i2, f), C);
        }
        return j33.h(C, alpha);
    }
}
