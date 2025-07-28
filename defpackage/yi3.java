package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yi3  reason: default package */
public final class yi3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ hj3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yi3(hj3 hj3, Continuation continuation) {
        super(2, continuation);
        this.Y = hj3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yi3(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hj3 hj3 = this.Y;
            hcd hcd = hj3.d;
            ds4 c = hj3.c();
            x7b x7b = (x7b) hj3.b.getValue();
            boolean z = (x7b == null || x7b.a == null) ? false : true;
            c.getClass();
            hge hge = new hge(i8a.n);
            lg7 c2 = hwf.c();
            c2.add(new kc3(f8a.Y, new hge(i8a.o1), 3, false));
            c2.add(new kc3(f8a.a0, new hge(i8a.s), 3, false));
            c2.add(new kc3(f8a.Z, new hge(i8a.r), 3, false));
            if (z) {
                c2.add(new kc3(f8a.X, new hge(i8a.o), 1, false));
            }
            c2.add(new kc3(f8a.W, new hge(i8a.k), 2, false));
            d9b d9b = new d9b(hge, (mge) null, hwf.a(c2));
            this.X = 1;
            if (hcd.a(d9b, this) == pu3) {
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
