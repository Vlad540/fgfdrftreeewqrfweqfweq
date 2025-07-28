package defpackage;

import one.me.sdk.zoom.ZoomableDraweeView;

/* renamed from: cwf  reason: default package */
public final /* synthetic */ class cwf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ZoomableDraweeView b;

    public /* synthetic */ cwf(ZoomableDraweeView zoomableDraweeView, int i) {
        this.a = i;
        this.b = zoomableDraweeView;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [one.me.sdk.zoom.ZoomableDraweeView, android.view.View, java.lang.Object] */
    public final void run() {
        ? r0 = this.b;
        switch (this.a) {
            case 0:
                int i = ZoomableDraweeView.J0;
                r0.requestLayout();
                r0.invalidate();
                return;
            default:
                int i2 = ZoomableDraweeView.J0;
                m75.d(ZoomableDraweeView.class, Integer.valueOf(r0.hashCode()), "onRelease: view %x");
                uc4 uc4 = (uc4) r0.I0;
                uc4.c = false;
                uc4.reset();
                return;
        }
    }
}
