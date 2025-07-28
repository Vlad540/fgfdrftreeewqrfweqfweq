package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ns2  reason: default package */
public final class ns2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ bt2 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ ym8 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ns2(bt2 bt2, long j, ym8 ym8, Continuation continuation) {
        super(2, continuation);
        this.Y = bt2;
        this.Z = j;
        this.w0 = ym8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ns2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ns2(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            b29 b29 = (b29) this.Y.B0.getValue();
            this.X = 1;
            b29.getClass();
            obj = a24.m0(b29.a.a.m(), new z19(b29, this.Z, this.w0, (Continuation) null), this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vo8 vo8 = (vo8) obj;
        if (vo8 != null) {
            return new Long(vo8.b);
        }
        return null;
    }
}
