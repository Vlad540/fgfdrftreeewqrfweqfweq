package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: g66  reason: default package */
public final class g66 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ m66 Y;
    public final /* synthetic */ Set Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g66(m66 m66, Set set, Continuation continuation) {
        super(2, continuation);
        this.Y = m66;
        this.Z = set;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new g66(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        m66 m66 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            ik5 ik5 = new ik5(m66.A0, 4);
            this.X = 1;
            if (ez3.D(ik5, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.X = 2;
        Object U = xs7.U(m66.s().e(), new s56(m66, this.Z, (Continuation) null), this);
        if (U != pu3) {
            U = jue;
        }
        return U == pu3 ? pu3 : jue;
    }
}
