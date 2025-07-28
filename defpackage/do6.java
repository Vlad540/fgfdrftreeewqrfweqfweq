package defpackage;

/* renamed from: do6  reason: default package */
public final class do6 {
    public final eo6 a;
    public final int b;
    public final int c;

    public do6(eo6 eo6, int i, int i2) {
        this.a = eo6;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do6)) {
            return false;
        }
        do6 do6 = (do6) obj;
        return hhd.f(this.a, do6.a) && this.b == do6.b && this.c == do6.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + c3d.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconLocalColors(tabbar=");
        sb.append(this.a);
        sb.append(", verificationSecondary=");
        sb.append(this.b);
        sb.append(", verificationSubhead=");
        return wn6.j(sb, this.c, ")");
    }
}
