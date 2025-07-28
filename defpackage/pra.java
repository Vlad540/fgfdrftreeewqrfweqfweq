package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pra  reason: default package */
public final class pra extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ xra Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pra(xra xra, Continuation continuation) {
        super(2, continuation);
        this.Z = xra;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pra) n((String) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pra pra = new pra(this.Z, continuation);
        pra.Y = obj;
        return pra;
    }

    public final Object o(Object obj) {
        String str;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            String str2 = (String) this.Y;
            if (h0e.c0(str2)) {
                return new wia(str2, hw4.a);
            }
            this.Y = str2;
            this.X = 1;
            tra tra = xra.J0;
            xra xra = this.Z;
            xra.getClass();
            zv1 zv1 = new zv1(1, urd.y(this));
            zv1.n();
            xra.q().d();
            xra.q().h = new ydc(xra, str2, zv1, 12);
            xra.q().f(str2);
            zv1.d(new ty0(7, xra));
            Object m = zv1.m();
            if (m == pu3) {
                return pu3;
            }
            String str3 = str2;
            obj = m;
            str = str3;
        } else if (i == 1) {
            str = (String) this.Y;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return new wia(str, obj);
    }
}
