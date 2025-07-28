package defpackage;

import android.media.MediaRouter;

/* renamed from: cc8  reason: default package */
public final class cc8 extends MediaRouter.VolumeCallback {
    public final bc8 a;

    public cc8(bc8 bc8) {
        this.a = bc8;
    }

    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.b(i, routeInfo);
    }

    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.a(i, routeInfo);
    }
}
