package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ab2  reason: default package */
public final class ab2 implements og6 {
    public final /* synthetic */ b62 b;
    public final /* synthetic */ b0d c;

    public ab2(b0d b0d, b62 b62) {
        this.c = b0d;
        this.b = b62;
    }

    public final long g() {
        return this.b.c;
    }

    public final long h() {
        long j = this.b.d;
        if (j == 0) {
            b0d b0d = this.c;
            long j2 = ((i22) b0d.b).b.j;
            long j3 = ((vo8) b0d.c).b;
            if (j2 == j3) {
                return j3;
            }
        }
        return j;
    }

    public final List i() {
        ArrayList arrayList = new ArrayList(this.b.e);
        b0d b0d = this.c;
        arrayList.addAll(((i22) b0d.b).b.n.d(md4.REGULAR));
        oyb.K(arrayList);
        vo8 vo8 = (vo8) b0d.c;
        if (((h62) oyb.x(vo8.o, arrayList).b) == null) {
            long j = vo8.o;
            arrayList.add(new h62(j, j));
        }
        return new ArrayList(arrayList);
    }
}
