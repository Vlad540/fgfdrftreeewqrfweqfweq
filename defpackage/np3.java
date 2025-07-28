package defpackage;

/* renamed from: np3  reason: default package */
public final class np3 extends uh0 {
    public final int D0;
    public final long E0;
    public final ay2 F0;
    public long G0;
    public volatile boolean H0;
    public boolean I0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public np3(qz3 qz3, yz3 yz3, xu5 xu5, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, ay2 ay2) {
        super(qz3, yz3, xu5, i, obj, j, j2, j3, j4, j5);
        this.D0 = i2;
        this.E0 = j6;
        this.F0 = ay2;
    }

    public final void a() {
        this.H0 = true;
    }

    public final long b() {
        return this.y0 + ((long) this.D0);
    }

    public final boolean c() {
        return this.I0;
    }

    public final void e(otf otf) {
        xu5 xu5 = this.o;
        if (c49.i(xu5.m)) {
            int i = xu5.I;
            int i2 = xu5.J;
            if ((i > 1 || i2 > 1) && i != -1 && i2 != -1) {
                bpe N = otf.N(4);
                int i3 = i * i2;
                long j = (this.w0 - this.Z) / ((long) i3);
                for (int i4 = 1; i4 < i3; i4++) {
                    N.b(new ija(), 0, 0);
                    N.a(((long) i4) * j, 0, 0, 0, (zoe) null);
                }
            }
        }
    }

    public final void load() {
        r74 r74;
        otf otf = this.B0;
        oyb.l(otf);
        if (this.G0 == 0) {
            long j = this.E0;
            for (wjc wjc : (wjc[]) otf.b) {
                if (wjc.F != j) {
                    wjc.F = j;
                    wjc.z = true;
                }
            }
            ay2 ay2 = this.F0;
            long j2 = this.z0;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.E0;
            long j4 = this.A0;
            ((qt0) ay2).b(otf, j3, j4 == -9223372036854775807L ? -9223372036854775807L : j4 - this.E0);
        }
        try {
            yz3 b = this.b.b(this.G0);
            fsd fsd = this.x0;
            r74 = new r74(fsd, b.f, fsd.G(b));
            while (!this.H0) {
                int g = ((qt0) this.F0).a.g(r74, qt0.z0);
                oyb.k(g != 1);
                if (!(g == 0)) {
                    break;
                }
            }
            e(otf);
            this.G0 = r74.o - this.b.f;
            vx3.i(this.x0);
            this.I0 = !this.H0;
        } catch (Throwable th) {
            vx3.i(this.x0);
            throw th;
        }
    }
}
