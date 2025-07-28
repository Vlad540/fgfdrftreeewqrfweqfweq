package defpackage;

/* renamed from: th1  reason: default package */
public final class th1 extends wh1 {
    public final g21 C;

    public th1(g21 g21) {
        this.C = g21;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof th1) && hhd.f(this.C, ((th1) obj).C);
    }

    public final int hashCode() {
        return this.C.hashCode();
    }

    public final String toString() {
        return "ShowOpponentInfo(contextInfo=" + this.C + ")";
    }
}
