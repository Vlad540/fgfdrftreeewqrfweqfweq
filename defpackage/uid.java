package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: uid  reason: default package */
public final class uid extends dhd {
    public final dhd X = null;
    public final dhd a;
    public final long b;
    public final TimeUnit c;
    public final qmc o;

    public uid(phd phd, long j, TimeUnit timeUnit, qmc qmc) {
        this.a = phd;
        this.b = j;
        this.c = timeUnit;
        this.o = qmc;
    }

    public final void l(zhd zhd) {
        zhd zhd2 = zhd;
        tid tid = new tid(zhd2, this.X, this.b, this.c);
        zhd.d(tid);
        bj4.c(tid.b, this.o.c(tid, this.b, this.c));
        this.a.k(tid);
    }
}
