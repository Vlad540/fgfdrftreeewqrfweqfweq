package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: k59  reason: default package */
public final class k59 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ r59 Y;
    public final /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k59(r59 r59, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = r59;
        this.Z = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new k59(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            int i2 = zp4.o;
            long P = mt0.P(2, eq4.o);
            this.X = 1;
            obj = this.Y.j(P, this.Z, this);
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
