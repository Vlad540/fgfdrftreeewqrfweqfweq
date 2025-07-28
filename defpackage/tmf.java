package defpackage;

import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppSettingsScreen;

/* renamed from: tmf  reason: default package */
public final class tmf implements zof {
    public final /* synthetic */ WebAppSettingsScreen a;

    public tmf(WebAppSettingsScreen webAppSettingsScreen) {
        this.a = webAppSettingsScreen;
    }

    public final void a(yof yof) {
        k77[] k77Arr = WebAppSettingsScreen.w0;
        anf l0 = this.a.l0();
        l0.getClass();
        if (yof instanceof xof) {
            taf.o(l0.A0, new vmf(((xof) yof).b));
        }
    }

    public final void b(wof wof, boolean z) {
        k77[] k77Arr = WebAppSettingsScreen.w0;
        anf l0 = this.a.l0();
        l0.getClass();
        qod D = xs7.D(l0.a, ((pae) l0.w0.getValue()).b(), ru3.b, new zmf(z, l0, (Continuation) null));
        l0.B0.o1(l0, anf.D0[0], D);
        l0.q();
    }
}
