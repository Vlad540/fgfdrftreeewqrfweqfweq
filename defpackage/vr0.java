package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vr0  reason: default package */
public final class vr0 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ mw Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vr0(mw mwVar, Continuation continuation) {
        super(2, continuation);
        this.Y = mwVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vr0(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            mw mwVar = this.Y;
            ck5 ck5 = new ck5(ez3.J(ez3.Q(new pj5[]{(hcd) mwVar.j, new djc(new qr0(mwVar.a, (Continuation) null)), (hcd) mwVar.i}), (ju3) mwVar.d), new tr0(mwVar, (Continuation) null));
            bw bwVar = new bw(2, (Object) mwVar);
            this.X = 1;
            if (ck5.c(bwVar, this) == pu3) {
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
