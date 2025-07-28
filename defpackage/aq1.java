package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: aq1  reason: default package */
public final class aq1 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ cq1 Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aq1(cq1 cq1, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = cq1;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((aq1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new aq1(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = xs7.U(((pae) this.Y.a.getValue()).b(), new zp1(this.Z, (Continuation) null), this);
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
