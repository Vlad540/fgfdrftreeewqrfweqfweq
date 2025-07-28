package defpackage;

/* renamed from: mp3  reason: default package */
public final class mp3 extends th0 {
    public final int D0;
    public final long E0;
    public final pt0 F0;
    public long G0;
    public volatile boolean H0;
    public boolean I0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mp3(oz3 oz3, xz3 xz3, vu5 vu5, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, pt0 pt0) {
        super(oz3, xz3, vu5, i, obj, j, j2, j3, j4, j5);
        this.D0 = i2;
        this.E0 = j6;
        this.F0 = pt0;
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

    public final void load() {
        q74 q74;
        boolean z;
        if (this.G0 == 0) {
            afc afc = this.B0;
            swb.i(afc);
            long j = this.E0;
            for (vjc vjc : (vjc[]) afc.b) {
                if (vjc.F != j) {
                    vjc.F = j;
                    vjc.z = true;
                }
            }
            pt0 pt0 = this.F0;
            long j2 = this.z0;
            long j3 = -9223372036854775807L;
            long j4 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.E0;
            long j5 = this.A0;
            if (j5 != -9223372036854775807L) {
                j3 = j5 - this.E0;
            }
            pt0.b(afc, j4, j3);
        }
        try {
            xz3 b = this.b.b(this.G0);
            esd esd = this.x0;
            q74 = new q74(esd, b.f, esd.N(b));
            do {
                if (!this.H0) {
                    int i = this.F0.a.i(q74, pt0.y0);
                    swb.h(i != 1);
                    if (i == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                }
                break;
            } while (z);
            break;
            this.G0 = q74.o - this.b.f;
            bm3.f(this.x0);
            this.I0 = !this.H0;
        } catch (Throwable th) {
            bm3.f(this.x0);
            throw th;
        }
    }
}
