package defpackage;

/* renamed from: jj1  reason: default package */
public final class jj1 {
    public final w2d a;
    public final q2d b;

    public jj1(w2d w2d, q2d q2d) {
        this.a = w2d;
        this.b = q2d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj1)) {
            return false;
        }
        jj1 jj1 = (jj1) obj;
        return hhd.f(this.a, jj1.a) && hhd.f(this.b, jj1.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q2d q2d = this.b;
        return hashCode + (q2d == null ? 0 : q2d.hashCode());
    }

    public final String toString() {
        return "ActiveRoomChangedParams(roomId=" + this.a + ", room=" + this.b + ")";
    }
}
