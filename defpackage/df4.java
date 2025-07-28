package defpackage;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* renamed from: df4  reason: default package */
public final class df4 extends dn4 {
    public static final cf4 F0 = new Object();
    public final qn4 A0;
    public final gnd B0;
    public final fnd C0;
    public final pn4 D0;
    public boolean E0 = false;

    /* JADX WARNING: type inference failed for: r2v2, types: [pn4, java.lang.Object] */
    public df4(Context context, oi0 oi0, qn4 qn4) {
        super(context, oi0);
        this.A0 = qn4;
        this.D0 = new Object();
        gnd gnd = new gnd();
        this.B0 = gnd;
        gnd.a(1.0f);
        gnd.b(50.0f);
        fnd fnd = new fnd(this, F0);
        this.C0 = fnd;
        fnd.m = gnd;
        if (this.w0 != 1.0f) {
            this.w0 = 1.0f;
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            qn4 qn4 = this.A0;
            Rect bounds = getBounds();
            float b = b();
            ValueAnimator valueAnimator = this.o;
            boolean z = valueAnimator != null && valueAnimator.isRunning();
            ValueAnimator valueAnimator2 = this.X;
            boolean z2 = valueAnimator2 != null && valueAnimator2.isRunning();
            qn4.a.a();
            qn4.a(canvas, bounds, b, z, z2);
            Paint paint = this.x0;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            oi0 oi0 = this.b;
            int i = oi0.c[0];
            pn4 pn4 = this.D0;
            pn4.c = i;
            int i2 = oi0.g;
            if (i2 > 0) {
                if (!(this.A0 instanceof wc7)) {
                    i2 = (int) ((xy6.i(pn4.b, 0.0f, 0.01f) * ((float) i2)) / 0.01f);
                }
                this.A0.d(canvas, paint, pn4.b, 1.0f, oi0.d, this.y0, i2);
            } else {
                this.A0.d(canvas, paint, 0.0f, 1.0f, oi0.d, this.y0, 0);
            }
            this.A0.c(canvas, paint, pn4, this.y0);
            this.A0.b(canvas, paint, oi0.c[0], this.y0);
            canvas.restore();
        }
    }

    public final boolean e(boolean z, boolean z2, boolean z3) {
        boolean e = super.e(z, z2, z3);
        dh dhVar = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        dhVar.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.E0 = true;
        } else {
            this.E0 = false;
            this.B0.b(50.0f / f);
        }
        return e;
    }

    public final int getIntrinsicHeight() {
        return this.A0.e();
    }

    public final int getIntrinsicWidth() {
        return this.A0.f();
    }

    public final void jumpToCurrentState() {
        this.C0.f();
        this.D0.b = ((float) getLevel()) / 10000.0f;
        invalidateSelf();
    }

    public final boolean onLevelChange(int i) {
        boolean z = this.E0;
        pn4 pn4 = this.D0;
        fnd fnd = this.C0;
        if (z) {
            fnd.f();
            pn4.b = ((float) i) / 10000.0f;
            invalidateSelf();
        } else {
            fnd.b = pn4.b * 10000.0f;
            fnd.c = true;
            fnd.a((float) i);
        }
        return true;
    }
}
