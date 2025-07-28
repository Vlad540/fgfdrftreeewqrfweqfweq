package defpackage;

import android.animation.FloatEvaluator;
import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* renamed from: lt1  reason: default package */
public final class lt1 extends FrameLayout {
    public static final /* synthetic */ int E0 = 0;
    public int A0;
    public final lme B0;
    public kt1 C0;
    public boolean D0;
    public vkb a;
    public ValueAnimator b;
    public final IntEvaluator c = new IntEvaluator();
    public final FloatEvaluator o = new FloatEvaluator();
    public int w0;
    public int x0;
    public float y0;
    public int z0;

    /* JADX WARNING: type inference failed for: r3v3, types: [lme, android.view.ViewOutlineProvider] */
    public lt1(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        ? viewOutlineProvider = new ViewOutlineProvider();
        viewOutlineProvider.a = 0;
        viewOutlineProvider.b = 0;
        this.B0 = viewOutlineProvider;
        setOutlineProvider(viewOutlineProvider);
    }

    public static final void b(lt1 lt1, int i, int i2, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8, float f3) {
        Integer evaluate = lt1.c.evaluate(f3, Integer.valueOf(i), Integer.valueOf(i2));
        IntEvaluator intEvaluator = lt1.c;
        Integer evaluate2 = intEvaluator.evaluate(f3, Integer.valueOf(i3), Integer.valueOf(i4));
        Float evaluate3 = lt1.o.evaluate(f3, Float.valueOf(f), Float.valueOf(f2));
        Integer evaluate4 = intEvaluator.evaluate(f3, Integer.valueOf(i5), Integer.valueOf(i6));
        Integer evaluate5 = intEvaluator.evaluate(f3, Integer.valueOf(i7), Integer.valueOf(i8));
        lt1.getLayoutParams().width = evaluate.intValue();
        lt1.getLayoutParams().height = evaluate2.intValue();
        lt1.setLayoutParams(lt1.getLayoutParams());
        lt1.setTranslationY(evaluate3.floatValue());
        int intValue = evaluate4.intValue();
        lme lme = lt1.B0;
        lme.a = intValue;
        lme.b = evaluate5.intValue();
        lt1.invalidateOutline();
    }

    public final void a(boolean z, boolean z2) {
        boolean z3 = z;
        if (this.D0 != z3) {
            this.D0 = z3;
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            vkb vkb = this.a;
            if (vkb == null) {
                vkb = null;
            }
            boolean z4 = this.D0;
            if (vkb.b != z4) {
                vkb.b = z4;
                ValueAnimator valueAnimator2 = vkb.c;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                float alpha = vkb.z0.getAlpha();
                float f = z4 ? 0.0f : 1.0f;
                float alpha2 = vkb.H0.getAlpha();
                float f2 = z4 ? 1.0f : 0.0f;
                if (z2) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    vkb.c = ofFloat;
                    ofFloat.addUpdateListener(new rkb(vkb, alpha, f, alpha2, f2));
                    ofFloat.setStartDelay(z4 ? 50 : 0);
                    ofFloat.setDuration(150);
                    ofFloat.start();
                } else {
                    vkb.b(vkb, alpha, f, alpha2, f2, 1.0f);
                }
            }
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int measuredWidth2 = this.D0 ? jjd.n(this).getMeasuredWidth() : this.w0;
            int measuredHeight2 = this.D0 ? jjd.n(this).getMeasuredHeight() : this.x0;
            float translationY = getTranslationY();
            boolean z5 = this.D0;
            float f3 = z5 ? 0.0f : this.y0;
            lme lme = this.B0;
            int i = lme.a;
            int i2 = 0;
            int i3 = z5 ? 0 : this.z0;
            int i4 = lme.b;
            if (!z5) {
                i2 = this.A0;
            }
            if (z2) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                this.b = ofFloat2;
                ofFloat2.addUpdateListener(new jt1(this, measuredWidth, measuredWidth2, measuredHeight, measuredHeight2, translationY, f3, i, i3, i4, i2));
                ofFloat2.setDuration(200);
                ofFloat2.start();
                return;
            }
            b(this, measuredWidth, measuredWidth2, measuredHeight, measuredHeight2, translationY, f3, i, i3, i4, i2, 1.0f);
        }
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof vkb) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalArgumentException("child must be QuickCameraView instance".toString());
    }

    public final kt1 getListener() {
        return this.C0;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.D0;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        lme lme = this.B0;
        boolean z = true;
        boolean z2 = y <= ((float) lme.a);
        if (motionEvent.getY() < ((float) (getMeasuredHeight() - lme.b))) {
            z = false;
        }
        if (this.D0 || (!z2 && !z)) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setListener(kt1 kt1) {
        this.C0 = kt1;
    }

    public final void setPreviewTranslationY(float f) {
        this.y0 = f;
        if (!this.D0) {
            setTranslationY(f);
        }
    }
}
