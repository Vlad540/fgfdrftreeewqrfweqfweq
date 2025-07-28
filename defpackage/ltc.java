package defpackage;

/* renamed from: ltc  reason: default package */
public final class ltc implements qse {
    public final jtc a;
    public final yze b = new yze(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public ltc(jtc jtc) {
        this.a = jtc;
    }

    public final void a() {
        this.f = true;
    }

    public final void b(bke bke, h75 h75, pse pse) {
        this.a.b(bke, h75, pse);
        this.f = true;
    }

    public final void c(int i, yze yze) {
        boolean z = (i & 1) != 0;
        int v = z ? yze.b + yze.v() : -1;
        if (this.f) {
            if (z) {
                this.f = false;
                yze.H(v);
                this.d = 0;
            } else {
                return;
            }
        }
        while (yze.c() > 0) {
            int i2 = this.d;
            yze yze2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int v2 = yze.v();
                    yze.H(yze.b - 1);
                    if (v2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(yze.c(), 3 - this.d);
                yze.g(this.d, yze2.a, min);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 3) {
                    yze2.H(0);
                    yze2.G(3);
                    yze2.I(1);
                    int v3 = yze2.v();
                    int v4 = yze2.v();
                    this.e = (v3 & 128) != 0;
                    int i4 = (((v3 & 15) << 8) | v4) + 3;
                    this.c = i4;
                    byte[] bArr = yze2.a;
                    if (bArr.length < i4) {
                        yze2.d(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(yze.c(), this.c - this.d);
                yze.g(this.d, yze2.a, min2);
                int i5 = this.d + min2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.e) {
                        byte[] bArr2 = yze2.a;
                        int i7 = mze.a;
                        int i8 = -1;
                        for (int i9 = 0; i9 < i6; i9++) {
                            i8 = mze.m[((i8 >>> 24) ^ (bArr2[i9] & 255)) & 255] ^ (i8 << 8);
                        }
                        if (i8 != 0) {
                            this.f = true;
                            return;
                        }
                        yze2.G(this.c - 4);
                    } else {
                        yze2.G(i6);
                    }
                    yze2.H(0);
                    this.a.g(yze2);
                    this.d = 0;
                }
            }
        }
    }
}
