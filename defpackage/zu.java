package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zu  reason: default package */
public final class zu extends l5e implements i26 {
    public int X;
    public final /* synthetic */ fw Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ z63 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zu(fw fwVar, long j, z63 z63, Continuation continuation) {
        super(2, continuation);
        this.Y = fwVar;
        this.Z = j;
        this.w0 = z63;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zu(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            fw fwVar = this.Y;
            yt ytVar = fwVar.j;
            e3 e3Var = new e3((Object) this.w0);
            this.X = 1;
            if (fwVar.t(ytVar, this.Z, e3Var, this) == pu3) {
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
