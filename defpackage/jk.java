package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jk  reason: default package */
public final class jk extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ duf Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jk(duf duf, Continuation continuation) {
        super(2, continuation);
        this.Z = duf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jk) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jk jkVar = new jk(this.Z, continuation);
        jkVar.Y = obj;
        return jkVar;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Y;
            this.Y = ou3;
            duf duf = this.Z;
            this.X = 1;
            zv1 zv1 = new zv1(1, urd.y(this));
            zv1.n();
            ((zr7) duf.b).dispatch(ou3.getCoroutineContext(), new re(2, zv1));
            if (zv1.m() == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            ou3 ou32 = (ou3) this.Y;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
