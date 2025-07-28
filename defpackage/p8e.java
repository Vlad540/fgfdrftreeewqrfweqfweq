package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;

/* renamed from: p8e  reason: default package */
public final class p8e extends t8e implements dc8 {
    public final MediaRouter.RouteInfo m() {
        return ((MediaRouter) this.y0).getDefaultRoute();
    }

    public final void o(r8e r8e, ul7 ul7) {
        z(r8e, ul7);
        ((Bundle) ul7.a).putInt("deviceType", ((MediaRouter.RouteInfo) r8e.a).getDeviceType());
    }

    public final void t(Object obj) {
        ((MediaRouter) this.y0).selectRoute(8388611, (MediaRouter.RouteInfo) obj);
    }

    public final void u() {
        boolean z = this.E0;
        Object obj = this.z0;
        Object obj2 = this.y0;
        if (z) {
            ((MediaRouter) obj2).removeCallback((MediaRouter.Callback) obj);
        }
        this.E0 = true;
        ((MediaRouter) obj2).addCallback(this.C0, (MediaRouter.Callback) obj, this.D0 | true ? 1 : 0);
    }

    public final void w(s8e s8e) {
        super.w(s8e);
        ((MediaRouter.UserRouteInfo) s8e.b).setDescription(s8e.a.e);
    }

    public final boolean x(r8e r8e) {
        return ((MediaRouter.RouteInfo) r8e.a).isConnecting();
    }

    public final void y(r8e r8e, ul7 ul7) {
        Display display;
        super.o(r8e, ul7);
        Object obj = r8e.a;
        boolean isEnabled = ((MediaRouter.RouteInfo) obj).isEnabled();
        Bundle bundle = (Bundle) ul7.a;
        if (!isEnabled) {
            bundle.putBoolean("enabled", false);
        }
        if (x(r8e)) {
            bundle.putInt("connectionState", 1);
        }
        try {
            display = ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
        } catch (NoSuchMethodError unused) {
            display = null;
        }
        if (display != null) {
            bundle.putInt("presentationDisplayId", display.getDisplayId());
        }
    }

    public final void z(r8e r8e, ul7 ul7) {
        y(r8e, ul7);
        CharSequence description = ((MediaRouter.RouteInfo) r8e.a).getDescription();
        if (description != null) {
            ((Bundle) ul7.a).putString("status", description.toString());
        }
    }
}
