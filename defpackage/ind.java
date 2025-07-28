package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: ind  reason: default package */
public final class ind extends Drawable.ConstantState {
    public final hu4 a;
    public int b;
    public final int c = 0;
    public final int d = 0;
    public final it4 e;

    public ind(hu4 hu4, int i, it4 it4) {
        this.a = hu4;
        this.b = i;
        this.e = it4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ind)) {
            return false;
        }
        ind ind = (ind) obj;
        return hhd.f(this.a, ind.a) && this.b == ind.b && this.c == ind.c && this.d == ind.d && hhd.f(this.e, ind.e);
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final int hashCode() {
        return this.e.hashCode() + c3d.d(this.d, c3d.d(this.c, c3d.d(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final Drawable newDrawable() {
        return new hnd(this);
    }

    public final String toString() {
        int i = this.b;
        return "SpriteEmojiDrawableState(location=" + this.a + ", size=" + i + ", paddingHorizontal=" + this.c + ", paddingVertical=" + this.d + ", bitmapResolver=" + this.e + ")";
    }
}
