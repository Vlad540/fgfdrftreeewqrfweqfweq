package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;

/* renamed from: yza  reason: default package */
public final class yza {
    public final int a;
    public final int b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final int f;
    public final RectF g;
    public float h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final kjb l;

    public yza(int i2, Context context, kjb kjb) {
        this.l = kjb;
        zg4 b2 = zg4.b();
        int i3 = b2.i;
        int i4 = b2.b;
        int i5 = b2.a;
        this.a = i5;
        int i6 = b2.h;
        this.b = i6;
        r7e r7e = wce.a0;
        wce E = fja.E(context);
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(E.w);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        this.d = paint;
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setColor(n1g.c0(E.m, 0.6f));
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        int i7 = i2 - i6;
        this.f = i7;
        float f2 = ((float) i4) / 2.0f;
        float f3 = (float) i5;
        RectF rectF = new RectF(((float) ((-i6) * 2)) + f2 + f3, (float) (i7 - i6), ((float) (i6 * 2)) + f2 + f3, (float) (i6 + i7 + i3));
        this.g = rectF;
        float f4 = (float) i7;
        RectF rectF2 = new RectF(rectF.centerX() - f2, -10.0f, rectF.centerX() + f2, f4);
        this.i = rectF2;
        float f5 = rectF2.left;
        this.j = new RectF(f5 - f3, 0.0f, f5, f4);
        float f6 = rectF2.right;
        this.k = new RectF(f6, 0.0f, f3 + f6, f4);
    }

    public final float a() {
        return ((RangeSeekBarView) this.l).c(this.i.centerX());
    }

    public final void b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        kjb kjb = this.l;
        if (action == 0) {
            this.h = ((RangeSeekBarView) kjb).b(a()) - motionEvent.getX();
        } else if (action == 2) {
            c(((RangeSeekBarView) kjb).c(motionEvent.getX() + this.h));
        }
    }

    public final void c(float f2) {
        float b2 = ((RangeSeekBarView) this.l).b(f2);
        RectF rectF = this.g;
        rectF.offsetTo(b2 - (rectF.width() / 2.0f), rectF.top);
        RectF rectF2 = this.i;
        rectF2.offsetTo(rectF.centerX() - (rectF2.width() / 2.0f), 0.0f);
        this.j.offsetTo(rectF2.left - ((float) this.a), 0.0f);
        this.k.offsetTo(rectF2.right, 0.0f);
    }
}
