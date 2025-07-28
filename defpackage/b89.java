package defpackage;

/* renamed from: b89  reason: default package */
public final class b89 implements ys4 {
    public final ija a;
    public final c89 b;
    public final String c;
    public final int d;
    public bpe e;
    public String f;
    public int g = 0;
    public int h;
    public boolean i;
    public boolean j;
    public long k;
    public int l;
    public long m;

    public b89(String str, int i2) {
        ija ija = new ija(4);
        this.a = ija;
        ija.a[0] = -1;
        this.b = new c89(1);
        this.m = -9223372036854775807L;
        this.c = str;
        this.d = i2;
    }

    public final void a() {
        this.g = 0;
        this.h = 0;
        this.j = false;
        this.m = -9223372036854775807L;
    }

    public final void f(ija ija) {
        oyb.l(this.e);
        while (ija.a() > 0) {
            int i2 = this.g;
            boolean z = true;
            ija ija2 = this.a;
            if (i2 == 0) {
                byte[] bArr = ija.a;
                int i3 = ija.b;
                int i4 = ija.c;
                while (true) {
                    if (i3 >= i4) {
                        ija.G(i4);
                        break;
                    }
                    byte b2 = bArr[i3];
                    boolean z2 = (b2 & 255) == 255;
                    boolean z3 = this.j && (b2 & 224) == 224;
                    this.j = z2;
                    if (z3) {
                        ija.G(i3 + 1);
                        this.j = false;
                        ija2.a[1] = bArr[i3];
                        this.h = 2;
                        this.g = 1;
                        break;
                    }
                    i3++;
                }
            } else if (i2 == 1) {
                int min = Math.min(ija.a(), 4 - this.h);
                ija.e(this.h, ija2.a, min);
                int i5 = this.h + min;
                this.h = i5;
                if (i5 >= 4) {
                    ija2.G(0);
                    int g2 = ija2.g();
                    c89 c89 = this.b;
                    if (!c89.a(g2)) {
                        this.h = 0;
                        this.g = 1;
                    } else {
                        this.l = c89.d;
                        if (!this.i) {
                            this.k = (((long) c89.h) * 1000000) / ((long) c89.e);
                            uu5 uu5 = new uu5();
                            uu5.a = this.f;
                            uu5.m = c49.l(c89.c);
                            uu5.n = 4096;
                            uu5.A = c89.f;
                            uu5.B = c89.e;
                            uu5.d = this.c;
                            uu5.f = this.d;
                            this.e.e(new xu5(uu5));
                            this.i = true;
                        }
                        ija2.G(0);
                        this.e.b(ija2, 4, 0);
                        this.g = 2;
                    }
                }
            } else if (i2 == 2) {
                int min2 = Math.min(ija.a(), this.l - this.h);
                this.e.b(ija, min2, 0);
                int i6 = this.h + min2;
                this.h = i6;
                if (i6 >= this.l) {
                    if (this.m == -9223372036854775807L) {
                        z = false;
                    }
                    oyb.k(z);
                    this.e.a(this.m, 1, this.l, 0, (zoe) null);
                    this.m += this.k;
                    this.h = 0;
                    this.g = 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final void h(int i2, long j2) {
        this.m = j2;
    }

    public final void j(boolean z) {
    }

    public final void k(i75 i75, pse pse) {
        pse.a();
        pse.b();
        this.f = pse.f;
        pse.b();
        this.e = i75.B(pse.e, 1);
    }
}
