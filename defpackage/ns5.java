package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ns5  reason: default package */
public final class ns5 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ os5 Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ns5(os5 os5, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = os5;
        this.Z = str;
        this.w0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ns5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ns5(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            b92 b92 = this.Y.b;
            this.X = 1;
            b92 b922 = b92;
            b922.getClass();
            Object U = xs7.U(b922.Y, new m82(b922, this.Z, this.w0, (Continuation) null), this);
            if (U != pu3) {
                U = jue;
            }
            if (U == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
