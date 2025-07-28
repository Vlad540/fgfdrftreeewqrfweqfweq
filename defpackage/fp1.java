package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fp1  reason: default package */
public final class fp1 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ jp1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fp1(jp1 jp1, Continuation continuation) {
        super(2, continuation);
        this.Y = jp1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fp1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fp1(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.a;
            x31 x31 = x31.a;
            this.X = 1;
            if (hcd.a(x31, this) == pu3) {
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
