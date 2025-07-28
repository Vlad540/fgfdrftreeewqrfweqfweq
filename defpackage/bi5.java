package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import android.widget.TextView;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: bi5  reason: default package */
public class bi5 extends ImageSpan implements dbf, mhe {
    public final Rect X;
    public final WeakHashMap Y;
    public final vh5 a;
    public final boolean b;
    public final RectF c;
    public final RectF o;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bi5(Drawable drawable, vh5 vh5, int i) {
        this(drawable, (i & 2) != 0 ? vh5.b : vh5, true);
    }

    public final void c(TextView textView) {
        WeakHashMap weakHashMap = this.Y;
        weakHashMap.remove(textView);
        if (weakHashMap.isEmpty()) {
            Drawable drawable = getDrawable();
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null) {
                animatable.stop();
            }
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        canvas.translate(f, (float) i3);
        canvas.clipRect(this.c);
        getDrawable().draw(canvas);
        canvas.restore();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.bi5) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.bi5
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            bi5 r5 = (defpackage.bi5) r5
            vh5 r1 = r5.a
            vh5 r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            android.graphics.drawable.Drawable r4 = r4.getDrawable()
            android.graphics.drawable.Drawable r5 = r5.getDrawable()
            boolean r4 = hhd.f(r4, r5)
            if (r4 != 0) goto L_0x0022
            return r2
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi5.equals(java.lang.Object):boolean");
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        float f2;
        float f3;
        float f4;
        Drawable drawable = getDrawable();
        RectF rectF = this.c;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            float f5 = (float) (fontMetricsInt2.descent - fontMetricsInt2.ascent);
            rectF.set(0.0f, 0.0f, f5, f5);
            RectF rectF2 = this.o;
            rectF2.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            float width = rectF2.width() == -1.0f ? rectF.width() : rectF2.width();
            float height = rectF2.height() == -1.0f ? rectF.height() : rectF2.height();
            int i3 = ai5.$EnumSwitchMapping$0[this.a.ordinal()];
            Rect rect = this.X;
            if (i3 == 1) {
                rect.set((int) ((float) Math.floor((double) rectF.left)), (int) ((float) Math.floor((double) rectF.top)), (int) ((float) Math.ceil((double) rectF.right)), (int) ((float) Math.ceil((double) rectF.bottom)));
            } else if (i3 == 2) {
                float f6 = width / height;
                if (f6 > 1.0f) {
                    f2 = rectF.height() * f6;
                    f = rectF.height();
                } else {
                    f2 = rectF.width();
                    f = rectF.width() / f6;
                }
                float f7 = (float) 2;
                float width2 = ((rectF.width() - f2) / f7) + rectF.left;
                float height2 = ((rectF.height() - f) / f7) + rectF.top;
                rect.set((int) ((float) Math.floor((double) width2)), (int) ((float) Math.floor((double) height2)), (int) ((float) Math.ceil((double) (width2 + f2))), (int) ((float) Math.ceil((double) (height2 + f))));
            } else if (i3 == 3) {
                float f8 = width / height;
                if (f8 > rectF.width() / rectF.height()) {
                    f4 = rectF.width();
                    f3 = rectF.width() / f8;
                } else {
                    f3 = rectF.height();
                    f4 = rectF.height() * f8;
                }
                float f9 = (float) 2;
                float width3 = ((rectF.width() - f4) / f9) + rectF.left;
                float height3 = ((rectF.height() - f3) / f9) + rectF.top;
                rect.set((int) ((float) Math.floor((double) width3)), (int) ((float) Math.floor((double) height3)), (int) ((float) Math.ceil((double) (width3 + f4))), (int) ((float) Math.ceil((double) (height3 + f3))));
            } else if (i3 == 4) {
                float f10 = (float) 2;
                float width4 = ((rectF.width() - width) / f10) + rectF.left;
                float height4 = ((rectF.height() - height) / f10) + rectF.top;
                rect.set((int) ((float) Math.floor((double) width4)), (int) ((float) Math.floor((double) height4)), (int) ((float) Math.ceil((double) (width4 + width))), (int) ((float) Math.ceil((double) (height4 + height))));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            drawable.setBounds(rect);
        }
        return (int) rectF.right;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + getDrawable().hashCode();
    }

    public final void onThemeChanged(pda pda) {
        Drawable drawable = getDrawable();
        mhe mhe = drawable instanceof mhe ? (mhe) drawable : null;
        if (mhe != null) {
            mhe.onThemeChanged(pda);
        }
    }

    public bi5(Drawable drawable, vh5 vh5, boolean z) {
        super(drawable);
        this.a = vh5;
        this.b = z;
        this.c = new RectF();
        this.o = new RectF();
        this.X = new Rect();
        this.Y = new WeakHashMap();
    }
}
