package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kqa  reason: default package */
public final class kqa extends l5e implements i26 {
    public int X;
    public final /* synthetic */ mqa Y;
    public final /* synthetic */ vh2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kqa(mqa mqa, vh2 vh2, Continuation continuation) {
        super(2, continuation);
        this.Y = mqa;
        this.Z = vh2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kqa(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.a;
            iqa iqa = new iqa(this.Z.a);
            this.X = 1;
            if (hcd.a(iqa, this) == pu3) {
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
