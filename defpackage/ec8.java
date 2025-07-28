package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: ec8  reason: default package */
public final class ec8 extends MediaRouter.Callback {
    public final ac8 a;

    public ec8(ac8 ac8) {
        this.a = ac8;
    }

    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        t8e t8e = (t8e) this.a;
        if (t8e.i(routeInfo)) {
            t8e.s();
        }
    }

    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int j;
        t8e t8e = (t8e) this.a;
        t8e.getClass();
        if (t8e.n(routeInfo) == null && (j = t8e.j(routeInfo)) >= 0) {
            r8e r8e = (r8e) t8e.F0.get(j);
            String str = r8e.b;
            CharSequence name = ((MediaRouter.RouteInfo) r8e.a).getName(t8e.a);
            ul7 ul7 = new ul7(str, name != null ? name.toString() : BuildConfig.FLAVOR);
            t8e.o(r8e, ul7);
            r8e.c = ul7.o();
            t8e.s();
        }
    }

    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.a.getClass();
    }

    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        Display display;
        p8e p8e = (p8e) ((dc8) this.a);
        int j = p8e.j(routeInfo);
        if (j >= 0) {
            r8e r8e = (r8e) p8e.F0.get(j);
            ArrayList arrayList = null;
            try {
                display = routeInfo.getPresentationDisplay();
            } catch (NoSuchMethodError unused) {
                display = null;
            }
            int displayId = display != null ? display.getDisplayId() : -1;
            if (displayId != r8e.c.a.getInt("presentationDisplayId", -1)) {
                ta8 ta8 = r8e.c;
                if (ta8 != null) {
                    Bundle bundle = new Bundle(ta8.a);
                    ArrayList arrayList2 = !ta8.b().isEmpty() ? new ArrayList(ta8.b()) : null;
                    ta8.a();
                    if (!ta8.c.isEmpty()) {
                        arrayList = new ArrayList(ta8.c);
                    }
                    bundle.putInt("presentationDisplayId", displayId);
                    if (arrayList != null) {
                        bundle.putParcelableArrayList("controlFilters", arrayList);
                    }
                    if (arrayList2 != null) {
                        bundle.putStringArrayList("groupMemberIds", arrayList2);
                    }
                    r8e.c = new ta8(bundle);
                    p8e.s();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }

    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int j;
        t8e t8e = (t8e) this.a;
        t8e.getClass();
        if (t8e.n(routeInfo) == null && (j = t8e.j(routeInfo)) >= 0) {
            t8e.F0.remove(j);
            t8e.s();
        }
    }

    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        xb8 a2;
        t8e t8e = (t8e) this.a;
        if (routeInfo == ((MediaRouter) t8e.y0).getSelectedRoute(8388611)) {
            s8e n = t8e.n(routeInfo);
            if (n != null) {
                n.a.l();
                return;
            }
            int j = t8e.j(routeInfo);
            if (j >= 0) {
                String str = ((r8e) t8e.F0.get(j)).b;
                ub8 ub8 = (ub8) t8e.x0;
                ub8.m.removeMessages(262);
                wb8 d = ub8.d(ub8.c);
                if (d != null && (a2 = d.a(str)) != null) {
                    a2.l();
                }
            }
        }
    }

    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.a.getClass();
    }

    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.a.getClass();
    }

    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int j;
        t8e t8e = (t8e) this.a;
        t8e.getClass();
        if (t8e.n(routeInfo) == null && (j = t8e.j(routeInfo)) >= 0) {
            r8e r8e = (r8e) t8e.F0.get(j);
            int volume = routeInfo.getVolume();
            if (volume != r8e.c.a.getInt("volume")) {
                ta8 ta8 = r8e.c;
                if (ta8 != null) {
                    Bundle bundle = new Bundle(ta8.a);
                    ArrayList arrayList = null;
                    ArrayList arrayList2 = !ta8.b().isEmpty() ? new ArrayList(ta8.b()) : null;
                    ta8.a();
                    if (!ta8.c.isEmpty()) {
                        arrayList = new ArrayList(ta8.c);
                    }
                    bundle.putInt("volume", volume);
                    if (arrayList != null) {
                        bundle.putParcelableArrayList("controlFilters", arrayList);
                    }
                    if (arrayList2 != null) {
                        bundle.putStringArrayList("groupMemberIds", arrayList2);
                    }
                    r8e.c = new ta8(bundle);
                    t8e.s();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }
}
