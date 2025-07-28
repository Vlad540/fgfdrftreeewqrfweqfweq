package defpackage;

/* renamed from: hid  reason: default package */
public final class hid extends uh0 {
    public final int D0;
    public final xu5 E0;
    public long F0;
    public boolean G0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hid(qz3 qz3, yz3 yz3, xu5 xu5, int i, Object obj, long j, long j2, long j3, int i2, xu5 xu52) {
        super(qz3, yz3, xu5, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.D0 = i2;
        this.E0 = xu52;
    }

    public final void a() {
    }

    public final boolean c() {
        return this.G0;
    }

    public final void load() {
        fsd fsd = this.x0;
        otf otf = this.B0;
        oyb.l(otf);
        for (wjc wjc : (wjc[]) otf.b) {
            if (wjc.F != 0) {
                wjc.F = 0;
                wjc.z = true;
            }
        }
        bpe N = otf.N(this.D0);
        N.e(this.E0);
        try {
            long G = fsd.G(this.b.b(this.F0));
            if (G != -1) {
                G += this.F0;
            }
            r74 r74 = new r74(this.x0, this.F0, G);
            for (int i = 0; i != -1; i = N.c(r74, Integer.MAX_VALUE, true)) {
                this.F0 += (long) i;
            }
            N.a(this.Z, 1, (int) this.F0, 0, (zoe) null);
            vx3.i(fsd);
            this.G0 = true;
        } catch (Throwable th) {
            vx3.i(fsd);
            throw th;
        }
    }
}
