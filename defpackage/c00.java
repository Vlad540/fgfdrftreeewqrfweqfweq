package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.messages.secret.widgets.TimerView;
import ru.ok.messages.settings.view.BrightnessSeekBar;
import ru.ok.messages.views.widgets.SlideOutLayout;

/* renamed from: c00  reason: default package */
public final /* synthetic */ class c00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c00(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                d00 d00 = (d00) obj;
                d00.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d00.invalidateSelf();
                return;
            case 1:
                u10 u10 = (u10) obj;
                u10.getClass();
                u10.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u10.invalidateSelf();
                return;
            case 2:
                ((af9) obj).G0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                int i = BrightnessSeekBar.y0;
                BrightnessSeekBar brightnessSeekBar = (BrightnessSeekBar) obj;
                brightnessSeekBar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                brightnessSeekBar.w0 = floatValue;
                if (floatValue < 0.0f) {
                    brightnessSeekBar.w0 = 0.0f;
                }
                brightnessSeekBar.invalidate();
                return;
            case 4:
                ((f81) obj).invalidateSelf();
                return;
            case 5:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cv3 cv3 = (cv3) obj;
                int i2 = (int) ((((float) cv3.y0) * ((((float) 100) * floatValue2) / 360.0f)) / 100.0f);
                sy2 sy2 = cv3.A0;
                sy2.b = floatValue2;
                sy2.invalidateSelf();
                cv3.setText(String.valueOf((i2 / 1000) + 1));
                return;
            case 6:
                kw3 kw3 = (kw3) obj;
                kw3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue3 != 0.0f) {
                    Matrix matrix = kw3.k;
                    float v = floatValue3 / e07.v(matrix, 0);
                    RectF rectF = kw3.g;
                    matrix.postScale(v, 1.0f, rectF.centerX(), rectF.centerY());
                    kw3.j.set(matrix);
                    awf awf = kw3.b;
                    if (awf != null) {
                        awf.f(matrix);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                kp4 kp4 = (kp4) obj;
                kp4.getClass();
                kp4.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                i55 i55 = (i55) obj;
                i55.E0 = (Integer) valueAnimator.getAnimatedValue();
                ViewGroup.LayoutParams layoutParams = i55.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    i55.setLayoutParams(layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            case 9:
                t96 t96 = (t96) obj;
                t96.w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t96.invalidate();
                return;
            case 10:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                fb7 fb7 = (fb7) obj;
                if (animatedFraction <= 0.1f && fb7.a) {
                    fb7.a = false;
                    fb7.b.a();
                    return;
                } else if (animatedFraction > 0.1f) {
                    fb7.a = true;
                    return;
                } else {
                    return;
                }
            case 11:
                ((oj7) obj).invalidateSelf();
                return;
            case 12:
                ((ao8) obj).M0.getForeground().setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 13:
                t3a t3a = (t3a) obj;
                t3a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3a.invalidate();
                return;
            case 14:
                vyb vyb = (vyb) obj;
                vyb.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vyb.invalidate();
                return;
            case 15:
                vnc vnc = (vnc) obj;
                vnc.getClass();
                ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vnc.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                ((zcd) obj).invalidateSelf();
                return;
            case 17:
                jfd jfd = (jfd) obj;
                jfd.getClass();
                if (valueAnimator.isRunning()) {
                    jfd.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    jfd.invalidate();
                    return;
                }
                return;
            case 18:
                int i3 = SlideOutLayout.G0;
                ((SlideOutLayout) obj).e();
                return;
            case 19:
                ((TextView) obj).setWidth(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                int i4 = TimerView.C0;
                TimerView timerView = (TimerView) obj;
                timerView.getClass();
                timerView.w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 360.0f;
                timerView.invalidate();
                return;
            case 21:
                a6f a6f = (a6f) obj;
                a6f.N0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a6f.requestLayout();
                return;
            case 22:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6f r6f = (r6f) obj;
                r6f.H0 = floatValue4;
                qb7 qb7 = r6f.A0;
                ecc ecc = qb7 != null ? qb7.c.F0 : null;
                if (ecc != null) {
                    ecc.d(floatValue4);
                    return;
                }
                return;
            default:
                ((View) ((trf) ((mv4) obj).b).i.getParent()).invalidate();
                return;
        }
    }

    public /* synthetic */ c00(mv4 mv4, View view) {
        this.a = 23;
        this.b = mv4;
    }
}
