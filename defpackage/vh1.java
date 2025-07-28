package defpackage;

/* renamed from: vh1  reason: default package */
public final class vh1 extends wh1 {
    public final mge C;
    public final s16 D;

    public vh1(jge jge, k61 k61) {
        this.C = jge;
        this.D = k61;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh1)) {
            return false;
        }
        vh1 vh1 = (vh1) obj;
        vh1.getClass();
        return hhd.f(this.C, vh1.C) && hhd.f(this.D, vh1.D);
    }

    public final int hashCode() {
        return this.D.hashCode() + c3d.e(fh1.b.hashCode() * 31, 31, this.C);
    }

    public final String toString() {
        return "ShowTimerSnackbar(priority=" + fh1.b + ", textSource=" + this.C + ", action=" + this.D + ")";
    }
}
