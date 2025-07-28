package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fqa  reason: default package */
public final class fqa extends l5e implements i26 {
    public int X;
    public final /* synthetic */ gqa Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fqa(gqa gqa, Continuation continuation) {
        super(2, continuation);
        this.Y = gqa;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fqa(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            gqa gqa = this.Y;
            hcd hcd = gqa.g;
            bqa bqa = new bqa(gqa.a);
            this.X = 1;
            if (hcd.a(bqa, this) == pu3) {
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
