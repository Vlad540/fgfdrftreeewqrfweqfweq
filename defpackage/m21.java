package defpackage;

/* renamed from: m21  reason: default package */
public final class m21 extends kh0 {
    public final String X;
    public final long b;
    public final String c;
    public final long o;

    public m21(String str, String str2, long j, long j2) {
        this.b = j;
        this.c = str;
        this.o = j2;
        this.X = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m21)) {
            return false;
        }
        m21 m21 = (m21) obj;
        return this.b == m21.b && hhd.f(this.c, m21.c) && this.o == m21.o && hhd.f(this.X, m21.X);
    }

    public final int hashCode() {
        return this.X.hashCode() + sxe.m(me4.d(Long.hashCode(this.b) * 31, 31, this.c), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallCreateJoinLinkEvent(requestId=");
        sb.append(this.b);
        sb.append(", conversationId=");
        sb.append(this.c);
        sb.append(", peerId=");
        sb.append(this.o);
        sb.append(", joinLink=");
        return wn6.l(sb, this.X, ")");
    }
}
