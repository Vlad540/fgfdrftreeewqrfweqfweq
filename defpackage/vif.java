package defpackage;

import java.security.KeyStore;
import javax.crypto.Cipher;
import one.me.login.welcome.WelcomeScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import one.me.webapp.settings.WebAppSettingsScreen;
import one.me.webapp.settings.WebAppsSettingScreen;

/* renamed from: vif  reason: default package */
public final /* synthetic */ class vif implements s16 {
    public final /* synthetic */ int a;

    public /* synthetic */ vif(int i) {
        this.a = i;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new bhd(false);
            case 1:
                return new bhd(true);
            case 2:
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                instance.load((KeyStore.LoadStoreParameter) null);
                return instance;
            case 3:
                return Cipher.getInstance("AES/CBC/PKCS7Padding");
            case 4:
                k77[] k77Arr = WebAppRootScreen.K0;
                return mnc.MINIAPP;
            case 5:
                k77[] k77Arr2 = WebAppSettingsScreen.w0;
                return mnc.SETTINGS_PRIVACY_MINIAPP;
            case 6:
                k77[] k77Arr3 = WebAppsSettingScreen.X;
                return mnc.SETTINGS_PRIVACY_MINIAPPS;
            case 7:
                k77[] k77Arr4 = WebAppsSettingScreen.X;
                return new ipf(((lqc) ((f03) uif.a.getAccessor().c(f03.class))).s());
            case 8:
                k77[] k77Arr5 = WelcomeScreen.w0;
                return mnc.AUTH_SIGN_METHOD;
            case 9:
                k77[] k77Arr6 = WelcomeScreen.w0;
                return y0f.a.b();
            default:
                return new gyf();
        }
    }
}
