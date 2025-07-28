package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: c66  reason: default package */
public final class c66 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ m66 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c66(m66 m66, Continuation continuation) {
        super(2, continuation);
        this.Y = m66;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new c66(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            m66 m66 = this.Y;
            f56 f56 = m66.Y;
            ArrayList t = pfa.t(m66.J0);
            f56.getClass();
            taf.o(f56.c, new z46(t));
            this.X = 1;
            Object U = xs7.U(m66.s().e(), new l66(m66, false, (Continuation) null), this);
            if (U != pu3) {
                U = jue;
            }
            if (U == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
