package defpackage;

/* renamed from: p80  reason: default package */
public final class p80 {
    public final int a;
    public final long b;

    public p80(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p80)) {
            return false;
        }
        p80 p80 = (p80) obj;
        return this.a == p80.a && this.b == p80.b;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PacketInfo{sizeInBytes=");
        sb.append(this.a);
        sb.append(", timestampNs=");
        return wn6.k(sb, this.b, "}");
    }
}
