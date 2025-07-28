package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cw  reason: default package */
public final class cw extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pj5 Z;
    public final /* synthetic */ fw w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cw(grd grd, Continuation continuation, fw fwVar) {
        super(2, continuation);
        this.Z = grd;
        this.w0 = fwVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cw cwVar = new cw(this.Z, continuation, this.w0);
        cwVar.Y = obj;
        return cwVar;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            bw bwVar = new bw((rj5) this.Y, this.w0);
            this.X = 1;
            if (this.Z.c(bwVar, this) == pu3) {
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
