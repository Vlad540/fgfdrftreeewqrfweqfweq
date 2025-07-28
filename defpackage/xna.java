package defpackage;

/* renamed from: xna  reason: default package */
public final class xna implements qse {
    public final xs4 a;
    public final wx1 b = new wx1(new byte[10], 10, 1, (byte) 0);
    public int c = 0;
    public int d;
    public bke e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public xna(xs4 xs4) {
        this.a = xs4;
    }

    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    public final void b(bke bke, h75 h75, pse pse) {
        this.e = bke;
        this.a.l(h75, pse);
    }

    public final void c(int i2, yze yze) {
        int i3;
        int i4;
        yze yze2 = yze;
        swb.i(this.e);
        int i5 = i2 & 1;
        xs4 xs4 = this.a;
        int i6 = 2;
        if (i5 != 0) {
            int i7 = this.c;
            if (!(i7 == 0 || i7 == 1 || i7 == 2)) {
                if (i7 == 3) {
                    xs4.i();
                } else {
                    throw new IllegalStateException();
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i8 = i2;
        while (yze.c() > 0) {
            int i9 = this.c;
            if (i9 != 0) {
                wx1 wx1 = this.b;
                if (i9 != 1) {
                    if (i9 == i6) {
                        if (d(yze2, wx1.b, Math.min(10, this.i)) && d(yze2, (byte[]) null, this.i)) {
                            wx1.q(0);
                            this.l = -9223372036854775807L;
                            int i10 = 4;
                            if (this.f) {
                                wx1.t(4);
                                wx1.t(1);
                                wx1.t(1);
                                long i11 = (((long) wx1.i(3)) << 30) | ((long) (wx1.i(15) << 15)) | ((long) wx1.i(15));
                                wx1.t(1);
                                if (!this.h && this.g) {
                                    wx1.t(4);
                                    wx1.t(1);
                                    long i12 = (long) (wx1.i(15) << 15);
                                    wx1.t(1);
                                    wx1.t(1);
                                    this.e.b(i12 | (((long) wx1.i(3)) << 30) | ((long) wx1.i(15)));
                                    this.h = true;
                                }
                                this.l = this.e.b(i11);
                            }
                            if (!this.k) {
                                i10 = 0;
                            }
                            i8 |= i10;
                            xs4.h(i8, this.l);
                            this.c = 3;
                            this.d = 0;
                            i6 = 2;
                        }
                    } else if (i9 == 3) {
                        int c2 = yze.c();
                        int i13 = this.j;
                        int i14 = i13 == -1 ? 0 : c2 - i13;
                        if (i14 > 0) {
                            c2 -= i14;
                            yze2.G(yze2.b + c2);
                        }
                        xs4.g(yze2);
                        int i15 = this.j;
                        if (i15 != -1) {
                            int i16 = i15 - c2;
                            this.j = i16;
                            if (i16 == 0) {
                                xs4.i();
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                    i3 = i6;
                } else if (d(yze2, wx1.b, 9)) {
                    wx1.q(0);
                    if (wx1.i(24) != 1) {
                        this.j = -1;
                        i4 = 0;
                        i3 = 2;
                    } else {
                        wx1.t(8);
                        int i17 = wx1.i(16);
                        wx1.t(5);
                        this.k = wx1.h();
                        i3 = 2;
                        wx1.t(2);
                        this.f = wx1.h();
                        this.g = wx1.h();
                        wx1.t(6);
                        int i18 = wx1.i(8);
                        this.i = i18;
                        if (i17 == 0) {
                            this.j = -1;
                        } else {
                            int i19 = (i17 - 3) - i18;
                            this.j = i19;
                            if (i19 < 0) {
                                this.j = -1;
                            }
                        }
                        i4 = 2;
                    }
                    this.c = i4;
                    this.d = 0;
                } else {
                    i3 = 2;
                }
            } else {
                i3 = i6;
                yze2.I(yze.c());
            }
            i6 = i3;
        }
    }

    public final boolean d(yze yze, byte[] bArr, int i2) {
        int min = Math.min(yze.c(), i2 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            yze.I(min);
        } else {
            yze.g(this.d, bArr, min);
        }
        int i3 = this.d + min;
        this.d = i3;
        return i3 == i2;
    }
}
