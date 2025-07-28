package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: y82  reason: default package */
public final class y82 extends l5e implements i26 {
    public b92 X;
    public int Y;
    public final /* synthetic */ b92 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y82(b92 b92, Continuation continuation) {
        super(2, continuation);
        this.Z = b92;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new y82(this.Z, continuation);
    }

    public final Object o(Object obj) {
        b92 b92;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        if (i == 0) {
            wx3.H(obj);
            String str = b92.O0;
            b92 = this.Z;
            udc e = b92.e();
            this.X = b92;
            this.Y = 1;
            obj = e.d(this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            b92 = this.X;
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.X = null;
        this.Y = 2;
        if (b92.j(b92, (List) obj, false, this) == pu3) {
            return pu3;
        }
        return jue.a;
    }
}
