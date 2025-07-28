package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: d72  reason: default package */
public final class d72 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ n72 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d72(n72 n72, Continuation continuation) {
        super(2, continuation);
        this.Y = n72;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new d72(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = n72.E;
            n72 n72 = this.Y;
            ((aw2) ((bv2) n72.r.getValue())).l().Q(n72.n);
            hcd hcd = n72.d;
            z8b z8b = z8b.b;
            this.X = 1;
            if (hcd.a(z8b, this) == pu3) {
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
