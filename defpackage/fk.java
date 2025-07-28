package defpackage;

/* renamed from: fk  reason: default package */
public final class fk {
    public final long a;

    public fk(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fk) && zp4.d(this.a, ((fk) obj).a);
    }

    public final int hashCode() {
        int i = zp4.o;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.i("AnrConfig(timeout=", zp4.j(this.a), ")");
    }
}
