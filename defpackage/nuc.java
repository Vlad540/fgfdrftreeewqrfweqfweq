package defpackage;

import java.util.List;

/* renamed from: nuc  reason: default package */
public final class nuc extends luc {
    public final List j;

    public nuc(mxb mxb, long j2, long j3, long j4, long j5, List list, long j6, List list2, long j7, long j8) {
        super(mxb, j2, j3, j4, j5, list, j6, j7, j8);
        this.j = list2;
    }

    public final long e(long j2) {
        return (long) this.j.size();
    }

    public final mxb i(long j2, jac jac) {
        return (mxb) this.j.get((int) (j2 - this.d));
    }

    public final boolean j() {
        return true;
    }
}
