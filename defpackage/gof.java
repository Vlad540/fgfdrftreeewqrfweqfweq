package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gof  reason: default package */
public final class gof extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ kof Z;
    public final /* synthetic */ aof w0;
    public final /* synthetic */ wnf x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gof(wnf wnf, aof aof, kof kof, Continuation continuation) {
        super(2, continuation);
        this.Z = kof;
        this.w0 = aof;
        this.x0 = wnf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((Throwable) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gof gof = new gof(this.x0, this.w0, this.Z, continuation);
        gof.Y = obj;
        return gof;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            kof kof = this.Z;
            kof.getClass();
            o57 f = kof.f((Throwable) this.Y);
            m53 g = kof.g();
            String str = this.x0.b;
            this.X = 1;
            if (g.a(kof.e, f, this.w0, str, this) == pu3) {
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
