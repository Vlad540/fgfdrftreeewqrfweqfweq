package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

class ClockHandView extends View {
    public float A0;
    public boolean B0;
    public double C0;
    public int D0;
    public int E0;
    public final ValueAnimator a = new ValueAnimator();
    public boolean b;
    public final ArrayList c = new ArrayList();
    public final int o;
    public final float w0;
    public final Paint x0;
    public final RectF y0;
    public final int z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ClockHandView(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            int r0 = defpackage.wlb.materialClockStyle
            r5.<init>(r6, r7, r0)
            android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
            r1.<init>()
            r5.a = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.c = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r5.x0 = r1
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r5.y0 = r2
            r2 = 1
            r5.E0 = r2
            int[] r3 = defpackage.xvb.ClockHandView
            int r4 = defpackage.kvb.Widget_MaterialComponents_TimePicker_Clock
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r3, r0, r4)
            int r0 = defpackage.wlb.motionDurationLong2
            r3 = 200(0xc8, float:2.8E-43)
            ct0.H(r0, r3, r6)
            int r0 = defpackage.wlb.motionEasingEmphasizedInterpolator
            p85 r3 = defpackage.og.b
            ct0.I(r6, r0, r3)
            int r0 = defpackage.xvb.ClockHandView_materialCircleRadius
            r3 = 0
            int r0 = r7.getDimensionPixelSize(r0, r3)
            r5.D0 = r0
            int r0 = defpackage.xvb.ClockHandView_selectorSize
            int r0 = r7.getDimensionPixelSize(r0, r3)
            r5.o = r0
            android.content.res.Resources r0 = r5.getResources()
            int r4 = defpackage.vmb.material_clock_hand_stroke_width
            int r4 = r0.getDimensionPixelSize(r4)
            r5.z0 = r4
            int r4 = defpackage.vmb.material_clock_hand_center_dot_radius
            int r0 = r0.getDimensionPixelSize(r4)
            float r0 = (float) r0
            r5.w0 = r0
            int r0 = defpackage.xvb.ClockHandView_clockHandColor
            int r0 = r7.getColor(r0, r3)
            r1.setAntiAlias(r2)
            r1.setColor(r0)
            r0 = 0
            r5.b(r0)
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            r6.getScaledTouchSlop()
            java.util.WeakHashMap r6 = defpackage.eaf.a
            r6 = 2
            r5.setImportantForAccessibility(r6)
            r7.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockHandView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(int i) {
        int i2 = this.D0;
        return i == 2 ? Math.round(((float) i2) * 0.66f) : i2;
    }

    public final void b(float f) {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f);
    }

    public final void c(float f) {
        float f2 = f % 360.0f;
        this.A0 = f2;
        this.C0 = Math.toRadians((double) (f2 - 90.0f));
        float a2 = (float) a(this.E0);
        float cos = (((float) Math.cos(this.C0)) * a2) + ((float) (getWidth() / 2));
        float sin = (a2 * ((float) Math.sin(this.C0))) + ((float) (getHeight() / 2));
        float f3 = (float) this.o;
        this.y0.set(cos - f3, sin - f3, cos + f3, sin + f3);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((u03) it.next());
            if (Math.abs(clockFaceView.a1 - f2) > 0.001f) {
                clockFaceView.a1 = f2;
                clockFaceView.x();
            }
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int a2 = a(this.E0);
        float f = (float) width;
        float f2 = (float) a2;
        float f3 = (float) height;
        Paint paint = this.x0;
        paint.setStrokeWidth(0.0f);
        int i = this.o;
        canvas.drawCircle((((float) Math.cos(this.C0)) * f2) + f, (f2 * ((float) Math.sin(this.C0))) + f3, (float) i, paint);
        double sin = Math.sin(this.C0);
        double d = (double) ((float) (a2 - i));
        paint.setStrokeWidth((float) this.z0);
        canvas.drawLine(f, f3, (float) (width + ((int) (Math.cos(this.C0) * d))), (float) (height + ((int) (d * sin))), paint);
        canvas.drawCircle(f, f3, this.w0, paint);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.a.isRunning()) {
            b(this.A0);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.B0 = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.B0;
            if (this.b) {
                this.E0 = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) a(2)) + gwf.m(getContext(), 12) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.B0;
        int degrees = (int) Math.toDegrees(Math.atan2((double) (y - ((float) (getHeight() / 2))), (double) (x - ((float) (getWidth() / 2)))));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = (float) i;
        boolean z5 = this.A0 != f;
        if (!z || !z5) {
            if (z5 || z2) {
                b(f);
            }
            this.B0 = z4 | z3;
            return true;
        }
        z3 = true;
        this.B0 = z4 | z3;
        return true;
    }
}
