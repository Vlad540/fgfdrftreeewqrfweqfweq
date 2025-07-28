package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bn2  reason: default package */
public final class bn2 extends l5e implements i26 {
    public final /* synthetic */ nn2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bn2(nn2 nn2, Continuation continuation) {
        super(2, continuation);
        this.X = nn2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bn2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bn2(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        nn2 nn2 = this.X;
        i22 i22 = (i22) nn2.Z0.a.getValue();
        jue jue = jue.a;
        if (i22 != null) {
            long j = i22.b.a;
            eha eha = (eha) nn2.K0.getValue();
            eha.getClass();
            if (j != 0) {
                eha.f(j, e00.Z, 0);
            }
        }
        return jue;
    }
}
