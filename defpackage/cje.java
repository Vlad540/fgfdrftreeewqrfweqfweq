package defpackage;

/* renamed from: cje  reason: default package */
public final class cje implements yjc {
    public final yjc a;
    public final long b;

    public cje(yjc yjc, long j) {
        this.a = yjc;
        this.b = j;
    }

    public final void c() {
        this.a.c();
    }

    public final boolean d() {
        return this.a.d();
    }

    public final int e(long j) {
        return this.a.e(j - this.b);
    }

    public final int j(qe4 qe4, n24 n24, int i) {
        int j = this.a.j(qe4, n24, i);
        if (j == -4) {
            n24.Z += this.b;
        }
        return j;
    }
}
