package defpackage;

import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import one.me.settings.privacy.ui.pincode.SetupPinCodeScreen;

/* renamed from: z8d  reason: default package */
public final /* synthetic */ class z8d implements i34, u26 {
    public static final z8d X = new z8d(3);
    public static final z8d b = new z8d(0);
    public static final z8d c = new z8d(1);
    public static final z8d o = new z8d(2);
    public final /* synthetic */ int a;

    public /* synthetic */ z8d(int i) {
        this.a = i;
    }

    public final Object a() {
        switch (this.a) {
            case 0:
                return new SettingsPrivacyScreen();
            case 1:
                return new SettingsBlacklistScreen();
            case 2:
                return new SafeModeOnboardingScreen();
            default:
                return new SetupPinCodeScreen();
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof i34) || !(obj instanceof u26)) {
                    return false;
                }
                return hhd.f(getFunctionDelegate(), ((u26) obj).getFunctionDelegate());
            case 1:
                if (!(obj instanceof i34) || !(obj instanceof u26)) {
                    return false;
                }
                return hhd.f(getFunctionDelegate(), ((u26) obj).getFunctionDelegate());
            case 2:
                if (!(obj instanceof i34) || !(obj instanceof u26)) {
                    return false;
                }
                return hhd.f(getFunctionDelegate(), ((u26) obj).getFunctionDelegate());
            default:
                if (!(obj instanceof i34) || !(obj instanceof u26)) {
                    return false;
                }
                return hhd.f(getFunctionDelegate(), ((u26) obj).getFunctionDelegate());
        }
    }

    public final n26 getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new x26(0, SettingsPrivacyScreen.class, "<init>", "<init>()V", 0);
            case 1:
                return new x26(0, SettingsBlacklistScreen.class, "<init>", "<init>()V", 0);
            case 2:
                return new x26(0, SafeModeOnboardingScreen.class, "<init>", "<init>()V", 0);
            default:
                return new x26(0, SetupPinCodeScreen.class, "<init>", "<init>()V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                return getFunctionDelegate().hashCode();
            case 1:
                return getFunctionDelegate().hashCode();
            case 2:
                return getFunctionDelegate().hashCode();
            default:
                return getFunctionDelegate().hashCode();
        }
    }
}
