package defpackage;

/* renamed from: s3  reason: default package */
public final class s3 implements e75 {
    public final u3 a = new u3();
    public final ija b = new ija(2786);
    public boolean c;

    public final void S(i75 i75) {
        this.a.k(i75, new pse(0, 1, 1, (byte) 0));
        i75.w();
        i75.M(new wc0(-9223372036854775807L));
    }

    public final void d(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    public final int g(g75 g75, le4 le4) {
        ija ija = this.b;
        int read = ((r74) g75).read(ija.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        ija.G(0);
        ija.F(read);
        boolean z = this.c;
        u3 u3Var = this.a;
        if (!z) {
            u3Var.n = 0;
            this.c = true;
        }
        u3Var.f(ija);
        return 0;
    }

    public final boolean n(g75 g75) {
        int i;
        ija ija = new ija(10);
        int i2 = 0;
        while (true) {
            ((r74) g75).r(ija.a, 0, 10, false);
            ija.G(0);
            if (ija.x() != 4801587) {
                break;
            }
            ija.H(3);
            int t = ija.t();
            i2 += t + 10;
            ((r74) g75).b(t, false);
        }
        r74 r74 = (r74) g75;
        r74.Y = 0;
        r74.b(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            r74.r(ija.a, 0, 6, false);
            ija.G(0);
            if (ija.A() != 2935) {
                r74.Y = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                r74.b(i4, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = ija.a;
                if (bArr.length < 6) {
                    i = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    i = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b2 = bArr[4];
                    i = z3d.t((b2 & 192) >> 6, b2 & 63);
                }
                if (i == -1) {
                    return false;
                }
                r74.b(i - 6, false);
            }
        }
    }

    public final void release() {
    }
}
