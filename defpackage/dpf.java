package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppsSettingScreen;

/* renamed from: dpf  reason: default package */
public final class dpf extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppsSettingScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dpf(Continuation continuation, WebAppsSettingScreen webAppsSettingScreen) {
        super(2, continuation);
        this.Y = webAppsSettingScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((List) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dpf dpf = new dpf(continuation, this.Y);
        dpf.X = obj;
        return dpf;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.o.E((List) this.X);
        return jue.a;
    }
}
