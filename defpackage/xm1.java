package defpackage;

import java.util.Objects;

/* renamed from: xm1  reason: default package */
public final class xm1 {
    public final w8f a;
    public final ge1 b;
    public final w69 c;

    public xm1(it4 it4) {
        this.a = (w8f) it4.b;
        this.b = (ge1) it4.a;
        this.c = (w69) it4.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xm1.class != obj.getClass()) {
            return false;
        }
        xm1 xm1 = (xm1) obj;
        return this.a == xm1.a && this.b.equals(xm1.b) && Objects.equals(this.c, xm1.c);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return "CallVideoTrackParticipantKey{" + this.b + ", type=" + this.a + ", mid=" + this.c + "}";
    }
}
