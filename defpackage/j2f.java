package defpackage;

/* renamed from: j2f  reason: default package */
public final class j2f extends ol implements qce {
    public final int X = 100;
    public final boolean Y;
    public final String Z;
    public final long o;

    public j2f(long j, long j2, boolean z) {
        super(j);
        this.o = j2;
        this.Y = z;
        this.Z = j2f.class.getName();
    }

    public final void c(lbe lbe) {
        k2f k2f = (k2f) lbe;
        s77 s77 = new s77();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        for (b61 b61 : k2f.c) {
            i22 y = m().y(b61.a);
            int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
            ym8 ym8 = b61.b;
            if (i == 0 || ym8.b < j2) {
                j2 = ym8.b;
            }
            if (j3 == 0 || ym8.b > j3) {
                j3 = ym8.b;
            }
            if (y != null) {
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                ((hz3) ((a04) plVar.P.getValue())).c.e(y.a, ((j2b) r()).a.s(), ym8);
            } else {
                s77.a(Long.valueOf(b61.a), Long.valueOf(ym8.a));
            }
            j = 0;
        }
        String T = ez3.T(Long.valueOf(j2));
        String T2 = ez3.T(Long.valueOf(j3));
        int b = s77.b();
        StringBuilder j4 = c3d.j("onSuccess: startTime: ", T, " endTime: ", T2, " missedMessages: ");
        j4.append(b);
        udd.q(this.Z, j4.toString());
        tt0 l = l();
        long j5 = k2f.o;
        long j6 = k2f.X;
        boolean z = k2f.Y;
        long j7 = this.a;
        l2f l2f = r2;
        l2f l2f2 = new l2f(j7, j2, j3, j5, j6, z, s77);
        l.c(l2f);
    }

    public final void d(uae uae) {
        l().c(new jh0(this.a, uae));
    }

    public final ibe i() {
        bm9 bm9 = new bm9((dfa) null, 14);
        long j = this.o;
        if (j > 0) {
            bm9.n(j, "marker");
        }
        bm9.g(this.X, "count");
        bm9.d("forward", this.Y);
        return bm9;
    }
}
