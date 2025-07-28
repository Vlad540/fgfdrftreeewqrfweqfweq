package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* renamed from: zg7  reason: default package */
public final class zg7 implements View.OnTouchListener {
    public static final int G0 = ViewConfiguration.getTapTimeout();
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public final ListView F0;
    public final float[] X;
    public final float[] Y;
    public final int Z;
    public final h80 a;
    public final AccelerateInterpolator b = new AccelerateInterpolator();
    public final View c;
    public re o;
    public final int w0;
    public final float[] x0;
    public final float[] y0;
    public final float[] z0;

    /* JADX WARNING: type inference failed for: r1v0, types: [h80, java.lang.Object] */
    public zg7(ListView listView) {
        ? obj = new Object();
        obj.e = Long.MIN_VALUE;
        obj.g = -1;
        obj.f = 0;
        this.a = obj;
        float[] fArr = {0.0f, 0.0f};
        this.X = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.Y = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.x0 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.y0 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.z0 = fArr5;
        this.c = listView;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((float) ((int) ((1575.0f * f) + 0.5f))) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((float) ((int) ((f * 315.0f) + 0.5f))) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.Z = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.w0 = G0;
        obj.a = 500;
        obj.b = 500;
        this.F0 = listView;
    }

    public static float b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.X
            r0 = r0[r7]
            float[] r1 = r3.Y
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.b
            if (r5 >= 0) goto L_0x0025
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L_0x002d
        L_0x0025:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x0036
            float r4 = r0.getInterpolation(r4)
        L_0x002d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L_0x0037
        L_0x0036:
            r4 = r2
        L_0x0037:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x003c
            return r2
        L_0x003c:
            float[] r0 = r3.x0
            r0 = r0[r7]
            float[] r1 = r3.y0
            r1 = r1[r7]
            float[] r3 = r3.z0
            r3 = r3[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L_0x0051
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            return r3
        L_0x0051:
            float r4 = -r4
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            float r3 = -r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg7.a(float, float, float, int):float");
    }

    public final float c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.Z;
        if (i == 0 || i == 1) {
            if (f < f2) {
                return f >= 0.0f ? 1.0f - (f / f2) : (!this.D0 || i != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    public final void d() {
        int i = 0;
        if (this.B0) {
            this.D0 = false;
            return;
        }
        h80 h80 = this.a;
        h80.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - h80.e);
        int i3 = h80.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        h80.i = i;
        h80.h = h80.a(currentAnimationTimeMillis);
        h80.g = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r7 = r7.F0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r7 = this;
            h80 r0 = r7.a
            float r1 = r0.d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.c
            java.lang.Math.abs(r0)
            r0 = 0
            if (r1 == 0) goto L_0x004a
            android.widget.ListView r7 = r7.F0
            int r2 = r7.getCount()
            if (r2 != 0) goto L_0x001b
            goto L_0x004a
        L_0x001b:
            int r3 = r7.getChildCount()
            int r4 = r7.getFirstVisiblePosition()
            int r5 = r4 + r3
            r6 = 1
            if (r1 <= 0) goto L_0x003a
            if (r5 < r2) goto L_0x0049
            int r3 = r3 - r6
            android.view.View r1 = r7.getChildAt(r3)
            int r1 = r1.getBottom()
            int r7 = r7.getHeight()
            if (r1 > r7) goto L_0x0049
            goto L_0x004a
        L_0x003a:
            if (r1 >= 0) goto L_0x004a
            if (r4 > 0) goto L_0x0049
            android.view.View r7 = r7.getChildAt(r0)
            int r7 = r7.getTop()
            if (r7 < 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = r6
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg7.e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r1 != 3) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            r0 = 3
            boolean r1 = r7.E0
            r2 = 0
            if (r1 != 0) goto L_0x0007
            return r2
        L_0x0007:
            int r1 = r9.getActionMasked()
            r3 = 1
            if (r1 == 0) goto L_0x001a
            if (r1 == r3) goto L_0x0016
            r4 = 2
            if (r1 == r4) goto L_0x001e
            if (r1 == r0) goto L_0x0016
            goto L_0x007b
        L_0x0016:
            r7.d()
            goto L_0x007b
        L_0x001a:
            r7.C0 = r3
            r7.A0 = r2
        L_0x001e:
            float r1 = r9.getX()
            int r4 = r8.getWidth()
            float r4 = (float) r4
            android.view.View r5 = r7.c
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r1 = r7.a(r1, r4, r6, r2)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r8 = r7.a(r9, r8, r4, r3)
            h80 r9 = r7.a
            r9.c = r1
            r9.d = r8
            boolean r8 = r7.D0
            if (r8 != 0) goto L_0x007b
            boolean r8 = r7.e()
            if (r8 == 0) goto L_0x007b
            re r8 = r7.o
            if (r8 != 0) goto L_0x005f
            re r8 = new re
            r8.<init>(r0, r7)
            r7.o = r8
        L_0x005f:
            r7.D0 = r3
            r7.B0 = r3
            boolean r8 = r7.A0
            if (r8 != 0) goto L_0x0074
            int r8 = r7.w0
            if (r8 <= 0) goto L_0x0074
            re r9 = r7.o
            long r0 = (long) r8
            java.util.WeakHashMap r8 = defpackage.eaf.a
            r5.postOnAnimationDelayed(r9, r0)
            goto L_0x0079
        L_0x0074:
            re r8 = r7.o
            r8.run()
        L_0x0079:
            r7.A0 = r3
        L_0x007b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg7.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
