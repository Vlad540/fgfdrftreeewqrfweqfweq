package defpackage;

/* renamed from: eh6  reason: default package */
public final class eh6 implements pg7 {
    public final long A0;
    public final boolean X;
    public final String Y;
    public final String Z;
    public final long a;
    public final long b;
    public final CharSequence c;
    public final String o;
    public final boolean w0;
    public final CharSequence x0;
    public final int y0;
    public final wg6 z0;

    public eh6(long j, long j2, CharSequence charSequence, String str, boolean z, String str2, String str3, boolean z2, CharSequence charSequence2, int i, wg6 wg6) {
        this.a = j;
        this.b = j2;
        this.c = charSequence;
        this.o = str;
        this.X = z;
        this.Y = str2;
        this.Z = str3;
        this.w0 = z2;
        this.x0 = charSequence2;
        this.y0 = i;
        this.z0 = wg6;
        this.A0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh6)) {
            return false;
        }
        eh6 eh6 = (eh6) obj;
        return this.a == eh6.a && this.b == eh6.b && hhd.f(this.c, eh6.c) && hhd.f(this.o, eh6.o) && this.X == eh6.X && hhd.f(this.Y, eh6.Y) && hhd.f(this.Z, eh6.Z) && this.w0 == eh6.w0 && hhd.f(this.x0, eh6.x0) && this.y0 == eh6.y0 && hhd.f(this.z0, eh6.z0);
    }

    public final boolean g(pg7 pg7) {
        return this.A0 == pg7.getItemId();
    }

    public final long getItemId() {
        return this.A0;
    }

    public final int hashCode() {
        int f = me4.f(this.c, sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31);
        String str = this.o;
        return this.z0.hashCode() + us8.h(this.y0, me4.f(this.x0, th2.f(me4.d(me4.d(th2.f((f + (str == null ? 0 : str.hashCode())) * 31, 31, this.X), 31, this.Y), 31, this.Z), 31, this.w0), 31), 31);
    }

    public final int l() {
        return 1;
    }

    public final Object n(Object obj) {
        eh6 eh6 = (pg7) obj;
        lg7 c2 = hwf.c();
        String str = this.Y;
        String str2 = eh6.Y;
        if (!hhd.f(str, str2)) {
            c2.add(new bh6(str2));
        }
        if (!hhd.f(this.o, eh6.o) || this.b != eh6.b || !hhd.f(this.c, eh6.c) || this.X != eh6.X) {
            c2.add(new xg6(eh6.b, eh6.c, eh6.o, eh6.X));
        }
        String str3 = this.Z;
        String str4 = eh6.Z;
        if (!hhd.f(str3, str4)) {
            c2.add(new ch6(str4));
        }
        boolean z = this.w0;
        boolean z2 = eh6.w0;
        if (z != z2) {
            c2.add(new ah6(z2));
        }
        CharSequence charSequence = this.x0;
        CharSequence charSequence2 = eh6.x0;
        if (!hhd.f(charSequence, charSequence2)) {
            c2.add(new zg6(charSequence2));
        }
        int i = this.y0;
        int i2 = eh6.y0;
        if (i != i2) {
            c2.add(new yg6(i2));
        }
        return hwf.a(c2);
    }

    public final String toString() {
        return "HistoryItemState(id=" + this.a + ", avatarColorId=" + this.b + ", abbreviation=" + this.c + ", avatar=" + this.o + ", isCallLink=" + this.X + ", callName=" + this.Y + ", time=" + this.Z + ", isMissing=" + this.w0 + ", description=" + this.x0 + ", callMediaType=" + me4.s(this.y0) + ", callType=" + this.z0 + ")";
    }
}
