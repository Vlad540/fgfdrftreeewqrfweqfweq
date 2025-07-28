package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o02  reason: default package */
public final class o02 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ p02 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o02(p02 p02, Continuation continuation) {
        super(2, continuation);
        this.Z = p02;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o02) n((d5b) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        o02 o02 = new o02(this.Z, continuation);
        o02.Y = obj;
        return o02;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (this.Z.h((d5b) this.Y, this) == pu3) {
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
