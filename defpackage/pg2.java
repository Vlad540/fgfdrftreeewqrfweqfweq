package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pg2  reason: default package */
public final class pg2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ah2 Y;
    public final /* synthetic */ dt Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pg2(ah2 ah2, dt dtVar, Continuation continuation) {
        super(2, continuation);
        this.Y = ah2;
        this.Z = dtVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pg2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pg2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            gy9 gy9 = this.Y.y0;
            this.X = 1;
            obj = gy9.K(this.Z, this);
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
