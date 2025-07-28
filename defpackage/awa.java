package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: awa  reason: default package */
public final class awa implements rwa {
    public int X;
    public float Y;
    public float Z;
    public final View a;
    public final af1 b;
    public final l81 c;
    public int o;
    public ValueAnimator w0;
    public qwa x0 = qwa.e;

    public awa(View view, ea6 ea6, l81 l81) {
        this.a = view;
        this.b = ea6;
        this.c = l81;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        if (r1 > r3) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            af1 r0 = r6.b
            android.graphics.PointF r0 = r0.q()
            float r1 = r0.x
            qwa r2 = r6.x0
            float r3 = r2.a
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x0012
        L_0x0010:
            r1 = r3
            goto L_0x0019
        L_0x0012:
            float r3 = r2.b
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0019
            goto L_0x0010
        L_0x0019:
            float r3 = r0.y
            float r4 = r2.c
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x0023
            r3 = r4
            goto L_0x002a
        L_0x0023:
            float r2 = r2.d
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x002a
            r3 = r2
        L_0x002a:
            android.animation.ValueAnimator r2 = r6.w0
            if (r2 == 0) goto L_0x0031
            r2.end()
        L_0x0031:
            r2 = 2
            float[] r2 = new float[r2]
            r2 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            r4 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r4)
            zva r4 = new zva
            r4.<init>(r0, r1, r3, r6)
            r2.addUpdateListener(r4)
            r6.w0 = r2
            r2.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awa.a():void");
    }

    public final boolean b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        af1 af1 = this.b;
        if (action == 0) {
            PointF q = af1.q();
            this.o = (int) q.x;
            this.X = (int) q.y;
            this.Y = motionEvent.getRawX();
            this.Z = motionEvent.getRawY();
        }
        int action2 = motionEvent.getAction();
        if (action2 == 1) {
            a();
            return motionEvent.getAction() == 1 && motionEvent.getEventTime() - motionEvent.getDownTime() < 100;
        } else if (action2 == 2) {
            float rawX = motionEvent.getRawX() - this.Y;
            float rawY = motionEvent.getRawY() - this.Z;
            float f = ((float) this.o) + rawX;
            float f2 = ((float) this.X) + rawY;
            af1.x(f, f2);
            PointF pointF = ((m81) this.c).b;
            pointF.x = f;
            pointF.y = f2;
            return true;
        } else if (action2 != 3) {
            return true;
        } else {
            a();
            return true;
        }
    }

    public final void j(float f, float f2) {
        this.b.x(f, f2);
        PointF pointF = ((m81) this.c).b;
        pointF.x = f;
        pointF.y = f2;
    }

    public final void q(float f, float f2, int i, int i2, ewa ewa) {
        this.x0 = mt0.d(this.a.getContext(), f, f2, i, i2, ewa);
    }
}
