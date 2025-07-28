package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import java.util.EnumMap;

/* renamed from: zd5  reason: default package */
public final class zd5 extends Drawable implements mhe {
    public final TextPaint X;
    public final t97 Y;
    public final BoringLayout.Metrics Z;
    public final Context a;
    public final yd5 b;
    public kc5 c;
    public final RectF o = new RectF();
    public BoringLayout w0;
    public final float x0;
    public float y0;

    public zd5(Context context, yd5 yd5) {
        this.a = context;
        this.b = yd5;
        TextPaint textPaint = new TextPaint();
        this.X = textPaint;
        this.Y = ez3.O(3, new xd3(27));
        this.Z = new BoringLayout.Metrics();
        this.x0 = 9.0f;
        long b2 = ah4.b(1, 9.0f);
        long b3 = ah4.b(1, 14.0f);
        long b4 = ah4.b(0, 0.03f);
        String str = nte.r.f;
        Class<yq4> cls = yq4.class;
        EnumMap enumMap = new EnumMap(cls);
        yq4 yq4 = yq4.b;
        c3d.k(b2, enumMap, yq4, cls).put(yq4, new ah4(b3));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        textPaint.setTypeface(Typeface.create(Typeface.create(str, 0), 500, false));
        textPaint.setLetterSpacing(ah4.d(b4, displayMetrics));
        ah4 ah4 = (ah4) enumMap.get(yq4);
        textPaint.setTextSize(ah4.d((ah4 == null ? (ah4) o23.U(enumMap.values()) : ah4).a, displayMetrics));
        textPaint.setLinearText(true);
        textPaint.setSubpixelText(true);
        textPaint.setAntiAlias(true);
        this.y0 = 1.0f;
    }

    public final boolean a(kc5 kc5) {
        if (this.c == kc5) {
            return false;
        }
        this.c = kc5;
        onThemeChanged(km4.y0.n(this.a).g());
        onBoundsChange(getBounds());
        invalidateSelf();
        return true;
    }

    /* JADX INFO: finally extract failed */
    public final void draw(Canvas canvas) {
        float f = dh4.c().getDisplayMetrics().density * 6.0f * this.y0;
        float f2 = dh4.c().getDisplayMetrics().density * 2.0f * this.y0;
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            this.b.draw(canvas);
            canvas.restoreToCount(save);
            float f3 = dh4.c().getDisplayMetrics().density * 4.0f * this.y0;
            RectF rectF = this.o;
            canvas.drawRoundRect(rectF, f3, f3, (Paint) this.Y.getValue());
            BoringLayout boringLayout = this.w0;
            if (boringLayout != null) {
                float g = us8.g(rectF.width(), (float) boringLayout.getWidth(), 0.5f, rectF.left);
                float g2 = us8.g(rectF.height(), (float) boringLayout.getHeight(), 0.5f, rectF.top);
                int save2 = canvas.save();
                canvas.translate(g, g2);
                try {
                    boringLayout.draw(canvas);
                } finally {
                    canvas.restoreToCount(save2);
                }
            }
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void invalidateSelf() {
        yd5 yd5 = this.b;
        if (yd5.getCallback() != getCallback()) {
            yd5.setCallback(getCallback());
        }
        yd5.invalidateSelf();
        super.invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        String str = "file";
        int width = rect.width();
        if (width != 0) {
            float f = (float) width;
            this.y0 = f / ((float) a24.X(((float) 40) * dh4.c().getDisplayMetrics().density));
            kc5 kc5 = this.c;
            if (kc5 != null) {
                this.b.setBounds(0, 0, a24.X(((float) a24.X(((float) 28) * dh4.c().getDisplayMetrics().density)) * this.y0), a24.X(((float) a24.X(((float) 36) * dh4.c().getDisplayMetrics().density)) * this.y0));
                RectF rectF = this.o;
                rectF.set(dh4.c().getDisplayMetrics().density * 4.0f * this.y0, dh4.c().getDisplayMetrics().density * 18.0f * this.y0, f - ((dh4.c().getDisplayMetrics().density * 4.0f) * this.y0), f - ((dh4.c().getDisplayMetrics().density * 8.0f) * this.y0));
                TextPaint textPaint = this.X;
                try {
                    textPaint.setTextSize(this.x0 * dh4.c().getDisplayMetrics().density * this.y0);
                    BoringLayout.Metrics metrics = this.Z;
                    textPaint.getFontMetricsInt(metrics);
                    this.w0 = BoringLayout.make(kc5 == kc5.UNKNOWN ? str : kc5.name(), textPaint, a24.X(rectF.width()), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, metrics, false);
                } catch (Throwable th) {
                    this.w0 = null;
                    String name = zd5.class.getName();
                    if (kc5 != kc5.UNKNOWN) {
                        str = kc5.name();
                    }
                    udd.s(name, "fail to generate boring layout for " + str, th);
                }
            }
        }
    }

    public final void onThemeChanged(pda pda) {
        kc5 kc5 = this.c;
        if (kc5 != null) {
            int i = pda.a().o().a.b.d;
            ec5 ec5 = kc5.a;
            this.b.a(i, pda.i(ec5.b), pda.i(ec5.c));
            ((Paint) this.Y.getValue()).setColor(pda.i(ec5.a));
            this.X.setColor(pda.i(ec5.o));
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
