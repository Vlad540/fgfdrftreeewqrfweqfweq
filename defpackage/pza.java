package defpackage;

/* renamed from: pza  reason: default package */
public final class pza extends vje {
    public static final Object j = new Object();
    public final l68 e;
    public final boolean f;
    public final boolean g;
    public final z58 h;
    public final long i;

    public pza(qza qza) {
        this.e = qza.R0();
        this.f = qza.n1();
        this.g = qza.y1();
        this.h = qza.K1() ? z58.f : null;
        this.i = oze.S(qza.A());
    }

    public final int b(Object obj) {
        return j.equals(obj) ? 0 : -1;
    }

    public final qje g(int i2, qje qje, boolean z) {
        Object obj = j;
        qje.getClass();
        qje qje2 = qje;
        Object obj2 = obj;
        qje2.j(obj2, obj, 0, this.i, 0, w8.g, false);
        return qje;
    }

    public final int i() {
        return 1;
    }

    public final Object m(int i2) {
        return j;
    }

    public final tje n(int i2, tje tje, long j2) {
        tje.b(j, this.e, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.h, 0, this.i, 0, 0, 0);
        return tje;
    }

    public final int p() {
        return 1;
    }
}
