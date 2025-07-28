package defpackage;

import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;

/* renamed from: ry0  reason: default package */
public final /* synthetic */ class ry0 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallAdminSettingsScreen b;

    public /* synthetic */ ry0(CallAdminSettingsScreen callAdminSettingsScreen, int i) {
        this.a = i;
        this.b = callAdminSettingsScreen;
    }

    public final Object invoke() {
        CallAdminSettingsScreen callAdminSettingsScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = CallAdminSettingsScreen.x0;
                return new qtc(qda.a, new rgc(13, callAdminSettingsScreen), new o8(15), 4);
            default:
                k77[] k77Arr2 = CallAdminSettingsScreen.x0;
                return new sy0(callAdminSettingsScreen);
        }
    }
}
