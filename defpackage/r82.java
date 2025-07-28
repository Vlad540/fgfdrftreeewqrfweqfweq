package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: r82  reason: default package */
public final class r82 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ b92 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r82(b92 b92, Continuation continuation) {
        super(2, continuation);
        this.Z = b92;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((List) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        r82 r82 = new r82(this.Z, continuation);
        r82.Y = obj;
        return r82;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (b92.j(this.Z, (List) this.Y, false, this) == pu3) {
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
