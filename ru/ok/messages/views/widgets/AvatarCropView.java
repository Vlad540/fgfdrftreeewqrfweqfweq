package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.util.AttributeSet;
import one.me.sdk.zoom.ZoomableDraweeView;
import ru.ok.messages.views.ActAvatarCrop;
import ru.ok.tamtam.android.prefs.PmsKey;

public class AvatarCropView extends ZoomableDraweeView {
    public final int K0;
    public final int L0;
    public final int M0;
    public final int N0;
    public final Path O0;
    public final Paint P0;
    public final Paint Q0;
    public final Rect R0;
    public int S0;
    public int T0 = 0;
    public gc0 U0;

    /* JADX WARNING: type inference failed for: r3v0, types: [one.me.sdk.zoom.ZoomableDraweeView, ru.ok.messages.views.widgets.AvatarCropView, android.view.View] */
    public AvatarCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        zg4 b = zg4.b();
        int i = b.n;
        this.K0 = i;
        this.L0 = b.D;
        this.M0 = i;
        this.N0 = b.A;
        yzc yzc = vl.b().n().b;
        yzc.getClass();
        setZoomableController(new kw3(new j1c(new k18()), (int) yzc.o(PmsKey.f77minimagesidesize, (long) 64)));
        this.O0 = new Path();
        this.R0 = new Rect();
        Paint paint = new Paint();
        this.P0 = paint;
        paint.setColor(km4.y0.r(this).b().d);
        this.P0.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.Q0 = paint2;
        paint2.setColor(getResources().getColor(xhc.f));
        this.Q0.setStyle(Paint.Style.STROKE);
        this.Q0.setAntiAlias(true);
        this.Q0.setStrokeWidth((float) b.a);
    }

    public final void f(Matrix matrix) {
        super.f(matrix);
        ((ActAvatarCrop) this.U0).c1.setVisibility(0);
    }

    public final void o(oq6 oq6) {
        super.o(oq6);
        this.S0 = oq6.getWidth();
        ((kw3) getZoomableController()).e();
        if (this.T0 == 0) {
            ((kw3) getZoomableController()).d(this.S0);
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [one.me.sdk.zoom.ZoomableDraweeView, ru.ok.messages.views.widgets.AvatarCropView, android.view.View] */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.clipPath(this.O0, Region.Op.DIFFERENCE);
        canvas.drawRect(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), this.P0);
        canvas.restore();
        if (this.T0 == 1) {
            Canvas canvas2 = canvas;
            canvas2.drawRect((float) ((getMeasuredWidth() / 2) - (this.R0.width() / 2)), (float) ((getMeasuredHeight() / 2) - (this.R0.height() / 2)), (float) ((this.R0.width() / 2) + (getMeasuredWidth() / 2)), (float) ((this.R0.height() / 2) + (getMeasuredHeight() / 2)), this.Q0);
            return;
        }
        canvas.drawCircle((float) this.R0.centerX(), (float) this.R0.centerY(), (float) (this.R0.width() / 2), this.Q0);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ((kw3) getZoomableController()).e();
        if (this.S0 > 0 && this.T0 == 0) {
            ((kw3) getZoomableController()).d(this.S0);
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [one.me.sdk.zoom.ZoomableDraweeView, on4, ru.ok.messages.views.widgets.AvatarCropView, android.view.View] */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        AvatarCropView.super.onMeasure(i, i2);
        if (this.T0 == 1) {
            i3 = getMeasuredWidth() - (this.M0 * 2);
            i4 = getMeasuredHeight() - (this.N0 * 2);
        } else {
            i3 = Math.min(getMeasuredWidth() - (this.K0 * 2), getMeasuredHeight() - (this.L0 * 2));
            i4 = i3;
        }
        this.O0.reset();
        if (this.T0 == 1) {
            int i5 = i3 / 2;
            int i6 = i4 / 2;
            this.O0.addRect((float) ((getMeasuredWidth() / 2) - i5), (float) ((getMeasuredHeight() / 2) - i6), (float) ((getMeasuredWidth() / 2) + i5), (float) ((getMeasuredHeight() / 2) + i6), Path.Direction.CCW);
        } else {
            this.O0.addCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) (i3 / 2), Path.Direction.CCW);
        }
        int i7 = i3 / 2;
        int i8 = i4 / 2;
        this.R0.set((getMeasuredWidth() / 2) - i7, (getMeasuredHeight() / 2) - i8, (getMeasuredWidth() / 2) + i7, (getMeasuredHeight() / 2) + i8);
        ((kw3) getZoomableController()).m = this.R0;
    }

    public void setMode(int i) {
        this.T0 = i;
        if (i == 1) {
            this.Q0.setAlpha(255);
            ((kw3) getZoomableController()).o = false;
            return;
        }
        this.Q0.setAlpha(50);
        ((kw3) getZoomableController()).o = true;
    }

    public void setTransformChangeListener(gc0 gc0) {
        this.U0 = gc0;
    }
}
