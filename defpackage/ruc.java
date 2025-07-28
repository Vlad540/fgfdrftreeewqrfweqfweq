package defpackage;

/* renamed from: ruc  reason: default package */
public final class ruc {
    public final long a;
    public final long b;

    public ruc(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ruc.class != obj.getClass()) {
            return false;
        }
        ruc ruc = (ruc) obj;
        return this.a == ruc.a && this.b == ruc.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
