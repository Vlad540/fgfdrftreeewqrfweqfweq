package defpackage;

/* renamed from: di8  reason: default package */
public final class di8 implements pg7 {
    public final boolean X;
    public final long Y;
    public final CharSequence Z;
    public final long a;
    public final CharSequence b;
    public final mge c;
    public final String o;
    public final ryb w0;
    public final boolean x0;
    public final boolean y0;

    public di8(long j, CharSequence charSequence, mge mge, String str, boolean z, long j2, CharSequence charSequence2, ryb ryb, boolean z2, boolean z3) {
        this.a = j;
        this.b = charSequence;
        this.c = mge;
        this.o = str;
        this.X = z;
        this.Y = j2;
        this.Z = charSequence2;
        this.w0 = ryb;
        this.x0 = z2;
        this.y0 = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di8)) {
            return false;
        }
        di8 di8 = (di8) obj;
        return this.a == di8.a && hhd.f(this.b, di8.b) && hhd.f(this.c, di8.c) && hhd.f(this.o, di8.o) && this.X == di8.X && this.Y == di8.Y && hhd.f(this.Z, di8.Z) && hhd.f(this.w0, di8.w0) && this.x0 == di8.x0 && this.y0 == di8.y0;
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int f = me4.f(this.Z, sxe.m(th2.f(me4.d(c3d.e(me4.f(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31, this.o), 31, this.X), 31, this.Y), 31);
        ryb ryb = this.w0;
        return Boolean.hashCode(this.y0) + th2.f((f + (ryb == null ? 0 : ryb.hashCode())) * 31, 31, this.x0);
    }

    public final int l() {
        return a7a.F;
    }

    public final Object n(Object obj) {
        pg7 pg7 = (pg7) obj;
        if (!(pg7 instanceof di8)) {
            return null;
        }
        ryb ryb = this.w0;
        ryb ryb2 = ((di8) pg7).w0;
        if (!hhd.f(ryb, ryb2)) {
            return new ci8(ryb2);
        }
        return null;
    }

    public final String toString() {
        return "MemberListItem(id=" + this.a + ", name=" + this.b + ", subtitle=" + this.c + ", avatar=" + this.o + ", isOnline=" + this.X + ", lastReadMark=" + this.Y + ", abbreviation=" + this.Z + ", reaction=" + this.w0 + ", isRead=" + this.x0 + ", isSelf=" + this.y0 + ")";
    }
}
