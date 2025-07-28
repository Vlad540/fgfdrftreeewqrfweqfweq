package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: tb0  reason: default package */
public final class tb0 extends Drawable implements mhe {
    public static final /* synthetic */ k77[] y0;
    public static final int[][] z0 = oyb.b;
    public final Rect X = new Rect();
    public final char[] Y;
    public final t97 Z;
    public final gz9 a;
    public final int[] b;
    public final t97 c;
    public final t97 o;
    public final Drawable w0;
    public final sb0 x0;

    static {
        k77 hc9 = new hc9(tb0.class, "isGradientEnabled", "isGradientEnabled$common_release()Z");
        m7c.a.getClass();
        y0 = new k77[]{hc9};
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public tb0(defpackage.gz9 r7, defpackage.ub0 r8, defpackage.pda r9) {
        /*
            r6 = this;
            r6.<init>()
            r6.a = r7
            int[][] r7 = z0
            int r0 = r7.length
            long r0 = (long) r0
            long r2 = r8.a
            long r2 = r2 % r0
            long r0 = java.lang.Math.abs(r2)
            int r0 = (int) r0
            r7 = r7[r0]
            r6.b = r7
            rb0 r7 = new rb0
            r0 = 0
            r7.<init>(r0, r9)
            r0 = 3
            t97 r7 = ez3.O(r0, r7)
            r6.c = r7
            rb0 r7 = new rb0
            r1 = 1
            r7.<init>(r1, r9)
            t97 r7 = ez3.O(r0, r7)
            r6.o = r7
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.X = r7
            r7 = 2
            char[] r7 = new char[r7]
            r1 = 0
            r7[r1] = r1
            r2 = 1
            r7[r2] = r1
            java.lang.CharSequence r8 = r8.b
            int r3 = r8.length()
            r4 = 0
            if (r3 != 0) goto L_0x0048
            goto L_0x0077
        L_0x0048:
            java.lang.Character r3 = h0e.W(r1, r8)
            if (r3 == 0) goto L_0x005b
            char r3 = r3.charValue()
            char r3 = java.lang.Character.toUpperCase(r3)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            goto L_0x005c
        L_0x005b:
            r3 = r4
        L_0x005c:
            java.lang.Character r5 = h0e.W(r2, r8)
            if (r5 == 0) goto L_0x006b
            char r5 = r5.charValue()
            char r5 = java.lang.Character.toUpperCase(r5)
            goto L_0x006c
        L_0x006b:
            r5 = r1
        L_0x006c:
            if (r3 != 0) goto L_0x006f
            goto L_0x0077
        L_0x006f:
            char r3 = r3.charValue()
            r7[r1] = r3
            r7[r2] = r5
        L_0x0077:
            r6.Y = r7
            m r7 = new m
            r2 = 14
            r7.<init>(r2)
            t97 r7 = ez3.O(r0, r7)
            r6.Z = r7
            sb0 r7 = new sb0
            r7.<init>((defpackage.tb0) r6, (defpackage.pda) r9)
            r6.x0 = r7
            int r7 = r8.length()
            boolean r9 = r8 instanceof android.text.Spanned     // Catch:{ all -> 0x00a2 }
            if (r9 == 0) goto L_0x0098
            android.text.Spanned r8 = (android.text.Spanned) r8     // Catch:{ all -> 0x00a2 }
            goto L_0x0099
        L_0x0098:
            r8 = r4
        L_0x0099:
            if (r8 == 0) goto L_0x00a2
            java.lang.Class<yld> r9 = defpackage.yld.class
            java.lang.Object[] r7 = r8.getSpans(r1, r7, r9)     // Catch:{ all -> 0x00a2 }
            goto L_0x00a3
        L_0x00a2:
            r7 = r4
        L_0x00a3:
            yld[] r7 = (defpackage.yld[]) r7
            if (r7 == 0) goto L_0x00b3
            java.lang.Object r7 = cs.Y(r7)
            yld r7 = (defpackage.yld) r7
            if (r7 == 0) goto L_0x00b3
            android.graphics.drawable.Drawable r4 = r7.b()
        L_0x00b3:
            r6.w0 = r4
            gz9 r7 = r6.a
            boolean r7 = r7 instanceof defpackage.fz9
            if (r7 == 0) goto L_0x00ca
            t97 r7 = r6.Z
            java.lang.Object r7 = r7.getValue()
            android.graphics.Path r7 = (android.graphics.Path) r7
            android.graphics.Rect r8 = r6.getBounds()
            defpackage.oad.a(r7, r8)
        L_0x00ca:
            r6.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb0.<init>(gz9, ub0, pda):void");
    }

    public final Paint a() {
        return (Paint) this.c.getValue();
    }

    public final Paint b() {
        return (Paint) this.o.getValue();
    }

    public final void c() {
        LinearGradient linearGradient;
        Paint a2 = a();
        k77 k77 = y0[0];
        if (((Boolean) this.x0.b).booleanValue()) {
            linearGradient = new LinearGradient((float) getBounds().left, (float) getBounds().top, (float) getBounds().right, (float) getBounds().bottom, this.b, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            linearGradient = null;
        }
        a2.setShader(linearGradient);
    }

    public final void draw(Canvas canvas) {
        gz9 gz9 = this.a;
        if (gz9 instanceof dz9) {
            canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), ((float) getBounds().width()) / 2.0f, a());
        } else if (gz9 instanceof fz9) {
            canvas.drawPath((Path) this.Z.getValue(), a());
        } else if (!hhd.f(gz9, ez9.a)) {
            throw new NoWhenBranchMatchedException();
        }
        b().setTextSize(((float) getBounds().height()) * 0.33f);
        Paint b2 = b();
        char[] cArr = this.Y;
        int length = cArr.length;
        Rect rect = this.X;
        b2.getTextBounds(cArr, 0, length, rect);
        float exactCenterX = getBounds().exactCenterX() - rect.exactCenterX();
        float exactCenterY = getBounds().exactCenterY() - rect.exactCenterY();
        Drawable drawable = this.w0;
        if (drawable != null) {
            int i = b().getFontMetricsInt().descent - b().getFontMetricsInt().ascent;
            drawable.setBounds(0, 0, i, i);
            float exactCenterX2 = getBounds().exactCenterX() - ((float) (drawable.getBounds().width() / 2));
            float exactCenterY2 = getBounds().exactCenterY() - ((float) (drawable.getBounds().height() / 2));
            int save = canvas.save();
            canvas.translate(exactCenterX2, exactCenterY2);
            try {
                drawable.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            canvas.drawText(cArr, 0, cArr.length, exactCenterX, exactCenterY, b());
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        if (this.a instanceof fz9) {
            oad.a((Path) this.Z.getValue(), rect);
        }
        c();
        invalidateSelf();
    }

    public final void onThemeChanged(pda pda) {
        k77 k77 = y0[0];
        if (!((Boolean) this.x0.b).booleanValue()) {
            b().setColor(pda.getText().e);
            a().setColor(pda.b().j);
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        a().setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        a().setColorFilter(colorFilter);
        invalidateSelf();
    }
}
