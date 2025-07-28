package defpackage;

import androidx.media3.transformer.ExportException;

/* renamed from: c35  reason: default package */
public abstract class c35 extends qi0 {
    public long G0;
    public long H0;
    public ojc I0;
    public w54 J0;
    public boolean K0;
    public xu5 L0;
    public xu5 M0;
    public final xw2 N0;
    public final zs O0;
    public final n24 P0 = new n24(0);
    public boolean Q0;
    public boolean R0;
    public boolean S0;

    public c35(int i, xw2 xw2, zs zsVar) {
        super(i);
        this.N0 = xw2;
        this.O0 = zsVar;
    }

    public final int D(xu5 xu5) {
        return qi0.b(c49.g(xu5.n) == this.b ? 4 : 0, 0, 0, 0);
    }

    public final boolean F() {
        if (this.I0 != null) {
            return true;
        }
        if (this.M0 == null) {
            if (this.J0 == null || pfa.r(this.L0.n) != 1) {
                this.M0 = M(this.L0);
            } else {
                w54 w54 = this.J0;
                w54.f(false);
                xu5 xu5 = w54.j;
                if (xu5 == null) {
                    return false;
                }
                this.M0 = M(xu5);
            }
        }
        ojc c = this.O0.c(this.M0);
        if (c == null) {
            return false;
        }
        this.I0 = c;
        return true;
    }

    public abstract boolean G();

    public abstract void H(xu5 xu5);

    public void J(n24 n24) {
    }

    public void K(xu5 xu5) {
    }

    public xu5 L(xu5 xu5) {
        return xu5;
    }

    public xu5 M(xu5 xu5) {
        return xu5;
    }

    public final boolean N(n24 n24) {
        qe4 qe4 = this.c;
        qe4.t();
        int y = y(qe4, n24, 0);
        if (y == -5) {
            throw new IllegalStateException("Format changes are not supported.");
        } else if (y != -4) {
            return false;
        } else {
            n24.y();
            if (n24.f(4)) {
                return true;
            }
            this.N0.c0(this.b, n24.Z);
            return true;
        }
    }

    public final boolean O() {
        xu5 xu5 = this.L0;
        if (xu5 != null && !this.R0) {
            return true;
        }
        if (xu5 == null) {
            qe4 qe4 = this.c;
            qe4.t();
            if (y(qe4, this.P0, 2) != -5) {
                return false;
            }
            xu5 xu52 = (xu5) qe4.c;
            xu52.getClass();
            xu5 L = L(xu52);
            this.L0 = L;
            K(L);
            this.R0 = this.O0.g(3, this.L0);
        }
        if (this.R0) {
            if (pfa.r(this.L0.n) == 2 && !F()) {
                return false;
            }
            H(this.L0);
            this.R0 = false;
        }
        return true;
    }

    public abstract boolean P(n24 n24);

    public final d28 k() {
        return this.N0;
    }

    public final boolean n() {
        return this.K0;
    }

    public final boolean p() {
        return true;
    }

    public final void r(boolean z, boolean z2) {
        this.N0.c0(this.b, 0);
    }

    public final void u() {
        w54 w54 = this.J0;
        if (w54 != null) {
            w54.h();
        }
    }

    public final void v() {
        this.Q0 = true;
    }

    public final void w() {
        this.Q0 = false;
    }

    public final void x(xu5[] xu5Arr, long j, long j2) {
        this.G0 = j;
        this.H0 = j2;
    }

    public final void z(long j, long j2) {
        boolean z;
        boolean G;
        boolean z2;
        try {
            if (this.Q0 && !this.K0) {
                if (O()) {
                    if (this.J0 != null) {
                        do {
                            G = F() ? G() : false;
                            w54 w54 = this.J0;
                            n24 n24 = this.P0;
                            if (w54.e(n24)) {
                                if (N(n24)) {
                                    if (!P(n24)) {
                                        J(n24);
                                        this.J0.g(n24);
                                    }
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        } while (G | z2);
                    } else if (F()) {
                        do {
                            n24 d = this.I0.d();
                            if (d != null) {
                                if (!this.S0) {
                                    if (N(d)) {
                                        if (P(d)) {
                                            z = true;
                                            continue;
                                        } else {
                                            this.S0 = true;
                                        }
                                    }
                                }
                                boolean f = d.f(4);
                                if (this.I0.f()) {
                                    this.S0 = false;
                                    this.K0 = f;
                                    z = !f;
                                    continue;
                                }
                            }
                            z = false;
                            continue;
                        } while (z);
                    }
                }
            }
        } catch (ExportException e) {
            this.Q0 = false;
            this.O0.d(e);
        }
    }
}
