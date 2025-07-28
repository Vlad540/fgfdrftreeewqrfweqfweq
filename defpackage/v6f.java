package defpackage;

import android.animation.ValueAnimator;
import android.view.ScaleGestureDetector;
import android.view.animation.AccelerateDecelerateInterpolator;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: v6f  reason: default package */
public final class v6f implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ VideoMessageWidget a;

    public v6f(VideoMessageWidget videoMessageWidget) {
        this.a = videoMessageWidget;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        r4 = (defpackage.yvf) (r4 = ((defpackage.fcc) r4).b.r()).d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onScale(android.view.ScaleGestureDetector r4) {
        /*
            r3 = this;
            k77[] r0 = one.me.chatscreen.videomsg.VideoMessageWidget.y0
            one.me.chatscreen.videomsg.VideoMessageWidget r3 = r3.a
            j5f r3 = r3.m0()
            float r4 = r4.getScaleFactor()
            r6f r3 = (r6f) r3
            android.animation.ValueAnimator r0 = r3.I0
            r1 = 1
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.isRunning()
            if (r0 != r1) goto L_0x0020
            android.animation.ValueAnimator r0 = r3.I0
            if (r0 == 0) goto L_0x0020
            r0.cancel()
        L_0x0020:
            float r0 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r4 = us8.g(r4, r0, r2, r0)
            float r0 = r3.H0
            float r0 = r0 * r4
            r3.H0 = r0
            fu1 r4 = r3.m()
            if (r4 == 0) goto L_0x0049
            fcc r4 = (defpackage.fcc) r4
            fu1 r4 = r4.b
            yh7 r4 = r4.r()
            if (r4 == 0) goto L_0x0049
            java.lang.Object r4 = r4.d()
            yvf r4 = (defpackage.yvf) r4
            if (r4 == 0) goto L_0x0049
            float r4 = r4.b()
            goto L_0x004b
        L_0x0049:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x004b:
            fu1 r2 = r3.m()
            if (r2 == 0) goto L_0x0068
            fcc r2 = (defpackage.fcc) r2
            fu1 r2 = r2.b
            yh7 r2 = r2.r()
            if (r2 == 0) goto L_0x0068
            java.lang.Object r2 = r2.d()
            yvf r2 = (defpackage.yvf) r2
            if (r2 == 0) goto L_0x0068
            float r2 = r2.a()
            goto L_0x006a
        L_0x0068:
            r2 = 1092616192(0x41200000, float:10.0)
        L_0x006a:
            float r4 = defpackage.gwf.i(r0, r4, r2)
            qb7 r3 = r3.A0
            if (r3 == 0) goto L_0x0077
            ev1 r3 = r3.c
            ecc r3 = r3.F0
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            if (r3 == 0) goto L_0x007d
            r3.d(r4)
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v6f.onScale(android.view.ScaleGestureDetector):boolean");
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        k77[] k77Arr = VideoMessageWidget.y0;
        r6f m0 = this.a.m0();
        ValueAnimator valueAnimator = m0.I0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{m0.H0, 1.0f});
            ofFloat.setDuration(150);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new c00(22, (Object) m0));
            ofFloat.addListener(new mf(9, m0));
            m0.I0 = ofFloat;
            ofFloat.start();
        }
    }
}
