package defpackage;

import java.util.ArrayList;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: og1  reason: default package */
public final class og1 implements vr3 {
    public final /* synthetic */ CallScreen a;

    public og1(CallScreen callScreen) {
        this.a = callScreen;
    }

    public final void a(rr3 rr3, rr3 rr32, boolean z) {
        smc smc = CallScreen.T0;
        CallScreen callScreen = this.a;
        callScreen.v0().getClass();
        wia wia = oed.b;
        if ((wia != null ? (fh1) wia.a : null) == fh1.c && z) {
            callScreen.v0().getClass();
            oed.a();
        }
    }

    public final void b(rr3 rr3, rr3 rr32, boolean z) {
        grd grd;
        Object value;
        ygc ygc = this.a;
        if (!z && rr3 == null) {
            smc smc = CallScreen.T0;
            if (ygc.z0().K0.a.getValue() == vye.a) {
                oed v0 = ygc.v0();
                int b = ygc.u0().k.b();
                vz0 vz0 = new vz0(0, ygc.z0(), aj1.class, "hideVpnSnackbar", "hideVpnSnackbar()V", 0, 3);
                v0.getClass();
                oed.b(fh1.c, new mz4((Object) ygc, b, (Object) vz0, 3));
            }
        }
        smc smc2 = CallScreen.T0;
        aj1 z0 = ygc.z0();
        while (ygc.getParentController() != null) {
            ygc = ygc.getParentController();
        }
        ArrayList arrayList = null;
        ygc ygc2 = ygc instanceof ygc ? ygc : null;
        sgc S = ygc2 != null ? ygc2.S() : null;
        if (S != null) {
            arrayList = S.e();
        }
        boolean z2 = true ^ (arrayList == null || arrayList.isEmpty());
        do {
            grd = z0.M0;
            value = grd.getValue();
            ((Boolean) value).getClass();
        } while (!grd.b(value, Boolean.valueOf(z2)));
    }
}
