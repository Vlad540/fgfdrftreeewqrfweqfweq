package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: ud5  reason: default package */
public final class ud5 extends View {
    public dr0 a;
    public int b;
    public final yd5 c;
    public final t97 o = ez3.O(3, new td5(this, 0));
    public short w0 = 0;
    public final t97 x0 = ez3.O(3, new td5(this, 1));
    public final t97 y0 = ez3.O(3, new td5(this, 2));
    public final t97 z0;

    public ud5(Context context) {
        super(context, (AttributeSet) null);
        s59 s59 = km4.y0;
        this.a = s59.r(this).a().a(true);
        this.b = s59.r(this).a().a(true).c.f;
        yd5 yd5 = new yd5(context);
        yd5.setCallback(this);
        this.c = yd5;
        this.z0 = ez3.O(3, new zu4((Object) context, 7, (Object) this));
        b(this.a);
    }

    public final void a(Canvas canvas) {
        int width = canvas.getWidth();
        yd5 yd5 = this.c;
        int save = canvas.save();
        canvas.translate(((float) (width - yd5.getBounds().width())) * 0.5f, ((float) (canvas.getHeight() - yd5.getBounds().height())) * 0.5f);
        try {
            yd5.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final void b(dr0 dr0) {
        this.a = dr0;
        this.b = dr0.c.f;
        t97 t97 = this.o;
        if (t97.a()) {
            ((Drawable) t97.getValue()).setTint(this.b);
        }
        t97 t972 = this.x0;
        if (t972.a()) {
            ((Drawable) t972.getValue()).setTint(this.b);
        }
        s59 s59 = km4.y0;
        this.c.a(s59.r(this).a().o().a.b.d, s59.r(this).a().o().a.b.t, s59.r(this).a().o().a.b.u);
        t97 t973 = this.z0;
        if (t973.a()) {
            ((zd5) t973.getValue()).onThemeChanged(s59.r(this));
        }
        t97 t974 = this.y0;
        if (t974.a()) {
            ((d00) t974.getValue()).b(this.b);
        }
    }

    public final void c(float f) {
        short s = this.w0;
        this.w0 = 1;
        boolean z = !(s == 1);
        ((d00) this.y0.getValue()).setLevel((int) (f * ((float) 100)));
        if (z) {
            ((Drawable) this.x0.getValue()).setTint(this.b);
            b(this.a);
            requestLayout();
            invalidate();
        }
    }

    public final void d() {
        short s = this.w0;
        boolean z = false;
        this.w0 = 0;
        if (s == 0) {
            z = true;
        }
        boolean z2 = !z;
        ((Drawable) this.o.getValue()).invalidateSelf();
        if (z2) {
            b(this.a);
            requestLayout();
            invalidate();
        }
    }

    public final void onDraw(Canvas canvas) {
        short s = this.w0;
        if (s == 0) {
            a(canvas);
            int width = getWidth();
            t97 t97 = this.o;
            int save = canvas.save();
            canvas.translate(((float) (width - ((Drawable) t97.getValue()).getBounds().width())) * 0.5f, dh4.c().getDisplayMetrics().density * 12.0f);
            try {
                ((Drawable) t97.getValue()).draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else if (s == 1) {
            a(canvas);
            int save2 = canvas.save();
            canvas.translate(dh4.c().getDisplayMetrics().density * 10.0f, dh4.c().getDisplayMetrics().density * 12.0f);
            try {
                ((d00) this.y0.getValue()).draw(canvas);
            } finally {
                canvas.restoreToCount(save2);
            }
        } else if (s == 2) {
            ((zd5) this.z0.getValue()).draw(canvas);
        }
    }

    public final void onMeasure(int i, int i2) {
        int X = a24.X(((float) 40) * dh4.c().getDisplayMetrics().density);
        this.c.setBounds(0, 0, a24.X(((float) 28) * dh4.c().getDisplayMetrics().density), a24.X(((float) 36) * dh4.c().getDisplayMetrics().density));
        t97 t97 = this.o;
        if (t97.a()) {
            float f = (float) 20;
            ((Drawable) t97.getValue()).setBounds(0, 0, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        }
        t97 t972 = this.x0;
        if (t972.a()) {
            float f2 = (float) 12;
            ((Drawable) t972.getValue()).setBounds(0, 0, a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        }
        t97 t973 = this.y0;
        if (t973.a()) {
            float f3 = (float) 20;
            ((d00) t973.getValue()).setBounds(0, 0, a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f3 * dh4.c().getDisplayMetrics().density));
        }
        t97 t974 = this.z0;
        if (t974.a()) {
            ((zd5) t974.getValue()).setBounds(0, 0, X, X);
        }
        setMeasuredDimension(X, X);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable((Drawable) null);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        boolean verifyDrawable = super.verifyDrawable(drawable);
        t97 t97 = this.y0;
        boolean z = true;
        if (t97.a()) {
            verifyDrawable = verifyDrawable || drawable == t97.getValue();
        }
        t97 t972 = this.z0;
        if (t972.a()) {
            if (!verifyDrawable) {
                zd5 zd5 = (zd5) t972.getValue();
                if (zd5 == drawable) {
                    zd5.getClass();
                } else if (zd5.b != drawable) {
                    verifyDrawable = false;
                }
            }
            verifyDrawable = true;
        }
        t97 t973 = this.o;
        if (t973.a()) {
            verifyDrawable = verifyDrawable || drawable == t973.getValue();
        }
        t97 t974 = this.x0;
        if (!t974.a()) {
            return verifyDrawable;
        }
        if (!verifyDrawable && drawable != t974.getValue()) {
            z = false;
        }
        return z;
    }
}
