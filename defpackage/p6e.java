package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: p6e  reason: default package */
public final class p6e extends Drawable {
    public final yie a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;

    public p6e(String str, int i, int i2, int i3, yie yie) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.a = yie;
    }

    /* renamed from: a */
    public final p6e mutate() {
        yie yie = this.a;
        yie.getClass();
        Paint paint = new Paint(yie.g);
        yie yie2 = new yie(yie.a, yie.b, yie.c);
        yie2.g = paint;
        yie2.j = true;
        return new p6e(this.b, this.c, this.d, this.e, yie2);
    }

    public final void draw(Canvas canvas) {
        yie yie = this.a;
        if (yie.j) {
            float f = yie.f;
            int save = canvas.save();
            canvas.scale(f, f, 0.0f, 0.0f);
            try {
                canvas.drawPaint(yie.g);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            udd.U(yie.class.getSimpleName(), "error: cant' render svg, incorrect data!");
        }
    }

    public final int getIntrinsicHeight() {
        return this.a.e;
    }

    public final int getIntrinsicWidth() {
        return this.a.d;
    }

    public final int getOpacity() {
        return -2;
    }

    public final void setAlpha(int i) {
        this.a.g.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.g.setColorFilter(colorFilter);
    }

    public p6e(String str, int i, int i2) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = 1;
        if (o6e.$EnumSwitchMapping$0[hr1.t(1)] == 1) {
            yie yie = new yie(str, i, i2);
            jue jue = (jue) yie.h.getValue();
            this.a = yie;
            return;
        }
        throw new NoWhenBranchMatchedException();
    }
}
