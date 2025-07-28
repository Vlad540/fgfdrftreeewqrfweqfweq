package defpackage;

/* renamed from: ad1  reason: default package */
public final class ad1 implements pg7 {
    public final boolean X;
    public final boolean Y;
    public final long Z;
    public final le1 a;
    public final String b;
    public final String c;
    public final boolean o;
    public final Integer w0;
    public final long x0;

    public ad1(le1 le1, String str, String str2, boolean z, boolean z2, boolean z3, long j, Integer num) {
        this.a = le1;
        this.b = str;
        this.c = str2;
        this.o = z;
        this.X = z2;
        this.Y = z3;
        this.Z = j;
        this.w0 = num;
        this.x0 = le1.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad1)) {
            return false;
        }
        ad1 ad1 = (ad1) obj;
        return hhd.f(this.a, ad1.a) && hhd.f(this.b, ad1.b) && hhd.f(this.c, ad1.c) && this.o == ad1.o && this.X == ad1.X && this.Y == ad1.Y && this.Z == ad1.Z && hhd.f(this.w0, ad1.w0);
    }

    public final boolean g(pg7 pg7) {
        return this.x0 == pg7.getItemId();
    }

    public final long getItemId() {
        return this.x0;
    }

    public final int hashCode() {
        int m = sxe.m(th2.f(th2.f(th2.f(me4.d(me4.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.o), 31, this.X), 31, this.Y), 31, this.Z);
        Integer num = this.w0;
        return m + (num == null ? 0 : num.hashCode());
    }

    public final int l() {
        return 1;
    }

    public final Object n(Object obj) {
        ad1 ad1 = (pg7) obj;
        lg7 c2 = hwf.c();
        String str = this.b;
        String str2 = ad1.b;
        if (!hhd.f(str, str2)) {
            c2.add(new xc1(str2));
        }
        Integer num = this.w0;
        Integer num2 = ad1.w0;
        if (!hhd.f(num, num2)) {
            c2.add(new vc1(num2));
        }
        String str3 = this.c;
        String str4 = ad1.c;
        boolean f = hhd.f(str3, str4);
        le1 le1 = this.a;
        le1 le12 = ad1.a;
        if (!f || !hhd.f(le1, le12) || !hhd.f(str, str2)) {
            c2.add(new uc1(le12, str2, str4));
        }
        boolean z = this.o;
        boolean z2 = ad1.o;
        if (z != z2 || !hhd.f(le1, le12)) {
            c2.add(new wc1(le12, z2));
        }
        boolean z3 = this.Y;
        boolean z4 = ad1.Y;
        if (z3 != z4) {
            c2.add(new yc1(z4));
        }
        return hwf.a(c2);
    }

    public final String toString() {
        return "CallOpponentInfoState(opponentId=" + this.a + ", userName=" + this.b + ", avatar=" + this.c + ", hasMoreAction=" + this.o + ", isAdmin=" + this.X + ", isRaiseHand=" + this.Y + ", isRaiseHandTime=" + this.Z + ", description=" + this.w0 + ")";
    }
}
