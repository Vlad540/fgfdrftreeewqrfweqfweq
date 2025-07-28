package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cb2  reason: default package */
public final class cb2 implements og6 {
    public final /* synthetic */ b62 b;
    public final /* synthetic */ i22 c;
    public final /* synthetic */ j60 d;

    public cb2(b62 b62, i22 i22, j60 j60) {
        this.b = b62;
        this.c = i22;
        this.d = j60;
    }

    public final long g() {
        return this.b.c;
    }

    public final long h() {
        long j = this.b.d;
        if (j != 0) {
            return j;
        }
        long j2 = this.c.b.j;
        long j3 = this.d.b;
        return j2 == j3 ? j3 : j;
    }

    public final List i() {
        ArrayList arrayList = new ArrayList(this.b.e);
        arrayList.addAll(this.c.b.n.d(md4.X));
        oyb.K(arrayList);
        j60 j60 = this.d;
        if (((h62) oyb.x(j60.c, arrayList).b) == null) {
            long j = j60.c;
            arrayList.add(new h62(j, j));
        }
        return arrayList;
    }
}
