package defpackage;

/* renamed from: sfa  reason: default package */
public final class sfa extends sg9 {
    public final long b;
    public final String c;
    public final String d;

    public sfa(long j, String str, String str2) {
        super(jue.a);
        this.b = j;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfa)) {
            return false;
        }
        sfa sfa = (sfa) obj;
        return this.b == sfa.b && hhd.f(this.c, sfa.c) && hhd.f(this.d, sfa.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + me4.d(Long.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenPhoneBook(contactId=");
        sb.append(this.b);
        sb.append(", fullName=");
        sb.append(this.c);
        sb.append(", phone=");
        return wn6.l(sb, this.d, ")");
    }
}
