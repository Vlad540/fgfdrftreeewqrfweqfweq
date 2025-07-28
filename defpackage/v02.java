package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: v02  reason: default package */
public final class v02 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ w02 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v02(w02 w02, Continuation continuation) {
        super(2, continuation);
        this.Z = w02;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v02) n((rj5) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        v02 v02 = new v02(this.Z, continuation);
        v02.Y = obj;
        return v02;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (this.Z.m((rj5) this.Y, this) == pu3) {
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
