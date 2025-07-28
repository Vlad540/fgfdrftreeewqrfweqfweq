package defpackage;

import java.util.Collections;

/* renamed from: i1d  reason: default package */
public final class i1d extends f1d {
    public final String D0;
    public final o10 E0;
    public final boolean F0;

    public i1d(h1d h1d) {
        super(h1d);
        this.D0 = h1d.m;
        this.E0 = (o10) h1d.o;
        this.F0 = h1d.n;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, p10] */
    public final uo8 y() {
        boolean z = this.F0;
        o10 o10 = this.E0;
        if (z) {
            m00 j = o10.j();
            j.w = c10.b;
            o10 = j.a();
        }
        ? obj = new Object();
        obj.a = Collections.singletonList(o10);
        jj7 c = obj.c();
        uo8 uo8 = new uo8();
        uo8.n = c;
        String str = this.D0;
        if (!r1g.p(str)) {
            uo8.g = str;
        }
        uo8.F = null;
        return uo8;
    }

    public final long z(long j, i22 i22) {
        long z = super.z(j, i22);
        if (this.F0) {
            pk a = a();
            gy9 gy9 = (gy9) a;
            gy9.w(gy9, new j99(((j2b) gy9.z()).a.n(), this.E0.g.b, j));
        }
        return z;
    }
}
