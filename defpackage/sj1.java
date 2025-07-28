package defpackage;

import android.content.Intent;
import android.view.View;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: sj1  reason: default package */
public final /* synthetic */ class sj1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uj1 b;

    public /* synthetic */ sj1(uj1 uj1, int i) {
        this.a = i;
        this.b = uj1;
    }

    public final void onClick(View view) {
        uj1 uj1 = this.b;
        switch (this.a) {
            case 0:
                tj1 tj1 = uj1.K0;
                if (tj1 != null) {
                    smc smc = CallScreen.T0;
                    ((xg1) tj1).a.z0().w(false, (Intent) null);
                    return;
                }
                return;
            default:
                tj1 tj12 = uj1.K0;
                if (tj12 != null) {
                    smc smc2 = CallScreen.T0;
                    ((xg1) tj12).a.z0().c.h.a(!uj1.L0);
                    return;
                }
                return;
        }
    }
}
