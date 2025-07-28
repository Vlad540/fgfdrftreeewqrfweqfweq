package defpackage;

/* renamed from: jg0  reason: default package */
public final class jg0 extends qf6 {
    public int s0;
    public boolean t0;
    public int u0;
    public boolean v0;

    public final boolean A() {
        return this.v0;
    }

    public final boolean B() {
        return this.v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.r0;
            if (i4 >= i) {
                break;
            }
            ff3 ff3 = this.q0[i4];
            if ((this.t0 || ff3.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !ff3.A()) || (((i3 = this.s0) == 2 || i3 == 3) && !ff3.B()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.r0; i6++) {
            ff3 ff32 = this.q0[i6];
            if (this.t0 || ff32.c()) {
                if (!z2) {
                    int i7 = this.s0;
                    if (i7 == 0) {
                        i5 = ff32.i(2).d();
                    } else if (i7 == 1) {
                        i5 = ff32.i(4).d();
                    } else if (i7 == 2) {
                        i5 = ff32.i(3).d();
                    } else if (i7 == 3) {
                        i5 = ff32.i(5).d();
                    }
                    z2 = true;
                }
                int i8 = this.s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, ff32.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, ff32.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, ff32.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, ff32.i(5).d());
                }
            }
        }
        int i9 = i5 + this.u0;
        int i10 = this.s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.v0 = true;
        return true;
    }

    public final int U() {
        int i = this.s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public final void b(id7 id7, boolean z) {
        boolean z2;
        int i;
        int i2;
        id7 id72 = id7;
        me3[] me3Arr = this.Q;
        me3 me3 = this.I;
        me3Arr[0] = me3;
        me3 me32 = this.J;
        int i3 = 2;
        me3Arr[2] = me32;
        me3 me33 = this.K;
        me3Arr[1] = me33;
        me3 me34 = this.L;
        me3Arr[3] = me34;
        for (me3 me35 : me3Arr) {
            me35.i = id72.k(me35);
        }
        int i4 = this.s0;
        if (i4 >= 0 && i4 < 4) {
            me3 me36 = me3Arr[i4];
            if (!this.v0) {
                T();
            }
            if (this.v0) {
                this.v0 = false;
                int i5 = this.s0;
                if (i5 == 0 || i5 == 1) {
                    id72.d(me3.i, this.Y);
                    id72.d(me33.i, this.Y);
                } else if (i5 == 2 || i5 == 3) {
                    id72.d(me32.i, this.Z);
                    id72.d(me34.i, this.Z);
                }
            } else {
                int i6 = 0;
                while (true) {
                    if (i6 >= this.r0) {
                        z2 = false;
                        break;
                    }
                    ff3 ff3 = this.q0[i6];
                    if ((this.t0 || ff3.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && ff3.p0[0] == 3 && ff3.I.f != null && ff3.K.f != null) || ((i2 == 2 || i2 == 3) && ff3.p0[1] == 3 && ff3.J.f != null && ff3.L.f != null))) {
                        z2 = true;
                    } else {
                        i6++;
                    }
                }
                boolean z3 = me3.g() || me33.g();
                boolean z4 = me32.g() || me34.g();
                int i7 = (z2 || (((i = this.s0) != 0 || !z3) && ((i != 2 || !z4) && ((i != 1 || !z3) && (i != 3 || !z4))))) ? 4 : 5;
                int i8 = 0;
                while (i8 < this.r0) {
                    ff3 ff32 = this.q0[i8];
                    if (this.t0 || ff32.c()) {
                        nld k = id72.k(ff32.Q[this.s0]);
                        int i9 = this.s0;
                        me3 me37 = ff32.Q[i9];
                        me37.i = k;
                        me3 me38 = me37.f;
                        int i10 = (me38 == null || me38.d != this) ? 0 : me37.g;
                        if (i9 == 0 || i9 == i3) {
                            as l = id7.l();
                            nld m = id7.m();
                            m.o = 0;
                            l.c(me36.i, k, m, this.u0 - i10);
                            id72.c(l);
                        } else {
                            as l2 = id7.l();
                            nld m2 = id7.m();
                            m2.o = 0;
                            l2.b(me36.i, k, m2, this.u0 + i10);
                            id72.c(l2);
                        }
                        id72.e(me36.i, k, this.u0 + i10, i7);
                    }
                    i8++;
                    i3 = 2;
                }
                int i11 = this.s0;
                if (i11 == 0) {
                    id72.e(me33.i, me3.i, 0, 8);
                    id72.e(me3.i, this.T.K.i, 0, 4);
                    id72.e(me3.i, this.T.I.i, 0, 0);
                } else if (i11 == 1) {
                    id72.e(me3.i, me33.i, 0, 8);
                    id72.e(me3.i, this.T.I.i, 0, 4);
                    id72.e(me3.i, this.T.K.i, 0, 0);
                } else if (i11 == 2) {
                    id72.e(me34.i, me32.i, 0, 8);
                    id72.e(me32.i, this.T.L.i, 0, 4);
                    id72.e(me32.i, this.T.J.i, 0, 0);
                } else if (i11 == 3) {
                    id72.e(me32.i, me34.i, 0, 8);
                    id72.e(me32.i, this.T.J.i, 0, 4);
                    id72.e(me32.i, this.T.L.i, 0, 0);
                }
            }
        }
    }

    public final boolean c() {
        return true;
    }

    public final String toString() {
        String l = wn6.l(new StringBuilder("[Barrier] "), this.h0, " {");
        for (int i = 0; i < this.r0; i++) {
            ff3 ff3 = this.q0[i];
            if (i > 0) {
                l = hr1.g(l, ", ");
            }
            StringBuilder l2 = hr1.l(l);
            l2.append(ff3.h0);
            l = l2.toString();
        }
        return hr1.g(l, "}");
    }
}
