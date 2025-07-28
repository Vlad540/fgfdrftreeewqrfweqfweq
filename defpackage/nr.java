package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: nr  reason: default package */
public abstract class nr extends Drawable implements Drawable.Callback, eqe, dqe {
    public final Rect X = new Rect();
    public boolean Y;
    public boolean Z;
    public eqe a;
    public final hd6 b = new hd6();
    public final Drawable[] c;
    public final xm4[] o;
    public boolean w0;

    public nr(Drawable[] drawableArr) {
        int i = 0;
        this.Y = false;
        this.Z = false;
        this.w0 = false;
        this.c = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.c;
            if (i < drawableArr2.length) {
                lp.N(drawableArr2[i], this, this);
                i++;
            } else {
                this.o = new xm4[drawableArr2.length];
                return;
            }
        }
    }

    public final Drawable a(int i) {
        boolean z = false;
        ez3.j(Boolean.valueOf(i >= 0));
        Drawable[] drawableArr = this.c;
        if (i < drawableArr.length) {
            z = true;
        }
        ez3.j(Boolean.valueOf(z));
        return drawableArr[i];
    }

    public final Drawable b(Drawable drawable, int i) {
        hd6 hd6;
        boolean z = true;
        if (i >= 0) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                z = false;
            }
            if (z) {
                Drawable drawable2 = drawableArr[i];
                if (drawable != drawable2) {
                    if (drawable != null && this.w0) {
                        drawable.mutate();
                    }
                    lp.N(drawableArr[i], (Drawable.Callback) null, (eqe) null);
                    lp.N(drawable, (Drawable.Callback) null, (eqe) null);
                    if (!(drawable == null || (hd6 = this.b) == null)) {
                        hd6.a(drawable);
                    }
                    lp.i(drawable, this);
                    lp.N(drawable, this, this);
                    this.Z = false;
                    drawableArr[i] = drawable;
                    invalidateSelf();
                }
                return drawable2;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final void d(Matrix matrix) {
        eqe eqe = this.a;
        if (eqe != null) {
            eqe.d(matrix);
        } else {
            matrix.reset();
        }
    }

    public final int getIntrinsicHeight() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    public final int getIntrinsicWidth() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    public final int getOpacity() {
        Drawable[] drawableArr = this.c;
        if (drawableArr.length == 0) {
            return -2;
        }
        int i = -1;
        for (int i2 = 1; i2 < drawableArr.length; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                i = Drawable.resolveOpacity(i, drawable.getOpacity());
            }
        }
        return i;
    }

    public final boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                Rect rect2 = this.X;
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i++;
        }
    }

    public final void h(RectF rectF) {
        eqe eqe = this.a;
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
        if (!this.Z) {
            this.Y = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.c;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.Y;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.Y = z2 | z;
                i++;
            }
            this.Z = true;
        }
        return this.Y;
    }

    public final void l(eqe eqe) {
        this.a = eqe;
    }

    public final Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.mutate();
                }
                i++;
            } else {
                this.w0 = true;
                return this;
            }
        }
    }

    public final void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setBounds(rect);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i2 >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
            i2++;
        }
    }

    public final boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
            i++;
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        hd6 hd6 = this.b;
        hd6.f = colorFilter;
        int i = 0;
        hd6.b = colorFilter != null;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void setDither(boolean z) {
        this.b.d = z ? 1 : 0;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setDither(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void setFilterBitmap(boolean z) {
        this.b.e = z ? 1 : 0;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setFilterBitmap(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void setHotspot(float f, float f2) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setHotspot(f, f2);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
            i++;
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
