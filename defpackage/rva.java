package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rva  reason: default package */
public final class rva extends l5e implements i26 {
    public final /* synthetic */ tva X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ i22 Z;
    public final /* synthetic */ long w0;
    public final /* synthetic */ long x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rva(tva tva, int i, i22 i22, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.X = tva;
        this.Y = i;
        this.Z = i22;
        this.w0 = j;
        this.x0 = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rva(this.X, this.Y, this.Z, this.w0, this.x0, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        hba hba = (hba) this.X.e.getValue();
        hba.c(new pba(0, this.Y, 3));
        hba.h(new hge(b8a.d));
        hba.f(yba.a);
        hba.g(new dca(new hge(b8a.e)));
        hba.d(new u42(this.X, this.Z, this.w0, this.x0));
        hba.j();
        return jue.a;
    }
}
