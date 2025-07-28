package defpackage;

/* renamed from: nu9  reason: default package */
public final class nu9 extends w2 {
    public final qmc b;
    public final int c;

    public nu9(nv9 nv9, qmc qmc, int i) {
        super(nv9);
        this.b = qmc;
        this.c = i;
    }

    public final void q(bw9 bw9) {
        qmc qmc = this.b;
        boolean z = qmc instanceof xpe;
        nv9 nv9 = this.a;
        if (z) {
            nv9.a(bw9);
        } else {
            nv9.a(new mu9(bw9, qmc.a(), this.c));
        }
    }
}
