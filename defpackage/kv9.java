package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: kv9  reason: default package */
public final class kv9 extends w2 {
    public final boolean X;
    public final long b;
    public final TimeUnit c;
    public final qmc o;

    public kv9(nv9 nv9, long j, TimeUnit timeUnit, qmc qmc, boolean z) {
        super(nv9);
        this.b = j;
        this.c = timeUnit;
        this.o = qmc;
        this.X = z;
    }

    public final void q(bw9 bw9) {
        zyc zyc = new zyc(bw9);
        boolean z = this.X;
        nv9 nv9 = this.a;
        if (z) {
            nv9.a(new hv9(zyc, this.b, this.c, this.o));
            return;
        }
        nv9.a(new jv9(zyc, this.b, this.c, this.o));
    }
}
