package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zxd  reason: default package */
public final class zxd extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kyd Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zxd(kyd kyd, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = kyd;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zxd(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        kyd kyd = this.Y;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = kyd.G0;
            j73 d = ((l95) kyd.w0.getValue()).d(this.Z, false);
            this.X = 1;
            if (e07.c(d, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        taf.o(kyd.E0, new p6d(phc.x, new hge(sca.l)));
        return jue.a;
    }
}
