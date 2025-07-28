package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: h72  reason: default package */
public final class h72 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ n72 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h72(n72 n72, Continuation continuation) {
        super(2, continuation);
        this.Y = n72;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new h72(this.Y, continuation);
    }

    public final Object o(Object obj) {
        d9b d9b;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            n72 n72 = this.Y;
            boolean z = n72.B;
            grd grd = n72.b;
            if (z) {
                ds4 c = n72.c();
                x7b x7b = (x7b) grd.getValue();
                boolean z2 = (x7b == null || x7b.a == null) ? false : true;
                c.getClass();
                hge hge = new hge(i8a.l);
                lg7 c2 = hwf.c();
                c2.add(new kc3(f8a.a0, new hge(i8a.s), 3, false));
                c2.add(new kc3(f8a.Z, new hge(i8a.r), 3, false));
                if (z2) {
                    c2.add(new kc3(f8a.X, new hge(i8a.o), 1, false));
                }
                c2.add(new kc3(f8a.W, new hge(i8a.k), 2, false));
                d9b = new d9b(hge, (mge) null, hwf.a(c2));
            } else {
                ds4 c3 = n72.c();
                x7b x7b2 = (x7b) grd.getValue();
                boolean z3 = (x7b2 == null || x7b2.a == null) ? false : true;
                c3.getClass();
                hge hge2 = new hge(i8a.m);
                lg7 c4 = hwf.c();
                c4.add(new kc3(f8a.a0, new hge(i8a.s), 3, false));
                c4.add(new kc3(f8a.Z, new hge(i8a.r), 3, false));
                if (z3) {
                    c4.add(new kc3(f8a.X, new hge(i8a.o), 1, false));
                }
                c4.add(new kc3(f8a.W, new hge(i8a.k), 2, false));
                d9b = new d9b(hge2, (mge) null, hwf.a(c4));
            }
            hcd hcd = n72.d;
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
