package defpackage;

import java.util.Objects;

/* renamed from: kj1  reason: default package */
public final class kj1 {
    public final ke1 a;
    public final w2d b;
    public final q2d c;

    public kj1(ke1 ke1, w2d w2d, q2d q2d) {
        this.a = ke1;
        this.b = w2d;
        this.c = q2d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj1)) {
            return false;
        }
        kj1 kj1 = (kj1) obj;
        return hhd.f(this.a, kj1.a) && hhd.f(this.b, kj1.b) && hhd.f(this.c, kj1.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Objects.hashCode(this.a.a) * 31)) * 31;
        q2d q2d = this.c;
        return hashCode + (q2d == null ? 0 : q2d.hashCode());
    }

    public final String toString() {
        return "InvitedParams(me=" + this.a + ", roomId=" + this.b + ", room=" + this.c + ")";
    }
}
