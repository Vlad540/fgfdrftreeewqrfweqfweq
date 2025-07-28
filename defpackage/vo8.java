package defpackage;

import java.util.List;

/* renamed from: vo8  reason: default package */
public final class vo8 extends hh0 {
    public final long A0;
    public final String B0;
    public final String C0;
    public final jj7 D0;
    public final int E0;
    public final long F0;
    public final vo8 G0;
    public final String H0;
    public final String I0;
    public final int J0;
    public final boolean K0;
    public final int L0;
    public final int M0;
    public final long N0;
    public final long O0;
    public final vo8 P0;
    public final int Q0;
    public final long R0;
    public final int S0;
    public final int T0;
    public final long U0;
    public final List V0;
    public final yr8 W0;
    public final long X;
    public final nd4 X0;
    public final long Y;
    public final md4 Y0;
    public final long Z;
    public final int Z0;
    public final long c;
    public final long o;
    public final String w0;
    public final long x0;
    public final bp8 y0;
    public final ls8 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vo8(long j, long j2, long j3, long j4, long j5, long j6, long j7, String str, bp8 bp8, ls8 ls8, long j8, String str2, String str3, jj7 jj7, int i, int i2, long j9, vo8 vo8, String str4, String str5, boolean z, int i3, int i4, int i5, long j10, long j11, vo8 vo82, int i6, long j12, int i7, int i8, long j13, List list, yr8 yr8, nd4 nd4) {
        super(j);
        nd4 nd42 = nd4;
        this.c = j2;
        this.o = j4;
        this.X = j5;
        this.Y = j6;
        this.Z = j7;
        this.w0 = str;
        this.x0 = j3;
        this.y0 = bp8;
        this.z0 = ls8;
        this.A0 = j8;
        this.B0 = str2;
        this.C0 = str3;
        this.E0 = i2;
        this.F0 = j9;
        this.G0 = vo8;
        this.J0 = i;
        this.D0 = jj7;
        this.H0 = str4;
        this.I0 = str5;
        this.K0 = z;
        this.L0 = i3;
        this.M0 = i4;
        this.Z0 = i5;
        this.N0 = j10;
        this.O0 = j11;
        this.P0 = vo82;
        this.Q0 = i6;
        this.R0 = j12;
        this.S0 = i7;
        this.T0 = i8;
        this.U0 = j13;
        this.V0 = list;
        this.W0 = yr8;
        this.X0 = nd42;
        this.Y0 = nd42 != null ? md4.DELAYED : md4.REGULAR;
    }

    public final boolean A() {
        if (m()) {
            if (this.D0.x(j10.Z) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean B() {
        if (m()) {
            if (this.D0.x(j10.Y) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean C() {
        if (m()) {
            if (this.D0.x(j10.o) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean D(long j) {
        return t() && ((!d().c() && !d().a()) || this.Y == j);
    }

    public final uo8 E() {
        uo8 uo8 = new uo8();
        uo8.a = this.b;
        uo8.b = this.c;
        uo8.c = this.o;
        uo8.d = this.X;
        uo8.e = this.Y;
        uo8.f = this.Z;
        uo8.g = this.w0;
        uo8.h = this.x0;
        uo8.i = this.y0;
        uo8.j = this.z0;
        uo8.k = this.A0;
        uo8.l = this.B0;
        uo8.m = this.C0;
        uo8.n = this.D0;
        uo8.p = this.E0;
        uo8.q = this.F0;
        uo8.r = this.G0;
        uo8.s = this.H0;
        uo8.t = this.I0;
        uo8.u = this.K0;
        uo8.w = this.M0;
        uo8.v = this.L0;
        uo8.I = this.Z0;
        uo8.x = this.N0;
        uo8.y = this.O0;
        uo8.z = this.P0;
        uo8.A = this.Q0;
        uo8.B = this.R0;
        uo8.C = this.S0;
        uo8.D = this.T0;
        uo8.E = this.U0;
        uo8.F = this.V0;
        uo8.G = this.W0;
        uo8.H = this.X0;
        return uo8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: o10} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: o10} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: o10} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: o10} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.o10 a(defpackage.j10 r4) {
        /*
            r3 = this;
            boolean r0 = r3.m()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            jj7 r3 = r3.D0
            java.lang.Object r3 = r3.a
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x0011
            goto L_0x002f
        L_0x0011:
            java.util.Iterator r3 = r3.iterator()
        L_0x0015:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r3.next()
            r2 = r0
            o10 r2 = (defpackage.o10) r2     // Catch:{ all -> 0x0028 }
            j10 r2 = r2.a     // Catch:{ all -> 0x0028 }
            if (r2 != r4) goto L_0x0015
            r1 = r0
            goto L_0x002f
        L_0x0028:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
        L_0x002f:
            o10 r1 = (defpackage.o10) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo8.a(j10):o10");
    }

    public final int b() {
        jj7 jj7 = this.D0;
        if (jj7 != null) {
            return jj7.v();
        }
        return 0;
    }

    public final l00 c() {
        if (!s()) {
            return null;
        }
        return this.D0.x(j10.X).e;
    }

    public final o00 d() {
        if (!t()) {
            return null;
        }
        return this.D0.x(j10.w0).i;
    }

    public final q00 e() {
        if (!u()) {
            return null;
        }
        return this.D0.x(j10.z0).k;
    }

    public final t00 f() {
        if (!v()) {
            return null;
        }
        return this.D0.x(j10.b).c;
    }

    public final v00 g() {
        if (!w()) {
            return null;
        }
        return this.D0.x(j10.y0).j;
    }

    public final long h() {
        long j = this.X;
        long j2 = this.o;
        return j > j2 ? j : j2;
    }

    public final f10 i() {
        if (!A()) {
            return null;
        }
        return this.D0.x(j10.Z).g;
    }

    public final i10 j() {
        if (!B()) {
            return null;
        }
        return this.D0.x(j10.Y).f;
    }

    public final long k() {
        return this.c == 0 ? this.A0 : this.o;
    }

    public final boolean l(j10 j10) {
        if (!m()) {
            return false;
        }
        int i = 0;
        while (true) {
            jj7 jj7 = this.D0;
            if (i >= jj7.v()) {
                return false;
            }
            if (jj7.u(i).a == j10) {
                return true;
            }
            i++;
        }
    }

    public final boolean m() {
        jj7 jj7 = this.D0;
        return jj7 != null && jj7.v() > 0;
    }

    public final boolean n() {
        return this.X0 != null;
    }

    public final boolean o() {
        return this.G0 != null && this.E0 == 2;
    }

    public final boolean p(long j) {
        List<fp8> list = this.V0;
        if (list != null && !list.isEmpty()) {
            for (fp8 fp8 : list) {
                if (fp8.c == ep8.a && fp8.a == j) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean q() {
        return this.G0 != null && this.E0 == 1;
    }

    public final boolean r() {
        return this.Q0 > 0;
    }

    public final boolean s() {
        if (m()) {
            if (this.D0.x(j10.X) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean t() {
        if (m()) {
            if (this.D0.x(j10.w0) != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return vo8.class.getSimpleName() + "{serverId='" + this.c + ",time=" + this.o + ",status" + this.z0 + "}";
    }

    public final boolean u() {
        if (m()) {
            if (this.D0.x(j10.z0) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean v() {
        if (m()) {
            if (this.D0.x(j10.b) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean w() {
        if (m()) {
            if (this.D0.x(j10.y0) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean x() {
        if (m()) {
            if (this.D0.x(j10.B0) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean y() {
        if (m()) {
            if (this.D0.x(j10.c) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean z() {
        if (m()) {
            if (this.D0.x(j10.A0) != null) {
                return true;
            }
        }
        return false;
    }
}
