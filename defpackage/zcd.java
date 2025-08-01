package defpackage;

import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: zcd  reason: default package */
public class zcd extends Drawable {
    public final c00 a = new c00(16, this);
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final Matrix d = new Matrix();
    public ValueAnimator e;
    public wcd f;

    public final void a() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null && !valueAnimator.isStarted()) {
            wcd wcd = this.f;
            if (wcd == null) {
                wcd = null;
            }
            if (wcd.k && getCallback() != null) {
                this.e.start();
            }
        }
    }

    public final void b(wcd wcd) {
        boolean z;
        ValueAnimator valueAnimator;
        this.f = wcd;
        Paint paint = this.b;
        wcd wcd2 = this.f;
        wcd wcd3 = null;
        if (wcd2 == null) {
            wcd2 = null;
        }
        paint.setXfermode(new PorterDuffXfermode(wcd2.l ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        e();
        ValueAnimator valueAnimator2 = this.e;
        if (valueAnimator2 != null) {
            z = valueAnimator2.isStarted();
            valueAnimator2.cancel();
            valueAnimator2.removeAllUpdateListeners();
        } else {
            z = false;
        }
        wcd wcd4 = this.f;
        if (wcd4 != null) {
            wcd3 = wcd4;
        }
        ValueAnimator valueAnimator3 = wcd3.r;
        if (valueAnimator3 == null) {
            valueAnimator3 = ValueAnimator.ofFloat(new float[]{0.0f, ((float) (wcd3.p / wcd3.o)) + 1.0f});
            valueAnimator3.setRepeatMode(wcd3.n);
            valueAnimator3.setRepeatCount(wcd3.m);
            valueAnimator3.setDuration(wcd3.o);
            valueAnimator3.setInterpolator(wcd3.q);
            wcd3.r = valueAnimator3;
        }
        this.e = valueAnimator3;
        valueAnimator3.addUpdateListener(this.a);
        if (z && (valueAnimator = this.e) != null) {
            valueAnimator.start();
        }
        invalidateSelf();
    }

    public final void c() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null) {
            return;
        }
        if ((valueAnimator == null || !valueAnimator.isStarted()) && getCallback() != null) {
            this.e.start();
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null && valueAnimator != null && valueAnimator.isStarted()) {
            this.e.cancel();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            android.graphics.Paint r0 = r10.b
            android.graphics.Shader r1 = r0.getShader()
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            wcd r1 = r10.f
            r2 = 0
            if (r1 != 0) goto L_0x000f
            r1 = r2
        L_0x000f:
            float r1 = r1.i
            double r3 = (double) r1
            double r3 = java.lang.Math.toRadians(r3)
            double r3 = java.lang.Math.tan(r3)
            float r1 = (float) r3
            android.graphics.Rect r3 = r10.c
            int r4 = r3.height()
            float r4 = (float) r4
            int r5 = r3.width()
            float r5 = (float) r5
            float r5 = r5 * r1
            float r5 = r5 + r4
            int r4 = r3.width()
            float r4 = (float) r4
            int r6 = r3.height()
            float r6 = (float) r6
            float r1 = r1 * r6
            float r1 = r1 + r4
            android.animation.ValueAnimator r4 = r10.e
            r6 = 0
            if (r4 == 0) goto L_0x003f
            float r4 = r4.getAnimatedFraction()
            goto L_0x0040
        L_0x003f:
            r4 = r6
        L_0x0040:
            wcd r7 = r10.f
            if (r7 != 0) goto L_0x0045
            r7 = r2
        L_0x0045:
            int r7 = r7.c
            int r7 = hr1.t(r7)
            if (r7 == 0) goto L_0x0071
            r8 = 1
            if (r7 == r8) goto L_0x006b
            r8 = 2
            if (r7 == r8) goto L_0x0062
            r1 = 3
            if (r7 != r1) goto L_0x005c
            float r1 = -r5
            float r1 = defpackage.us8.g(r1, r5, r4, r5)
            goto L_0x0077
        L_0x005c:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x0062:
            float r5 = -r1
            float r1 = defpackage.us8.g(r5, r1, r4, r1)
        L_0x0067:
            r9 = r6
            r6 = r1
            r1 = r9
            goto L_0x0077
        L_0x006b:
            float r1 = -r5
            float r1 = defpackage.us8.g(r5, r1, r4, r1)
            goto L_0x0077
        L_0x0071:
            float r5 = -r1
            float r1 = defpackage.us8.g(r1, r5, r4, r5)
            goto L_0x0067
        L_0x0077:
            android.graphics.Matrix r4 = r10.d
            r4.reset()
            wcd r10 = r10.f
            if (r10 != 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r2 = r10
        L_0x0082:
            float r10 = r2.i
            int r2 = r3.width()
            float r2 = (float) r2
            r5 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r5
            int r7 = r3.height()
            float r7 = (float) r7
            float r7 = r7 / r5
            r4.setRotate(r10, r2, r7)
            r4.postTranslate(r6, r1)
            android.graphics.Shader r10 = r0.getShader()
            r10.setLocalMatrix(r4)
            r11.drawRect(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zcd.draw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r13 = this;
            android.graphics.Rect r0 = r13.getBounds()
            int r1 = r0.width()
            int r0 = r0.height()
            if (r1 == 0) goto L_0x0072
            if (r0 != 0) goto L_0x0012
            goto L_0x0072
        L_0x0012:
            wcd r2 = r13.f
            r3 = 0
            if (r2 != 0) goto L_0x0018
            r2 = r3
        L_0x0018:
            int r4 = r2.f
            if (r4 <= 0) goto L_0x001d
            goto L_0x0025
        L_0x001d:
            float r2 = r2.g
            float r1 = (float) r1
            float r2 = r2 * r1
            int r4 = a24.X(r2)
        L_0x0025:
            wcd r1 = r13.f
            if (r1 != 0) goto L_0x002a
            r1 = r3
        L_0x002a:
            float r1 = r1.h
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = a24.X(r1)
            wcd r1 = r13.f
            if (r1 != 0) goto L_0x0038
            r2 = r3
            goto L_0x0039
        L_0x0038:
            r2 = r1
        L_0x0039:
            int r2 = r2.c
            r5 = 2
            r6 = 0
            if (r2 == r5) goto L_0x004a
            if (r1 != 0) goto L_0x0042
            r1 = r3
        L_0x0042:
            int r1 = r1.c
            r2 = 4
            if (r1 != r2) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r1 = r6
            goto L_0x004b
        L_0x004a:
            r1 = 1
        L_0x004b:
            if (r1 == 0) goto L_0x004e
            r4 = r6
        L_0x004e:
            if (r1 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r0 = r6
        L_0x0052:
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            float r8 = (float) r4
            float r9 = (float) r0
            wcd r0 = r13.f
            if (r0 != 0) goto L_0x005c
            r2 = r3
            goto L_0x005d
        L_0x005c:
            r2 = r0
        L_0x005d:
            int[] r10 = r2.b
            if (r0 != 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r3 = r0
        L_0x0063:
            float[] r11 = r3.a
            android.graphics.Shader$TileMode r12 = android.graphics.Shader.TileMode.CLAMP
            r6 = 0
            r7 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            android.graphics.Paint r13 = r13.b
            r13.setShader(r1)
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zcd.e():void");
    }

    public final int getOpacity() {
        wcd wcd = this.f;
        if (!(wcd == null ? null : wcd).j) {
            if (wcd == null) {
                wcd = null;
            }
            return wcd.l ? -3 : -1;
        }
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(0, 0, rect.width(), rect.height());
        e();
        a();
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
