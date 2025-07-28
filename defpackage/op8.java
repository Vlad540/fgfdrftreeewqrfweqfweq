package defpackage;

/* renamed from: op8  reason: default package */
public final class op8 implements qp8 {
    public final long a;
    public final long b;

    public op8(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op8)) {
            return false;
        }
        op8 op8 = (op8) obj;
        return this.a == op8.a && this.b == op8.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ByRange(startTime=");
        sb.append(this.a);
        sb.append(", endTime=");
        return wn6.k(sb, this.b, ")");
    }
}
