package defpackage;

/* renamed from: ake  reason: default package */
public final class ake implements ucc {
    public final long b;
    public final ucc c;

    public ake(long j, ucc ucc) {
        e07.j("Timeout must be non-negative.", j >= 0);
        this.b = j;
        this.c = ucc;
    }

    public final long a() {
        return this.b;
    }

    public final tcc b(tu1 tu1) {
        tcc b2 = this.c.b(tu1);
        long j = this.b;
        if (j <= 0) {
            return b2;
        }
        return tu1.b >= j - b2.a ? tcc.d : b2;
    }
}
