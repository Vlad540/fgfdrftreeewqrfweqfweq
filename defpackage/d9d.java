package defpackage;

import one.me.settings.privacy.ui.SettingsPrivacyScreen;

/* renamed from: d9d  reason: default package */
public final /* synthetic */ class d9d implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsPrivacyScreen b;

    public /* synthetic */ d9d(SettingsPrivacyScreen settingsPrivacyScreen, int i) {
        this.a = i;
        this.b = settingsPrivacyScreen;
    }

    public final Object invoke() {
        SettingsPrivacyScreen settingsPrivacyScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = SettingsPrivacyScreen.Z;
                y8d y8d = y8d.a;
                r7e d = y8d.getAccessor().d(qpc.class);
                r7e d2 = y8d.getAccessor().d(pk.class);
                r7e d3 = y8d.getAccessor().d(b9e.class);
                Class<f03> cls = f03.class;
                return new t9d(new m5d(y8d.getAccessor().d(tt0.class), (pae) y8d.b().getValue()), new v2b(y8d.getAccessor().d(cls), 10, new d9d(settingsPrivacyScreen, 1)), (pae) y8d.b().getValue(), d, y8d.getAccessor().d(xzc.class), y8d.getAccessor().d(cls), y8d.getAccessor().d(jb5.class), d2, d3, (oa3) y8d.getAccessor().c(oa3.class));
            default:
                k77[] k77Arr2 = SettingsPrivacyScreen.Z;
                return settingsPrivacyScreen.getContext();
        }
    }
}
