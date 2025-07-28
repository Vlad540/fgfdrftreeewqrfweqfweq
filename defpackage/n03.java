package defpackage;

/* renamed from: n03  reason: default package */
public final class n03 implements yjc {
    public final yjc a;
    public boolean b;
    public final /* synthetic */ p03 c;

    public n03(p03 p03, yjc yjc) {
        this.c = p03;
        this.a = yjc;
    }

    public final void c() {
        this.a.c();
    }

    public final boolean d() {
        return !this.c.a() && this.a.d();
    }

    public final int e(long j) {
        if (this.c.a()) {
            return -3;
        }
        return this.a.e(j);
    }

    public final int j(qe4 qe4, n24 n24, int i) {
        p03 p03 = this.c;
        if (p03.a()) {
            return -3;
        }
        if (this.b) {
            n24.b = 4;
            return -4;
        }
        long r = p03.r();
        int j = this.a.j(qe4, n24, i);
        if (j == -5) {
            xu5 xu5 = (xu5) qe4.c;
            xu5.getClass();
            int i2 = xu5.F;
            int i3 = xu5.E;
            if (!(i3 == 0 && i2 == 0)) {
                if (p03.X != 0) {
                    i3 = 0;
                }
                if (p03.Y != Long.MIN_VALUE) {
                    i2 = 0;
                }
                uu5 a2 = xu5.a();
                a2.D = i3;
                a2.E = i2;
                qe4.c = a2.a();
            }
            return -5;
        }
        long j2 = p03.Y;
        if (j2 == Long.MIN_VALUE || ((j != -4 || n24.Z < j2) && (j != -3 || r != Long.MIN_VALUE || n24.Y))) {
            return j;
        }
        n24.v();
        n24.b = 4;
        this.b = true;
        return -4;
    }
}
