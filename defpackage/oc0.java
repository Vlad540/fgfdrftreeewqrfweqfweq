package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: oc0  reason: default package */
public final class oc0 extends Drawable {
    public final Drawable a;
    public final gz9 b;
    public final Paint c;
    public final t97 d;

    public oc0(Drawable drawable, gz9 gz9, Context context, u16 u16, u16 u162) {
        this.a = drawable;
        this.b = gz9;
        s59 s59 = km4.y0;
        um4.g(drawable, ((Number) u16.invoke(s59.n(context).g())).intValue());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(((Number) u162.invoke(s59.n(context).g())).intValue());
        this.c = paint;
        t97 O = ez3.O(3, new m(16));
        this.d = O;
        if (gz9 instanceof fz9) {
            oad.a((Path) O.getValue(), getBounds());
        }
    }

    public final void draw(Canvas canvas) {
        int min = Math.min(getBounds().width(), getBounds().height());
        gz9 gz9 = this.b;
        boolean z = gz9 instanceof dz9;
        Paint paint = this.c;
        if (z) {
            canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), ((float) getBounds().width()) / 2.0f, paint);
        } else if (gz9 instanceof fz9) {
            canvas.drawPath((Path) this.d.getValue(), paint);
        } else if (!hhd.f(gz9, ez9.a)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = mz9.O0;
        int q = pfa.q(min);
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, q, q);
        canvas.save();
        float f = ((float) q) / 2.0f;
        canvas.translate(getBounds().exactCenterX() - f, getBounds().exactCenterY() - f);
        drawable.draw(canvas);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        if (this.b instanceof fz9) {
            oad.a((Path) this.d.getValue(), rect);
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
