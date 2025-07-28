package defpackage;

import android.animation.IntEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: q60  reason: default package */
public final class q60 extends View implements mhe {
    public static final IntEvaluator J0 = new IntEvaluator();
    public final Paint A0;
    public final Paint B0;
    public final Paint C0;
    public final Path D0 = new Path();
    public lr E0;
    public Byte F0;
    public long G0;
    public boolean H0;
    public p60 I0;
    public final int[] a = new int[2];
    public final float b;
    public final float c;
    public final float o;
    public byte[] w0;
    public long x0;
    public boolean y0;
    public boolean z0;

    public q60(Context context) {
        super(context, (AttributeSet) null, 0);
        setLayerType(1, (Paint) null);
        setPadding((int) ((dh4.c().getDisplayMetrics().density * 2.0f) + (dh4.c().getDisplayMetrics().density * 4.0f)), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        this.b = dh4.c().getDisplayMetrics().density * 4.0f;
        this.c = dh4.c().getDisplayMetrics().density * 2.0f;
        float f = dh4.c().getDisplayMetrics().density * 2.0f;
        this.o = f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f);
        this.A0 = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.C0 = paint2;
        this.B0 = new Paint(paint);
        xy6.c(this);
        if (xy6.w(this)) {
            setScaleX(-1.0f);
        }
        onThemeChanged(km4.y0.r(this));
    }

    public final float a(MotionEvent motionEvent) {
        int[] iArr = this.a;
        getLocationOnScreen(iArr);
        float rawX = motionEvent.getRawX();
        int paddingLeft = getPaddingLeft() + iArr[0];
        int width = getWidth();
        if (width == 0) {
            return 0.0f;
        }
        if (rawX >= ((float) (paddingLeft + width))) {
            return 1.0f;
        }
        float f = (float) paddingLeft;
        if (rawX <= f) {
            return 0.0f;
        }
        return (rawX - f) / ((float) width);
    }

    public final long getDuration() {
        return this.G0;
    }

    public final int getPeaksCount() {
        return (int) (((float) (getMeasuredWidth() - getPaddingLeft())) / (this.c + this.o));
    }

    /* JADX INFO: finally extract failed */
    public final void onDraw(Canvas canvas) {
        float f;
        Path path = this.D0;
        if (!path.isEmpty()) {
            float measuredHeight = ((float) getMeasuredHeight()) / 2.0f;
            float width = ((((float) this.x0) / ((float) this.G0)) * ((float) getWidth())) + ((float) getPaddingLeft());
            boolean z = this.z0 || this.H0;
            float f2 = dh4.c().getDisplayMetrics().density * 4.0f;
            if (this.H0) {
                f2 += dh4.c().getDisplayMetrics().density * 2.0f;
            }
            if (z) {
                canvas.save();
                f = width > ((float) getWidth()) - f2 ? ((float) getWidth()) - f2 : width;
            } else {
                f = 0.0f;
            }
            Paint paint = this.A0;
            if (!z) {
                canvas.drawPath(path, paint);
                return;
            }
            int save = canvas.save();
            try {
                canvas.clipRect(0.0f, 0.0f, width, (float) canvas.getHeight());
                canvas.drawPath(path, this.B0);
                canvas.restoreToCount(save);
                int save2 = canvas.save();
                try {
                    canvas.clipRect(width, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
                    canvas.drawPath(path, paint);
                    canvas.restoreToCount(save2);
                    canvas.drawCircle(f, measuredHeight, f2, this.C0);
                } catch (Throwable th) {
                    canvas.restoreToCount(save2);
                    throw th;
                }
            } catch (Throwable th2) {
                canvas.restoreToCount(save);
                throw th2;
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        if (this.w0 == null) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        }
    }

    public final void onThemeChanged(pda pda) {
        int i;
        if (this.y0) {
            pda.getIcon();
            i = r1g.G(-1, 0.5f);
        } else {
            pda.getIcon();
            i = r1g.G(-16745729, 0.5f);
        }
        this.A0.setColor(i);
        pda.getIcon();
        this.C0.setColor(-1);
        this.B0.setColor(-1);
        invalidate();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.z0 && !this.H0) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else if (!this.H0) {
                    return false;
                } else {
                    this.x0 = (long) (a(motionEvent) * ((float) this.G0));
                    d4b d4b = this.I0;
                    if (d4b != null) {
                        d4b d4b2 = d4b;
                        String b2 = d8.b((long) (((float) ((q60) d4b2.b).getDuration()) * a(motionEvent)));
                        k77[] k77Arr = RecordControlsWidget.m1;
                        ((RecordControlsWidget) d4b2.c).A0().setText(b2);
                    }
                    postInvalidate();
                }
            }
            this.H0 = false;
            d4b d4b3 = this.I0;
            if (d4b3 != null) {
                float a2 = a(motionEvent);
                k77[] k77Arr2 = RecordControlsWidget.m1;
                y3c L0 = ((RecordControlsWidget) d4b3.c).L0();
                Long l = (Long) L0.D0.a.getValue();
                if (l != null) {
                    long longValue = (long) (a2 * ((float) l.longValue()));
                    nb9 nb9 = (nb9) ((e40) L0.u()).b();
                    nb9.getClass();
                    xs7.E(nb9.h, (hu3) null, (ru3) null, new jb9(longValue, nb9, (Continuation) null), 3);
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (!this.y0) {
            return false;
        } else {
            this.H0 = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    public final void setLinesColor(int i) {
        this.A0.setColor(i);
        invalidate();
    }

    public final void setListener(p60 p60) {
        this.I0 = p60;
    }
}
