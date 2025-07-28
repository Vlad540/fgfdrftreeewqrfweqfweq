package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: ao2  reason: default package */
public final class ao2 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ Throwable Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rj5 rj5 = (rj5) obj;
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                ao2 ao2 = new ao2(3, continuation, 0);
                ao2.Y = th;
                jue jue = jue.a;
                ao2.o(jue);
                return jue;
            case 1:
                ao2 ao22 = new ao2(3, continuation, 1);
                ao22.Y = th;
                jue jue2 = jue.a;
                ao22.o(jue2);
                return jue2;
            case 2:
                ao2 ao23 = new ao2(3, continuation, 2);
                ao23.Y = th;
                jue jue3 = jue.a;
                ao23.o(jue3);
                return jue3;
            default:
                ao2 ao24 = new ao2(3, continuation, 3);
                ao24.Y = th;
                jue jue4 = jue.a;
                ao24.o(jue4);
                return jue4;
        }
    }

    public final Object o(Object obj) {
        jue jue = jue.a;
        switch (this.X) {
            case 0:
                wx3.H(obj);
                udd.s("fo2", "catch error in chatUpdateFlow", this.Y);
                return jue;
            case 1:
                wx3.H(obj);
                udd.s("ChatVM/MissedContactsController", "fail", this.Y);
                return jue;
            case 2:
                wx3.H(obj);
                udd.s("MiniChatsUpdated", "fail", this.Y);
                return jue;
            default:
                wx3.H(obj);
                Throwable th = this.Y;
                if (!(th instanceof CancellationException)) {
                    ((r4a) o2a.a.g()).c(th, false);
                }
                return jue;
        }
    }
}
