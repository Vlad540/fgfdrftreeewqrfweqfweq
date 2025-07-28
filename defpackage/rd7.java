package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rd7  reason: default package */
public final class rd7 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ td7 Y;
    public final /* synthetic */ qd7 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rd7(td7 td7, qd7 qd7, Continuation continuation) {
        super(2, continuation);
        this.Y = td7;
        this.Z = qd7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rd7(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.a;
            qd7 qd7 = this.Z;
            ld7 ld7 = new ld7(qd7.a, qd7.b, new Long(qd7.c), qd7.o, qd7.X, qd7.Y, qd7.Z, qd7.w0);
            this.X = 1;
            if (hcd.a(ld7, this) == pu3) {
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
