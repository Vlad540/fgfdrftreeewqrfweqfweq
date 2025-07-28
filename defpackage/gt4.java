package defpackage;

import java.util.List;
import one.me.rlottie.RLottieDrawable;

/* renamed from: gt4  reason: default package */
public final class gt4 {
    public final int a;
    public final int b;
    public final CharSequence c;
    public final List d;
    public final CharSequence e;
    public final String f;
    public final RLottieDrawable g;

    public gt4(int i, int i2, CharSequence charSequence, List list, CharSequence charSequence2, String str, RLottieDrawable rLottieDrawable) {
        this.a = i;
        this.b = i2;
        this.c = charSequence;
        this.d = list;
        this.e = charSequence2;
        this.f = str;
        this.g = rLottieDrawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!gt4.class.equals(obj.getClass())) {
            return false;
        }
        gt4 gt4 = (gt4) obj;
        if (this.a == gt4.a && this.b == gt4.b && hhd.f(this.c, gt4.c)) {
            return hhd.f(this.d, gt4.d);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "Emoji(groupIndex=" + this.a + ", indexInGroup=" + this.b + ", defaultValue=" + this.c + ", values=" + this.d + ", animatableValue=" + this.e + ", staticUrl=" + this.f + ", lottieDrawable=" + this.g + ")";
    }
}
