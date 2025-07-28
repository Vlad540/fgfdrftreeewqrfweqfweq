package defpackage;

import java.io.Serializable;

/* renamed from: sr8  reason: default package */
public final class sr8 implements Serializable {
    public final rr8 a;
    public final int b;

    public sr8(rr8 rr8, int i) {
        this.a = rr8;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr8)) {
            return false;
        }
        sr8 sr8 = (sr8) obj;
        return hhd.f(this.a, sr8.a) && this.b == sr8.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MessageReactionCounter(reaction=" + this.a + ", count=" + this.b + ")";
    }
}
