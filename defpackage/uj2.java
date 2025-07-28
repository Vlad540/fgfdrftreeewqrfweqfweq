package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uj2  reason: default package */
public final class uj2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ dk2 Y;
    public final /* synthetic */ i22 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uj2(dk2 dk2, i22 i22, Continuation continuation) {
        super(2, continuation);
        this.Y = dk2;
        this.Z = i22;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new uj2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (((r59) ((t97) this.Y.n.getValue()).getValue()).o(this.Z, this) == pu3) {
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
