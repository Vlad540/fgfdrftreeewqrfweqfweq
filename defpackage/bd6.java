package defpackage;

import java.util.ArrayList;

/* renamed from: bd6  reason: default package */
public final class bd6 extends ff3 {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public me3 t0 = this.J;
    public int u0;
    public boolean v0;

    public bd6() {
        this.u0 = 0;
        this.R.clear();
        this.R.add(this.t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.t0;
        }
    }

    public final boolean A() {
        return this.v0;
    }

    public final boolean B() {
        return this.v0;
    }

    public final void Q(id7 id7, boolean z) {
        if (this.T != null) {
            me3 me3 = this.t0;
            id7.getClass();
            int n = id7.n(me3);
            if (this.u0 == 1) {
                this.Y = n;
                this.Z = 0;
                L(this.T.k());
                O(0);
                return;
            }
            this.Y = 0;
            this.Z = n;
            O(this.T.q());
            L(0);
        }
    }

    public final void R(int i) {
        this.t0.l(i);
        this.v0 = true;
    }

    public final void S(int i) {
        if (this.u0 != i) {
            this.u0 = i;
            ArrayList arrayList = this.R;
            arrayList.clear();
            if (this.u0 == 1) {
                this.t0 = this.I;
            } else {
                this.t0 = this.J;
            }
            arrayList.add(this.t0);
            me3[] me3Arr = this.Q;
            int length = me3Arr.length;
            for (int i2 = 0; i2 < length; i2++) {
                me3Arr[i2] = this.t0;
            }
        }
    }

    public final void b(id7 id7, boolean z) {
        gf3 gf3 = (gf3) this.T;
        if (gf3 != null) {
            me3 i = gf3.i(2);
            me3 i2 = gf3.i(4);
            ff3 ff3 = this.T;
            boolean z2 = true;
            boolean z3 = ff3 != null && ff3.p0[0] == 2;
            if (this.u0 == 0) {
                i = gf3.i(3);
                i2 = gf3.i(5);
                ff3 ff32 = this.T;
                if (ff32 == null || ff32.p0[1] != 2) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (this.v0) {
                me3 me3 = this.t0;
                if (me3.c) {
                    nld k = id7.k(me3);
                    id7.d(k, this.t0.d());
                    if (this.r0 != -1) {
                        if (z3) {
                            id7.f(id7.k(i2), k, 0, 5);
                        }
                    } else if (this.s0 != -1 && z3) {
                        nld k2 = id7.k(i2);
                        id7.f(k, id7.k(i), 0, 5);
                        id7.f(k2, k, 0, 5);
                    }
                    this.v0 = false;
                    return;
                }
            }
            if (this.r0 != -1) {
                nld k3 = id7.k(this.t0);
                id7.e(k3, id7.k(i), this.r0, 8);
                if (z3) {
                    id7.f(id7.k(i2), k3, 0, 5);
                }
            } else if (this.s0 != -1) {
                nld k4 = id7.k(this.t0);
                nld k5 = id7.k(i2);
                id7.e(k4, k5, -this.s0, 8);
                if (z3) {
                    id7.f(k4, id7.k(i), 0, 5);
                    id7.f(k5, k4, 0, 5);
                }
            } else if (this.q0 != -1.0f) {
                nld k6 = id7.k(this.t0);
                nld k7 = id7.k(i2);
                float f = this.q0;
                as l = id7.l();
                l.d.j(k6, -1.0f);
                l.d.j(k7, f);
                id7.c(l);
            }
        }
    }

    public final boolean c() {
        return true;
    }

    public final me3 i(int i) {
        int t = hr1.t(i);
        if (t != 1) {
            if (t != 2) {
                if (t != 3) {
                    if (t != 4) {
                        return null;
                    }
                }
            }
            if (this.u0 == 0) {
                return this.t0;
            }
            return null;
        }
        if (this.u0 == 1) {
            return this.t0;
        }
        return null;
    }
}
