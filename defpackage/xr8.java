package defpackage;

/* renamed from: xr8  reason: default package */
public final class xr8 {
    public final yyb a;
    public final int b;

    public xr8(yyb yyb, int i) {
        this.a = yyb;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr8)) {
            return false;
        }
        xr8 xr8 = (xr8) obj;
        return hhd.f(this.a, xr8.a) && this.b == xr8.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MessageReactionWithCount(reaction=" + this.a + ", count=" + this.b + ")";
    }
}
