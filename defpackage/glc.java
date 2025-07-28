package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: glc  reason: default package */
public final class glc extends ow5 {
    public ilc X;
    public Float Y;
    public PointF Z;
    public int w0;
    public int x0;
    public Matrix y0;
    public final Matrix z0 = new Matrix();

    public glc(Drawable drawable, ilc ilc) {
        super(drawable);
        this.X = ilc;
    }

    public final void d(Matrix matrix) {
        n(matrix);
        q();
        Matrix matrix2 = this.y0;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    public final void draw(Canvas canvas) {
        q();
        if (this.y0 != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.y0);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    public final Drawable o(Drawable drawable) {
        Drawable o = super.o(drawable);
        p();
        return o;
    }

    public final void onBoundsChange(Rect rect) {
        p();
    }

    public final void p() {
        Drawable drawable = this.a;
        if (drawable == null) {
            this.x0 = 0;
            this.w0 = 0;
            this.y0 = null;
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.w0 = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.x0 = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
            this.y0 = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            drawable.setBounds(bounds);
            this.y0 = null;
        } else if (this.X == jlc.m) {
            drawable.setBounds(bounds);
            this.y0 = null;
        } else {
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            Matrix matrix = this.z0;
            matrix.reset();
            ilc ilc = this.X;
            PointF pointF = this.Z;
            ilc.a(matrix, bounds, intrinsicWidth, intrinsicHeight, pointF != null ? pointF.x : 0.5f, pointF != null ? pointF.y : 0.5f);
            this.y0 = matrix;
        }
    }

    public final void q() {
        boolean z;
        ilc ilc = this.X;
        if (ilc instanceof hlc) {
            Float valueOf = Float.valueOf(((hlc) ilc).j);
            z = !valueOf.equals(this.Y);
            this.Y = valueOf;
        } else {
            z = false;
        }
        Drawable drawable = this.a;
        if (drawable != null) {
            if (this.w0 != drawable.getIntrinsicWidth() || this.x0 != drawable.getIntrinsicHeight() || z) {
                p();
            }
        }
    }

    public final void r(PointF pointF) {
        if (!at7.o(this.Z, pointF)) {
            if (pointF == null) {
                this.Z = null;
            } else {
                if (this.Z == null) {
                    this.Z = new PointF();
                }
                this.Z.set(pointF);
            }
            p();
            invalidateSelf();
        }
    }
}
