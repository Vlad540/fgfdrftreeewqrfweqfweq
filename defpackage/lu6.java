package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lu6  reason: default package */
public final class lu6 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ bv6 Y;
    public final /* synthetic */ o46 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lu6(bv6 bv6, o46 o46, Continuation continuation) {
        super(2, continuation);
        this.Y = bv6;
        this.Z = o46;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lu6(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        o46 o46 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            n46 n46 = o46.a;
            this.X = 1;
            obj = bv6.a(n46, this.Y, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return o46.a(o46, ((Number) obj).intValue(), false, 13);
    }
}
