package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: q4d  reason: default package */
public final class q4d extends l5e implements i26 {
    public grd X;
    public int Y;
    public final /* synthetic */ v4d Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q4d(v4d v4d, Continuation continuation) {
        super(2, continuation);
        this.Z = v4d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new q4d(this.Z, continuation);
    }

    public final Object o(Object obj) {
        mc9 mc9;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        if (i == 0) {
            wx3.H(obj);
            v4d v4d = this.Z;
            mc9 mc92 = v4d.D0;
            this.X = mc92;
            this.Y = 1;
            obj = v4d.c.a(this);
            if (obj == pu3) {
                return pu3;
            }
            mc9 = mc92;
        } else if (i == 1) {
            mc9 = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mc9.setValue(obj);
        return jue.a;
    }
}
