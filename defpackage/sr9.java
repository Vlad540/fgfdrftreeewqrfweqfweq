package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: sr9  reason: default package */
public final class sr9 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ur9 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sr9(ur9 ur9, Continuation continuation) {
        super(2, continuation);
        this.Y = ur9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sr9(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ur9 ur9 = this.Y;
            this.X = 1;
            ur9.getClass();
            if (r1g.h(ur9.a, new g74(10, ur9), this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                udd.s("NotificationsTrackerMessagesDao", "onLogout: failed", th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
