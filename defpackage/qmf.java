package defpackage;

import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppSettingsScreen;

/* renamed from: qmf  reason: default package */
public final class qmf extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qmf(Continuation continuation, WebAppSettingsScreen webAppSettingsScreen) {
        super(2, continuation);
        this.Y = webAppSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qmf qmf = new qmf(continuation, this.Y);
        qmf.X = obj;
        return qmf;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        wmf wmf = (wmf) this.X;
        WebAppSettingsScreen webAppSettingsScreen = this.Y;
        webAppSettingsScreen.Z.E(wmf.b);
        webAppSettingsScreen.getClass();
        ((nea) webAppSettingsScreen.X.T0(webAppSettingsScreen, WebAppSettingsScreen.w0[2])).setTitle((CharSequence) wmf.a);
        return jue.a;
    }
}
