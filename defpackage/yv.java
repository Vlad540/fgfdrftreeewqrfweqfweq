package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yv  reason: default package */
public final class yv extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pj5 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yv(q02 q02, Continuation continuation) {
        super(2, continuation);
        this.Z = q02;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yv yvVar = new yv(this.Z, continuation);
        yvVar.Y = obj;
        return yvVar;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            tv tvVar = new tv((rj5) this.Y, 3);
            this.X = 1;
            if (this.Z.c(tvVar, this) == pu3) {
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
