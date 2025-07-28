package defpackage;

/* renamed from: xva  reason: default package */
public final class xva implements yva {
    public final long a;
    public final mge b;
    public final boolean c;

    public xva(long j, lge lge, boolean z) {
        this.a = j;
        this.b = lge;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xva)) {
            return false;
        }
        xva xva = (xva) obj;
        return this.a == xva.a && hhd.f(this.b, xva.b) && this.c == xva.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + c3d.e(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "State(messageId=" + this.a + ", text=" + this.b + ", canClose=" + this.c + ")";
    }
}
