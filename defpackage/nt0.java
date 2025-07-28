package defpackage;

/* renamed from: nt0  reason: default package */
public final class nt0 implements ape {
    public final int a;
    public final vu5 b;
    public final xp4 c = new xp4();
    public vu5 d;
    public ape e;
    public long f;

    public nt0(int i, int i2, vu5 vu5) {
        this.a = i2;
        this.b = vu5;
    }

    public final int a(iz3 iz3, int i, boolean z) {
        ape ape = this.e;
        int i2 = mze.a;
        return ape.e(iz3, i, z);
    }

    public final void b(long j, int i, int i2, int i3, yoe yoe) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        ape ape = this.e;
        int i4 = mze.a;
        ape.b(j, i, i2, i3, yoe);
    }

    public final void c(int i, yze yze) {
        ape ape = this.e;
        int i2 = mze.a;
        ape.c(i, yze);
    }

    public final void d(vu5 vu5) {
        vu5 vu52 = this.b;
        if (vu52 != null) {
            vu5 = vu5.d(vu52);
        }
        this.d = vu5;
        ape ape = this.e;
        int i = mze.a;
        ape.d(vu5);
    }
}
