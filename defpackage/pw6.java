package defpackage;

/* renamed from: pw6  reason: default package */
public final class pw6 extends xx2 {
    public long A0;
    public volatile boolean B0;
    public final pt0 y0;
    public afc z0;

    public pw6(oz3 oz3, xz3 xz3, vu5 vu5, int i, Object obj, pt0 pt0) {
        super(oz3, xz3, 2, vu5, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.y0 = pt0;
    }

    public final void a() {
        this.B0 = true;
    }

    public final void load() {
        q74 q74;
        boolean z;
        if (this.A0 == 0) {
            this.y0.b(this.z0, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            xz3 b = this.b.b(this.A0);
            esd esd = this.x0;
            q74 = new q74(esd, b.f, esd.N(b));
            do {
                if (!this.B0) {
                    int i = this.y0.a.i(q74, pt0.y0);
                    z = false;
                    swb.h(i != 1);
                    if (i == 0) {
                        z = true;
                        continue;
                    }
                }
                break;
            } while (z);
            break;
            this.A0 = q74.o - this.b.f;
            bm3.f(this.x0);
        } catch (Throwable th) {
            bm3.f(this.x0);
            throw th;
        }
    }
}
