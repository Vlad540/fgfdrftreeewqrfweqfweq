package defpackage;

/* renamed from: q1d  reason: default package */
public final class q1d extends c0d {
    public final boolean X;
    public final long b;
    public final long c;
    public final long o;

    public q1d(long j, long j2, boolean z, long j3) {
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.X = z;
    }

    public final void x() {
        to8 n = n();
        n.getClass();
        long j = this.o;
        Long valueOf = Long.valueOf(j);
        boolean z = this.X;
        udd.p("to8", "updateDelayedAttrs %d, %b", new Object[]{valueOf, Boolean.valueOf(z)});
        nec nec = ((hz3) n.a).c;
        Long valueOf2 = Long.valueOf(j);
        Boolean valueOf3 = Boolean.valueOf(z);
        long j2 = this.c;
        nec.q(j2, valueOf2, valueOf3);
        n.f.c.remove(Long.valueOf(j2));
        n().x(n().q(j2), bp8.SENDING);
        jve jve = new jve(((lqc) i()).n(), this.b, this.c, this.o, this.X);
        d0d d0d = this.a;
        d0d d0d2 = null;
        if (d0d == null) {
            d0d = null;
        }
        sce.d((sce) d0d.h.getValue(), jve, true, 1, 4);
        d0d d0d3 = this.a;
        if (d0d3 != null) {
            d0d2 = d0d3;
        }
        ((tt0) d0d2.c.getValue()).c(new ove(this.b, this.c, 0));
    }
}
