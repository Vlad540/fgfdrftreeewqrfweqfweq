package defpackage;

/* renamed from: a89  reason: default package */
public final class a89 implements xs4 {
    public final yze a;
    public final c89 b;
    public final String c;
    public ape d;
    public String e;
    public int f = 0;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public a89(String str) {
        yze yze = new yze(4);
        this.a = yze;
        yze.a[0] = -1;
        this.b = new c89(0);
        this.l = -9223372036854775807L;
        this.c = str;
    }

    public final void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }

    public final void g(yze yze) {
        swb.i(this.d);
        while (yze.c() > 0) {
            int i2 = this.f;
            yze yze2 = this.a;
            if (i2 == 0) {
                byte[] bArr = yze.a;
                int i3 = yze.b;
                int i4 = yze.c;
                while (true) {
                    if (i3 >= i4) {
                        yze.H(i4);
                        break;
                    }
                    byte b2 = bArr[i3];
                    boolean z = (b2 & 255) == 255;
                    boolean z2 = this.i && (b2 & 224) == 224;
                    this.i = z;
                    if (z2) {
                        yze.H(i3 + 1);
                        this.i = false;
                        yze2.a[1] = bArr[i3];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    i3++;
                }
            } else if (i2 == 1) {
                int min = Math.min(yze.c(), 4 - this.g);
                yze.g(this.g, yze2.a, min);
                int i5 = this.g + min;
                this.g = i5;
                if (i5 >= 4) {
                    yze2.H(0);
                    int h2 = yze2.h();
                    c89 c89 = this.b;
                    if (!c89.a(h2)) {
                        this.g = 0;
                        this.f = 1;
                    } else {
                        this.k = c89.d;
                        if (!this.h) {
                            int i6 = c89.e;
                            this.j = (((long) c89.h) * 1000000) / ((long) i6);
                            tu5 tu5 = new tu5();
                            tu5.a = this.e;
                            tu5.k = c89.c;
                            tu5.l = 4096;
                            tu5.x = c89.f;
                            tu5.y = i6;
                            tu5.c = this.c;
                            this.d.d(new vu5(tu5));
                            this.h = true;
                        }
                        yze2.H(0);
                        this.d.c(4, yze2);
                        this.f = 2;
                    }
                }
            } else if (i2 == 2) {
                int min2 = Math.min(yze.c(), this.k - this.g);
                this.d.c(min2, yze);
                int i7 = this.g + min2;
                this.g = i7;
                int i8 = this.k;
                if (i7 >= i8) {
                    long j2 = this.l;
                    if (j2 != -9223372036854775807L) {
                        this.d.b(j2, 1, i8, 0, (yoe) null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final void h(int i2, long j2) {
        if (j2 != -9223372036854775807L) {
            this.l = j2;
        }
    }

    public final void i() {
    }

    public final void l(h75 h75, pse pse) {
        pse.a();
        pse.b();
        this.e = pse.f;
        pse.b();
        this.d = h75.B(pse.e, 1);
    }
}
