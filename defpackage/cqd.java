package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cqd  reason: default package */
public final class cqd extends l5e implements i26 {
    public int X;
    public final /* synthetic */ dqd Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cqd(dqd dqd, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = dqd;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cqd(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        dqd dqd = this.Y;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = ((aw2) ((bv2) dqd.X.getValue())).u(this.Z, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i22 i22 = (i22) obj;
        if (i22 != null) {
            taf.o(dqd.A0, mpd.c.Z1(i22.a));
        }
        return jue.a;
    }
}
