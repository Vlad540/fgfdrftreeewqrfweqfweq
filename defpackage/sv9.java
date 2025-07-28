package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: sv9  reason: default package */
public final class sv9 extends w2 {
    public final long b;
    public final TimeUnit c;
    public final qmc o;

    public sv9(nv9 nv9, long j, TimeUnit timeUnit, qmc qmc) {
        super(nv9);
        this.b = j;
        this.c = timeUnit;
        this.o = qmc;
    }

    public final void q(bw9 bw9) {
        this.a.a(new rv9(new zyc(bw9), this.b, this.c, this.o.a()));
    }
}
