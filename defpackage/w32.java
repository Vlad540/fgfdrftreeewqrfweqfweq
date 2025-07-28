package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: w32  reason: default package */
public final class w32 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ o42 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w32(o42 o42, Continuation continuation) {
        super(2, continuation);
        this.Y = o42;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new w32(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            o42 o42 = this.Y;
            hcd hcd = o42.f;
            k77[] k77Arr = o42.x;
            lg7 c = hwf.c();
            sz1 sz1 = (sz1) o42.i.getValue();
            if ((sz1 != null ? sz1.b : null) == rz1.c) {
                c.add(new pq3(f8a.A0, (mge) new hge(i8a.N1), Integer.valueOf(j9a.J), Integer.valueOf(phc.N1), Integer.valueOf(j9a.F)));
            }
            e6b e6b = new e6b(hwf.a(c));
            this.X = 1;
            if (hcd.a(e6b, this) == pu3) {
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
