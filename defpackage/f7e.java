package defpackage;

import android.graphics.drawable.GradientDrawable;

/* renamed from: f7e  reason: default package */
public final class f7e {
    public final GradientDrawable a;
    public final GradientDrawable b;
    public final GradientDrawable c;
    public final GradientDrawable d;

    public f7e(GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, GradientDrawable gradientDrawable3, GradientDrawable gradientDrawable4) {
        this.a = gradientDrawable;
        this.b = gradientDrawable2;
        this.c = gradientDrawable3;
        this.d = gradientDrawable4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7e)) {
            return false;
        }
        f7e f7e = (f7e) obj;
        return hhd.f(this.a, f7e.a) && hhd.f(this.b, f7e.b) && hhd.f(this.c, f7e.c) && hhd.f(this.d, f7e.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StateDrawable(enabledChecked=" + this.a + ", enabledUnchecked=" + this.b + ", disabledChecked=" + this.c + ", disabledUnchecked=" + this.d + ")";
    }
}
