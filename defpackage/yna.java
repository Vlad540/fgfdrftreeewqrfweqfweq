package defpackage;

/* renamed from: yna  reason: default package */
public final class yna implements rse {
    public final ys4 a;
    public final wx1 b = new wx1(new byte[10], 10, 2, (byte) 0);
    public int c = 0;
    public int d;
    public cke e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public yna(ys4 ys4) {
        this.a = ys4;
    }

    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    public final void b(int i2, ija ija) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        ija ija2 = ija;
        oyb.l(this.e);
        int i7 = i2 & 1;
        ys4 ys4 = this.a;
        int i8 = -1;
        int i9 = 3;
        int i10 = 2;
        boolean z2 = false;
        if (i7 != 0) {
            int i11 = this.c;
            if (!(i11 == 0 || i11 == 1)) {
                if (i11 == 2) {
                    ez3.j0("Unexpected start indicator reading extended header");
                } else if (i11 == 3) {
                    if (this.j != -1) {
                        ez3.j0("Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    ys4.j(ija2.c == 0);
                } else {
                    throw new IllegalStateException();
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i12 = i2;
        while (ija.a() > 0) {
            int i13 = this.c;
            if (i13 != 0) {
                wx1 wx1 = this.b;
                if (i13 == 1) {
                    i5 = i9;
                    boolean z3 = z2;
                    if (c(ija2, wx1.b, 9)) {
                        wx1.q(z3 ? 1 : 0);
                        int i14 = wx1.i(24);
                        if (i14 != 1) {
                            us8.l(i14, "Unexpected start code prefix: ");
                            this.j = -1;
                            i4 = -1;
                            i6 = 0;
                            i3 = 2;
                        } else {
                            wx1.t(8);
                            int i15 = wx1.i(16);
                            wx1.t(5);
                            this.k = wx1.h();
                            i3 = 2;
                            wx1.t(2);
                            this.f = wx1.h();
                            this.g = wx1.h();
                            wx1.t(6);
                            int i16 = wx1.i(8);
                            this.i = i16;
                            if (i15 == 0) {
                                this.j = -1;
                                i4 = -1;
                            } else {
                                int i17 = (i15 - 3) - i16;
                                this.j = i17;
                                if (i17 < 0) {
                                    ez3.j0("Found negative packet payload size: " + this.j);
                                    i4 = -1;
                                    this.j = -1;
                                } else {
                                    i4 = -1;
                                }
                            }
                            i6 = 2;
                        }
                        this.c = i6;
                        z = false;
                        this.d = 0;
                    } else {
                        z = z3;
                        i4 = -1;
                        i3 = 2;
                    }
                } else if (i13 == i10) {
                    if (!c(ija2, wx1.b, Math.min(10, this.i)) || !c(ija2, (byte[]) null, this.i)) {
                        i5 = i9;
                        i4 = -1;
                        boolean z4 = z2;
                        i3 = i10;
                        z = z4;
                    } else {
                        wx1.q(z2 ? 1 : 0);
                        this.l = -9223372036854775807L;
                        int i18 = 4;
                        if (this.f) {
                            wx1.t(4);
                            wx1.t(1);
                            long i19 = (long) (wx1.i(15) << 15);
                            wx1.t(1);
                            long i20 = i19 | (((long) wx1.i(i9)) << 30) | ((long) wx1.i(15));
                            wx1.t(1);
                            if (!this.h && this.g) {
                                wx1.t(4);
                                wx1.t(1);
                                long i21 = (long) (wx1.i(15) << 15);
                                wx1.t(1);
                                wx1.t(1);
                                this.e.b(i21 | (((long) wx1.i(i9)) << 30) | ((long) wx1.i(15)));
                                this.h = true;
                            }
                            this.l = this.e.b(i20);
                        }
                        if (!this.k) {
                            i18 = 0;
                        }
                        i12 |= i18;
                        ys4.h(i12, this.l);
                        this.c = 3;
                        this.d = 0;
                        z2 = false;
                        i10 = 2;
                        i9 = 3;
                        i8 = -1;
                    }
                } else if (i13 == i9) {
                    int a2 = ija.a();
                    int i22 = this.j;
                    int i23 = i22 == i8 ? z2 : a2 - i22;
                    if (i23 > 0) {
                        a2 -= i23;
                        ija2.F(ija2.b + a2);
                    }
                    ys4.f(ija2);
                    int i24 = this.j;
                    if (i24 != i8) {
                        int i25 = i24 - a2;
                        this.j = i25;
                        if (i25 == 0) {
                            ys4.j(z2);
                            this.c = 1;
                            this.d = z2;
                        }
                    }
                    int i26 = i9;
                    i4 = i8;
                    i5 = i26;
                    boolean z5 = z2;
                    i3 = i10;
                    z = z5;
                } else {
                    throw new IllegalStateException();
                }
            } else {
                int i27 = i9;
                i4 = i8;
                i5 = i27;
                boolean z6 = z2;
                i3 = i10;
                z = z6;
                ija2.H(ija.a());
            }
            int i28 = i4;
            i9 = i5;
            i8 = i28;
            int i29 = i3;
            z2 = z;
            i10 = i29;
        }
    }

    public final boolean c(ija ija, byte[] bArr, int i2) {
        int min = Math.min(ija.a(), i2 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            ija.H(min);
        } else {
            ija.e(this.d, bArr, min);
        }
        int i3 = this.d + min;
        this.d = i3;
        return i3 == i2;
    }

    public final void e(cke cke, i75 i75, pse pse) {
        this.e = cke;
        this.a.k(i75, pse);
    }
}
