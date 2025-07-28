package defpackage;

/* renamed from: qw6  reason: default package */
public final class qw6 extends zx2 {
    public long A0;
    public volatile boolean B0;
    public final ay2 y0;
    public otf z0;

    public qw6(qz3 qz3, yz3 yz3, xu5 xu5, int i, Object obj, ay2 ay2) {
        super(qz3, yz3, 2, xu5, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.y0 = ay2;
    }

    public final void a() {
        this.B0 = true;
    }

    public final void load() {
        r74 r74;
        boolean z;
        if (this.A0 == 0) {
            ((qt0) this.y0).b(this.z0, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            yz3 b = this.b.b(this.A0);
            fsd fsd = this.x0;
            r74 = new r74(fsd, b.f, fsd.G(b));
            do {
                if (!this.B0) {
                    int g = ((qt0) this.y0).a.g(r74, qt0.z0);
                    z = false;
                    oyb.k(g != 1);
                    if (g == 0) {
                        z = true;
                        continue;
                    }
                }
                break;
            } while (z);
            break;
            this.A0 = r74.o - this.b.f;
            vx3.i(this.x0);
        } catch (Throwable th) {
            vx3.i(this.x0);
            throw th;
        }
    }
}
