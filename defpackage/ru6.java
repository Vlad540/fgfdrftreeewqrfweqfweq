package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: ru6  reason: default package */
public final class ru6 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ bv6 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ru6(bv6 bv6, Continuation continuation) {
        super(2, continuation);
        this.Y = bv6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ru6(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            bv6 bv6 = this.Y;
            bv6.z0.setValue((Object) null);
            udd.q(bv6.I0, "cancel prefetchJob");
            g37 g37 = bv6.C0;
            if (g37 != null) {
                g37.cancel((CancellationException) null);
            }
            bv6.C0 = null;
            bv6.f();
            g37 g372 = bv6.C0;
            if (g372 != null) {
                this.X = 1;
                if (g372.join(this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
