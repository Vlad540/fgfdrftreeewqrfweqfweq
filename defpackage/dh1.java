package defpackage;

/* renamed from: dh1  reason: default package */
public final class dh1 extends wh1 {
    public final raf C;

    public dh1(raf raf) {
        this.C = raf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dh1) && this.C == ((dh1) obj).C;
    }

    public final int hashCode() {
        return this.C.hashCode();
    }

    public final String toString() {
        return "ChangeMode(mode=" + this.C + ")";
    }
}
