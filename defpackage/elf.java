package defpackage;

import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: elf  reason: default package */
public final /* synthetic */ class elf implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebAppRootScreen b;

    public /* synthetic */ elf(WebAppRootScreen webAppRootScreen, int i) {
        this.a = i;
        this.b = webAppRootScreen;
    }

    public final Object invoke() {
        WebAppRootScreen webAppRootScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = WebAppRootScreen.K0;
                webAppRootScreen.getClass();
                k77[] k77Arr2 = WebAppRootScreen.K0;
                k77 k77 = k77Arr2[1];
                long longValue = ((Number) webAppRootScreen.x0.a(webAppRootScreen)).longValue();
                k77 k772 = k77Arr2[2];
                k77 k773 = k77Arr2[0];
                k77 k774 = k77Arr2[3];
                return new kmf(longValue, (bff) webAppRootScreen.y0.a(webAppRootScreen), (Long) webAppRootScreen.w0.a(webAppRootScreen), (String) webAppRootScreen.z0.a(webAppRootScreen));
            default:
                k77[] k77Arr3 = WebAppRootScreen.K0;
                return new vpf(webAppRootScreen.z0());
        }
    }
}
