package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.webapp.settings.WebAppsSettingScreen;

/* renamed from: fpf  reason: default package */
public final class fpf implements zof {
    public final /* synthetic */ WebAppsSettingScreen a;

    public fpf(WebAppsSettingScreen webAppsSettingScreen) {
        this.a = webAppsSettingScreen;
    }

    public final void a(yof yof) {
        k77[] k77Arr = WebAppsSettingScreen.X;
        ipf ipf = (ipf) this.a.b.getValue();
        ipf.getClass();
        if (!(yof instanceof wof) && !(yof instanceof vof)) {
            if (yof instanceof xof) {
                taf.o(ipf.Z, ((xof) yof).b);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
