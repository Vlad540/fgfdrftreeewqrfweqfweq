package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: zg1  reason: default package */
public final class zg1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zg1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.Y = callScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((zg1) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zg1 zg1 = new zg1(continuation, this.Y);
        zg1.X = obj;
        return zg1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        Boolean bool = (Boolean) this.X;
        boolean f = hhd.f(bool, Boolean.TRUE);
        fh1 fh1 = fh1.c;
        CallScreen callScreen = this.Y;
        if (f) {
            smc smc = CallScreen.T0;
            oed v0 = callScreen.v0();
            int b = callScreen.u0().k.b();
            vz0 vz0 = new vz0(0, callScreen.z0(), aj1.class, "hideVpnSnackbar", "hideVpnSnackbar()V", 0, 4);
            v0.getClass();
            oed.b(fh1, new mz4((Object) callScreen, b, (Object) vz0, 3));
        } else if (hhd.f(bool, Boolean.FALSE)) {
            smc smc2 = CallScreen.T0;
            callScreen.v0().getClass();
            wia wia = oed.b;
            if ((wia != null ? (fh1) wia.a : null) == fh1) {
                callScreen.v0().getClass();
                oed.a();
            }
        } else if (bool != null) {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
