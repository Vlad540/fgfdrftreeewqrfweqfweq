package defpackage;

/* renamed from: twf  reason: default package */
public final class twf {
    public final long a;
    public final u4b b;

    public twf(long j, u4b u4b) {
        this.a = j;
        this.b = u4b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twf)) {
            return false;
        }
        twf twf = (twf) obj;
        return this.a == twf.a && hhd.f(this.b, twf.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "State(uptime=" + this.a + ", processorInfo=" + this.b + ")";
    }
}
