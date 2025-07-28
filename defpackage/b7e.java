package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: b7e  reason: default package */
public final class b7e extends FrameLayout {
    public static final /* synthetic */ int w0 = 0;
    public final iaf a;
    public boolean b;
    public ValueAnimator c;
    public a7e o;

    public b7e(Context context) {
        super(context, (AttributeSet) null);
        iaf iaf = new iaf(getContext(), this, new yp0(2, this));
        iaf.b = (int) (1.0f * ((float) iaf.b));
        this.a = iaf;
    }

    public static void a(b7e b7e, float f) {
        b7e.setBackgroundAlpha(f);
    }

    public static void b(b7e b7e, float f, float f2) {
        if (f2 != 0.0f) {
            f2 = ((float) 1) - f2;
        }
        if (f > f2) {
            b7e.setBackgroundAlpha(((float) 1) - f);
        }
    }

    private final void setBackgroundAlpha(float f) {
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha((int) (gwf.i(f, 0.0f, 1.0f) * ((float) 255)));
        }
    }

    public final void c(int i, int i2, s16 s16, s16 s162, i26 i26) {
        a7e a7e = this.o;
        if (a7e != null) {
            ValueAnimator valueAnimator = this.c;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            ValueAnimator valueAnimator2 = this.c;
            if (valueAnimator2 != null) {
                vx3.f(valueAnimator2);
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
            ofInt.setDuration(200);
            ofInt.addUpdateListener(new jf(a7e, i26, animatedFraction, 2));
            ofInt.addListener(new sg(s162, this, s16, 2));
            ofInt.start();
            this.c = ofInt;
        }
    }

    public final void computeScroll() {
        if (this.a.f()) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [hca, android.view.View] */
    public final void d() {
        j8e j8e = this.o;
        if (j8e != null) {
            j8e j8e2 = j8e;
            if (((hca) j8e2.c).getHeight() > 0) {
                c(j8e2.q(), j8e2.p(), new opd(11), new opd(11), new z6e(this, 0));
            }
            invalidate();
        }
    }

    public final a7e getCallback() {
        return this.o;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a.o(motionEvent);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [hca, android.view.View] */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        j8e j8e = this.o;
        if (j8e != null) {
            j8e j8e2 = j8e;
            ? r1 = (hca) j8e2.c;
            int top = r1.getHeight() > 0 ? r1.getTop() : j8e2.q();
            super.onLayout(z, i, i2, i3, i4);
            r1.offsetTopAndBottom(top);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.a.i(motionEvent);
        return true;
    }

    public final void setCallback(a7e a7e) {
        this.o = a7e;
    }
}
