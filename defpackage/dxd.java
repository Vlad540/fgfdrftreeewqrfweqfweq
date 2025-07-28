package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dxd  reason: default package */
public final class dxd extends l5e implements i26 {
    public int X;
    public final /* synthetic */ gxd Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dxd(gxd gxd, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = gxd;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dxd(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        gxd gxd = this.Y;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = gxd.F0;
            j73 d = ((l95) gxd.o.getValue()).d(this.Z, false);
            this.X = 1;
            if (e07.c(d, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        taf.o(gxd.Z, new p6d(phc.x, new hge(sca.l)));
        return jue.a;
    }
}
