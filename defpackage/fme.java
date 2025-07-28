package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;

/* renamed from: fme  reason: default package */
public final class fme extends lw7 implements hfe {
    public CharSequence N0;
    public final Context O0;
    public final Paint.FontMetrics P0 = new Paint.FontMetrics();
    public final ife Q0;
    public final mp0 R0;
    public final Rect S0;
    public int T0;
    public int U0;
    public int V0;
    public int W0;
    public boolean X0;
    public int Y0;
    public int Z0;
    public float a1;
    public float b1;
    public float c1;
    public float d1;

    public fme(Context context, int i) {
        super(context, (AttributeSet) null, 0, i);
        ife ife = new ife(this);
        this.Q0 = ife;
        this.R0 = new mp0(14, this);
        this.S0 = new Rect();
        this.a1 = 1.0f;
        this.b1 = 1.0f;
        this.c1 = 0.5f;
        this.d1 = 1.0f;
        this.O0 = context;
        TextPaint textPaint = ife.a;
        textPaint.density = context.getResources().getDisplayMetrics().density;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        float r = r();
        double sqrt = Math.sqrt(2.0d);
        canvas.scale(this.a1, this.b1, (((float) getBounds().width()) * 0.5f) + ((float) getBounds().left), (((float) getBounds().height()) * this.c1) + ((float) getBounds().top));
        canvas.translate(r, (float) (-((sqrt * ((double) this.Y0)) - ((double) this.Y0))));
        super.draw(canvas);
        if (this.N0 != null) {
            Rect bounds = getBounds();
            ife ife = this.Q0;
            TextPaint textPaint = ife.a;
            Paint.FontMetrics fontMetrics = this.P0;
            textPaint.getFontMetrics(fontMetrics);
            int centerY = (int) (((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            afe afe = ife.g;
            TextPaint textPaint2 = ife.a;
            if (afe != null) {
                textPaint2.drawableState = getState();
                ife.g.e(this.O0, textPaint2, ife.b);
                textPaint2.setAlpha((int) (this.d1 * 255.0f));
            }
            CharSequence charSequence = this.N0;
            canvas.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) centerY, textPaint2);
        }
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return (int) Math.max(this.Q0.a.getTextSize(), (float) this.V0);
    }

    public final int getIntrinsicWidth() {
        float f = (float) (this.T0 * 2);
        CharSequence charSequence = this.N0;
        return (int) Math.max(f + (charSequence == null ? 0.0f : this.Q0.a(charSequence.toString())), (float) this.U0);
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.X0) {
            buf e = this.a.a.e();
            e.k = s();
            setShapeAppearanceModel(e.c());
        }
    }

    public final float r() {
        int i;
        Rect rect = this.S0;
        if (((rect.right - getBounds().right) - this.Z0) - this.W0 < 0) {
            i = ((rect.right - getBounds().right) - this.Z0) - this.W0;
        } else if (((rect.left - getBounds().left) - this.Z0) + this.W0 <= 0) {
            return 0.0f;
        } else {
            i = ((rect.left - getBounds().left) - this.Z0) + this.W0;
        }
        return (float) i;
    }

    public final ew9 s() {
        float width = ((float) (((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.Y0)))) / 2.0f;
        return new ew9(new bv7((float) this.Y0), Math.min(Math.max(-r(), -width), width));
    }
}
