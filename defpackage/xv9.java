package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: xv9  reason: default package */
public final class xv9 extends w2 {
    public final nv9 X = null;
    public final long b;
    public final TimeUnit c;
    public final qmc o;

    public xv9(ms9 ms9, long j, TimeUnit timeUnit, qmc qmc) {
        super(ms9);
        this.b = j;
        this.c = timeUnit;
        this.o = qmc;
    }

    public final void q(bw9 bw9) {
        nv9 nv9 = this.X;
        nv9 nv92 = this.a;
        qmc qmc = this.o;
        if (nv9 == null) {
            bw9 bw92 = bw9;
            vv9 vv9 = new vv9(bw92, this.b, this.c, qmc.a());
            bw9.d(vv9);
            xi4 c2 = vv9.o.c(new io5(0, (wv9) vv9), vv9.b, vv9.c);
            bw1 bw1 = vv9.X;
            bw1.getClass();
            bj4.c(bw1, c2);
            nv92.a(vv9);
            return;
        }
        bw9 bw93 = bw9;
        uv9 uv9 = new uv9(bw93, this.b, this.c, qmc.a());
        bw9.d(uv9);
        xi4 c3 = uv9.o.c(new io5(0, (wv9) uv9), uv9.b, uv9.c);
        bw1 bw12 = uv9.X;
        bw12.getClass();
        bj4.c(bw12, c3);
        nv92.a(uv9);
    }
}
