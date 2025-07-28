package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: ddd  reason: default package */
public final class ddd extends TextView {
    public final Paint a;
    public final zcd b;
    public boolean c = true;

    public ddd(Context context) {
        super(context, (AttributeSet) null);
        Paint paint = new Paint();
        this.a = paint;
        zcd zcd = new zcd();
        this.b = zcd;
        setWillNotDraw(false);
        zcd.setCallback(this);
        c9 c9Var = new c9(21);
        wcd wcd = (wcd) c9Var.b;
        wcd.k = false;
        wcd.i = 0.0f;
        s59 s59 = km4.y0;
        c9Var.s(s59.r(this).getText().g);
        s59.r(this);
        wcd.d = -1;
        c9Var.r();
        c9Var.v(a24.X(((float) 360) * dh4.c().getDisplayMetrics().density));
        wcd i = c9Var.i();
        zcd.b(i);
        if (i.j) {
            setLayerType(2, paint);
        } else {
            setLayerType(0, (Paint) null);
        }
    }

    public final void a(boolean z) {
        zcd zcd = this.b;
        if (z) {
            this.c = true;
            if (z) {
                zcd.c();
                return;
            }
            return;
        }
        zcd.d();
        this.c = false;
        invalidate();
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.c) {
            this.b.draw(canvas);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.a();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.d();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.setBounds(0, 0, getWidth(), getHeight());
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b;
    }
}
