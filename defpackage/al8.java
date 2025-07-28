package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: al8  reason: default package */
public final class al8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ cl8 Y;
    public final /* synthetic */ i22 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public al8(cl8 cl8, i22 i22, Continuation continuation) {
        super(2, continuation);
        this.Y = cl8;
        this.Z = i22;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new al8(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        cl8 cl8 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (cl8.s(cl8, this.Z, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cl8.q(cl8);
        return jue.a;
    }
}
