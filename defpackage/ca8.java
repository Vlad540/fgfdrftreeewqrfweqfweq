package defpackage;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* renamed from: ca8  reason: default package */
public final class ca8 extends MediaRouter2$RouteCallback {
    public final /* synthetic */ ea8 a;

    public ca8(ea8 ea8) {
        this.a = ea8;
    }

    public final void onRoutesAdded(List list) {
        this.a.j();
    }

    public final void onRoutesChanged(List list) {
        this.a.j();
    }

    public final void onRoutesRemoved(List list) {
        this.a.j();
    }
}
