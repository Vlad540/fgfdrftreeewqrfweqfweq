package defpackage;

/* renamed from: uh1  reason: default package */
public final class uh1 extends wh1 {
    public final mge C;
    public final Integer D;

    public uh1(mge mge, Integer num) {
        this.C = mge;
        this.D = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh1)) {
            return false;
        }
        uh1 uh1 = (uh1) obj;
        uh1.getClass();
        return hhd.f(this.C, uh1.C) && hhd.f(this.D, uh1.D);
    }

    public final int hashCode() {
        int e = c3d.e(fh1.a.hashCode() * 31, 31, this.C);
        Integer num = this.D;
        return e + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(priority=" + fh1.a + ", textSource=" + this.C + ", icon=" + this.D + ")";
    }
}
