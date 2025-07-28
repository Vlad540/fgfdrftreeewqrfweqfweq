package defpackage;

import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;

/* renamed from: sb3  reason: default package */
public final /* synthetic */ class sb3 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmPinCodeScreen b;

    public /* synthetic */ sb3(ConfirmPinCodeScreen confirmPinCodeScreen, int i) {
        this.a = i;
        this.b = confirmPinCodeScreen;
    }

    public final Object invoke() {
        ConfirmPinCodeScreen confirmPinCodeScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ConfirmPinCodeScreen.Y;
                ex9 onBackPressedDispatcher = confirmPinCodeScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return jue.a;
            default:
                k77[] k77Arr2 = ConfirmPinCodeScreen.Y;
                k77 k77 = ConfirmPinCodeScreen.Y[0];
                return new zb3((String) confirmPinCodeScreen.a.a(confirmPinCodeScreen));
        }
    }
}
