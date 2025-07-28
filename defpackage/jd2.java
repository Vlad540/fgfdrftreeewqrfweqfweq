package defpackage;

/* renamed from: jd2  reason: default package */
public final class jd2 extends qd2 {
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;

    public jd2(long j, long j2, String str, boolean z) {
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd2)) {
            return false;
        }
        jd2 jd2 = (jd2) obj;
        return this.b == jd2.b && this.c == jd2.c && hhd.f(this.d, jd2.d) && this.e == jd2.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + me4.d(sxe.m(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenImage(chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", attachLocalId=");
        sb.append(this.d);
        sb.append(", isSingleAttach=");
        return hr1.j(sb, this.e, ")");
    }
}
