package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: rc0  reason: default package */
public final class rc0 extends Drawable implements mhe {
    public final Paint X;
    public final t97 Y;
    public final Drawable a;
    public final gz9 b;
    public final u16 c;
    public final u16 o;

    public rc0(Drawable drawable, gz9 gz9, pda pda, u16 u16, u16 u162) {
        Paint paint;
        this.a = drawable;
        this.b = gz9;
        this.c = u16;
        this.o = u162;
        if (u162 != null) {
            paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(((Number) u162.invoke(pda)).intValue());
        } else {
            paint = null;
        }
        this.X = paint;
        t97 O = ez3.O(3, new m(17));
        this.Y = O;
        if ((gz9 instanceof fz9) && paint != null) {
            oad.a((Path) O.getValue(), getBounds());
        }
        if (u16 != null) {
            um4.g(drawable, ((Number) u16.invoke(pda)).intValue());
        }
    }

    public final void draw(Canvas canvas) {
        Paint paint = this.X;
        if (paint != null) {
            gz9 gz9 = this.b;
            if (gz9 instanceof dz9) {
                canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), ((float) getBounds().width()) / 2.0f, paint);
            } else if (gz9 instanceof fz9) {
                canvas.drawPath((Path) this.Y.getValue(), paint);
            } else if (!hhd.f(gz9, ez9.a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Drawable drawable = this.a;
        float width = ((float) drawable.getBounds().width()) / 2.0f;
        int save = canvas.save();
        canvas.translate(getBounds().exactCenterX() - width, getBounds().exactCenterY() - width);
        try {
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final int getOpacity() {
        return -1;
    }

    public final void onBoundsChange(Rect rect) {
        gz9 gz9 = this.b;
        boolean z = gz9 instanceof fz9;
        Drawable drawable = this.a;
        Paint paint = this.X;
        if (z) {
            oad.a((Path) this.Y.getValue(), rect);
        } else if (gz9 instanceof ez9) {
            int min = Math.min(rect.width(), rect.height());
            if (paint != null) {
                int i = mz9.O0;
                min = pfa.q(min);
            }
            drawable.setBounds(0, 0, min, min);
        }
        int min2 = Math.min(rect.width(), rect.height());
        if (paint != null) {
            int i2 = mz9.O0;
            min2 = pfa.q(min2);
        }
        drawable.setBounds(0, 0, min2, min2);
    }

    public final void onThemeChanged(pda pda) {
        u16 u16;
        Paint paint = this.X;
        if (!(paint == null || (u16 = this.o) == null)) {
            paint.setColor(((Number) u16.invoke(pda)).intValue());
        }
        Drawable drawable = this.a;
        u16 u162 = this.c;
        if (u162 != null) {
            um4.g(drawable, ((Number) u162.invoke(pda)).intValue());
        }
        if (paint == null && u162 == null) {
            mhe mhe = drawable instanceof mhe ? (mhe) drawable : null;
            if (mhe != null) {
                mhe.onThemeChanged(pda);
            }
        }
        invalidateSelf();
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
