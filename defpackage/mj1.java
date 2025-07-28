package defpackage;

/* renamed from: mj1  reason: default package */
public final class mj1 {
    public final w2d a;
    public final q2d b;

    public mj1(w2d w2d, q2d q2d) {
        this.a = w2d;
        this.b = q2d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj1)) {
            return false;
        }
        mj1 mj1 = (mj1) obj;
        return hhd.f(this.a, mj1.a) && hhd.f(this.b, mj1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdatedParams(roomId=" + this.a + ", room=" + this.b + ")";
    }
}
