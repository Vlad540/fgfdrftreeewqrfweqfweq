package defpackage;

/* renamed from: coa  reason: default package */
public final class coa {
    public final String a;
    public final long b;

    public coa(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof coa)) {
            return false;
        }
        coa coa = (coa) obj;
        return hhd.f(this.a, coa.a) && this.b == coa.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneAndServerPhone(phone=");
        sb.append(this.a);
        sb.append(", serverPhone=");
        return wn6.k(sb, this.b, ")");
    }
}
