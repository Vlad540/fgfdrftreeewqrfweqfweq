package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ub2  reason: default package */
public final class ub2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zb2 Y;
    public final /* synthetic */ pn2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ub2(zb2 zb2, pn2 pn2, Continuation continuation) {
        super(2, continuation);
        this.Y = zb2;
        this.Z = pn2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ub2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ub2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = ((pk) this.Y.Z.getValue()).K(this.Z, this);
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
