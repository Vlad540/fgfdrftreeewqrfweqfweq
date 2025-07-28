package defpackage;

import java.io.Serializable;

/* renamed from: tr8  reason: default package */
public final class tr8 implements Serializable {
    public final long a;
    public final rr8 b;

    public tr8(long j, rr8 rr8) {
        this.a = j;
        this.b = rr8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr8)) {
            return false;
        }
        tr8 tr8 = (tr8) obj;
        return this.a == tr8.a && hhd.f(this.b, tr8.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MessageReactionEntry(userId=" + this.a + ", reaction=" + this.b + ")";
    }
}
