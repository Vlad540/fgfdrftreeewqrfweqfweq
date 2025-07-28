package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppSettingsScreen;

/* renamed from: rmf  reason: default package */
public final class rmf extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rmf(Continuation continuation, WebAppSettingsScreen webAppSettingsScreen) {
        super(2, continuation);
        this.Y = webAppSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rmf rmf = new rmf(continuation, this.Y);
        rmf.X = obj;
        return rmf;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        umf umf = (umf) this.X;
        k77[] k77Arr = WebAppSettingsScreen.w0;
        WebAppSettingsScreen webAppSettingsScreen = this.Y;
        webAppSettingsScreen.getClass();
        if (umf instanceof umf) {
            mif mif = webAppSettingsScreen.Y;
            if (mif != null) {
                mif.c(umf.b, umf.a, (String) null);
            }
            return jue.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
