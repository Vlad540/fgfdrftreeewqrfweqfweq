package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: c2f  reason: default package */
public final class c2f extends View {
    public static final /* synthetic */ k77[] H0;
    public static final TextPaint I0 = new TextPaint();
    public final int A0;
    public final b2f B0;
    public final b2f C0;
    public Drawable D0;
    public Layout E0;
    public final t97 F0;
    public final b2f G0;
    public final p97 a = ((p97) xv8.a.getAccessor().c(p97.class));
    public final float b = (dh4.c().getDisplayMetrics().density * 4.0f);
    public final int c;
    public final int o;
    public final int w0;
    public final int x0;
    public final float y0;
    public final t97 z0;

    static {
        Class<c2f> cls = c2f.class;
        H0 = new k77[]{new hc9(cls, "isBackgroundEnabled", "isBackgroundEnabled()Z"), c3d.g(m7c.a, cls, "isDrawableEnabled", "isDrawableEnabled()Z"), new hc9(cls, "text", "getText()Ljava/lang/CharSequence;")};
    }

    public c2f(Context context) {
        super(context);
        int X = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        this.c = X;
        this.o = getBackgroundColor();
        this.w0 = a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
        this.x0 = a24.X(((float) 3) * dh4.c().getDisplayMetrics().density);
        this.y0 = dh4.c().getDisplayMetrics().density * 10.0f;
        this.z0 = ez3.O(3, new opd(26));
        this.A0 = km4.y0.r(this).a().o().b.a;
        this.B0 = new b2f(this, 1);
        b2f b2f = new b2f(this, 2);
        this.C0 = b2f;
        this.F0 = ez3.O(3, new opd(27));
        this.G0 = new b2f(this, 0);
        setId(a7a.P);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setTranslationZ(Float.MAX_VALUE);
        TextPaint textPaint = I0;
        textPaint.setAntiAlias(true);
        nge nge = jp2.c;
        textPaint.setTextSize(ah4.c(nge.g(yq4.b), context));
        textPaint.setLetterSpacing(ah4.c(nge.e, context));
        textPaint.setTypeface(Typeface.create(Typeface.create(nge.f, 0), me4.b(nge.g)));
        setWillNotDraw(false);
        k77 k77 = H0[1];
        if (((Boolean) b2f.b).booleanValue()) {
            Drawable b2 = gq3.b(getContext(), phc.k2);
            b2.setBounds(0, 0, X, X);
            b2.setTint(getDrawableColor());
            this.D0 = b2;
        }
    }

    private final int getBackgroundColor() {
        return km4.y0.r(this).a().o().a.e;
    }

    /* access modifiers changed from: private */
    public final int getDrawableColor() {
        km4.y0.r(this).a().o().c.getClass();
        return -1;
    }

    /* access modifiers changed from: private */
    public final BoringLayout.Metrics getMetrics() {
        return (BoringLayout.Metrics) this.F0.getValue();
    }

    private final CharSequence getText() {
        k77 k77 = H0[2];
        return (CharSequence) this.G0.b;
    }

    private final void setText(CharSequence charSequence) {
        this.G0.o1(this, H0[2], charSequence);
    }

    /* JADX INFO: finally extract failed */
    public final void onDraw(Canvas canvas) {
        Layout layout = this.E0;
        if (layout != null) {
            layout.getPaint().setColor(this.A0);
            float height = ((float) (getHeight() - layout.getHeight())) * 0.5f;
            k77 k77 = H0[0];
            float f = 0.0f;
            if (((Boolean) this.B0.b).booleanValue()) {
                f = 0.0f + ((float) this.w0);
                t97 t97 = this.z0;
                ((Paint) t97.getValue()).setColor(this.o);
                float f2 = this.y0;
                canvas.drawRoundRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), f2, f2, (Paint) t97.getValue());
            }
            boolean w = xy6.w(this);
            float f3 = this.b;
            if (w) {
                int save = canvas.save();
                canvas.translate(f, height);
                try {
                    layout.draw(canvas);
                    canvas.restoreToCount(save);
                    Drawable drawable = this.D0;
                    if (drawable != null) {
                        int save2 = canvas.save();
                        canvas.translate(f + ((float) layout.getWidth()) + f3, ((float) (getHeight() - drawable.getBounds().height())) * 0.5f);
                        try {
                            drawable.draw(canvas);
                        } finally {
                            canvas.restoreToCount(save2);
                        }
                    }
                } catch (Throwable th) {
                    canvas.restoreToCount(save);
                    throw th;
                }
            } else {
                Drawable drawable2 = this.D0;
                if (drawable2 != null) {
                    int save3 = canvas.save();
                    canvas.translate(f, ((float) (getHeight() - drawable2.getBounds().height())) * 0.5f);
                    try {
                        drawable2.draw(canvas);
                        canvas.restoreToCount(save3);
                        f += ((float) drawable2.getBounds().width()) + f3;
                    } catch (Throwable th2) {
                        canvas.restoreToCount(save3);
                        throw th2;
                    }
                }
                int save4 = canvas.save();
                canvas.translate(f, height);
                try {
                    layout.draw(canvas);
                } finally {
                    canvas.restoreToCount(save4);
                }
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        Layout layout = this.E0;
        if (layout != null) {
            i4 = layout.getWidth();
            i3 = layout.getHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        Drawable drawable = this.D0;
        if (drawable != null) {
            i4 += drawable.getBounds().width() + a24.X(this.b);
            i3 = Math.max(i3, drawable.getBounds().height());
        }
        k77 k77 = H0[0];
        if (((Boolean) this.B0.b).booleanValue()) {
            i4 += this.w0 * 2;
            i3 += this.x0 * 2;
        }
        setMeasuredDimension(i4, i3);
    }

    public final void setBackgroundEnabled(boolean z) {
        this.B0.o1(this, H0[0], Boolean.valueOf(z));
    }

    public final void setContent(CharSequence charSequence) {
        setText(charSequence);
    }

    public final void setDrawableEnabled(boolean z) {
        this.C0.o1(this, H0[1], Boolean.valueOf(z));
    }
}
