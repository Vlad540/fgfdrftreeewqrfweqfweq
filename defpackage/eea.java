package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: eea  reason: default package */
public final class eea {
    public final String a;
    public final CharSequence b;
    public final long c;
    public final Drawable d = null;

    public eea(long j, CharSequence charSequence, String str) {
        this.a = str;
        this.b = charSequence;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eea)) {
            return false;
        }
        eea eea = (eea) obj;
        return hhd.f(this.a, eea.a) && hhd.f(this.b, eea.b) && this.c == eea.c && hhd.f(this.d, eea.d);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int m = sxe.m(me4.f(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c);
        Drawable drawable = this.d;
        if (drawable != null) {
            i = drawable.hashCode();
        }
        return m + i;
    }

    public final String toString() {
        return "AvatarParams(url=" + this.a + ", abbreviationName=" + this.b + ", id=" + this.c + ", placeholder=" + this.d + ")";
    }
}
