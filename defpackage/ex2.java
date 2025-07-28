package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: ex2  reason: default package */
public final class ex2 extends lw7 implements Drawable.Callback, hfe {
    public static final int[] W1 = {16842910};
    public static final ShapeDrawable X1 = new ShapeDrawable(new OvalShape());
    public final ife A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public boolean H1;
    public int I1;
    public int J1 = 255;
    public ColorFilter K1;
    public PorterDuffColorFilter L1;
    public ColorStateList M1;
    public ColorStateList N0;
    public PorterDuff.Mode N1 = PorterDuff.Mode.SRC_IN;
    public ColorStateList O0;
    public int[] O1;
    public float P0;
    public boolean P1;
    public float Q0 = -1.0f;
    public ColorStateList Q1;
    public ColorStateList R0;
    public WeakReference R1 = new WeakReference((Object) null);
    public float S0;
    public TextUtils.TruncateAt S1;
    public ColorStateList T0;
    public boolean T1;
    public CharSequence U0;
    public int U1;
    public boolean V0;
    public boolean V1;
    public Drawable W0;
    public ColorStateList X0;
    public float Y0;
    public boolean Z0;
    public boolean a1;
    public Drawable b1;
    public RippleDrawable c1;
    public ColorStateList d1;
    public float e1;
    public SpannableStringBuilder f1;
    public boolean g1;
    public boolean h1;
    public Drawable i1;
    public ColorStateList j1;
    public q69 k1;
    public q69 l1;
    public float m1;
    public float n1;
    public float o1;
    public float p1;
    public float q1;
    public float r1;
    public float s1;
    public float t1;
    public final Context u1;
    public final Paint v1 = new Paint(1);
    public final Paint.FontMetrics w1 = new Paint.FontMetrics();
    public final RectF x1 = new RectF();
    public final PointF y1 = new PointF();
    public final Path z1 = new Path();

    public ex2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        j(context);
        this.u1 = context;
        ife ife = new ife(this);
        this.A1 = ife;
        this.U0 = BuildConfig.FLAVOR;
        ife.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = W1;
        setState(iArr);
        if (!Arrays.equals(this.O1, iArr)) {
            this.O1 = iArr;
            if (W()) {
                z(getState(), iArr);
            }
        }
        this.T1 = true;
        X1.setTint(-1);
    }

    public static void X(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public static boolean w(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean x(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z) {
        if (this.g1 != z) {
            this.g1 = z;
            float t = t();
            if (!z && this.H1) {
                this.H1 = false;
            }
            float t2 = t();
            invalidateSelf();
            if (t != t2) {
                y();
            }
        }
    }

    public final void B(Drawable drawable) {
        if (this.i1 != drawable) {
            float t = t();
            this.i1 = drawable;
            float t2 = t();
            X(this.i1);
            r(this.i1);
            invalidateSelf();
            if (t != t2) {
                y();
            }
        }
    }

    public final void C(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.j1 != colorStateList) {
            this.j1 = colorStateList;
            if (this.h1 && (drawable = this.i1) != null && this.g1) {
                um4.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void D(boolean z) {
        if (this.h1 != z) {
            boolean U = U();
            this.h1 = z;
            boolean U2 = U();
            if (U != U2) {
                if (U2) {
                    r(this.i1);
                } else {
                    X(this.i1);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void E(float f) {
        if (this.Q0 != f) {
            this.Q0 = f;
            buf e = this.a.a.e();
            e.e = new a0(f);
            e.f = new a0(f);
            e.g = new a0(f);
            e.h = new a0(f);
            setShapeAppearanceModel(e.c());
        }
    }

    public final void F(Drawable drawable) {
        Drawable drawable2 = this.W0;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof quf) {
            ((ruf) ((quf) drawable2)).getClass();
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float t = t();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.W0 = drawable3;
            float t2 = t();
            X(drawable2);
            if (V()) {
                r(this.W0);
            }
            invalidateSelf();
            if (t != t2) {
                y();
            }
        }
    }

    public final void G(float f) {
        if (this.Y0 != f) {
            float t = t();
            this.Y0 = f;
            float t2 = t();
            invalidateSelf();
            if (t != t2) {
                y();
            }
        }
    }

    public final void H(ColorStateList colorStateList) {
        this.Z0 = true;
        if (this.X0 != colorStateList) {
            this.X0 = colorStateList;
            if (V()) {
                um4.h(this.W0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void I(boolean z) {
        if (this.V0 != z) {
            boolean V = V();
            this.V0 = z;
            boolean V2 = V();
            if (V != V2) {
                if (V2) {
                    r(this.W0);
                } else {
                    X(this.W0);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        if (this.R0 != colorStateList) {
            this.R0 = colorStateList;
            if (this.V1) {
                n(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K(float f) {
        if (this.S0 != f) {
            this.S0 = f;
            this.v1.setStrokeWidth(f);
            if (this.V1) {
                this.a.k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void L(Drawable drawable) {
        Drawable drawable2 = this.b1;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof quf) {
            ((ruf) ((quf) drawable2)).getClass();
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float u = u();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.b1 = drawable3;
            ColorStateList colorStateList = this.T0;
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            this.c1 = new RippleDrawable(colorStateList, this.b1, X1);
            float u2 = u();
            X(drawable2);
            if (W()) {
                r(this.b1);
            }
            invalidateSelf();
            if (u != u2) {
                y();
            }
        }
    }

    public final void M(float f) {
        if (this.s1 != f) {
            this.s1 = f;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void N(float f) {
        if (this.e1 != f) {
            this.e1 = f;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void O(float f) {
        if (this.r1 != f) {
            this.r1 = f;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.d1 != colorStateList) {
            this.d1 = colorStateList;
            if (W()) {
                um4.h(this.b1, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Q(boolean z) {
        if (this.a1 != z) {
            boolean W = W();
            this.a1 = z;
            boolean W2 = W();
            if (W != W2) {
                if (W2) {
                    r(this.b1);
                } else {
                    X(this.b1);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void R(float f) {
        if (this.o1 != f) {
            float t = t();
            this.o1 = f;
            float t2 = t();
            invalidateSelf();
            if (t != t2) {
                y();
            }
        }
    }

    public final void S(float f) {
        if (this.n1 != f) {
            float t = t();
            this.n1 = f;
            float t2 = t();
            invalidateSelf();
            if (t != t2) {
                y();
            }
        }
    }

    public final void T(ColorStateList colorStateList) {
        if (this.T0 != colorStateList) {
            this.T0 = colorStateList;
            if (!this.P1) {
                colorStateList = null;
            } else if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            this.Q1 = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean U() {
        return this.h1 && this.i1 != null && this.H1;
    }

    public final boolean V() {
        return this.V0 && this.W0 != null;
    }

    public final boolean W() {
        return this.a1 && this.b1 != null;
    }

    public final void a() {
        y();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        int i;
        RectF rectF;
        int i2;
        int i3;
        int i4;
        RectF rectF2;
        int i5;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.J1) != 0) {
            int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i) : 0;
            boolean z = this.V1;
            Paint paint = this.v1;
            RectF rectF3 = this.x1;
            if (!z) {
                paint.setColor(this.B1);
                paint.setStyle(Paint.Style.FILL);
                rectF3.set(bounds);
                canvas2.drawRoundRect(rectF3, v(), v(), paint);
            }
            if (!this.V1) {
                paint.setColor(this.C1);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.K1;
                if (colorFilter == null) {
                    colorFilter = this.L1;
                }
                paint.setColorFilter(colorFilter);
                rectF3.set(bounds);
                canvas2.drawRoundRect(rectF3, v(), v(), paint);
            }
            if (this.V1) {
                super.draw(canvas);
            }
            if (this.S0 > 0.0f && !this.V1) {
                paint.setColor(this.E1);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.V1) {
                    ColorFilter colorFilter2 = this.K1;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.L1;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f = this.S0 / 2.0f;
                rectF3.set(((float) bounds.left) + f, ((float) bounds.top) + f, ((float) bounds.right) - f, ((float) bounds.bottom) - f);
                float f2 = this.Q0 - (this.S0 / 2.0f);
                canvas2.drawRoundRect(rectF3, f2, f2, paint);
            }
            paint.setColor(this.F1);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            if (!this.V1) {
                canvas2.drawRoundRect(rectF3, v(), v(), paint);
            } else {
                RectF rectF4 = new RectF(bounds);
                Path path = this.z1;
                kw7 kw7 = this.a;
                this.G0.d(kw7.a, kw7.j, rectF4, this.F0, path);
                f(canvas, paint, path, this.a.a, h());
            }
            if (V()) {
                s(bounds, rectF3);
                float f3 = rectF3.left;
                float f4 = rectF3.top;
                canvas2.translate(f3, f4);
                this.W0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.W0.draw(canvas2);
                canvas2.translate(-f3, -f4);
            }
            if (U()) {
                s(bounds, rectF3);
                float f5 = rectF3.left;
                float f6 = rectF3.top;
                canvas2.translate(f5, f6);
                this.i1.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.i1.draw(canvas2);
                canvas2.translate(-f5, -f6);
            }
            if (!this.T1 || this.U0 == null) {
                rectF = rectF3;
                i3 = saveLayerAlpha;
                i2 = 0;
                i4 = 255;
            } else {
                PointF pointF = this.y1;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.U0;
                ife ife = this.A1;
                if (charSequence != null) {
                    float t = t() + this.m1 + this.p1;
                    if (vm4.a(this) == 0) {
                        pointF.x = ((float) bounds.left) + t;
                    } else {
                        pointF.x = ((float) bounds.right) - t;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = ife.a;
                    Paint.FontMetrics fontMetrics = this.w1;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF3.setEmpty();
                if (this.U0 != null) {
                    float t2 = t() + this.m1 + this.p1;
                    float u = u() + this.t1 + this.q1;
                    if (vm4.a(this) == 0) {
                        rectF3.left = ((float) bounds.left) + t2;
                        rectF3.right = ((float) bounds.right) - u;
                    } else {
                        rectF3.left = ((float) bounds.left) + u;
                        rectF3.right = ((float) bounds.right) - t2;
                    }
                    rectF3.top = (float) bounds.top;
                    rectF3.bottom = (float) bounds.bottom;
                }
                afe afe = ife.g;
                TextPaint textPaint2 = ife.a;
                if (afe != null) {
                    textPaint2.drawableState = getState();
                    ife.g.e(this.u1, textPaint2, ife.b);
                }
                textPaint2.setTextAlign(align);
                boolean z2 = Math.round(ife.a(this.U0.toString())) > Math.round(rectF3.width());
                if (z2) {
                    i5 = canvas.save();
                    canvas2.clipRect(rectF3);
                } else {
                    i5 = 0;
                }
                CharSequence charSequence2 = this.U0;
                if (z2 && this.S1 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.S1);
                }
                CharSequence charSequence3 = charSequence2;
                rectF = rectF3;
                int length = charSequence3.length();
                i3 = saveLayerAlpha;
                float f7 = pointF.x;
                i2 = 0;
                float f8 = pointF.y;
                i4 = 255;
                canvas.drawText(charSequence3, 0, length, f7, f8, textPaint2);
                if (z2) {
                    canvas2.restoreToCount(i5);
                }
            }
            if (W()) {
                rectF.setEmpty();
                if (W()) {
                    float f9 = this.t1 + this.s1;
                    if (vm4.a(this) == 0) {
                        float f10 = ((float) bounds.right) - f9;
                        rectF2 = rectF;
                        rectF2.right = f10;
                        rectF2.left = f10 - this.e1;
                    } else {
                        rectF2 = rectF;
                        float f11 = ((float) bounds.left) + f9;
                        rectF2.left = f11;
                        rectF2.right = f11 + this.e1;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f12 = this.e1;
                    float f13 = exactCenterY - (f12 / 2.0f);
                    rectF2.top = f13;
                    rectF2.bottom = f13 + f12;
                } else {
                    rectF2 = rectF;
                }
                float f14 = rectF2.left;
                float f15 = rectF2.top;
                canvas2.translate(f14, f15);
                this.b1.setBounds(i2, i2, (int) rectF2.width(), (int) rectF2.height());
                this.c1.setBounds(this.b1.getBounds());
                this.c1.jumpToCurrentState();
                this.c1.draw(canvas2);
                canvas2.translate(-f14, -f15);
            }
            if (this.J1 < i4) {
                canvas2.restoreToCount(i3);
            }
        }
    }

    public final int getAlpha() {
        return this.J1;
    }

    public final ColorFilter getColorFilter() {
        return this.K1;
    }

    public final int getIntrinsicHeight() {
        return (int) this.P0;
    }

    public final int getIntrinsicWidth() {
        return Math.min(Math.round(u() + this.A1.a(this.U0.toString()) + t() + this.m1 + this.p1 + this.q1 + this.t1), this.U1);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        if (this.V1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.Q0);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.P0, this.Q0);
        }
        outline.setAlpha(((float) this.J1) / 255.0f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r0 = (r0 = r1.A1.g).j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.N0
            boolean r0 = w(r0)
            if (r0 != 0) goto L_0x005d
            android.content.res.ColorStateList r0 = r1.O0
            boolean r0 = w(r0)
            if (r0 != 0) goto L_0x005d
            android.content.res.ColorStateList r0 = r1.R0
            boolean r0 = w(r0)
            if (r0 != 0) goto L_0x005d
            boolean r0 = r1.P1
            if (r0 == 0) goto L_0x0024
            android.content.res.ColorStateList r0 = r1.Q1
            boolean r0 = w(r0)
            if (r0 != 0) goto L_0x005d
        L_0x0024:
            ife r0 = r1.A1
            afe r0 = r0.g
            if (r0 == 0) goto L_0x0035
            android.content.res.ColorStateList r0 = r0.j
            if (r0 == 0) goto L_0x0035
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0035
            goto L_0x005d
        L_0x0035:
            boolean r0 = r1.h1
            if (r0 == 0) goto L_0x0042
            android.graphics.drawable.Drawable r0 = r1.i1
            if (r0 == 0) goto L_0x0042
            boolean r0 = r1.g1
            if (r0 == 0) goto L_0x0042
            goto L_0x005d
        L_0x0042:
            android.graphics.drawable.Drawable r0 = r1.W0
            boolean r0 = x(r0)
            if (r0 != 0) goto L_0x005d
            android.graphics.drawable.Drawable r0 = r1.i1
            boolean r0 = x(r0)
            if (r0 != 0) goto L_0x005d
            android.content.res.ColorStateList r1 = r1.M1
            boolean r1 = w(r1)
            if (r1 == 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r1 = 0
            goto L_0x005e
        L_0x005d:
            r1 = 1
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex2.isStateful():boolean");
    }

    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (V()) {
            onLayoutDirectionChanged |= vm4.b(this.W0, i);
        }
        if (U()) {
            onLayoutDirectionChanged |= vm4.b(this.i1, i);
        }
        if (W()) {
            onLayoutDirectionChanged |= vm4.b(this.b1, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (V()) {
            onLevelChange |= this.W0.setLevel(i);
        }
        if (U()) {
            onLevelChange |= this.i1.setLevel(i);
        }
        if (W()) {
            onLevelChange |= this.b1.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.V1) {
            super.onStateChange(iArr);
        }
        return z(iArr, this.O1);
    }

    public final void r(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            vm4.b(drawable, vm4.a(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.b1) {
                if (drawable.isStateful()) {
                    drawable.setState(this.O1);
                }
                um4.h(drawable, this.d1);
                return;
            }
            Drawable drawable2 = this.W0;
            if (drawable == drawable2 && this.Z0) {
                um4.h(drawable2, this.X0);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void s(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (V() || U()) {
            float f = this.m1 + this.n1;
            Drawable drawable = this.H1 ? this.i1 : this.W0;
            float f2 = this.Y0;
            if (f2 <= 0.0f && drawable != null) {
                f2 = (float) drawable.getIntrinsicWidth();
            }
            if (vm4.a(this) == 0) {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = ((float) rect.right) - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            Drawable drawable2 = this.H1 ? this.i1 : this.W0;
            float f5 = this.Y0;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil((double) gwf.m(this.u1, 24));
                if (((float) drawable2.getIntrinsicHeight()) <= f5) {
                    f5 = (float) drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.J1 != i) {
            this.J1 = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.K1 != colorFilter) {
            this.K1 = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.M1 != colorStateList) {
            this.M1 = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.N1 != mode) {
            this.N1 = mode;
            ColorStateList colorStateList = this.M1;
            this.L1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (V()) {
            visible |= this.W0.setVisible(z, z2);
        }
        if (U()) {
            visible |= this.i1.setVisible(z, z2);
        }
        if (W()) {
            visible |= this.b1.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final float t() {
        if (!V() && !U()) {
            return 0.0f;
        }
        float f = this.n1;
        Drawable drawable = this.H1 ? this.i1 : this.W0;
        float f2 = this.Y0;
        if (f2 <= 0.0f && drawable != null) {
            f2 = (float) drawable.getIntrinsicWidth();
        }
        return f2 + f + this.o1;
    }

    public final float u() {
        if (W()) {
            return this.r1 + this.e1 + this.s1;
        }
        return 0.0f;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        return this.V1 ? this.a.a.e.a(h()) : this.Q0;
    }

    public final void y() {
        dx2 dx2 = (dx2) this.R1.get();
        if (dx2 != null) {
            Chip chip = (Chip) dx2;
            chip.d(chip.I0);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean z(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.N0;
        int d = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.B1) : 0);
        boolean z3 = true;
        if (this.B1 != d) {
            this.B1 = d;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.O0;
        int d2 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.C1) : 0);
        if (this.C1 != d2) {
            this.C1 = d2;
            onStateChange = true;
        }
        int f = j33.f(d2, d);
        if ((this.D1 != f) || (this.a.c == null)) {
            this.D1 = f;
            l(ColorStateList.valueOf(f));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.R0;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.E1) : 0;
        if (this.E1 != colorForState) {
            this.E1 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.Q1 == null || !lp.O(iArr)) ? 0 : this.Q1.getColorForState(iArr, this.F1);
        if (this.F1 != colorForState2) {
            this.F1 = colorForState2;
            if (this.P1) {
                onStateChange = true;
            }
        }
        afe afe = this.A1.g;
        int colorForState3 = (afe == null || (colorStateList = afe.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.G1);
        if (this.G1 != colorForState3) {
            this.G1 = colorForState3;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (state[i] != 16842912) {
                    i++;
                } else if (this.g1) {
                    z = true;
                }
            }
        }
        z = false;
        if (this.H1 == z || this.i1 == null) {
            z2 = false;
        } else {
            float t = t();
            this.H1 = z;
            if (t != t()) {
                onStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.M1;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.I1) : 0;
        if (this.I1 != colorForState4) {
            this.I1 = colorForState4;
            ColorStateList colorStateList6 = this.M1;
            PorterDuff.Mode mode = this.N1;
            this.L1 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            z3 = onStateChange;
        }
        if (x(this.W0)) {
            z3 |= this.W0.setState(iArr);
        }
        if (x(this.i1)) {
            z3 |= this.i1.setState(iArr);
        }
        if (x(this.b1)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z3 |= this.b1.setState(iArr3);
        }
        if (x(this.c1)) {
            z3 |= this.c1.setState(iArr2);
        }
        if (z3) {
            invalidateSelf();
        }
        if (z2) {
            y();
        }
        return z3;
    }
}
