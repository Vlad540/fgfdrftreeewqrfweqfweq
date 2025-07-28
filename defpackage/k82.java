package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: k82  reason: default package */
public final class k82 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ b92 Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ Set w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k82(b92 b92, List list, Set set, Continuation continuation) {
        super(2, continuation);
        this.Y = b92;
        this.Z = list;
        this.w0 = set;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new k82(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            String str = b92.O0;
            udc e = this.Y.e();
            this.X = 1;
            e.getClass();
            if (a24.m0(e.a, new to1(e, this.Z, this.w0, 12), this) == pu3) {
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
