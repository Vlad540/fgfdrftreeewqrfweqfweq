package defpackage;

/* renamed from: oa1  reason: default package */
public final class oa1 {
    public final String a;
    public final String b;
    public final long c;

    public oa1(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa1)) {
            return false;
        }
        oa1 oa1 = (oa1) obj;
        return hhd.f(this.a, oa1.a) && hhd.f(this.b, oa1.b) && this.c == oa1.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + me4.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallLink(conversationId=");
        sb.append(this.a);
        sb.append(", joinLink=");
        sb.append(this.b);
        sb.append(", startedAt=");
        return wn6.k(sb, this.c, ")");
    }
}
