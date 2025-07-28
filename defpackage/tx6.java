package defpackage;

/* renamed from: tx6  reason: default package */
public final class tx6 extends sg9 {
    public final String b;
    public final String c;
    public final int d;

    public tx6(String str, String str2, int i) {
        super(jue.a);
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx6)) {
            return false;
        }
        tx6 tx6 = (tx6) obj;
        return hhd.f(this.b, tx6.b) && hhd.f(this.c, tx6.c) && this.d == tx6.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + me4.d(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneConfirmScreen(verifyToken=");
        sb.append(this.b);
        sb.append(", phone=");
        sb.append(this.c);
        sb.append(", codeLength=");
        return wn6.j(sb, this.d, ")");
    }
}
