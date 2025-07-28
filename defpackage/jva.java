package defpackage;

import android.animation.ValueAnimator;
import ru.ok.messages.video.widgets.PinchToZoomVideoViewWrapper;

/* renamed from: jva  reason: default package */
public final /* synthetic */ class jva implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PinchToZoomVideoViewWrapper b;

    public /* synthetic */ jva(PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper, int i) {
        this.a = i;
        this.b = pinchToZoomVideoViewWrapper;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.b;
        switch (this.a) {
            case 0:
                int i = PinchToZoomVideoViewWrapper.O0;
                pinchToZoomVideoViewWrapper.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinchToZoomVideoViewWrapper.A0.setAlpha((int) (255.0f * floatValue));
                if (((double) floatValue) == 0.0d) {
                    pinchToZoomVideoViewWrapper.z0 = false;
                }
                pinchToZoomVideoViewWrapper.invalidate();
                return;
            case 1:
                int i2 = PinchToZoomVideoViewWrapper.O0;
                pinchToZoomVideoViewWrapper.getClass();
                pinchToZoomVideoViewWrapper.w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinchToZoomVideoViewWrapper.invalidate();
                return;
            case 2:
                int i3 = PinchToZoomVideoViewWrapper.O0;
                pinchToZoomVideoViewWrapper.getClass();
                pinchToZoomVideoViewWrapper.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinchToZoomVideoViewWrapper.invalidate();
                return;
            case 3:
                int i4 = PinchToZoomVideoViewWrapper.O0;
                pinchToZoomVideoViewWrapper.getClass();
                pinchToZoomVideoViewWrapper.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinchToZoomVideoViewWrapper.invalidate();
                return;
            case 4:
                int i5 = PinchToZoomVideoViewWrapper.O0;
                pinchToZoomVideoViewWrapper.getClass();
                pinchToZoomVideoViewWrapper.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinchToZoomVideoViewWrapper.invalidate();
                return;
            default:
                int i6 = PinchToZoomVideoViewWrapper.O0;
                pinchToZoomVideoViewWrapper.getClass();
                pinchToZoomVideoViewWrapper.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinchToZoomVideoViewWrapper.invalidate();
                return;
        }
    }
}
