package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: add  reason: default package */
public final class add extends FrameLayout {
    public final Paint a = new Paint();
    public final zcd b;
    public boolean c;

    public add(Context context) {
        super(context, (AttributeSet) null, 0);
        zcd zcd = new zcd();
        this.b = zcd;
        this.c = true;
        setWillNotDraw(false);
        zcd.setCallback(this);
        c9 c9Var = new c9(21);
        wcd wcd = (wcd) c9Var.b;
        wcd.k = false;
        wcd.i = 0.0f;
        s59 s59 = km4.y0;
        c9Var.s(s59.r(this).getText().e);
        wcd.d = s59.r(this).e().a;
        c9Var.r();
        c9Var.v(a24.X(((float) 360) * dh4.c().getDisplayMetrics().density));
        a(c9Var.i());
    }

    public final void a(wcd wcd) {
        this.b.b(wcd);
        if (wcd.j) {
            setLayerType(2, this.a);
        } else {
            setLayerType(0, (Paint) null);
        }
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
