package defpackage;

/* renamed from: suc  reason: default package */
public final class suc {
    public final long a;
    public final long b;

    public suc(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || suc.class != obj.getClass()) {
            return false;
        }
        suc suc = (suc) obj;
        return this.a == suc.a && this.b == suc.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
