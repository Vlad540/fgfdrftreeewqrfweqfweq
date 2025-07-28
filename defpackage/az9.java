package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: az9  reason: default package */
public final class az9 extends Drawable {
    public final Context a;
    public final gz9 b;
    public final String c;
    public final mn4 d;
    public int e;
    public final qcc f;
    public final o5 g;
    public String h;
    public tr6 i;
    public final int j;

    public /* synthetic */ az9(Context context) {
        this(context, dz9.a);
    }

    public final void a(tr6 tr6) {
        int i2;
        mn4 mn4 = this.d;
        if (tr6 == null) {
            mn4.i((gn4) null);
        } else {
            boolean isEmpty = getBounds().isEmpty();
            int i3 = this.j;
            if (isEmpty) {
                i2 = i3;
            } else if (getBounds().width() < getBounds().height()) {
                int width = getBounds().width();
                if (width >= i3) {
                    i3 = width;
                }
                i2 = a24.X((((float) i3) / ((float) getBounds().width())) * ((float) getBounds().height()));
            } else {
                int height = getBounds().height();
                if (height >= i3) {
                    i3 = height;
                }
                int i4 = i3;
                i3 = a24.X((((float) i3) / ((float) getBounds().height())) * ((float) getBounds().width()));
                i2 = i4;
            }
            vb0 vb0 = bz9.a;
            hbc hbc = (i3 <= 0 || i2 <= 0) ? null : new hbc(0.0f, i3, i2, 12);
            gz9 gz9 = this.b;
            ur6 d2 = ur6.d(tr6.b);
            d2.g = rr6.b;
            d2.l = bz9.a(gz9);
            if (hbc != null) {
                d2.d = hbc;
            }
            d2.k = u3b.c;
            tr6 a2 = d2.a();
            fr6 u = a06.u();
            u.getClass();
            er6 er6 = new er6(u, a2, (Object) null);
            qcc qcc = this.f;
            qcc.a(er6);
            if (mn4.X == null) {
                ywa a3 = a06.a.a();
                a3.g = qcc;
                a3.h = this.g;
                a3.l = mn4.X;
                a3.k = true;
                mn4.i(a3.a());
            }
        }
        invalidateSelf();
    }

    public final void b(ub0 ub0) {
        mn4 mn4 = this.d;
        if (ub0 != null && (ub0.a != 0 || ub0.b.length() != 0)) {
            tb0 tb0 = new tb0(this.b, ub0, km4.y0.n(this.a).g());
            y66 y66 = mn4.o;
            y66.getClass();
            y66.i(tb0, 1);
            this.e = 3;
        } else if (this.e == 3) {
            y66 y662 = mn4.o;
            y662.getClass();
            y662.i((Drawable) null, 1);
            this.e = 1;
        }
        invalidateSelf();
    }

    public final void c(String str) {
        tr6 tr6;
        if (!hhd.f(this.h, str)) {
            this.h = str;
            if (str == null || str.length() == 0) {
                tr6 = null;
            } else {
                vb0 vb0 = bz9.a;
                tr6 = bz9.b(str, this.b, 4);
            }
            this.i = tr6;
            mn4 mn4 = this.d;
            if (tr6 != null) {
                mn4.g();
            } else {
                mn4.h();
            }
            a(this.i);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        lfc e2 = this.d.e();
        if (e2 != null) {
            Drawable.Callback callback = e2.getCallback();
            e2.setCallback((Drawable.Callback) null);
            e2.draw(canvas);
            e2.setCallback(callback);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az9)) {
            return false;
        }
        az9 az9 = (az9) obj;
        return hhd.f(this.b, az9.b) && hhd.f(this.h, az9.h);
    }

    public final int getAlpha() {
        lfc e2 = this.d.e();
        return e2 != null ? e2.getAlpha() : super.getAlpha();
    }

    public final int getIntrinsicHeight() {
        this.d.getClass();
        return -1;
    }

    public final int getIntrinsicWidth() {
        this.d.getClass();
        return -1;
    }

    public final int getOpacity() {
        return -3;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.h;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        lfc e2 = this.d.e();
        if (e2 != null) {
            Drawable.Callback callback = e2.getCallback();
            e2.setCallback((Drawable.Callback) null);
            e2.setBounds(0, 0, rect.width(), rect.height());
            e2.setCallback(callback);
        }
        a(this.i);
    }

    public final void setAlpha(int i2) {
        lfc e2 = this.d.e();
        if (e2 != null) {
            e2.setAlpha(i2);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        lfc e2 = this.d.e();
        if (e2 != null) {
            e2.setColorFilter(colorFilter);
        }
    }

    public az9(Context context, gz9 gz9) {
        this.a = context;
        this.b = gz9;
        this.c = az9.class.getName();
        z66 z66 = new z66(context.getResources());
        z66.b = 0;
        mn4 mn4 = new mn4(z66.a());
        lfc e2 = mn4.e();
        if (e2 != null) {
            e2.setCallback(new pf(2, this));
        }
        this.d = mn4;
        this.e = 1;
        qcc qcc = new qcc();
        this.f = qcc;
        o5 o5Var = new o5(1, this);
        this.g = o5Var;
        this.j = a24.X(((float) 32) * dh4.c().getDisplayMetrics().density);
        ywa a2 = a06.a.a();
        a2.g = qcc;
        a2.h = o5Var;
        a2.l = mn4.X;
        a2.k = true;
        mn4.i(a2.a());
    }
}
