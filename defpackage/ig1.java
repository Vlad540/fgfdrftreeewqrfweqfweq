package defpackage;

import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: ig1  reason: default package */
public final /* synthetic */ class ig1 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallScreen b;

    public /* synthetic */ ig1(CallScreen callScreen, int i) {
        this.a = i;
        this.b = callScreen;
    }

    public final Object invoke(Object obj) {
        jue jue = jue.a;
        CallScreen callScreen = this.b;
        switch (this.a) {
            case 0:
                smc smc = CallScreen.T0;
                callScreen.z0().c.a((raf) obj);
                return jue;
            case 1:
                if (((Boolean) obj).booleanValue() && !callScreen.x0) {
                    callScreen.z0().t(true);
                }
                callScreen.B0.c();
                return jue;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                smc smc2 = CallScreen.T0;
                if (!booleanValue) {
                    callScreen.z0().t(false);
                }
                return jue;
        }
    }
}
