package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Size;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ku0  reason: default package */
public final class ku0 extends View {
    public final Paint A0;
    public final Paint B0;
    public final TextPaint C0;
    public iu0 D0;
    public yt0 E0;
    public eu0 F0;
    public final Drawable G0;
    public final Drawable H0;
    public final Drawable I0;
    public final Drawable J0;
    public ov6 K0;
    public final Path L0 = new Path();
    public final RectF M0 = new RectF();
    public final float[] N0 = new float[8];
    public final Size O0;
    public boolean P0;
    public final GestureDetector Q0;
    public final int a = a24.X(((float) 40) * dh4.c().getDisplayMetrics().density);
    public final int b = a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
    public final float c = (dh4.c().getDisplayMetrics().density * 6.0f);
    public final int o = a24.X(((float) 20) * dh4.c().getDisplayMetrics().density);
    public final int w0 = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
    public int x0;
    public ArrayList y0 = new ArrayList();
    public r77 z0;

    public ku0(Context context) {
        super(context, (AttributeSet) null);
        this.Q0 = new GestureDetector(context, new tz(1, this));
        this.O0 = new Size(gwf.w(context).getWidth(), gwf.w(context).getHeight());
        int i = z6a.l;
        s59 s59 = km4.y0;
        s59.r(this);
        this.G0 = js.q(i, -1, context);
        int i2 = z6a.k;
        s59.r(this);
        this.H0 = js.q(i2, -1, context);
        int i3 = z6a.b;
        s59.r(this);
        this.J0 = js.q(i3, -1, context);
        int i4 = z6a.a;
        s59.r(this);
        this.I0 = js.q(i4, -1, context);
        TextPaint textPaint = new TextPaint();
        this.C0 = textPaint;
        int i5 = s59.r(this).a().a(true).a.a.a;
        Paint paint = new Paint();
        paint.setColor(i5);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setAntiAlias(true);
        this.A0 = paint;
        int i6 = s59.r(this).a().a(true).a.a.c;
        Paint paint2 = new Paint();
        paint2.setColor(i6);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setAntiAlias(true);
        this.B0 = paint2;
        s59.r(this);
        textPaint.setColor(-1);
        nte.B.a(textPaint, getResources().getDisplayMetrics(), yq4.b);
        textPaint.setTextSize(dh4.c().getDisplayMetrics().density * 16.0f);
        textPaint.setTextAlign(Paint.Align.CENTER);
        urd.B(new pf0(3, (Continuation) null, 1), this);
    }

    public final r77 getKeyboard() {
        return this.z0;
    }

    public final void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        if (!this.y0.isEmpty()) {
            Iterator it = this.y0.iterator();
            while (it.hasNext()) {
                fp0 fp0 = (fp0) it.next();
                d10 d10 = fp0.b;
                RectF rectF = this.M0;
                rectF.set(d10.b, d10.c, d10.d, d10.e);
                yt0 yt0 = this.E0;
                yt0 yt02 = fp0.a;
                if (yt02 == yt0) {
                    int i = ju0.$EnumSwitchMapping$1[hr1.t(yt02.c)];
                    paint = this.B0;
                } else {
                    int i2 = ju0.$EnumSwitchMapping$1[hr1.t(yt02.c)];
                    paint = this.A0;
                }
                d10 d102 = fp0.b;
                float[] fArr = fp0.g;
                if (fArr != null) {
                    Path path = this.L0;
                    path.reset();
                    float f = fArr[0];
                    float[] fArr2 = this.N0;
                    fArr2[0] = f;
                    fArr2[1] = fArr[0];
                    float f2 = fArr[1];
                    fArr2[2] = f2;
                    fArr2[3] = f2;
                    float f3 = fArr[2];
                    fArr2[4] = f3;
                    fArr2[5] = f3;
                    float f4 = fArr[3];
                    fArr2[6] = f4;
                    fArr2[7] = f4;
                    path.addRoundRect(rectF, fArr2, Path.Direction.CCW);
                    canvas2.drawPath(path, paint);
                } else {
                    rectF.set(d102.b, d102.c, d102.d, d102.e);
                    float f5 = this.c;
                    canvas2.drawRoundRect(rectF, f5, f5, paint);
                }
                if (yt02.w0) {
                    ov6 ov6 = this.K0;
                    if (ov6 != null) {
                        float f6 = d102.b;
                        float f7 = d102.d;
                        int i3 = this.o / 2;
                        float f8 = d102.c;
                        float f9 = d102.e;
                        ov6.setBounds(((int) ((f6 + f7) * 0.5f)) - i3, ((int) ((f8 + f9) * 0.5f)) - i3, ((int) ((f6 + f7) * 0.5f)) + i3, i3 + ((int) ((f8 + f9) * 0.5f)));
                    }
                    ov6 ov62 = this.K0;
                    if (ov62 != null) {
                        ov62.draw(canvas2);
                    }
                } else {
                    TextPaint textPaint = this.C0;
                    canvas2.drawText(fp0.h, (d102.b + d102.d) * 0.5f, ((d102.c + d102.e) * 0.5f) - ((textPaint.ascent() + textPaint.descent()) / ((float) 2)), textPaint);
                }
                int i4 = this.b;
                int i5 = ((int) d102.d) - i4;
                int i6 = this.w0;
                int i7 = i5 - i6;
                int i8 = ((int) d102.c) + i4;
                int i9 = i6 + i8;
                int ordinal = yt02.b.ordinal();
                Drawable drawable = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 5 ? null : this.G0 : this.J0 : this.I0 : this.H0;
                if (drawable != null) {
                    drawable.setBounds(i7, i8, i5, i9);
                    drawable.draw(canvas2);
                }
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        r77 r77 = this.z0;
        if (this.y0.size() == 0 || r77 == null) {
            super.onMeasure(i, i2);
            return;
        }
        int size = ((vw6) r77).a.size();
        int size2 = View.MeasureSpec.getSize(i);
        if (!this.P0) {
            Size size3 = this.O0;
            if (((double) size2) > Math.min((double) size3.getWidth(), (double) size3.getHeight())) {
                size2 = (int) (((float) (size3.getWidth() * size2)) / ((float) size3.getHeight()));
            }
        }
        int i3 = this.a;
        int i4 = this.b;
        setMeasuredDimension(size2, (i3 + i4) * size);
        int i5 = 0;
        d10 d10 = ((fp0) this.y0.get(0)).b;
        if ((d10.b == 0.0f && d10.c == 0.0f && d10.d == 0.0f && d10.e == 0.0f) || this.x0 != getMeasuredWidth()) {
            int measuredWidth = getMeasuredWidth();
            ArrayList arrayList = this.y0;
            l lVar = new l(14, this);
            Iterator it = arrayList.iterator();
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (it.hasNext()) {
                fp0 fp0 = (fp0) it.next();
                int i9 = fp0.c;
                if (i9 != -1) {
                    i8 = (measuredWidth - (i9 * i4)) / i9;
                    i6 = i5;
                }
                boolean z = fp0.f;
                if (z) {
                    i8 += i4;
                }
                float f = (float) i6;
                float f2 = (float) i7;
                int i10 = fp0.d ? i6 + measuredWidth : i6 + i8;
                int i11 = i7 + i3;
                int i12 = measuredWidth;
                d10 d102 = fp0.b;
                d102.b = f;
                d102.c = f2;
                d102.d = (float) i10;
                d102.e = (float) i11;
                lVar.invoke(fp0);
                i6 = i6 + i8 + i4;
                if (z) {
                    i7 = i11 + i4;
                }
                measuredWidth = i12;
                i5 = 0;
            }
        }
        this.x0 = getMeasuredWidth();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        this.Q0.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        yia yia = null;
        if (action == 0) {
            ArrayList arrayList = this.y0;
            r77 r77 = this.z0;
            List list = r77 != null ? ((vw6) r77).a : null;
            if (list == null) {
                list = hw4.a;
            }
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!arrayList.isEmpty() && !list.isEmpty()) {
                int y = (int) (motionEvent.getY() / ((float) (measuredHeight / list.size())));
                int size = list.size() - 1;
                Class<gp0> cls = gp0.class;
                if (y > size) {
                    String name = cls.getName();
                    fn6 fn6 = udd.e;
                    if (fn6 != null && fn6.c()) {
                        fn6.d(tn7.w0, name, me4.g("Calculated wrong row index=", y, size, ", correct index="), (Throwable) null);
                    }
                    y = size;
                }
                fu0 fu0 = (fu0) list.get(y);
                if (!fu0.isEmpty()) {
                    int x = (int) (motionEvent.getX() / ((float) (measuredWidth / fu0.size())));
                    int size2 = fu0.size() - 1;
                    if (x > size2) {
                        String name2 = cls.getName();
                        fn6 fn62 = udd.e;
                        if (fn62 != null && fn62.c()) {
                            fn62.d(tn7.w0, name2, me4.g("Calculated wrong column index=", x, size2, ", correct index="), (Throwable) null);
                        }
                        x = size2;
                    }
                    yia = new yia(new eu0(y, x), fu0.get(x));
                }
            }
            if (yia == null) {
                return true;
            }
            this.F0 = (eu0) yia.a;
            this.E0 = (yt0) yia.b;
            invalidate();
            return true;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            this.E0 = null;
            this.F0 = null;
            invalidate();
            return false;
        }
    }

    public final void setClickListener(iu0 iu0) {
        this.D0 = iu0;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof ov6) || super.verifyDrawable(drawable);
    }
}
