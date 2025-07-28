package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xk8  reason: default package */
public final class xk8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ cl8 Y;
    public final /* synthetic */ i22 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xk8(cl8 cl8, i22 i22, Continuation continuation) {
        super(2, continuation);
        this.Y = cl8;
        this.Z = i22;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xk8(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            cl8 cl8 = this.Y;
            long j = this.Z.b.a;
            Integer num = new Integer(((Number) cl8.M0.getValue()).intValue());
            this.X = 1;
            obj = ((l86) cl8.B0.getValue()).a(j, cl8.o, (String) null, (Long) null, num, this);
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
