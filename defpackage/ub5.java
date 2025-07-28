package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ub5  reason: default package */
public final class ub5 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ g0 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ub5(g0 g0Var, Continuation continuation) {
        super(2, continuation);
        this.Y = g0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ub5(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            g0 g0Var = this.Y;
            this.X = 1;
            zv1 zv1 = new zv1(1, urd.y(this));
            zv1.n();
            zv1.d(new sb5(g0Var, 0));
            g0Var.m(new tb5(0, zv1), new gr(2));
            obj = zv1.m();
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
