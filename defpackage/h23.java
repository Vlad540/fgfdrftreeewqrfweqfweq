package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;

/* renamed from: h23  reason: default package */
public final class h23 extends vf8 implements p13 {
    public final v13 G0;

    public h23(Context context) {
        super(context);
        this.G0 = new v13(context, this);
        setTransitionGroup(true);
    }

    public final int b(int i, int i2) {
        v13 v13 = this.G0;
        int i3 = v13.c;
        v13.b(i, i2);
        return v13.d;
    }

    public final void d(MotionEvent motionEvent, int[] iArr) {
        this.G0.e(a24.X(motionEvent.getX()), a24.X(motionEvent.getY()), iArr);
    }

    public final boolean h(MotionEvent motionEvent) {
        return false;
    }

    public final void invalidateDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.invalidateDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new d23(this, drawable, 0));
        } else {
            post(new e23(this, drawable, 0));
        }
    }

    public final q13 n(MotionEvent motionEvent) {
        return this.G0.a(a24.X(motionEvent.getX()), a24.X(motionEvent.getY()));
    }

    public final void onDraw(Canvas canvas) {
        float measuredWidth = (float) getMeasuredWidth();
        float measuredHeight = (float) getMeasuredHeight();
        float f = (float) 2;
        Matrix a = b28.a();
        a.reset();
        a.setScale((measuredWidth - ((dh4.c().getDisplayMetrics().density * 1.0f) * f)) / measuredWidth, (measuredHeight - ((1.0f * dh4.c().getDisplayMetrics().density) * f)) / measuredHeight, measuredWidth / 2.0f, measuredHeight / 2.0f);
        Path b = b28.b();
        b.reset();
        b.set(((on8) getBackground()).a());
        b.transform(b28.a());
        Path b2 = b28.b();
        int save = canvas.save();
        canvas.clipPath(b2);
        try {
            dispatchDraw(canvas);
            v13 v13 = this.G0;
            int length = v13.h.length;
            for (int i = 0; i < length; i++) {
                lfc e = v13.e.c(i).e();
                if (e != null) {
                    e.draw(canvas);
                }
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.G0.e.r();
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.G0.e.t();
    }

    public final long s(int i, int i2, int i3, int i4) {
        v13 v13 = this.G0;
        v13.c(i2);
        return az6.a(v13.c, v13.d);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.scheduleDrawable(drawable, runnable, j);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new f23(this, drawable, runnable, j, 0));
            return;
        }
        post(new f23(this, drawable, runnable, j, 1));
    }

    public void setOnFinalImageSetCallback(u16 u16) {
        this.G0.g = u16;
    }

    public final void u(sy7 sy7) {
        w13 w13 = (w13) sy7;
        float[] fArr = w13.a;
        v13 v13 = this.G0;
        v13.h = fArr;
        v13.f.o1(v13, v13.k[0], w13.b);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable, runnable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new g23(this, drawable, runnable, 0));
        } else {
            post(new g23(this, drawable, runnable, 1));
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return this.G0.g(drawable) || super.verifyDrawable(drawable);
    }

    public final void unscheduleDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new d23(this, drawable, 1));
        } else {
            post(new e23(this, drawable, 1));
        }
    }
}
