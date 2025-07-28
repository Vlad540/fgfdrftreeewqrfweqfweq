package defpackage;

/* renamed from: cja  reason: default package */
public abstract class cja {
    public static final jx0 a = new jx0(new hge(r1a.J), (long) o1a.q, (d7d) null, (hge) null, (b7d) null, Integer.valueOf(n1a.H0), 0, false, 880);
    public static final jx0 b = new jx0(new hge(r1a.I), (long) o1a.F, (d7d) null, (hge) null, (b7d) null, Integer.valueOf(zhc.P), 0, false, 880);
    public static final jx0 c;
    public static final jx0 d;
    public static final jx0 e;
    public static final jx0 f;
    public static final jx0 g;
    public static final jx0 h;
    public static final jx0 i;
    public static final jx0 j;
    public static final jx0 k;
    public static final jx0 l;
    public static final jx0 m;
    public static final jx0 n;

    static {
        long j2 = (long) o1a.w;
        int i2 = r1a.O;
        hge hge = new hge(i2);
        int i3 = n1a.p0;
        c = new jx0(hge, j2, (d7d) null, (hge) null, (b7d) null, Integer.valueOf(i3), 0, false, 880);
        d = new jx0(new hge(r1a.S), (long) o1a.y, (d7d) null, (hge) null, (b7d) null, Integer.valueOf(i3), 0, false, 880);
        long j3 = (long) o1a.x;
        hge hge2 = new hge(i2);
        int i4 = n1a.l;
        d7d d7d = d7d.o;
        e = new jx0(hge2, j3, d7d, new hge(r1a.P), (b7d) null, Integer.valueOf(i4), 0, false, 320);
        long j4 = (long) o1a.r;
        int i5 = r1a.K;
        hge hge3 = new hge(i5);
        int i6 = n1a.h0;
        int i7 = o1a.i0;
        f = new jx0(hge3, j4, (d7d) null, (hge) null, (b7d) null, Integer.valueOf(i6), i7, false, 624);
        g = new jx0(new hge(r1a.R), (long) o1a.t, (d7d) null, (hge) null, (b7d) null, Integer.valueOf(n1a.u0), i7, false, 624);
        h = new jx0(new hge(r1a.L), (long) o1a.u, (d7d) null, (hge) null, (b7d) null, Integer.valueOf(n1a.g0), i7, true, 112);
        i = new jx0(new hge(i5), (long) o1a.s, d7d, new hge(r1a.M), (b7d) null, Integer.valueOf(i6), i7, false, 64);
        long j5 = (long) o1a.R0;
        int i8 = r1a.W0;
        hge hge4 = new hge(i8);
        int i9 = n1a.H;
        j = new jx0(hge4, j5, (d7d) null, (hge) null, (b7d) null, Integer.valueOf(i9), 0, false, 880);
        k = new jx0(new hge(i8), j5, d7d, (hge) null, (b7d) null, Integer.valueOf(i9), 0, false, 352);
        long j6 = (long) o1a.S0;
        int i10 = r1a.Y0;
        hge hge5 = new hge(i10);
        int i11 = r1a.X0;
        hge hge6 = new hge(i11);
        int i12 = n1a.t0;
        l = new jx0(hge5, j6, (d7d) null, hge6, (b7d) null, Integer.valueOf(i12), 0, false, 848);
        m = new jx0(new hge(i10), j6, d7d, new hge(i11), (b7d) null, Integer.valueOf(i12), 0, false, 320);
        long j7 = (long) o1a.v;
        n = new jx0(new hge(r1a.N), j7, (d7d) null, (hge) null, w6d.a, Integer.valueOf(n1a.q), 0, false, 816);
    }

    public static void a(lg7 lg7, ai1 ai1) {
        if (!ai1.f && ai1.d) {
            lg7.add(e);
        } else if (ai1.a()) {
            lg7.add(d);
        } else {
            lg7.add(c);
        }
    }

    public static lg7 b(yh1 yh1) {
        lg7 c2 = hwf.c();
        boolean z = yh1.a;
        boolean z2 = yh1.b;
        boolean z3 = yh1.c;
        if (z3 && ((!z || !z3) && !z2)) {
            c2.add(h);
        } else if (z3 && (z2 || z)) {
            c2.add(g);
        } else if (!yh1.e || z2) {
            c2.add(f);
        } else {
            c2.add(i);
        }
        return hwf.a(c2);
    }
}
