package defpackage;

/* renamed from: ot0  reason: default package */
public final class ot0 implements bpe {
    public final int a;
    public final xu5 b;
    public final qh4 c = new qh4();
    public xu5 d;
    public bpe e;
    public long f;

    public ot0(int i, int i2, xu5 xu5) {
        this.a = i2;
        this.b = xu5;
    }

    public final void a(long j, int i, int i2, int i3, zoe zoe) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        bpe bpe = this.e;
        int i4 = oze.a;
        bpe.a(j, i, i2, i3, zoe);
    }

    public final void b(ija ija, int i, int i2) {
        bpe bpe = this.e;
        int i3 = oze.a;
        bpe.b(ija, i, 0);
    }

    public final int c(jz3 jz3, int i, boolean z) {
        bpe bpe = this.e;
        int i2 = oze.a;
        return bpe.d(jz3, i, z);
    }

    public final void e(xu5 xu5) {
        xu5 xu52 = this.b;
        if (xu52 != null) {
            xu5 = xu5.f(xu52);
        }
        this.d = xu5;
        bpe bpe = this.e;
        int i = oze.a;
        bpe.e(xu5);
    }
}
