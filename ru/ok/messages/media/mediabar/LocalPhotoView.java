package ru.ok.messages.media.mediabar;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import one.me.sdk.zoom.ZoomableDraweeView;

public class LocalPhotoView extends ZoomableDraweeView {
    public static final /* synthetic */ int M0 = 0;
    public final GestureDetector K0;
    public ql7 L0;

    /* JADX WARNING: type inference failed for: r3v0, types: [on4, android.view.View, java.lang.Object, ru.ok.messages.media.mediabar.LocalPhotoView] */
    public LocalPhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        GestureDetector gestureDetector = new GestureDetector(context, new tz(12, this));
        this.K0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        z66 z66 = new z66(getResources());
        z66.l = jlc.j;
        z66.b = 0;
        setHierarchy(z66.a());
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [one.me.sdk.zoom.ZoomableDraweeView, android.widget.ImageView, android.view.View, ru.ok.messages.media.mediabar.LocalPhotoView] */
    public final void onDraw(Canvas canvas) {
        getDrawable().setBounds(0, 0, getWidth(), getHeight());
        super.onDraw(canvas);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K0.onTouchEvent(motionEvent);
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setListener(ql7 ql7) {
        this.L0 = ql7;
    }
}
