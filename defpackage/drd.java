package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: drd  reason: default package */
public final class drd extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pj5 Z;
    public final /* synthetic */ l7c w0;
    public final /* synthetic */ rj5 x0;
    public final /* synthetic */ long y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public drd(pj5 pj5, l7c l7c, rj5 rj5, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = pj5;
        this.w0 = l7c;
        this.x0 = rj5;
        this.y0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        drd drd = new drd(this.Z, this.w0, this.x0, this.y0, continuation);
        drd.Y = obj;
        return drd;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            rj5 rj5 = this.x0;
            long j = this.y0;
            crd crd = new crd(this.w0, rj5, (ou3) this.Y, j);
            this.X = 1;
            if (this.Z.c(crd, this) == pu3) {
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
