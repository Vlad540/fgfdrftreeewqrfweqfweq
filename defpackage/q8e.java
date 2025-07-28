package defpackage;

import android.media.MediaRouter;

/* renamed from: q8e  reason: default package */
public final class q8e extends nb8 {
    public final Object a;

    public q8e(Object obj) {
        this.a = obj;
    }

    public final void f(int i) {
        ((MediaRouter.RouteInfo) this.a).requestSetVolume(i);
    }

    public final void i(int i) {
        ((MediaRouter.RouteInfo) this.a).requestUpdateVolume(i);
    }
}
