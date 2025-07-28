package defpackage;

/* renamed from: m03  reason: default package */
public final class m03 implements xjc {
    public final xjc a;
    public boolean b;
    public final /* synthetic */ o03 c;

    public m03(o03 o03, xjc xjc) {
        this.c = o03;
        this.a = xjc;
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

    public final int h(otf otf, m24 m24, int i) {
        o03 o03 = this.c;
        if (o03.a()) {
            return -3;
        }
        if (this.b) {
            m24.b = 4;
            return -4;
        }
        int h = this.a.h(otf, m24, i);
        if (h == -5) {
            vu5 vu5 = (vu5) otf.b;
            vu5.getClass();
            int i2 = vu5.R0;
            int i3 = vu5.Q0;
            if (!(i3 == 0 && i2 == 0)) {
                if (o03.X != 0) {
                    i3 = 0;
                }
                if (o03.Y != Long.MIN_VALUE) {
                    i2 = 0;
                }
                tu5 a2 = vu5.a();
                a2.A = i3;
                a2.B = i2;
                otf.b = a2.a();
            }
            return -5;
        }
        long j = o03.Y;
        if (j == Long.MIN_VALUE || ((h != -4 || m24.Y < j) && (h != -3 || o03.r() != Long.MIN_VALUE || m24.X))) {
            return h;
        }
        m24.v();
        m24.b = 4;
        this.b = true;
        return -4;
    }
}
