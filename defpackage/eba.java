package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import one.me.appearancesettings.AppearanceSettingsScreen;

/* renamed from: eba  reason: default package */
public final class eba extends View implements mhe {
    public boolean A0;
    public float B0;
    public float C0;
    public final Paint D0;
    public final TextPaint E0;
    public final ArrayList F0;
    public final int a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    public final qjd b = new qjd();
    public final tjd c = new tjd();
    public final Paint o;
    public int w0;
    public int x0;
    public final dba y0;
    public final dba z0;

    public eba(Context context) {
        super(context);
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(dh4.c().getDisplayMetrics().density * 4.0f);
        this.o = paint;
        this.y0 = new dba(this, 0);
        this.z0 = new dba(this, 1);
        this.C0 = -1.0f;
        Paint paint2 = new Paint();
        paint2.setShadowLayer(dh4.c().getDisplayMetrics().density * 4.0f, 0.0f, 0.0f, r1g.G(-16777216, 0.12f));
        this.D0 = paint2;
        TextPaint textPaint = new TextPaint();
        nte.i.a(textPaint, getResources().getDisplayMetrics(), yq4.b);
        this.E0 = textPaint;
        this.F0 = new ArrayList();
        float f = (float) 16;
        setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f), getPaddingTop(), a24.X(f * dh4.c().getDisplayMetrics().density), getPaddingBottom());
        onThemeChanged(km4.y0.r(this));
    }

    private final void setLastThumbSnap(float f) {
        tjd tjd = this.c;
        float f2 = tjd.d;
        k77 k77 = tjd.g[2];
        sjd sjd = tjd.c;
        float floatValue = ((Number) sjd.b).floatValue() / ((float) 2);
        int i = tjd.e;
        for (int i2 = 0; i2 < i; i2++) {
            qjd qjd = this.b;
            RectF rectF = qjd.b;
            float a2 = qjd.q.a(i2);
            rectF.left = a2;
            rectF.right = a2;
            rectF.top = qjd.n;
            rectF.bottom = qjd.o;
            if (Math.abs(rectF.centerX() - f) <= floatValue) {
                float b2 = tjd.b();
                k77 k772 = tjd.g[2];
                tjd.c((((Number) sjd.b).floatValue() * ((float) i2)) + b2);
                if (tjd.d != f2) {
                    dba dba = this.y0;
                    removeCallbacks(dba);
                    removeCallbacks(this.z0);
                    post(dba);
                }
            }
        }
        this.B0 = f;
    }

    public final boolean a() {
        ViewParent parent = getParent();
        while (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public final void b() {
        Iterator it = this.F0.iterator();
        while (it.hasNext()) {
            nq nqVar = (nq) it.next();
            float f = this.c.d;
            nqVar.getClass();
            nqVar.a.setVisibility(((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0) ^ true ? 0 : 8);
            k77[] k77Arr = AppearanceSettingsScreen.Z;
            int j = gwf.j(a24.X(f), 0, 5);
            qpc qpc = (qpc) ((ip) nqVar.b.Y.getValue());
            qpc.j(j, "app.extra.text.size.mode");
            qpc.i.c(Integer.valueOf(j));
        }
    }

    public final float getValue() {
        return this.c.d;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        TextPaint textPaint = this.E0;
        textPaint.setTextSize(TypedValue.applyDimension(2, 12.0f, dh4.c().getDisplayMetrics()));
        qjd qjd = this.b;
        PointF pointF = qjd.a;
        float f = (float) qjd.e;
        pointF.x = f;
        float f2 = (((float) qjd.d) / 2.0f) + qjd.j;
        pointF.y = f2;
        canvas.drawText("A", f, f2, textPaint);
        textPaint.setTextSize(TypedValue.applyDimension(2, 18.0f, dh4.c().getDisplayMetrics()));
        PointF pointF2 = qjd.a;
        float f3 = ((float) (qjd.c - qjd.g)) - qjd.l;
        pointF2.x = f3;
        float f4 = (((float) qjd.d) / 2.0f) + qjd.m;
        pointF2.y = f4;
        canvas.drawText("A", f3, f4, textPaint);
        RectF rectF = qjd.r;
        pointF2.x = qjd.s;
        pointF2.y = rectF.centerY();
        float f5 = pointF2.x;
        Paint paint = this.o;
        paint.setColor(this.w0);
        canvas.drawLine(rectF.left, rectF.top, f5, rectF.bottom, paint);
        int i = this.c.e;
        for (int i2 = 0; i2 < i; i2++) {
            RectF rectF2 = qjd.b;
            float a2 = qjd.q.a(i2);
            rectF2.left = a2;
            rectF2.right = a2;
            rectF2.top = qjd.n;
            rectF2.bottom = qjd.o;
            if (a2 > f5) {
                paint.setColor(this.x0);
            }
            canvas.drawLine(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, paint);
        }
        canvas.drawLine(f5, rectF.top, rectF.right, rectF.bottom, paint);
        pointF2.x = qjd.s;
        float centerY = rectF.centerY();
        pointF2.y = centerY;
        canvas.drawCircle(pointF2.x, centerY, dh4.c().getDisplayMetrics().density * 12.0f, this.D0);
    }

    public final void onMeasure(int i, int i2) {
        TextPaint textPaint = this.E0;
        textPaint.setTextSize(dh4.c().getDisplayMetrics().density * 12.0f);
        textPaint.measureText("A");
        float f = (float) 20;
        a24.X(dh4.c().getDisplayMetrics().density * f);
        float measureText = textPaint.measureText("A");
        float f2 = textPaint.getFontMetrics().descent;
        float g = gwf.g(measureText, 0.0f);
        qjd qjd = this.b;
        qjd.getClass();
        qjd.i = g + ((float) a24.X(dh4.c().getDisplayMetrics().density * f));
        qjd.j = f2;
        qjd.d();
        qjd.b(qjd.p);
        textPaint.setTextSize(dh4.c().getDisplayMetrics().density * 18.0f);
        textPaint.measureText("A");
        a24.X(dh4.c().getDisplayMetrics().density * f);
        float measureText2 = textPaint.measureText("A");
        float f3 = textPaint.getFontMetrics().descent;
        float g2 = gwf.g(measureText2, 0.0f);
        qjd.l = g2;
        qjd.k = g2 + ((float) a24.X(f * dh4.c().getDisplayMetrics().density));
        qjd.m = f3;
        qjd.d();
        qjd.b(qjd.p);
        setMeasuredDimension(View.MeasureSpec.getSize(i), a24.X(((float) 68) * dh4.c().getDisplayMetrics().density));
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        if (measuredWidth < 0) {
            measuredWidth = 0;
        }
        qjd.c = measuredWidth;
        if (measuredHeight < 0) {
            measuredHeight = 0;
        }
        qjd.d = measuredHeight;
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        qjd.e = paddingLeft;
        if (paddingTop < 0) {
            paddingTop = 0;
        }
        qjd.f = paddingTop;
        if (paddingRight < 0) {
            paddingRight = 0;
        }
        qjd.g = paddingRight;
        if (paddingBottom < 0) {
            paddingBottom = 0;
        }
        qjd.h = paddingBottom;
        qjd.d();
        qjd.b(qjd.p);
        qjd.c(qjd.s);
        tjd tjd = this.c;
        qjd.b(tjd.e);
        RectF rectF = qjd.r;
        if (!this.A0) {
            qjd.c(qjd.a((rectF.width() * tjd.f) + rectF.left));
        }
    }

    public final void onThemeChanged(pda pda) {
        pda.getIcon();
        this.w0 = -16745729;
        r0e h = pda.h();
        this.x0 = j33.f(h.j, pda.b().f);
        this.o.setColor(this.w0);
        this.D0.setColor(-1);
        this.E0.setColor(pda.getText().f);
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r0 != 3) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.isEnabled()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = r6.getAction()
            qjd r2 = r5.b
            r3 = 1
            if (r0 == 0) goto L_0x0076
            if (r0 == r3) goto L_0x0063
            r4 = 2
            if (r0 == r4) goto L_0x001b
            r4 = 3
            if (r0 == r4) goto L_0x0063
            goto L_0x00a6
        L_0x001b:
            boolean r0 = r5.A0
            if (r0 != 0) goto L_0x003f
            boolean r0 = r5.a()
            if (r0 == 0) goto L_0x0038
            float r0 = r6.getX()
            float r4 = r5.C0
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            int r4 = r5.a
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0038
            return r1
        L_0x0038:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
        L_0x003f:
            r5.A0 = r3
            float r6 = r6.getX()
            float r6 = r2.a(r6)
            float r0 = r5.B0
            float r0 = r6 - r0
            float r0 = java.lang.Math.abs(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a6
            he6 r0 = defpackage.he6.CLOCK_TICK
            lp.K(r5, r0)
            r5.setLastThumbSnap(r6)
            r2.c(r6)
            goto L_0x00a6
        L_0x0063:
            r5.A0 = r1
            float r6 = r6.getX()
            float r6 = r2.a(r6)
            r5.setLastThumbSnap(r6)
            float r6 = r5.B0
            r2.c(r6)
            goto L_0x00a6
        L_0x0076:
            float r0 = r6.getX()
            r5.C0 = r0
            boolean r0 = r5.a()
            if (r0 == 0) goto L_0x0083
            goto L_0x00a6
        L_0x0083:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            r5.requestFocus()
            r5.A0 = r3
            float r0 = r6.getX()
            float r0 = r2.a(r0)
            r5.setLastThumbSnap(r0)
            float r6 = r6.getX()
            r2.c(r6)
            ie6 r6 = defpackage.ie6.GESTURE_START
            lp.K(r5, r6)
        L_0x00a6:
            r5.invalidate()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eba.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setStepSize(float f) {
        tjd tjd = this.c;
        float f2 = tjd.d;
        tjd.c.o1(tjd, tjd.g[2], Float.valueOf(f));
        int i = tjd.e;
        qjd qjd = this.b;
        qjd.b(i);
        RectF rectF = qjd.r;
        qjd.c(qjd.a((rectF.width() * tjd.f) + rectF.left));
        if (f2 != tjd.d) {
            removeCallbacks(this.y0);
            dba dba = this.z0;
            removeCallbacks(dba);
            post(dba);
        }
        postInvalidate();
    }

    public final void setValue(float f) {
        tjd tjd = this.c;
        float f2 = tjd.d;
        tjd.c(f);
        int i = tjd.e;
        qjd qjd = this.b;
        qjd.b(i);
        RectF rectF = qjd.r;
        qjd.c(qjd.a((rectF.width() * tjd.f) + rectF.left));
        if (f2 != tjd.d) {
            removeCallbacks(this.y0);
            dba dba = this.z0;
            removeCallbacks(dba);
            post(dba);
        }
        postInvalidate();
    }

    public final void setValueFrom(float f) {
        tjd tjd = this.c;
        float f2 = tjd.d;
        tjd.a.o1(tjd, tjd.g[0], Float.valueOf(f));
        int i = tjd.e;
        qjd qjd = this.b;
        qjd.b(i);
        RectF rectF = qjd.r;
        qjd.c(qjd.a((rectF.width() * tjd.f) + rectF.left));
        if (f2 != tjd.d) {
            removeCallbacks(this.y0);
            dba dba = this.z0;
            removeCallbacks(dba);
            post(dba);
        }
        postInvalidate();
    }

    public final void setValueTo(float f) {
        tjd tjd = this.c;
        float f2 = tjd.d;
        tjd.b.o1(tjd, tjd.g[1], Float.valueOf(f));
        int i = tjd.e;
        qjd qjd = this.b;
        qjd.b(i);
        RectF rectF = qjd.r;
        qjd.c(qjd.a((rectF.width() * tjd.f) + rectF.left));
        if (f2 != tjd.d) {
            removeCallbacks(this.y0);
            dba dba = this.z0;
            removeCallbacks(dba);
            post(dba);
        }
        postInvalidate();
    }
}
