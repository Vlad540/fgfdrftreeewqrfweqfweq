package defpackage;

/* renamed from: mfa  reason: default package */
public final class mfa extends nfa {
    public final long a;
    public final String b;

    public mfa(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfa)) {
            return false;
        }
        mfa mfa = (mfa) obj;
        return this.a == mfa.a && hhd.f(this.b, mfa.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenImage(messageId=");
        sb.append(this.a);
        sb.append(", attachLocalId=");
        return wn6.l(sb, this.b, ")");
    }
}
