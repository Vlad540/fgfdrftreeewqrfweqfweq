package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: n9  reason: default package */
public final class n9 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ o9 Z;
    public final /* synthetic */ Set w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n9(int i, o9 o9Var, Set set, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = o9Var;
        this.w0 = set;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new n9(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        o9 o9Var = this.Z;
        if (i == 0) {
            wx3.H(obj);
            boolean z = this.Y == j8a.j;
            k77[] k77Arr = o9.i;
            List s0 = o23.s0(this.w0);
            this.X = 1;
            if (((aw2) ((bv2) o9Var.b.getValue())).e(o9Var.a, s0, z, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hcd hcd = o9Var.e;
        v03 v03 = v03.b;
        this.X = 2;
        if (hcd.a(v03, this) == pu3) {
            return pu3;
        }
        return jue.a;
    }
}
