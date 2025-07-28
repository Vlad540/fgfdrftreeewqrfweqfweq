package defpackage;

/* renamed from: mz0  reason: default package */
public final class mz0 implements nz0 {
    public final long a;
    public final boolean b;

    public mz0(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz0)) {
            return false;
        }
        mz0 mz0 = (mz0) obj;
        return this.a == mz0.a && this.b == mz0.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneToOne(opponentId=");
        sb.append(this.a);
        sb.append(", isVideo=");
        return hr1.j(sb, this.b, ")");
    }
}
