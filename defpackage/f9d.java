package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;

/* renamed from: f9d  reason: default package */
public final class f9d extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsPrivacyScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f9d(Continuation continuation, SettingsPrivacyScreen settingsPrivacyScreen) {
        super(2, continuation);
        this.Y = settingsPrivacyScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        f9d f9d = new f9d(continuation, this.Y);
        f9d.X = obj;
        return f9d;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        hba hba = new hba((Widget) this.Y);
        hba.i((String) this.X);
        hba.j();
        return jue.a;
    }
}
