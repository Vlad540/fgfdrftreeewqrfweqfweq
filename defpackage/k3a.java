package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k3a  reason: default package */
public final class k3a extends l5e implements u16 {
    public int X;
    public final /* synthetic */ l3a Y;
    public final /* synthetic */ vo8 Z;
    public final /* synthetic */ i22 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k3a(l3a l3a, vo8 vo8, i22 i22, Continuation continuation) {
        super(1, continuation);
        this.Y = l3a;
        this.Z = vo8;
        this.w0 = i22;
    }

    public final Object invoke(Object obj) {
        return new k3a(this.Y, this.Z, this.w0, (Continuation) obj).o(jue.a);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            k61 k61 = new k61(this.Y, this.Z, this.w0, 5);
            this.X = 1;
            obj = udd.M(k61, this);
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
