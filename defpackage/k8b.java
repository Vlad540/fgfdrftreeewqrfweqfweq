package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k8b  reason: default package */
public final class k8b extends l5e implements i26 {
    public int X;
    public final /* synthetic */ p8b Y;
    public final /* synthetic */ mab Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k8b(p8b p8b, mab mab, Continuation continuation) {
        super(2, continuation);
        this.Y = p8b;
        this.Z = mab;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new k8b(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.a;
            mab mab = this.Z;
            Long l = new Long(mab.a);
            uj3 uj3 = mab.b;
            g8b g8b = new g8b(l, uj3.a(), ehe.c(uj3.A0), uj3.d(fj0.c));
            this.X = 1;
            if (hcd.a(g8b, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
