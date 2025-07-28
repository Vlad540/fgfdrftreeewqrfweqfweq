package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: we0  reason: default package */
public final class we0 extends Drawable implements hfe {
    public static final int C0 = kvb.Widget_MaterialComponents_Badge;
    public static final int D0 = wlb.badgeStyle;
    public WeakReference A0;
    public WeakReference B0;
    public final ye0 X;
    public float Y;
    public float Z;
    public final WeakReference a;
    public final lw7 b;
    public final ife c;
    public final Rect o = new Rect();
    public final int w0;
    public float x0;
    public float y0;
    public float z0;

    public we0(int i, int i2, Context context) {
        afe afe;
        WeakReference weakReference = new WeakReference(context);
        this.a = weakReference;
        she.c(context, she.b, "Theme.MaterialComponents");
        ife ife = new ife(this);
        this.c = ife;
        TextPaint textPaint = ife.a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        ye0 ye0 = new ye0(i, i2, context);
        this.X = ye0;
        boolean e = e();
        xe0 xe0 = ye0.b;
        lw7 lw7 = new lw7(ead.a(context, e ? xe0.Z.intValue() : xe0.X.intValue(), e() ? xe0.w0.intValue() : xe0.Y.intValue(), new a0((float) 0)).c());
        this.b = lw7;
        g();
        Context context2 = (Context) weakReference.get();
        if (!(context2 == null || ife.g == (afe = new afe(context2, xe0.o.intValue())))) {
            ife.c(afe, context2);
            textPaint.setColor(xe0.c.intValue());
            invalidateSelf();
            i();
            invalidateSelf();
        }
        int i3 = xe0.A0;
        if (i3 != -2) {
            this.w0 = ((int) Math.pow(10.0d, ((double) i3) - 1.0d)) - 1;
        } else {
            this.w0 = xe0.B0;
        }
        ife.e = true;
        i();
        invalidateSelf();
        ife.e = true;
        g();
        i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(xe0.b.intValue());
        if (lw7.a.c != valueOf) {
            lw7.l(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(xe0.c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.A0;
        if (!(weakReference2 == null || weakReference2.get() == null)) {
            View view = (View) this.A0.get();
            WeakReference weakReference3 = this.B0;
            h(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        i();
        setVisible(xe0.I0.booleanValue(), false);
    }

    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        ye0 ye0 = this.X;
        xe0 xe0 = ye0.b;
        String str = xe0.y0;
        boolean z = str != null;
        WeakReference weakReference = this.a;
        if (z) {
            int i = xe0.A0;
            if (i == -2 || str == null || str.length() <= i) {
                return str;
            }
            Context context = (Context) weakReference.get();
            if (context == null) {
                return BuildConfig.FLAVOR;
            }
            return String.format(context.getString(wsb.m3_exceed_max_badge_text_suffix), new Object[]{str.substring(0, i - 1), "…"});
        } else if (!f()) {
            return null;
        } else {
            int i2 = this.w0;
            xe0 xe02 = ye0.b;
            if (i2 == -2 || d() <= this.w0) {
                return NumberFormat.getInstance(xe02.C0).format((long) d());
            }
            Context context2 = (Context) weakReference.get();
            return context2 == null ? BuildConfig.FLAVOR : String.format(xe02.C0, context2.getString(wsb.mtrl_exceed_max_badge_number_suffix), new Object[]{Integer.valueOf(this.w0), "+"});
        }
    }

    public final FrameLayout c() {
        WeakReference weakReference = this.B0;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int d() {
        int i = this.X.b.z0;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final void draw(Canvas canvas) {
        String b2;
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.b.draw(canvas);
            if (e() && (b2 = b()) != null) {
                Rect rect = new Rect();
                ife ife = this.c;
                ife.a.getTextBounds(b2, 0, b2.length(), rect);
                float exactCenterY = this.Z - rect.exactCenterY();
                canvas.drawText(b2, this.Y, (float) (rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY)), ife.a);
            }
        }
    }

    public final boolean e() {
        return this.X.b.y0 != null || f();
    }

    public final boolean f() {
        xe0 xe0 = this.X.b;
        return xe0.y0 == null && xe0.z0 != -1;
    }

    public final void g() {
        Context context = (Context) this.a.get();
        if (context != null) {
            boolean e = e();
            ye0 ye0 = this.X;
            this.b.setShapeAppearanceModel(ead.a(context, e ? ye0.b.Z.intValue() : ye0.b.X.intValue(), e() ? ye0.b.w0.intValue() : ye0.b.Y.intValue(), new a0((float) 0)).c());
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        return this.X.b.x0;
    }

    public final int getIntrinsicHeight() {
        return this.o.height();
    }

    public final int getIntrinsicWidth() {
        return this.o.width();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void h(View view, FrameLayout frameLayout) {
        this.A0 = new WeakReference(view);
        this.B0 = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        i();
        invalidateSelf();
    }

    public final void i() {
        float f;
        float f2;
        float f3;
        WeakReference weakReference = this.a;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.A0;
        ViewGroup viewGroup = null;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            Rect rect2 = this.o;
            rect.set(rect2);
            Rect rect3 = new Rect();
            view.getDrawingRect(rect3);
            WeakReference weakReference3 = this.B0;
            if (weakReference3 != null) {
                viewGroup = (ViewGroup) weakReference3.get();
            }
            if (viewGroup != null) {
                viewGroup.offsetDescendantRectToMyCoords(view, rect3);
            }
            boolean e = e();
            ye0 ye0 = this.X;
            float f4 = e ? ye0.d : ye0.c;
            this.x0 = f4;
            if (f4 != -1.0f) {
                this.y0 = f4;
                this.z0 = f4;
            } else {
                this.y0 = (float) Math.round((e() ? ye0.g : ye0.e) / 2.0f);
                this.z0 = (float) Math.round((e() ? ye0.h : ye0.f) / 2.0f);
            }
            if (e()) {
                String b2 = b();
                float f5 = this.y0;
                ife ife = this.c;
                this.y0 = Math.max(f5, (ife.a(b2) / 2.0f) + ((float) ye0.b.J0.intValue()));
                float f6 = this.z0;
                if (!ife.e) {
                    f3 = ife.d;
                } else {
                    ife.b(b2);
                    f3 = ife.d;
                }
                float max = Math.max(f6, (f3 / 2.0f) + ((float) ye0.b.K0.intValue()));
                this.z0 = max;
                this.y0 = Math.max(this.y0, max);
            }
            int intValue = ye0.b.M0.intValue();
            boolean e2 = e();
            xe0 xe0 = ye0.b;
            if (e2) {
                intValue = xe0.O0.intValue();
                Context context2 = (Context) weakReference.get();
                if (context2 != null) {
                    intValue = og.c(intValue, og.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), intValue - xe0.R0.intValue());
                }
            }
            int i = ye0.k;
            if (i == 0) {
                intValue -= Math.round(this.z0);
            }
            int intValue2 = xe0.Q0.intValue() + intValue;
            int intValue3 = xe0.H0.intValue();
            if (intValue3 == 8388691 || intValue3 == 8388693) {
                this.Z = (float) (rect3.bottom - intValue2);
            } else {
                this.Z = (float) (rect3.top + intValue2);
            }
            int intValue4 = e() ? xe0.N0.intValue() : xe0.L0.intValue();
            if (i == 1) {
                intValue4 += e() ? ye0.j : ye0.i;
            }
            int intValue5 = xe0.P0.intValue() + intValue4;
            int intValue6 = xe0.H0.intValue();
            if (intValue6 == 8388659 || intValue6 == 8388691) {
                WeakHashMap weakHashMap = eaf.a;
                this.Y = view.getLayoutDirection() == 0 ? (((float) rect3.left) - this.y0) + ((float) intValue5) : (((float) rect3.right) + this.y0) - ((float) intValue5);
            } else {
                WeakHashMap weakHashMap2 = eaf.a;
                this.Y = view.getLayoutDirection() == 0 ? (((float) rect3.right) + this.y0) - ((float) intValue5) : (((float) rect3.left) - this.y0) + ((float) intValue5);
            }
            if (xe0.S0.booleanValue()) {
                View c2 = c();
                if (c2 != null) {
                    FrameLayout c3 = c();
                    if (c3 == null || c3.getId() != lob.mtrl_anchor_parent) {
                        f2 = 0.0f;
                        f = 0.0f;
                    } else if (c2.getParent() instanceof View) {
                        f2 = c2.getY();
                        f = c2.getX();
                        c2 = (View) c2.getParent();
                    }
                } else if (view.getParent() instanceof View) {
                    float y = view.getY();
                    f = view.getX();
                    View view2 = (View) view.getParent();
                    f2 = y;
                    c2 = view2;
                }
                float y2 = c2.getY() + (this.Z - this.z0) + f2;
                float x = c2.getX() + (this.Y - this.y0) + f;
                float height = c2.getParent() instanceof View ? ((this.Z + this.z0) - (((float) ((View) c2.getParent()).getHeight()) - c2.getY())) + f2 : 0.0f;
                float width = c2.getParent() instanceof View ? ((this.Y + this.y0) - (((float) ((View) c2.getParent()).getWidth()) - c2.getX())) + f : 0.0f;
                if (y2 < 0.0f) {
                    this.Z = Math.abs(y2) + this.Z;
                }
                if (x < 0.0f) {
                    this.Y = Math.abs(x) + this.Y;
                }
                if (height > 0.0f) {
                    this.Z -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.Y -= Math.abs(width);
                }
            }
            float f7 = this.Y;
            float f8 = this.Z;
            float f9 = this.y0;
            float f10 = this.z0;
            rect2.set((int) (f7 - f9), (int) (f8 - f10), (int) (f7 + f9), (int) (f8 + f10));
            float f11 = this.x0;
            int i2 = (f11 > -1.0f ? 1 : (f11 == -1.0f ? 0 : -1));
            lw7 lw7 = this.b;
            if (i2 != 0) {
                buf e3 = lw7.a.a.e();
                e3.e = new a0(f11);
                e3.f = new a0(f11);
                e3.g = new a0(f11);
                e3.h = new a0(f11);
                lw7.setShapeAppearanceModel(e3.c());
            }
            if (!rect.equals(rect2)) {
                lw7.setBounds(rect2);
            }
        }
    }

    public final boolean isStateful() {
        return false;
    }

    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final void setAlpha(int i) {
        ye0 ye0 = this.X;
        ye0.a.x0 = i;
        ye0.b.x0 = i;
        this.c.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
