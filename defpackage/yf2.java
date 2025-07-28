package defpackage;

/* renamed from: yf2  reason: default package */
public final class yf2 {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final xf2 d;

    public yf2(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, xf2 xf2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = xf2;
    }

    public static yf2 a(yf2 yf2, xf2 xf2) {
        CharSequence charSequence = yf2.a;
        CharSequence charSequence2 = yf2.b;
        CharSequence charSequence3 = yf2.c;
        yf2.getClass();
        return new yf2(charSequence, charSequence2, charSequence3, xf2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf2)) {
            return false;
        }
        yf2 yf2 = (yf2) obj;
        return hhd.f(this.a, yf2.a) && hhd.f(this.b, yf2.b) && hhd.f(this.c, yf2.c) && hhd.f(this.d, yf2.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + me4.f(this.c, me4.f(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "InfoPanelState(author=" + this.a + ", dateText=" + this.b + ", captionText=" + this.c + ", frameState=" + this.d + ")";
    }
}
