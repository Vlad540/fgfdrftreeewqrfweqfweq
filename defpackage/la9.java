package defpackage;

/* renamed from: la9  reason: default package */
public final /* synthetic */ class la9 implements q96 {
    public final /* synthetic */ pqe a;

    public /* synthetic */ la9(pqe pqe) {
        this.a = pqe;
    }

    public void a(r96 r96, p96 p96, long j) {
        pqe pqe = this.a;
        oyb.l(pqe.D0);
        oyb.k(!pqe.H0);
        b24.a();
        pqe.A0.add(new ma9(p96, j));
        pqe.B0.put(p96.a, new na9(r96, j));
        if (!pqe.F0) {
            rc4 rc4 = pqe.D0;
            rc4.getClass();
            rc4.c(3, pqe.w0, new bz5(pqe.b, p96.c, p96.d, 1.0f, 0));
            pqe.F0 = true;
            return;
        }
        pqe.b();
    }
}
