package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xq2  reason: default package */
public final class xq2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kr2 Y;
    public final /* synthetic */ dq2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xq2(kr2 kr2, dq2 dq2, Continuation continuation) {
        super(2, continuation);
        this.Y = kr2;
        this.Z = dq2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xq2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xq2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (kr2.a(this.Y, this.Z, this) == pu3) {
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
