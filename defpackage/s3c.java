package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: s3c  reason: default package */
public final class s3c extends l5e implements i26 {
    public int X;
    public final /* synthetic */ y3c Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s3c(y3c y3c, Continuation continuation) {
        super(2, continuation);
        this.Y = y3c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new s3c(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (ek8.q(200, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k77[] k77Arr = y3c.N0;
        y3c y3c = this.Y;
        qod D = xs7.D(y3c.a, ((pae) y3c.Z.getValue()).b(), ru3.b, new u3c(y3c, (Continuation) null));
        y3c.M0.o1(y3c, y3c.N0[1], D);
        return jue.a;
    }
}
