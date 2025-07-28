package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;

/* renamed from: afe  reason: default package */
public final class afe {
    public final ColorStateList a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;
    public ColorStateList j;
    public float k;
    public final int l;
    public boolean m = false;
    public Typeface n;

    public afe(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, xvb.TextAppearance);
        this.k = obtainStyledAttributes.getDimension(xvb.TextAppearance_android_textSize, 0.0f);
        this.j = wx3.i(context, obtainStyledAttributes, xvb.TextAppearance_android_textColor);
        wx3.i(context, obtainStyledAttributes, xvb.TextAppearance_android_textColorHint);
        wx3.i(context, obtainStyledAttributes, xvb.TextAppearance_android_textColorLink);
        this.c = obtainStyledAttributes.getInt(xvb.TextAppearance_android_textStyle, 0);
        this.d = obtainStyledAttributes.getInt(xvb.TextAppearance_android_typeface, 1);
        int i3 = xvb.TextAppearance_fontFamily;
        i3 = !obtainStyledAttributes.hasValue(i3) ? xvb.TextAppearance_android_fontFamily : i3;
        this.l = obtainStyledAttributes.getResourceId(i3, 0);
        this.b = obtainStyledAttributes.getString(i3);
        obtainStyledAttributes.getBoolean(xvb.TextAppearance_textAllCaps, false);
        this.a = wx3.i(context, obtainStyledAttributes, xvb.TextAppearance_android_shadowColor);
        this.e = obtainStyledAttributes.getFloat(xvb.TextAppearance_android_shadowDx, 0.0f);
        this.f = obtainStyledAttributes.getFloat(xvb.TextAppearance_android_shadowDy, 0.0f);
        this.g = obtainStyledAttributes.getFloat(xvb.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i2, xvb.MaterialTextAppearance);
        this.h = obtainStyledAttributes2.hasValue(xvb.MaterialTextAppearance_android_letterSpacing);
        this.i = obtainStyledAttributes2.getFloat(xvb.MaterialTextAppearance_android_letterSpacing, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.n;
        int i2 = this.c;
        if (typeface == null && (str = this.b) != null) {
            this.n = Typeface.create(str, i2);
        }
        if (this.n == null) {
            int i3 = this.d;
            if (i3 == 1) {
                this.n = Typeface.SANS_SERIF;
            } else if (i3 == 2) {
                this.n = Typeface.SERIF;
            } else if (i3 != 3) {
                this.n = Typeface.DEFAULT;
            } else {
                this.n = Typeface.MONOSPACE;
            }
            this.n = Typeface.create(this.n, i2);
        }
    }

    public final Typeface b(Context context) {
        if (this.m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = ubc.a(context, this.l);
                this.n = a2;
                if (a2 != null) {
                    this.n = Typeface.create(a2, this.c);
                }
            } catch (Resources.NotFoundException | Exception | UnsupportedOperationException unused) {
            }
        }
        a();
        this.m = true;
        return this.n;
    }

    public final void c(Context context, hwf hwf) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i2 = this.l;
        if (i2 == 0) {
            this.m = true;
        }
        if (this.m) {
            hwf.q(this.n, true);
            return;
        }
        try {
            yee yee = new yee(this, hwf);
            ThreadLocal threadLocal = ubc.a;
            if (context.isRestricted()) {
                yee.e(-4);
                return;
            }
            ubc.b(context, i2, new TypedValue(), 0, yee, false, false);
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            hwf.p(1);
        } catch (Exception unused2) {
            this.m = true;
            hwf.p(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i2 = this.l;
        if (i2 != 0) {
            ThreadLocal threadLocal = ubc.a;
            if (!context.isRestricted()) {
                typeface = ubc.b(context, i2, new TypedValue(), 0, (vx3) null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, hwf hwf) {
        f(context, textPaint, hwf);
        ColorStateList colorStateList = this.j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(this.g, this.e, this.f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, hwf hwf) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.n);
        c(context, new zee(this, context, textPaint, hwf));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface w = r1g.w(context.getResources().getConfiguration(), typeface);
        if (w != null) {
            typeface = w;
        }
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.c;
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
