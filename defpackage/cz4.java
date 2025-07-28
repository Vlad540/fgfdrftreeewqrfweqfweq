package defpackage;

import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* renamed from: cz4  reason: default package */
public final /* synthetic */ class cz4 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EnterPinCodeScreen b;

    public /* synthetic */ cz4(EnterPinCodeScreen enterPinCodeScreen, int i) {
        this.a = i;
        this.b = enterPinCodeScreen;
    }

    public final Object invoke() {
        jue jue = jue.a;
        EnterPinCodeScreen enterPinCodeScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = EnterPinCodeScreen.X;
                bm3.r(enterPinCodeScreen.getView());
                ex9 onBackPressedDispatcher = enterPinCodeScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return jue;
            default:
                k77[] k77Arr2 = EnterPinCodeScreen.X;
                iz4 iz4 = (iz4) enterPinCodeScreen.c.getValue();
                if (!iz4.x0) {
                    taf.o(iz4.Z, jue);
                }
                return jue;
        }
    }
}
