package defpackage;

import android.animation.ValueAnimator;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: nf  reason: default package */
public final class nf extends FrameLayout {
    public OneMeButton a;
    public OneMeButton b;
    public boolean c;
    public ValueAnimator o;
    public fnd w0;

    public static final void a(nf nfVar, OneMeButton oneMeButton) {
        nfVar.getClass();
        fnd fnd = new fnd((TextView) oneMeButton.findViewById(qhc.j), fnd.q, 0.0f);
        gnd gnd = new gnd(0.0f);
        gnd.b(200.0f);
        gnd.a(0.5f);
        fnd.m = gnd;
        fnd.a = 500.0f;
        kf kfVar = new kf(nfVar, oneMeButton);
        ArrayList arrayList = fnd.k;
        if (!arrayList.contains(kfVar)) {
            arrayList.add(kfVar);
        }
        fnd.g();
        nfVar.w0 = fnd;
    }

    private final void setupViewsPosition(boolean z) {
        if (z) {
            OneMeButton oneMeButton = this.a;
            if (oneMeButton != null) {
                oneMeButton.setTranslationY(0.0f);
            }
            OneMeButton oneMeButton2 = this.b;
            if (oneMeButton2 != null) {
                oneMeButton2.setTranslationY((float) getMeasuredHeight());
                return;
            }
            return;
        }
        OneMeButton oneMeButton3 = this.a;
        if (oneMeButton3 != null) {
            oneMeButton3.setTranslationY(-((float) getMeasuredHeight()));
        }
        OneMeButton oneMeButton4 = this.b;
        if (oneMeButton4 != null) {
            oneMeButton4.setTranslationY(0.0f);
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.o = null;
        fnd fnd = this.w0;
        if (fnd != null) {
            fnd.b();
        }
        this.w0 = null;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public final void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        OneMeButton oneMeButton = this.b;
        int measuredHeight = oneMeButton != null ? oneMeButton.getMeasuredHeight() : 0;
        OneMeButton oneMeButton2 = this.a;
        super.onMeasure(i, Math.max(measuredHeight, oneMeButton2 != null ? oneMeButton2.getMeasuredHeight() : 0));
        OneMeButton oneMeButton3 = this.a;
        if (oneMeButton3 != null) {
            oneMeButton3.setVisibility(0);
        }
        OneMeButton oneMeButton4 = this.b;
        if (oneMeButton4 != null) {
            oneMeButton4.setVisibility(0);
        }
        setupViewsPosition(isEnabled());
    }

    public final void setActiveButtonClickListener(s16 s16) {
        OneMeButton oneMeButton = this.a;
        if (oneMeButton != null) {
            a24.a0(oneMeButton, new q6(1, s16));
        }
    }

    public final void setActiveButtonLoaderState(boolean z) {
        OneMeButton oneMeButton = this.a;
        if (oneMeButton != null) {
            oneMeButton.setProgressEnabled(z);
            oneMeButton.setClickable(!z);
        }
    }

    public void setEnabled(boolean z) {
        OneMeButton oneMeButton;
        fnd fnd;
        if (isEnabled() != z) {
            if (!z || !this.c) {
                b();
                setupViewsPosition(z);
            } else {
                OneMeButton oneMeButton2 = this.a;
                if (!(oneMeButton2 == null || (oneMeButton = this.b) == null)) {
                    ValueAnimator valueAnimator = this.o;
                    if ((valueAnimator != null && valueAnimator.isRunning()) || ((fnd = this.w0) != null && fnd.f)) {
                        b();
                    }
                    float height = (float) getHeight();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, height});
                    ofFloat.setDuration(200);
                    ofFloat.addUpdateListener(new jf(oneMeButton, oneMeButton2, height, 0));
                    ofFloat.addListener(new mf(0, oneMeButton2));
                    ofFloat.addListener(new lf(this, 0, oneMeButton2));
                    ofFloat.start();
                    this.o = ofFloat;
                }
            }
            super.setEnabled(z);
        }
    }

    public final void setupActiveButton(u16 u16) {
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        u16.invoke(oneMeButton);
        oneMeButton.setOutlineProvider((ViewOutlineProvider) null);
        oneMeButton.setVisibility(oneMeButton.isEnabled() ? 0 : 8);
        this.a = oneMeButton;
        addView(oneMeButton);
    }

    public final void setupDisabledButton(u16 u16) {
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        u16.invoke(oneMeButton);
        setOutlineProvider(oneMeButton.getOutlineProvider());
        oneMeButton.setOutlineProvider((ViewOutlineProvider) null);
        oneMeButton.setVisibility(oneMeButton.isEnabled() ^ true ? 0 : 8);
        this.b = oneMeButton;
        addView(oneMeButton);
    }
}
