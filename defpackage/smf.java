package defpackage;

import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppSettingsScreen;

/* renamed from: smf  reason: default package */
public final class smf extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public smf(Continuation continuation, WebAppSettingsScreen webAppSettingsScreen) {
        super(2, continuation);
        this.Y = webAppSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        smf smf = new smf(continuation, this.Y);
        smf.X = obj;
        return smf;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        k77[] k77Arr = WebAppSettingsScreen.w0;
        WebAppSettingsScreen webAppSettingsScreen = this.Y;
        webAppSettingsScreen.getClass();
        if (a34 instanceof v03) {
            webAppSettingsScreen.getRouter().C();
        } else if (a34 instanceof a34) {
            lkf.c.R1(a34);
        } else if (a34 instanceof vmf) {
            webAppSettingsScreen.getRouter().C();
            lkf.c.R1(((vmf) a34).b);
        }
        return jue.a;
    }
}
