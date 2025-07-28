package defpackage;

/* renamed from: lj1  reason: default package */
public final class lj1 {
    public final w2d a;

    public lj1(w2d w2d) {
        this.a = w2d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lj1) && hhd.f(this.a, ((lj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemovedParams(roomId=" + this.a + ")";
    }
}
