package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o7b  reason: default package */
public final class o7b extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pj5 Z;
    public final /* synthetic */ q7b w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o7b(v11 v11, Continuation continuation, q7b q7b) {
        super(2, continuation);
        this.Z = v11;
        this.w0 = q7b;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        o7b o7b = new o7b(this.Z, continuation, this.w0);
        o7b.Y = obj;
        return o7b;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            l7b l7b = new l7b((rj5) this.Y, this.w0, 1);
            this.X = 1;
            if (this.Z.c(l7b, this) == pu3) {
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
