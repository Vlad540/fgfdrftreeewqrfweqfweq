package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zpd  reason: default package */
public final class zpd extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ dqd Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zpd(dqd dqd, Continuation continuation) {
        super(2, continuation);
        this.Z = dqd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((bk3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zpd zpd = new zpd(this.Z, continuation);
        zpd.Y = obj;
        return zpd;
    }

    public final Object o(Object obj) {
        jue jue = pu3.a;
        int i = this.X;
        jue jue2 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            grd grd = this.Z.Z;
            this.X = 1;
            grd.setValue((bk3) this.Y);
            if (jue2 == jue) {
                return jue;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue2;
    }
}
