package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ku9  reason: default package */
public final class ku9 extends ms9 {
    public final qmc a;
    public final long b;
    public final long c;
    public final TimeUnit o;

    public ku9(long j, long j2, TimeUnit timeUnit, qmc qmc) {
        this.b = j;
        this.c = j2;
        this.o = timeUnit;
        this.a = qmc;
    }

    public final void q(bw9 bw9) {
        ju9 ju9 = new ju9(bw9);
        bw9.d(ju9);
        qmc qmc = this.a;
        if (qmc instanceof xpe) {
            ((xpe) qmc).getClass();
            wpe wpe = new wpe();
            bj4.e(ju9, wpe);
            ju9 ju92 = ju9;
            wpe.d(ju92, this.b, this.c, this.o);
            return;
        }
        ju9 ju93 = ju9;
        bj4.e(ju9, qmc.d(ju93, this.b, this.c, this.o));
    }
}
