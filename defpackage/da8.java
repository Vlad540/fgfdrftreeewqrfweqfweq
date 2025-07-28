package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: da8  reason: default package */
public final class da8 extends MediaRouter2$TransferCallback {
    public final /* synthetic */ ea8 a;

    public da8(ea8 ea8) {
        this.a = ea8;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        nb8 nb8 = (nb8) this.a.z0.remove(routingController);
        if (nb8 != null) {
            ub8 ub8 = (ub8) this.a.y0.a;
            if (nb8 == ub8.s) {
                xb8 c = ub8.c();
                if (ub8.f() != c) {
                    ub8.i(c, 2);
                }
            } else if (yb8.c) {
                Objects.toString(nb8);
            }
        } else {
            Objects.toString(routingController);
        }
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        xb8 xb8;
        this.a.z0.remove(routingController);
        if (routingController2 == this.a.x0.getSystemController()) {
            ub8 ub8 = (ub8) this.a.y0.a;
            xb8 c = ub8.c();
            if (ub8.f() != c) {
                ub8.i(c, 3);
                return;
            }
            return;
        }
        List u = routingController2.getSelectedRoutes();
        if (!u.isEmpty()) {
            String r = d4.i(u.get(0)).getId();
            this.a.z0.put(routingController2, new aa8(this.a, routingController2, r));
            ub8 ub82 = (ub8) this.a.y0.a;
            Iterator it = ub82.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    xb8 = null;
                    break;
                }
                xb8 = (xb8) it.next();
                if (xb8.c() == ub82.e && TextUtils.equals(r, xb8.b)) {
                    break;
                }
            }
            if (xb8 != null) {
                ub82.i(xb8, 3);
            }
            this.a.k(routingController2);
        }
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Objects.toString(mediaRoute2Info);
    }
}
