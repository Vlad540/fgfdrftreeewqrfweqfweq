package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ip3  reason: default package */
public final class ip3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ jp3 Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ip3(jp3 jp3, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = jp3;
        this.Z = str;
        this.w0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ip3(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            jp3 jp3 = this.Y;
            obj = xs7.U(jp3.b.a(), new hp3(jp3, this.Z, this.w0, (Continuation) null), this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
