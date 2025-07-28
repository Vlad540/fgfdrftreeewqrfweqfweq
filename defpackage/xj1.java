package defpackage;

import android.view.View;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: xj1  reason: default package */
public final /* synthetic */ class xj1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zj1 b;

    public /* synthetic */ xj1(zj1 zj1, int i) {
        this.a = i;
        this.b = zj1;
    }

    public final void onClick(View view) {
        zj1 zj1 = this.b;
        switch (this.a) {
            case 0:
                e3 e3Var = zj1.Q0;
                if (e3Var != null) {
                    le1 le1 = zj1.V0;
                    smc smc = CallScreen.T0;
                    yl1 yl1 = ((CallScreen) e3Var.a).z0().Z;
                    yl1.getClass();
                    if (!le1.equals(le1.c)) {
                        po1 po1 = yl1.b;
                        if (((zw3) po1.b().getValue()).h) {
                            po1.h(le1, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                e3 e3Var2 = zj1.Q0;
                if (e3Var2 != null) {
                    smc smc2 = CallScreen.T0;
                    ((CallScreen) e3Var2.a).z0().Z.c();
                    return;
                }
                return;
        }
    }
}
