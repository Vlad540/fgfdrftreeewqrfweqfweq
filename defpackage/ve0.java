package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* renamed from: ve0  reason: default package */
public final class ve0 {
    public final Drawable a;
    public final int b;
    public final int c;
    public final float d;

    public ve0(GradientDrawable gradientDrawable, int i, float f, int i2) {
        f = (i2 & 8) != 0 ? 12.0f : f;
        this.a = gradientDrawable;
        this.b = i;
        this.c = 20;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve0)) {
            return false;
        }
        ve0 ve0 = (ve0) obj;
        return hhd.f(this.a, ve0.a) && this.b == ve0.b && this.c == ve0.c && Float.compare(this.d, ve0.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + c3d.d(this.c, c3d.d(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Style(backgroundDrawable=" + this.a + ", width=" + this.b + ", height=" + this.c + ", textSize=" + this.d + ")";
    }
}
