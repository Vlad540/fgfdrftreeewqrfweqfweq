package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: ow5  reason: default package */
public class ow5 extends Drawable implements Drawable.Callback, eqe, dqe, xm4 {
    public static final Matrix o = new Matrix();
    public Drawable a;
    public final hd6 b = new hd6();
    public eqe c;

    public ow5(Drawable drawable) {
        this.a = drawable;
        lp.N(drawable, this, this);
    }

    public void d(Matrix matrix) {
        n(matrix);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public final Drawable f(Drawable drawable) {
        return o(drawable);
    }

    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.a;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    public final Drawable getCurrent() {
        return this.a;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.a;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    public final void h(RectF rectF) {
        eqe eqe = this.c;
        if (eqe != null) {
            eqe.h(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    public final Drawable j() {
        return this.a;
    }

    public final void l(eqe eqe) {
        this.c = eqe;
    }

    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public final void n(Matrix matrix) {
        eqe eqe = this.c;
        if (eqe != null) {
            eqe.d(matrix);
        } else {
            matrix.reset();
        }
    }

    public Drawable o(Drawable drawable) {
        hd6 hd6;
        Drawable drawable2 = this.a;
        lp.N(drawable2, (Drawable.Callback) null, (eqe) null);
        lp.N(drawable, (Drawable.Callback) null, (eqe) null);
        if (!(drawable == null || (hd6 = this.b) == null)) {
            hd6.a(drawable);
        }
        lp.i(drawable, this);
        lp.N(drawable, this, this);
        this.a = drawable;
        invalidateSelf();
        return drawable2;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onLevelChange(int i) {
        Drawable drawable = this.a;
        return drawable == null ? super.onLevelChange(i) : drawable.setLevel(i);
    }

    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.a;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
        this.b.c = i;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        hd6 hd6 = this.b;
        hd6.f = colorFilter;
        hd6.b = colorFilter != null;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public final void setDither(boolean z) {
        this.b.d = z ? 1 : 0;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    public final void setFilterBitmap(boolean z) {
        this.b.e = z ? 1 : 0;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.a;
        return drawable == null ? visible : drawable.setVisible(z, z2);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
