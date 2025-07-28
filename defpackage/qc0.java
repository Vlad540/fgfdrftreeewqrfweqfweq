package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: qc0  reason: default package */
public final class qc0 extends Drawable {
    public static final int[] f = {-2096531, -2007990, -164330, -616921, -2019997, -2206338, -2011174, -4377970, -13333023, -6993695, -13219103, -10719519, -16733746, -11226714, -13526051, -13462339};
    public final TextPaint a;
    public final pc0 b;
    public final CharSequence c;
    public final int d;
    public final boolean e;

    public qc0(pc0 pc0, tf3 tf3, boolean z) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = pc0;
        this.c = tf3.m();
        int a2 = a(tf3.n());
        this.d = a2;
        this.e = z;
        textPaint.setColor(a2);
    }

    public static int a(long j) {
        return f[(int) ((Math.abs(j) >> 8) % ((long) 16))];
    }

    public final void draw(Canvas canvas) {
        StaticLayout build;
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.translate((float) bounds.left, (float) bounds.top);
        int width = bounds.width();
        int height = bounds.height();
        float min = this.e ? ((float) Math.min(width, height)) / 2.0f : ((float) Math.min(width, height)) / 2.5f;
        float f2 = ((float) width) / 2.0f;
        canvas.drawCircle(f2, f2, f2, this.a);
        CharSequence charSequence = this.c;
        if (!TextUtils.isEmpty(charSequence)) {
            pc0 pc0 = this.b;
            TextPaint textPaint = pc0.a;
            TextPaint textPaint2 = pc0.a;
            textPaint.setTextSize(min);
            if (charSequence instanceof Spannable) {
                Integer valueOf = Integer.valueOf(charSequence.hashCode() + (width * 31));
                q16 q16 = pc0.b;
                Object obj = q16.get(valueOf);
                if (obj == null) {
                    try {
                        build = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint2, width).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
                    } catch (Throwable unused) {
                        String obj2 = charSequence.toString();
                        build = StaticLayout.Builder.obtain(obj2, 0, obj2.length(), textPaint2, width).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
                    }
                    obj = build;
                    q16.put(valueOf, obj);
                }
                StaticLayout staticLayout = (StaticLayout) obj;
                canvas.translate(((float) staticLayout.getWidth()) / 2.0f, (((float) height) / 2.0f) - (((float) staticLayout.getHeight()) / 2.0f));
                staticLayout.draw(canvas);
            } else {
                canvas.drawText(charSequence, 0, charSequence.length(), f2, (((float) height) / 2.0f) - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
            }
        }
        canvas.restoreToCount(save);
    }

    public final int getOpacity() {
        return 0;
    }

    public final Drawable mutate() {
        return new qc0(this.b, this.c, this.d, this.e);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public qc0(pc0 pc0, i22 i22, w6a w6a) {
        int i;
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = pc0;
        i22.i0();
        this.c = i22.B0;
        i22.i0();
        if (w6a.j.a(0, i22.B0)) {
            i = -1250068;
        } else {
            i = a(i22.b.a);
        }
        this.d = i;
        this.e = false;
        textPaint.setColor(i);
    }

    public qc0(pc0 pc0, w6a w6a, CharSequence charSequence) {
        int i;
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = pc0;
        this.c = w6a.j.e(ehe.a(charSequence, w6a));
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        int[] iArr = f;
        if (isEmpty) {
            i = iArr[0];
        } else {
            i = iArr[(Math.abs(charSequence.hashCode()) >> 8) % 16];
        }
        this.d = i;
        this.e = false;
        textPaint.setColor(i);
    }

    public qc0(pc0 pc0, w6a w6a, CharSequence charSequence, long j, boolean z) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = pc0;
        this.c = w6a.j.e(ehe.a(charSequence, w6a));
        int a2 = a(j);
        this.d = a2;
        this.e = z;
        textPaint.setColor(a2);
    }

    public qc0(pc0 pc0, CharSequence charSequence, int i, boolean z) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = pc0;
        this.c = charSequence;
        this.d = i;
        this.e = z;
        textPaint.setColor(i);
    }
}
