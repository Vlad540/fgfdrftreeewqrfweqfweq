package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* renamed from: gye  reason: default package */
public final class gye extends Drawable {
    public final mn4 a;
    public final qcc b;
    public u16 c;
    public final o5 d;
    public tr6 e;
    public tr6 f;
    public final int g;
    public String h;

    public gye(Context context) {
        z66 z66 = new z66(context.getResources());
        z66.b = 0;
        mn4 mn4 = new mn4(z66.a());
        lfc e2 = mn4.e();
        if (e2 != null) {
            e2.setCallback(new pf(4, this));
        }
        this.a = mn4;
        this.b = new qcc();
        this.d = new o5(4, this);
        this.g = a24.X(((float) 32) * dh4.c().getDisplayMetrics().density);
        d();
    }

    public static tr6 b(tr6 tr6, int i, int i2) {
        ur6 b2 = ur6.b(tr6);
        b2.d = (i <= 0 || i2 <= 0) ? null : new hbc(0.0f, i, i2, 12);
        return b2.a();
    }

    public final void a(tr6 tr6, tr6 tr62) {
        int i;
        o3e o3e;
        mn4 mn4 = this.a;
        if (tr6 == null) {
            mn4.i((gn4) null);
            return;
        }
        boolean isEmpty = getBounds().isEmpty();
        int i2 = this.g;
        if (isEmpty) {
            i = i2;
        } else if (getBounds().width() < getBounds().height()) {
            int width = getBounds().width();
            if (width >= i2) {
                i2 = width;
            }
            i = a24.X((((float) i2) / ((float) getBounds().width())) * ((float) getBounds().height()));
        } else {
            int height = getBounds().height();
            if (height >= i2) {
                i2 = height;
            }
            int i3 = i2;
            i2 = a24.X((((float) i2) / ((float) getBounds().height())) * ((float) getBounds().width()));
            i = i3;
        }
        if (tr62 != null) {
            fr6 u = a06.u();
            tr6 b2 = b(tr6, i2, i);
            u.getClass();
            o3e er6 = new er6(u, b2, (Object) null);
            fr6 u2 = a06.u();
            tr6 b3 = b(tr62, i2, i);
            u2.getClass();
            o3e = new nv6(p23.B(new o3e[]{er6, new er6(u2, b3, (Object) null)}), false);
        } else {
            fr6 u3 = a06.u();
            tr6 b4 = b(tr6, i2, i);
            u3.getClass();
            o3e = new er6(u3, b4, (Object) null);
        }
        this.b.a(o3e);
        if (mn4.X == null) {
            d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r3 = ez3.d(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.net.Uri r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = r1.h
            boolean r0 = hhd.f(r0, r3)
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            r1.h = r3
            r0 = 0
            if (r3 == 0) goto L_0x001d
            android.net.Uri r3 = ez3.d(r3)
            if (r3 == 0) goto L_0x001d
            ur6 r3 = ur6.d(r3)
            tr6 r3 = r3.a()
            goto L_0x001e
        L_0x001d:
            r3 = r0
        L_0x001e:
            r1.e = r3
            if (r2 == 0) goto L_0x002a
            ur6 r2 = ur6.d(r2)
            tr6 r0 = r2.a()
        L_0x002a:
            r1.f = r0
            tr6 r2 = r1.e
            mn4 r3 = r1.a
            if (r2 != 0) goto L_0x0039
            if (r0 == 0) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            r3.h()
            goto L_0x003c
        L_0x0039:
            r3.g()
        L_0x003c:
            tr6 r2 = r1.e
            tr6 r3 = r1.f
            r1.a(r2, r3)
            r1.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gye.c(android.net.Uri, java.lang.String):void");
    }

    public final void d() {
        ywa a2 = a06.a.a();
        a2.g = this.b;
        a2.h = this.d;
        mn4 mn4 = this.a;
        a2.l = mn4.X;
        a2.k = true;
        mn4.i(a2.a());
    }

    public final void draw(Canvas canvas) {
        lfc e2 = this.a.e();
        if (e2 != null) {
            e2.draw(canvas);
        }
    }

    public final int getOpacity() {
        lfc e2 = this.a.e();
        if (e2 != null) {
            return e2.getOpacity();
        }
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        lfc e2 = this.a.e();
        if (e2 != null) {
            e2.setBounds(0, 0, rect.width(), rect.height());
        }
        a(this.e, this.f);
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        lfc e2 = this.a.e();
        if (e2 != null) {
            e2.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        lfc e2 = this.a.e();
        if (e2 != null) {
            e2.setColorFilter(colorFilter);
        }
    }

    public gye(Context context, Uri uri, String str) {
        this(context);
        c(uri, str);
    }
}
