package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: mi6  reason: default package */
public final class mi6 extends wi6 {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final wn4 q;
    public final ws6 r;
    public final ws6 s;
    public final zs6 t;
    public final long u;
    public final li6 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mi6(int i2, String str, List list, long j2, boolean z, long j3, boolean z2, int i3, long j4, int i4, long j5, long j6, boolean z3, boolean z4, boolean z5, wn4 wn4, List list2, List list3, li6 li6, Map map) {
        super(str, z3, list);
        long j7 = j2;
        String str2 = str;
        List list4 = list;
        this.d = i2;
        this.h = j3;
        this.g = z;
        this.i = z2;
        this.j = i3;
        this.k = j4;
        this.l = i4;
        this.m = j5;
        this.n = j6;
        this.o = z4;
        this.p = z5;
        this.q = wn4;
        this.r = ws6.j(list2);
        this.s = ws6.j(list3);
        this.t = zs6.b(map);
        if (!list3.isEmpty()) {
            di6 di6 = (di6) gwf.t(list3);
            this.u = di6.X + di6.c;
        } else if (!list2.isEmpty()) {
            hi6 hi6 = (hi6) gwf.t(list2);
            this.u = hi6.X + hi6.c;
        } else {
            this.u = 0;
        }
        this.e = j7 != -9223372036854775807L ? j7 >= 0 ? Math.min(this.u, j2) : Math.max(0, this.u + j7) : -9223372036854775807L;
        this.f = j7 >= 0;
        this.v = li6;
    }

    public final Object a(List list) {
        return this;
    }
}
