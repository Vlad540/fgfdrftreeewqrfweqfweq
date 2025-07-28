package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import one.me.sdk.zoom.ZoomableDraweeView;

/* renamed from: spa  reason: default package */
public final class spa extends ZoomableDraweeView {
    public final String K0 = spa.class.getName();
    public final GestureDetector L0;
    public rpa M0;
    public tp6 N0;
    public boolean O0;

    /* JADX WARNING: type inference failed for: r2v0, types: [on4, spa, android.view.View, java.lang.Object] */
    public spa(Context context) {
        super(context);
        GestureDetector gestureDetector = new GestureDetector(context, new tz(15, this));
        this.L0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        z66 z66 = new z66(getResources());
        z66.l = jlc.j;
        z66.b = 0;
        setHierarchy(z66.a());
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [on4, spa] */
    private final ywa getControllerBuilder() {
        ywa a = a06.a.get();
        tp6 tp6 = this.N0;
        boolean z = false;
        if (tp6 != null && tp6.e) {
            z = true;
        }
        a.j = z;
        Uri uri = tp6 != null ? tp6.b : null;
        if (uri != null) {
            a.e = ur6.d(uri).a();
        } else {
            a.e = null;
        }
        a.k = true;
        a.l = getController();
        return a;
    }

    public final boolean getFailure() {
        return this.O0;
    }

    public final void n(Throwable th) {
        spa.super.n(th);
        this.O0 = true;
        udd.s(this.K0, "Set photo attach failed", th);
        rpa rpa = this.M0;
        if (rpa != null) {
            rpa.p();
        }
    }

    public final void o(oq6 oq6) {
        spa.super.o(oq6);
        this.O0 = false;
        rpa rpa = this.M0;
        if (rpa != null) {
            rpa.g();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [one.me.sdk.zoom.ZoomableDraweeView, spa, android.widget.ImageView, android.view.View] */
    public final void onDraw(Canvas canvas) {
        getDrawable().setBounds(0, 0, getWidth(), getHeight());
        spa.super.onDraw(canvas);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.L0.onTouchEvent(motionEvent);
        return spa.super.onTouchEvent(motionEvent);
    }

    public final void r(tp6 tp6, boolean z) {
        boolean z2 = !tp6.equals(this.N0) || z;
        this.N0 = tp6;
        this.O0 = false;
        if (z2) {
            ywa controllerBuilder = getControllerBuilder();
            Uri uri = tp6.g;
            if (uri != null) {
                controllerBuilder.f = ur6.d(uri).a();
            }
            tr6 tr6 = (tr6) controllerBuilder.e;
            setController(controllerBuilder.a());
        }
    }

    public final void setListener(rpa rpa) {
        this.M0 = rpa;
    }
}
