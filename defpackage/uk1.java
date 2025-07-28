package defpackage;

/* renamed from: uk1  reason: default package */
public final class uk1 extends ete {
    public final String c;
    public final boolean d;

    public uk1(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk1)) {
            return false;
        }
        uk1 uk1 = (uk1) obj;
        return hhd.f(this.c, uk1.c) && this.d == uk1.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "Link(link=" + this.c + ", isJoinByExistLink=" + this.d + ")";
    }
}
