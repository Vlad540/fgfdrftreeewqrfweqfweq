package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: h04  reason: default package */
public final class h04 extends View {
    public static final /* synthetic */ k77[] H0;
    public static final TextPaint I0 = new TextPaint();
    public final g04 A0 = new g04(this, 1);
    public dcf B0 = dcf.None;
    public Drawable C0;
    public Layout D0;
    public final t97 E0 = ez3.O(3, new xd3(12));
    public final g04 F0 = new g04(this, 0);
    public final tb9 G0;
    public final float a = (dh4.c().getDisplayMetrics().density * 4.0f);
    public final int b = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
    public int c;
    public final int o = a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
    public final int w0 = a24.X(((float) 3) * dh4.c().getDisplayMetrics().density);
    public final float x0 = (dh4.c().getDisplayMetrics().density * 10.0f);
    public final t97 y0 = ez3.O(3, new xd3(11));
    public int z0 = -1;

    static {
        Class<h04> cls = h04.class;
        H0 = new k77[]{new hc9(cls, "isBackgroundEnabled", "isBackgroundEnabled$message_list_release()Z"), c3d.g(m7c.a, cls, "text", "getText()Ljava/lang/CharSequence;")};
    }

    public h04(Context context) {
        super(context);
        setId(a7a.K);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setTranslationZ(Float.MAX_VALUE);
        TextPaint textPaint = I0;
        textPaint.setAntiAlias(true);
        nge nge = jp2.c;
        textPaint.setTextSize(ah4.c(nge.g(yq4.b), context));
        textPaint.setLetterSpacing(ah4.c(nge.e, context));
        textPaint.setTypeface(Typeface.create(Typeface.create(nge.f, 0), me4.b(nge.g)));
        setWillNotDraw(false);
        this.G0 = new tb9(dcf.w0.getSize());
    }

    /* access modifiers changed from: private */
    public final BoringLayout.Metrics getMetrics() {
        return (BoringLayout.Metrics) this.E0.getValue();
    }

    private final CharSequence getText() {
        k77 k77 = H0[1];
        return (CharSequence) this.F0.b;
    }

    private final int getViewStatusTintColor() {
        int i = f04.$EnumSwitchMapping$0[this.B0.ordinal()];
        s59 s59 = km4.y0;
        if (i != 1) {
            return b() ? s59.r(this).a().f().c.b : s59.r(this).a().f().c.a;
        }
        s59.r(this).a().f().c.getClass();
        return -1685946;
    }

    private final void setText(CharSequence charSequence) {
        this.F0.o1(this, H0[1], charSequence);
    }

    public final boolean b() {
        k77 k77 = H0[0];
        return ((Boolean) this.A0.b).booleanValue();
    }

    public final void c(CharSequence charSequence, boolean z) {
        if (z) {
            charSequence = new SpannableStringBuilder(getContext().getString(c7a.N0)).append(" · ").append(charSequence);
        }
        setText(charSequence);
    }

    public final void d(dcf dcf) {
        Drawable drawable = this.C0;
        if (drawable == null) {
            return;
        }
        if (dcf == dcf.Error) {
            EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
            if (enhancedVectorDrawable != null) {
                xs7.P(enhancedVectorDrawable, "error", getViewStatusTintColor());
                return;
            }
            return;
        }
        drawable.setTint(getViewStatusTintColor());
    }

    /* JADX INFO: finally extract failed */
    public final void onDraw(Canvas canvas) {
        Layout layout = this.D0;
        if (layout != null) {
            layout.getPaint().setColor(this.z0);
            float height = ((float) (getHeight() - layout.getHeight())) * 0.5f;
            float f = 0.0f;
            if (b()) {
                f = 0.0f + ((float) this.o);
                t97 t97 = this.y0;
                ((Paint) t97.getValue()).setColor(this.c);
                float f2 = this.x0;
                canvas.drawRoundRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), f2, f2, (Paint) t97.getValue());
            }
            boolean w = xy6.w(this);
            float f3 = this.a;
            if (w) {
                Drawable drawable = this.C0;
                if (drawable != null) {
                    int save = canvas.save();
                    canvas.translate(f, ((float) (getHeight() - drawable.getBounds().height())) * 0.5f);
                    try {
                        drawable.draw(canvas);
                        canvas.restoreToCount(save);
                        f += ((float) drawable.getBounds().width()) + f3;
                    } catch (Throwable th) {
                        canvas.restoreToCount(save);
                        throw th;
                    }
                }
                int save2 = canvas.save();
                canvas.translate(f, height);
                try {
                    layout.draw(canvas);
                } finally {
                    canvas.restoreToCount(save2);
                }
            } else {
                int save3 = canvas.save();
                canvas.translate(f, height);
                try {
                    layout.draw(canvas);
                    canvas.restoreToCount(save3);
                    Drawable drawable2 = this.C0;
                    if (drawable2 != null) {
                        int save4 = canvas.save();
                        canvas.translate(f + ((float) layout.getWidth()) + f3, ((float) (getHeight() - drawable2.getBounds().height())) * 0.5f);
                        try {
                            drawable2.draw(canvas);
                        } finally {
                            canvas.restoreToCount(save4);
                        }
                    }
                } catch (Throwable th2) {
                    canvas.restoreToCount(save3);
                    throw th2;
                }
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        Layout layout = this.D0;
        if (layout != null) {
            i3 = layout.getWidth();
            i4 = layout.getHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        Drawable drawable = this.C0;
        if (drawable != null) {
            i3 += drawable.getBounds().width() + a24.X(this.a);
            i4 = Math.max(i4, drawable.getBounds().height());
        }
        if (b()) {
            i3 += this.o * 2;
            i4 += this.w0 * 2;
        }
        setMeasuredDimension(i3, i4);
    }

    public void setBackgroundColor(int i) {
        if (this.c != i) {
            this.c = i;
            invalidate();
        }
    }

    public final void setBackgroundEnabled$message_list_release(boolean z) {
        this.A0.o1(this, H0[0], Boolean.valueOf(z));
    }

    public final void setStatus$message_list_release(dcf dcf) {
        Drawable drawable;
        this.B0 = dcf;
        Integer num = dcf.a;
        if (num == null) {
            drawable = null;
        } else {
            int intValue = num.intValue();
            tb9 tb9 = this.G0;
            Object c2 = tb9.c(intValue);
            if (c2 == null) {
                if (this.B0 == dcf.Error) {
                    c2 = new EnhancedVectorDrawable(getContext(), num.intValue());
                } else {
                    c2 = gq3.b(getContext(), num.intValue());
                }
                int a2 = tb9.a(intValue);
                tb9.b[a2] = intValue;
                tb9.c[a2] = c2;
            }
            drawable = (Drawable) c2;
        }
        boolean z = !hhd.f(this.C0, drawable);
        if (drawable != null) {
            int i = this.b;
            drawable.setBounds(0, 0, i, i);
        }
        this.C0 = drawable;
        d(dcf);
        invalidate();
        if (z) {
            requestLayout();
        }
    }

    public final void setTextColor$message_list_release(int i) {
        if (this.z0 != i) {
            this.z0 = i;
            I0.setColor(i);
            d(this.B0);
            invalidate();
        }
    }
}
