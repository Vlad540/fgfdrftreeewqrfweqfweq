package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nx2  reason: default package */
public final class nx2 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ km4 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nx2(km4 km4, Continuation continuation) {
        super(2, continuation);
        this.Z = km4;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nx2 nx2 = new nx2(this.Z, continuation);
        nx2.Y = obj;
        return nx2;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            bk9 r = ((jg8) this.Z.Y).r();
            this.X = 1;
            if (((rj5) this.Y).a(r, this) == pu3) {
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
