package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pvc  reason: default package */
public final class pvc extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pj5 Z;
    public final /* synthetic */ qvc w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pvc(mvc mvc, Continuation continuation, qvc qvc) {
        super(2, continuation);
        this.Z = mvc;
        this.w0 = qvc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pvc pvc = new pvc(this.Z, continuation, this.w0);
        pvc.Y = obj;
        return pvc;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            h42 h42 = new h42((rj5) this.Y, (Object) this.w0, 10);
            this.X = 1;
            if (this.Z.c(h42, this) == pu3) {
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
