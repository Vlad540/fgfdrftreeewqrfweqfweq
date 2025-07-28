package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tbb  reason: default package */
public final class tbb extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pj5 Z;
    public final /* synthetic */ ubb w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tbb(ik5 ik5, Continuation continuation, ubb ubb) {
        super(2, continuation);
        this.Z = ik5;
        this.w0 = ubb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tbb tbb = new tbb(this.Z, continuation, this.w0);
        tbb.Y = obj;
        return tbb;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            h42 h42 = new h42((rj5) this.Y, (Object) this.w0, 8);
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
