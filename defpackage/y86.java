package defpackage;

/* renamed from: y86  reason: default package */
public final class y86 {
    public final String a;
    public final String b;
    public final ub0 c;

    public y86(String str, String str2, ub0 ub0) {
        this.a = str;
        this.b = str2;
        this.c = ub0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y86)) {
            return false;
        }
        y86 y86 = (y86) obj;
        return hhd.f(this.a, y86.a) && hhd.f(this.b, y86.b) && hhd.f(this.c, y86.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + me4.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "WebAppContactData(displayName=" + this.a + ", avatarUrl=" + this.b + ", abbreviationModel=" + this.c + ")";
    }
}
