package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cof  reason: default package */
public final class cof extends l5e implements i26 {
    public int X;
    public final /* synthetic */ nnf Y;
    public final /* synthetic */ kof Z;
    public final /* synthetic */ aof w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cof(nnf nnf, aof aof, kof kof, Continuation continuation) {
        super(2, continuation);
        this.Y = nnf;
        this.Z = kof;
        this.w0 = aof;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((jue) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kof kof = this.Z;
        return new cof(this.Y, this.w0, kof, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        aof aof = this.w0;
        kof kof = this.Z;
        if (i == 0) {
            wx3.H(obj);
            d2e d2e = new d2e(c2e.o, this.Y.b);
            us0 us0 = kof.e;
            String str = aof.a;
            r57 r57 = kof.a;
            r57.getClass();
            f57 f57 = new f57(str, r57.b(d2e.Companion.serializer(), d2e));
            this.X = 1;
            if (us0.o(f57, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kof.e(kof, aof.a);
        return jue.a;
    }
}
