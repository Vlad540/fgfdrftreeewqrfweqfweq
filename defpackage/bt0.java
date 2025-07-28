package defpackage;

/* renamed from: bt0  reason: default package */
public final class bt0 {
    public final long a;
    public final boolean b;

    public bt0(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt0)) {
            return false;
        }
        bt0 bt0 = (bt0) obj;
        return this.a == bt0.a && this.b == bt0.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BufferingState(messageId=");
        sb.append(this.a);
        sb.append(", isBuffering=");
        return hr1.j(sb, this.b, ")");
    }
}
