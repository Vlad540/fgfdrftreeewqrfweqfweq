package defpackage;

/* renamed from: mtc  reason: default package */
public final class mtc implements rse {
    public final ktc a;
    public final ija b = new ija(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public mtc(ktc ktc) {
        this.a = ktc;
    }

    public final void a() {
        this.f = true;
    }

    public final void b(int i, ija ija) {
        boolean z = (i & 1) != 0;
        int u = z ? ija.b + ija.u() : -1;
        if (this.f) {
            if (z) {
                this.f = false;
                ija.G(u);
                this.d = 0;
            } else {
                return;
            }
        }
        while (ija.a() > 0) {
            int i2 = this.d;
            ija ija2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int u2 = ija.u();
                    ija.G(ija.b - 1);
                    if (u2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(ija.a(), 3 - this.d);
                ija.e(this.d, ija2.a, min);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 3) {
                    ija2.G(0);
                    ija2.F(3);
                    ija2.H(1);
                    int u3 = ija2.u();
                    int u4 = ija2.u();
                    this.e = (u3 & 128) != 0;
                    int i4 = (((u3 & 15) << 8) | u4) + 3;
                    this.c = i4;
                    byte[] bArr = ija2.a;
                    if (bArr.length < i4) {
                        ija2.b(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(ija.a(), this.c - this.d);
                ija.e(this.d, ija2.a, min2);
                int i5 = this.d + min2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        ija2.F(i6);
                    } else if (oze.n(0, i6, -1, ija2.a) != 0) {
                        this.f = true;
                        return;
                    } else {
                        ija2.F(this.c - 4);
                    }
                    ija2.G(0);
                    this.a.f(ija2);
                    this.d = 0;
                }
            }
        }
    }

    public final void e(cke cke, i75 i75, pse pse) {
        this.a.e(cke, i75, pse);
        this.f = true;
    }
}
