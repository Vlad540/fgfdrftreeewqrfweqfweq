package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vs2  reason: default package */
public final class vs2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ bt2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vs2(Object obj, Continuation continuation, bt2 bt2) {
        super(2, continuation);
        this.Y = obj;
        this.Z = bt2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vs2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vs2(this.Y, continuation, this.Z);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            src src = this.Z.Y;
            this.X = 1;
            obj = src.b((prc) this.Y, this);
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
