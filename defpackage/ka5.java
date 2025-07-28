package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: ka5  reason: default package */
public final class ka5 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ na5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ka5(na5 na5, Continuation continuation) {
        super(2, continuation);
        this.Y = na5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ka5(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            na5 na5 = this.Y;
            this.X = 1;
            na5.getClass();
            if (r1g.h(na5.a, new g74(4, na5), this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                udd.s("FcmAnalyticsDao", "onLogout: clear failed", th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
