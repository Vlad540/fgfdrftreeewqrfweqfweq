package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: g32  reason: default package */
public final class g32 implements pg7 {
    public final Boolean a;
    public final ud0 b;
    public final Drawable c;
    public final Drawable o;

    public g32(Boolean bool, ud0 ud0, Drawable drawable, Drawable drawable2) {
        this.a = bool;
        this.b = ud0;
        this.c = drawable;
        this.o = drawable2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g32)) {
            return false;
        }
        g32 g32 = (g32) obj;
        return hhd.f(this.a, g32.a) && hhd.f(this.b, g32.b) && hhd.f(this.c, g32.c) && hhd.f(this.o, g32.o);
    }

    public final boolean g(pg7 pg7) {
        return getItemId() == pg7.getItemId();
    }

    public final long getItemId() {
        return (long) this.b.a.hashCode();
    }

    public final int hashCode() {
        int i = 0;
        Boolean bool = this.a;
        int d = me4.d((bool == null ? 0 : bool.hashCode()) * 31, 31, this.b.a);
        Drawable drawable = this.c;
        int hashCode = (d + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            i = drawable2.hashCode();
        }
        return hashCode + i;
    }

    public final int l() {
        return 0;
    }

    public final Object n(Object obj) {
        g32 g32 = (pg7) obj;
        g32 g322 = g32 instanceof g32 ? g32 : null;
        if (g322 == null) {
            return null;
        }
        Boolean bool = this.a;
        Boolean bool2 = g322.a;
        if (!hhd.f(bool, bool2)) {
            return new f32(bool2);
        }
        return null;
    }

    public final String toString() {
        return "ChatBackground(isSelected=" + this.a + ", backgroundId=" + this.b + ", drawable=" + this.c + ", previewDrawable=" + this.o + ")";
    }
}
