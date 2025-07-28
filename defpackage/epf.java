package defpackage;

import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppsSettingScreen;

/* renamed from: epf  reason: default package */
public final class epf extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppsSettingScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public epf(Continuation continuation, WebAppsSettingScreen webAppsSettingScreen) {
        super(2, continuation);
        this.Y = webAppsSettingScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        epf epf = new epf(continuation, this.Y);
        epf.X = obj;
        return epf;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        k77[] k77Arr = WebAppsSettingScreen.X;
        WebAppsSettingScreen webAppsSettingScreen = this.Y;
        webAppsSettingScreen.getClass();
        if (a34 instanceof v03) {
            webAppsSettingScreen.getRouter().C();
        } else if (a34 instanceof a34) {
            lkf.c.R1(a34);
        }
        return jue.a;
    }
}
