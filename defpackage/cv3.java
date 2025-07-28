package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: cv3  reason: default package */
public final class cv3 extends AppCompatTextView implements mhe {
    public final sy2 A0;
    public long y0;
    public final ValueAnimator z0 = ValueAnimator.ofFloat(new float[]{360.0f, 0.0f});

    /* JADX WARNING: type inference failed for: r2v0, types: [cv3, android.widget.TextView, android.view.View] */
    public cv3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sy2 sy2 = new sy2();
        s59 s59 = km4.y0;
        sy2.a.setColor(s59.r(this).h().a);
        this.A0 = sy2;
        setBackground(sy2);
        nte.n.b(this, yq4.b);
        setTextAlignment(4);
        s59.r(this);
        setTextColor(-1);
        setGravity(17);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [cv3, android.view.View, java.lang.Object] */
    public final void onAttachedToWindow() {
        cv3.super.onAttachedToWindow();
        long j = this.y0;
        ValueAnimator valueAnimator = this.z0;
        valueAnimator.setDuration(j);
        valueAnimator.addUpdateListener(new c00(5, this));
        valueAnimator.start();
    }

    public final void onDetachedFromWindow() {
        cv3.super.onDetachedFromWindow();
        this.z0.cancel();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [cv3, android.widget.TextView] */
    public final void onThemeChanged(pda pda) {
        this.A0.a.setColor(pda.h().a);
        setTextColor(-1);
    }

    public final void setMaxValue(long j) {
        this.y0 = j;
    }
}
