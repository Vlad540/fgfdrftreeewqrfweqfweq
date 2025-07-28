package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: qtc  reason: default package */
public final class qtc extends l6c implements mhe {
    public final x3a A0;
    public final RectF X;
    public final Rect Y;
    public final ub9 Z;
    public final otc a;
    public final int b;
    public final u16 c;
    public final Paint o;
    public final ub9 w0;
    public final ub9 x0;
    public final float[] y0;
    public final Path z0;

    public qtc(pda pda, otc otc, u1c u1c, int i) {
        int i2 = (i & 4) != 0 ? 4 : 0;
        u1c = (i & 8) != 0 ? new u1c(4) : u1c;
        this.a = otc;
        this.b = i2;
        this.c = u1c;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.o = paint;
        this.X = new RectF();
        this.Y = new Rect();
        ub9 ub9 = gz6.a;
        this.Z = new ub9();
        this.w0 = new ub9();
        this.x0 = new ub9();
        this.y0 = new float[8];
        this.z0 = new Path();
        this.A0 = new x3a(16);
        onThemeChanged(pda);
    }

    public static final void i(qtc qtc, Canvas canvas) {
        Path path = qtc.z0;
        RectF rectF = qtc.X;
        Path.Direction direction = Path.Direction.CCW;
        float[] fArr = qtc.y0;
        path.addRoundRect(rectF, fArr, direction);
        Path path2 = qtc.z0;
        canvas.drawPath(path2, qtc.o);
        path2.reset();
        rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
        cs.U(fArr, 0.0f);
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, x6c x6c) {
        Rect rect2 = rect;
        View view2 = view;
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        if (R != -1) {
            int i = this.a.i(R);
            ub9 ub9 = this.Z;
            ub9.h(R);
            ub9 ub92 = this.w0;
            ub92.h(R);
            ub9 ub93 = this.x0;
            ub93.h(R);
            int i2 = i == 0 ? -1 : ptc.$EnumSwitchMapping$0[hr1.t(i)];
            if (i2 != -1) {
                int i3 = this.b;
                if (i2 == 1) {
                    rect2.top = me4.c((float) i3, dh4.c().getDisplayMetrics().density, rect2.top);
                    ub9.a(R);
                    gdc gdc = view2 instanceof gdc ? (gdc) view2 : null;
                    if (gdc != null) {
                        gdc.setRippleMask(new RoundRectShape(new float[]{dh4.c().getDisplayMetrics().density * 16.0f, dh4.c().getDisplayMetrics().density * 16.0f, dh4.c().getDisplayMetrics().density * 16.0f, dh4.c().getDisplayMetrics().density * 16.0f, 0.0f, 0.0f, 0.0f, 0.0f}, (RectF) null, (float[]) null));
                    }
                } else if (i2 == 2) {
                    rect2.bottom = me4.c((float) i3, dh4.c().getDisplayMetrics().density, rect2.bottom);
                    ub93.a(R);
                    gdc gdc2 = view2 instanceof gdc ? (gdc) view2 : null;
                    if (gdc2 != null) {
                        gdc2.setRippleMask(new RoundRectShape(new float[]{0.0f, 0.0f, 0.0f, 0.0f, dh4.c().getDisplayMetrics().density * 16.0f, dh4.c().getDisplayMetrics().density * 16.0f, dh4.c().getDisplayMetrics().density * 16.0f, dh4.c().getDisplayMetrics().density * 16.0f}, (RectF) null, (float[]) null));
                    }
                } else if (i2 == 3) {
                    float f = (float) i3;
                    rect2.top = me4.c(f, dh4.c().getDisplayMetrics().density, rect2.top);
                    rect2.bottom = me4.c(f, dh4.c().getDisplayMetrics().density, rect2.bottom);
                    ub9.a(R);
                    ub93.a(R);
                    gdc gdc3 = view2 instanceof gdc ? (gdc) view2 : null;
                    if (gdc3 != null) {
                        gdc3.setRippleMask(new RoundRectShape(new float[]{dh4.c().getDisplayMetrics().density * 16.0f, dh4.c().getDisplayMetrics().density * 16.0f, dh4.c().getDisplayMetrics().density * 16.0f, dh4.c().getDisplayMetrics().density * 16.0f, dh4.c().getDisplayMetrics().density * 16.0f, dh4.c().getDisplayMetrics().density * 16.0f, dh4.c().getDisplayMetrics().density * 16.0f, dh4.c().getDisplayMetrics().density * 16.0f}, (RectF) null, (float[]) null));
                    }
                } else if (i2 == 4) {
                    ub92.a(R);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            this.A0.E(rect2, view2, recyclerView);
        }
    }

    public final void g(Canvas canvas, RecyclerView recyclerView, x6c x6c) {
        RectF rectF = this.X;
        rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int R = RecyclerView.R(childAt);
            x3a x3a = this.A0;
            Rect rect = this.Y;
            x3a.w(rect, childAt, R);
            ub9 ub9 = this.Z;
            boolean c2 = ub9.c(R);
            int i2 = this.b;
            float[] fArr = this.y0;
            if (c2) {
                float f = dh4.c().getDisplayMetrics().density * 16.0f;
                fArr[0] = f;
                fArr[1] = f;
                fArr[2] = f;
                fArr[3] = f;
                rectF.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
                int i3 = -a24.X(((float) i2) * dh4.c().getDisplayMetrics().density);
                Drawable background = childAt.getBackground();
                RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
                if (rippleDrawable != null) {
                    d8.G(rippleDrawable, 0, i3, 0, 13);
                }
            }
            boolean c3 = this.w0.c(R);
            ub9 ub92 = this.x0;
            if (c3 || ub92.c(R)) {
                rectF.left = Math.min(rectF.left, (float) rect.left);
                rectF.top = Math.min(rectF.top, (float) rect.top);
                rectF.right = Math.max(rectF.right, (float) rect.right);
                rectF.bottom = Math.max(rectF.bottom, (float) rect.bottom);
                if (ub92.c(R)) {
                    float f2 = dh4.c().getDisplayMetrics().density * 16.0f;
                    fArr[4] = f2;
                    fArr[5] = f2;
                    fArr[6] = f2;
                    fArr[7] = f2;
                    int p = ub9.c(R) ? me4.p((float) i2, dh4.c().getDisplayMetrics().density, rect.height()) : rect.height();
                    Drawable background2 = childAt.getBackground();
                    RippleDrawable rippleDrawable2 = background2 instanceof RippleDrawable ? (RippleDrawable) background2 : null;
                    if (rippleDrawable2 != null) {
                        d8.G(rippleDrawable2, 0, 0, p, 7);
                    }
                    i(this, canvas);
                }
            }
        }
        if (rectF.height() > 0.0f) {
            i(this, canvas);
        }
    }

    public final void onThemeChanged(pda pda) {
        this.o.setColor(((Number) this.c.invoke(pda)).intValue());
    }
}
