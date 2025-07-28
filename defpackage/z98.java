package defpackage;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* renamed from: z98  reason: default package */
public final class z98 extends MediaRouter2$ControllerCallback {
    public final /* synthetic */ ea8 a;

    public z98(ea8 ea8) {
        this.a = ea8;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.k(routingController);
    }
}
