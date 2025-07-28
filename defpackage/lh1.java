package defpackage;

/* renamed from: lh1  reason: default package */
public final class lh1 extends wh1 {
    public final le1 C;

    public lh1(le1 le1) {
        this.C = le1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lh1) && hhd.f(this.C, ((lh1) obj).C);
    }

    public final int hashCode() {
        return this.C.hashCode();
    }

    public final String toString() {
        return "RaiseHandDialog(participantId=" + this.C + ")";
    }
}
