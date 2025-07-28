package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: t32  reason: default package */
public final class t32 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ o42 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t32(o42 o42, Continuation continuation) {
        super(2, continuation);
        this.Z = o42;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((i22) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        t32 t32 = new t32(this.Z, continuation);
        t32.Y = obj;
        return t32;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            i22 i22 = (i22) this.Y;
            if (i22.H() && !i22.x()) {
                hcd hcd = this.Z.e;
                v03 v03 = v03.b;
                this.X = 1;
                if (hcd.a(v03, this) == pu3) {
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
