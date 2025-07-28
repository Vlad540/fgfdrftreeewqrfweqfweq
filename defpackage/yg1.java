package defpackage;

import android.content.Context;
import android.content.Intent;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: yg1  reason: default package */
public final class yg1 implements gk1 {
    public final /* synthetic */ CallScreen a;

    public yg1(CallScreen callScreen) {
        this.a = callScreen;
    }

    public final void c() {
        CallScreen callScreen = this.a;
        Context context = callScreen.getContext();
        String W = at7.W(callScreen.z0().s().k);
        stf stf = new stf(context);
        stf.L(context.getString(ftb.call_link_share_dialog_share_link_description, new Object[]{W}));
        stf.c = context.getString(ftb.call_link_share_dialog_share_link_dialog_intent_title);
        ((Intent) stf.b).setType("text/plain");
        stf.M();
    }

    public final void d() {
        smc smc = CallScreen.T0;
        CallScreen callScreen = this.a;
        hhd.q(callScreen.getContext(), at7.W(callScreen.z0().s().k));
        if (hhd.y()) {
            String string = callScreen.getContext().getString(ftb.call_link_share_dialog_share_link_copy);
            hba hba = new hba(callScreen);
            hba.i(string);
            hba.d(new bm1(3, (s16) null));
            hba.c(new pba(0, 0, 3));
            hba.j();
        }
    }

    public final void h() {
        smc smc = CallScreen.T0;
        this.a.z0().r();
    }

    public final void j() {
        oc1.c.getClass();
    }

    public final void l() {
        smc smc = CallScreen.T0;
        aj1 z0 = this.a.z0();
        z0.getClass();
        taf.o(z0.Q0, new qh1(at7.W(z0.s().k)));
    }
}
