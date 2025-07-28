package ru.ok.messages.views.widgets.audiowave;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ok/messages/views/widgets/audiowave/AudioWaveView;", "Landroid/view/View;", "Lmhe;", "Lr60;", "listener", "Ljue;", "setListener", "(Lr60;)V", "", "F0", "Z", "isIncomingMessage", "()Z", "setIncomingMessage", "(Z)V", "", "getDataWidth", "()I", "dataWidth", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class AudioWaveView extends View implements mhe {
    public final Paint A0;
    public final Paint B0;
    public final Paint C0;
    public final Path D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public r60 H0;
    public final byte[] I0;
    public final int[] a;
    public final float b;
    public final float c;
    public final float o;
    public final float w0;
    public byte[] x0;
    public int y0;
    public final Paint z0;

    public AudioWaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final int getDataWidth() {
        byte[] bArr = this.x0;
        if (bArr == null) {
            return 0;
        }
        return (int) ((((float) (bArr.length - 1)) * this.c) + (((float) bArr.length) * this.o));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int[] r0 = r4.a
            r4.getLocationOnScreen(r0)
            r1 = 0
            r0 = r0[r1]
            float r5 = r5.getRawX()
            int r4 = r4.getWidth()
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            if (r4 != 0) goto L_0x0017
        L_0x0015:
            r5 = r2
            goto L_0x0029
        L_0x0017:
            int r3 = r0 + r4
            float r3 = (float) r3
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0020
            r5 = r1
            goto L_0x0029
        L_0x0020:
            float r0 = (float) r0
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x0026
            goto L_0x0015
        L_0x0026:
            float r5 = r5 - r0
            float r4 = (float) r4
            float r5 = r5 / r4
        L_0x0029:
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0035
            r4 = 0
            r2 = 1
            long r4 = r4 - r2
            float r4 = (float) r4
            float r5 = r1 / r4
        L_0x0035:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.views.widgets.audiowave.AudioWaveView.a(android.view.MotionEvent):float");
    }

    /* JADX INFO: finally extract failed */
    public final void onDraw(Canvas canvas) {
        float f;
        Path path = this.D0;
        if (!path.isEmpty()) {
            float measuredHeight = ((float) getMeasuredHeight()) / 2.0f;
            float width = ((((float) 0) / ((float) 0)) * ((float) getWidth())) + 0.5f;
            boolean z = this.G0;
            float X = (float) a24.X(((float) 6) * getContext().getResources().getDisplayMetrics().density);
            if (this.G0) {
                X += (float) a24.X(((float) 2) * getContext().getResources().getDisplayMetrics().density);
            }
            if (z) {
                canvas.save();
                float X2 = ((float) a24.X(((float) 2) * getContext().getResources().getDisplayMetrics().density)) + X;
                f = width < X2 ? X2 : width;
                if (f > ((float) getWidth()) - X2) {
                    f = ((float) getWidth()) - X2;
                }
                r60 r60 = this.H0;
                if (r60 != null) {
                    r60.a(f);
                }
            } else {
                f = 0.0f;
            }
            Paint paint = this.z0;
            if (!z) {
                canvas.drawPath(path, paint);
                return;
            }
            int save = canvas.save();
            try {
                canvas.clipRect(0.0f, 0.0f, width, (float) canvas.getHeight());
                canvas.drawPath(path, this.A0);
                canvas.restoreToCount(save);
                int save2 = canvas.save();
                try {
                    canvas.clipRect(width, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
                    canvas.drawPath(path, paint);
                    canvas.restoreToCount(save2);
                    canvas.drawCircle(f, measuredHeight, this.w0 + X, this.C0);
                    canvas.drawCircle(f, measuredHeight, X, this.B0);
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
        super.onMeasure(i, i2);
    }

    public final void onThemeChanged(pda pda) {
        dr0 dr0;
        wce wce;
        wce wce2;
        if (this.F0) {
            if (isInEditMode()) {
                wce2 = db4.e0;
            } else {
                Context context = getContext();
                r7e r7e = wce.a0;
                wce2 = fja.E(context);
            }
            dr0 = wce2.h;
        } else {
            if (isInEditMode()) {
                wce = db4.e0;
            } else {
                Context context2 = getContext();
                r7e r7e2 = wce.a0;
                wce = fja.E(context2);
            }
            dr0 = wce.g;
        }
        this.z0.setColor(dr0.a.f);
        Paint paint = this.B0;
        xq0 xq0 = dr0.a;
        paint.setColor(xq0.e);
        this.C0.setColor(dr0.d.b);
        this.A0.setColor(xq0.e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.G0
            if (r0 == 0) goto L_0x0059
            int r0 = r5.getAction()
            r1 = 1
            if (r0 == 0) goto L_0x0042
            r2 = 0
            if (r0 == r1) goto L_0x002c
            r3 = 2
            if (r0 == r3) goto L_0x0015
            r3 = 3
            if (r0 == r3) goto L_0x002c
            goto L_0x0058
        L_0x0015:
            boolean r0 = r4.G0
            if (r0 != 0) goto L_0x001a
            goto L_0x0058
        L_0x001a:
            boolean r0 = r4.E0
            if (r0 == 0) goto L_0x0020
            r4.E0 = r2
        L_0x0020:
            r60 r0 = r4.H0
            if (r0 == 0) goto L_0x0058
            float r4 = r4.a(r5)
            r0.d(r4)
            goto L_0x0058
        L_0x002c:
            r4.E0 = r2
            r4.G0 = r2
            r60 r0 = r4.H0
            if (r0 == 0) goto L_0x003a
            r4.a(r5)
            r0.b()
        L_0x003a:
            android.view.ViewParent r4 = r4.getParent()
            r4.requestDisallowInterceptTouchEvent(r2)
            goto L_0x0058
        L_0x0042:
            r4.E0 = r1
            r4.G0 = r1
            android.view.ViewParent r0 = r4.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            r60 r0 = r4.H0
            if (r0 == 0) goto L_0x0058
            float r4 = r4.a(r5)
            r0.e(r4)
        L_0x0058:
            return r1
        L_0x0059:
            boolean r4 = super.onTouchEvent(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.views.widgets.audiowave.AudioWaveView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setIncomingMessage(boolean z) {
        this.F0 = z;
    }

    public final void setListener(r60 r60) {
        this.H0 = r60;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioWaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.a = new int[2];
        this.D0 = new Path();
        setLayerType(1, (Paint) null);
        this.b = dh4.c().getDisplayMetrics().density * 5.0f;
        this.c = dh4.c().getDisplayMetrics().density * 2.0f;
        float f = dh4.c().getDisplayMetrics().density * 2.0f;
        this.o = f;
        this.w0 = dh4.c().getDisplayMetrics().density * 2.0f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f);
        this.z0 = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.B0 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        this.C0 = paint3;
        this.A0 = new Paint(paint);
        xy6.c(this);
        if (xy6.w(this)) {
            setScaleX(-1.0f);
        }
        this.I0 = new byte[0];
    }
}
