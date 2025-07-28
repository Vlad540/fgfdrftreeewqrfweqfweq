package defpackage;

import java.util.List;

/* renamed from: ouc  reason: default package */
public final class ouc extends muc {
    public final List j;

    public ouc(nxb nxb, long j2, long j3, long j4, long j5, List list, long j6, List list2, long j7, long j8) {
        super(nxb, j2, j3, j4, j5, list, j6, j7, j8);
        this.j = list2;
    }

    public final long e(long j2) {
        return (long) this.j.size();
    }

    public final nxb i(long j2, kac kac) {
        return (nxb) this.j.get((int) (j2 - this.d));
    }

    public final boolean j() {
        return true;
    }
}
