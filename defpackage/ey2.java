package defpackage;

/* renamed from: ey2  reason: default package */
public final class ey2 implements xjc {
    public final /* synthetic */ iy2 X;
    public final iy2 a;
    public final vjc b;
    public final int c;
    public boolean o;

    public ey2(iy2 iy2, iy2 iy22, vjc vjc, int i) {
        this.X = iy2;
        this.a = iy22;
        this.b = vjc;
        this.c = i;
    }

    public final void a() {
        if (!this.o) {
            iy2 iy2 = this.X;
            af8 af8 = iy2.Z;
            int[] iArr = iy2.b;
            int i = this.c;
            af8.b(iArr[i], iy2.c[i], 0, (Object) null, iy2.I0);
            this.o = true;
        }
    }

    public final void c() {
    }

    public final boolean d() {
        iy2 iy2 = this.X;
        return !iy2.n() && this.b.t(iy2.L0);
    }

    public final int e(long j) {
        iy2 iy2 = this.X;
        if (iy2.n()) {
            return 0;
        }
        boolean z = iy2.L0;
        vjc vjc = this.b;
        int q = vjc.q(j, z);
        th0 th0 = iy2.K0;
        if (th0 != null) {
            q = Math.min(q, th0.d(this.c + 1) - vjc.o());
        }
        vjc.B(q);
        if (q > 0) {
            a();
        }
        return q;
    }

    public final int h(otf otf, m24 m24, int i) {
        iy2 iy2 = this.X;
        if (iy2.n()) {
            return -3;
        }
        th0 th0 = iy2.K0;
        vjc vjc = this.b;
        if (th0 != null && th0.d(this.c + 1) <= vjc.o()) {
            return -3;
        }
        a();
        return vjc.y(otf, m24, i, iy2.L0);
    }
}
