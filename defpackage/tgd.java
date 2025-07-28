package defpackage;

/* renamed from: tgd  reason: default package */
public final class tgd extends u2 {
    public final m45 c;
    public final ga3 o;

    public tgd(p35 p35) {
        super(2);
        ga3 ga3 = new ga3(0, false);
        this.o = ga3;
        try {
            this.c = new m45(p35, this);
            ga3.g();
        } catch (Throwable th) {
            this.o.g();
            throw th;
        }
    }

    public final int B() {
        Z1();
        return this.c.B();
    }

    public final int O() {
        Z1();
        return this.c.O();
    }

    public final uje O1() {
        Z1();
        return this.c.O1();
    }

    public final void Q1() {
        Z1();
        this.c.s2();
    }

    public final void Y(boolean z) {
        Z1();
        m45 m45 = this.c;
        m45.s2();
        m45.s2();
        int d = m45.M0.d(m45.o1.e, z);
        int i = 1;
        if (z && d != 1) {
            i = 2;
        }
        m45.p2(d, i, z);
    }

    public final void Z1() {
        this.o.b();
    }

    public final long b0() {
        Z1();
        return this.c.b0();
    }

    public final float e() {
        Z1();
        m45 m45 = this.c;
        m45.s2();
        return m45.i1;
    }

    public final int getRepeatMode() {
        Z1();
        m45 m45 = this.c;
        m45.s2();
        return m45.R0;
    }

    public final long k() {
        Z1();
        return this.c.k();
    }

    public final boolean n() {
        Z1();
        return this.c.n();
    }

    public final int o0() {
        Z1();
        return this.c.o0();
    }

    public final int p0() {
        Z1();
        return this.c.p0();
    }

    public final long q() {
        Z1();
        return this.c.q();
    }

    public final void r(int i, long j) {
        Z1();
        this.c.r(i, j);
    }
}
