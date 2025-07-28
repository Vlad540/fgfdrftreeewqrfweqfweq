package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fof  reason: default package */
public final class fof extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ wnf Z;
    public final /* synthetic */ kof w0;
    public final /* synthetic */ aof x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fof(wnf wnf, aof aof, kof kof, Continuation continuation) {
        super(2, continuation);
        this.Z = wnf;
        this.w0 = kof;
        this.x0 = aof;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((String) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kof kof = this.w0;
        fof fof = new fof(this.Z, this.x0, kof, continuation);
        fof.Y = obj;
        return fof;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        aof aof = this.x0;
        kof kof = this.w0;
        if (i == 0) {
            wx3.H(obj);
            wnf wnf = this.Z;
            znf znf = new znf(wnf.b, wnf.c, (String) this.Y);
            us0 us0 = kof.e;
            String str = aof.a;
            r57 r57 = kof.a;
            r57.getClass();
            f57 f57 = new f57(str, r57.b(znf.Companion.serializer(), znf));
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
