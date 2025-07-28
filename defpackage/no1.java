package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: no1  reason: default package */
public final class no1 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ed3 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public no1(ed3 ed3, Continuation continuation) {
        super(2, continuation);
        this.Z = ed3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((no1) n((d5b) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        no1 no1 = new no1(this.Z, continuation);
        no1.Y = obj;
        return no1;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            d5b d5b = (d5b) this.Y;
            ed3 ed3 = this.Z;
            r7e r7e = new r7e(new x2((Object) ed3, 16, (Object) d5b));
            a5b a5b = (a5b) d5b;
            a5b.n(ed3.d() ? vye.a : vye.b);
            ed3.c((dd3) r7e.getValue());
            x2 x2Var = new x2((Object) ed3, 17, (Object) r7e);
            this.X = 1;
            if (at7.d(a5b, x2Var, this) == pu3) {
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
