package defpackage;

/* renamed from: uc1  reason: default package */
public final class uc1 extends zc1 {
    public final le1 a;
    public final String b;
    public final String c;

    public uc1(le1 le1, String str, String str2) {
        this.a = le1;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc1)) {
            return false;
        }
        uc1 uc1 = (uc1) obj;
        return hhd.f(this.a, uc1.a) && hhd.f(this.b, uc1.b) && hhd.f(this.c, uc1.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + me4.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Avatar(opponentId=");
        sb.append(this.a);
        sb.append(", userName=");
        sb.append(this.b);
        sb.append(", url=");
        return wn6.l(sb, this.c, ")");
    }
}
