package defpackage;

/* renamed from: fa0  reason: default package */
public final class fa0 {
    public final long a;
    public final hb0 b;
    public final i90 c;

    public fa0(long j, hb0 hb0, i90 i90) {
        this.a = j;
        this.b = hb0;
        this.c = i90;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fa0)) {
            return false;
        }
        fa0 fa0 = (fa0) obj;
        return this.a == fa0.a && this.b.equals(fa0.b) && this.c.equals(fa0.c);
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
