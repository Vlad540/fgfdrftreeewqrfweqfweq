package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: b42  reason: default package */
public final class b42 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ o42 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b42(int i, o42 o42, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = o42;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new b42(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            if (this.Y == f8a.A0) {
                hcd hcd = this.Z.f;
                k77[] k77Arr = o42.x;
                d6b d6b = new d6b(new hge(i8a.y2), new hge(i8a.x2), p23.B(new kc3[]{new kc3(f8a.E0, new hge(i8a.u2), 3, false), new kc3(f8a.e, new hge(i8a.v2), 2, false)}));
                this.X = 1;
                if (hcd.a(d6b, this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
