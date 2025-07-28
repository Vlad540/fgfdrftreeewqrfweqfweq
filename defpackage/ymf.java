package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ymf  reason: default package */
public final class ymf extends l5e implements i26 {
    public int X;
    public final /* synthetic */ anf Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ymf(anf anf, Continuation continuation) {
        super(2, continuation);
        this.Y = anf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ymf(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        anf anf = this.Y;
        if (i == 0) {
            wx3.H(obj);
            xff xff = (xff) anf.Y.getValue();
            this.X = 1;
            xff.getClass();
            if (r1g.h(xff.a, new uff(xff, anf.b, anf.c), this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k77[] k77Arr = anf.D0;
        anf.q();
        return jue.a;
    }
}
