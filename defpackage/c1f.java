package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: c1f  reason: default package */
public final class c1f extends ImageSpan implements mhe {
    public final u16 X;
    public final Resources Y;
    public b1f Z;
    public final Context a;
    public final int b;
    public final boolean c;
    public final boolean o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c1f(Context context, int i, boolean z, u16 u16) {
        super(context, i == 1 ? phc.h2 : phc.i2, 2);
        this.a = context;
        this.b = i;
        this.c = true;
        this.o = z;
        this.X = u16;
        this.Y = Resources.getSystem();
        this.Z = new b1f(context, i, u16);
        onThemeChanged(km4.y0.n(context).g());
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [b1f, android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r7v2, types: [b1f, android.graphics.drawable.Drawable] */
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int save = canvas.save();
        try {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i6 = fontMetricsInt.descent;
            float f2 = (float) 2;
            canvas.translate(f, (((float) (i4 + i6)) - (((float) (i6 - fontMetricsInt.ascent)) / f2)) - (((float) (this.Z.getBounds().bottom - this.Z.getBounds().top)) / f2));
            this.Z.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [b1f, android.graphics.drawable.Drawable] */
    public final Drawable getDrawable() {
        return this.Z;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [b1f, android.graphics.drawable.Drawable] */
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int C = xy6.C(paint.getTextSize() / this.Y.getDisplayMetrics().density);
        if (C != this.b) {
            this.Z = new b1f(this.a, C, this.X);
        }
        int X2 = a24.X(((float) sxe.f(C)) * dh4.c().getDisplayMetrics().density);
        int i3 = this.c ? X2 : 0;
        if (!this.o) {
            X2 = 0;
        }
        ? r1 = this.Z;
        float i4 = (float) sxe.i(C);
        r1.setBounds(i3, 0, me4.c(i4, dh4.c().getDisplayMetrics().density, i3), a24.X(dh4.c().getDisplayMetrics().density * i4));
        return rf0.b(i4, dh4.c().getDisplayMetrics().density, i3, X2);
    }

    public final void onThemeChanged(pda pda) {
        b1f b1f = this.Z;
        if (!(b1f instanceof b1f)) {
            b1f = null;
        }
        if (b1f != null) {
            b1f.onThemeChanged(pda);
        }
    }
}
