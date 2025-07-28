package defpackage;

/* renamed from: fy2  reason: default package */
public final class fy2 implements yjc {
    public final /* synthetic */ jy2 X;
    public final jy2 a;
    public final wjc b;
    public final int c;
    public boolean o;

    public fy2(jy2 jy2, jy2 jy22, wjc wjc, int i) {
        this.X = jy2;
        this.a = jy22;
        this.b = wjc;
        this.c = i;
    }

    public final void a() {
        if (!this.o) {
            jy2 jy2 = this.X;
            jn jnVar = jy2.Z;
            int[] iArr = jy2.b;
            int i = this.c;
            jnVar.n(iArr[i], jy2.c[i], 0, (Object) null, jy2.I0);
            this.o = true;
        }
    }

    public final void b() {
        jy2 jy2 = this.X;
        boolean[] zArr = jy2.o;
        int i = this.c;
        oyb.k(zArr[i]);
        jy2.o[i] = false;
    }

    public final void c() {
    }

    public final boolean d() {
        jy2 jy2 = this.X;
        return !jy2.w() && this.b.s(jy2.L0);
    }

    public final int e(long j) {
        jy2 jy2 = this.X;
        if (jy2.w()) {
            return 0;
        }
        boolean z = jy2.L0;
        wjc wjc = this.b;
        int p = wjc.p(j, z);
        uh0 uh0 = jy2.K0;
        if (uh0 != null) {
            p = Math.min(p, uh0.d(this.c + 1) - wjc.n());
        }
        wjc.B(p);
        if (p > 0) {
            a();
        }
        return p;
    }

    public final int j(qe4 qe4, n24 n24, int i) {
        jy2 jy2 = this.X;
        if (jy2.w()) {
            return -3;
        }
        uh0 uh0 = jy2.K0;
        wjc wjc = this.b;
        if (uh0 != null && uh0.d(this.c + 1) <= wjc.n()) {
            return -3;
        }
        a();
        return wjc.x(qe4, n24, i, jy2.L0);
    }
}
