package defpackage;

/* renamed from: kqd  reason: default package */
public final class kqd implements utc {
    public final /* synthetic */ utc a;
    public final /* synthetic */ xw2 b;

    public kqd(xw2 xw2, utc utc) {
        this.b = xw2;
        this.a = utc;
    }

    public final boolean c() {
        return this.a.c();
    }

    public final stc e(long j) {
        stc e = this.a.e(j);
        ytc ytc = e.a;
        long j2 = ytc.a;
        long j3 = ytc.b;
        long j4 = this.b.b;
        ytc ytc2 = new ytc(j2, j3 + j4);
        ytc ytc3 = e.b;
        return new stc(ytc2, new ytc(ytc3.a, ytc3.b + j4));
    }

    public final long f() {
        return this.a.f();
    }
}
