package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: yoc  reason: default package */
public final class yoc implements u16 {
    public final /* synthetic */ qoc X;
    public final /* synthetic */ View a;
    public final /* synthetic */ zoc b;
    public final /* synthetic */ toc c;
    public final /* synthetic */ zoc o;

    public yoc(qoc qoc, zoc zoc, toc toc, zoc zoc2, qoc qoc2) {
        this.a = qoc;
        this.b = zoc;
        this.c = toc;
        this.o = zoc2;
        this.X = qoc2;
    }

    public final Object invoke(Object obj) {
        ValueAnimator valueAnimator = (ValueAnimator) obj;
        View view = this.a;
        float translationY = ((float) 1) - (view.getTranslationY() / (dh4.c().getDisplayMetrics().density * 4.0f));
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{view.getTranslationY(), dh4.c().getDisplayMetrics().density * 4.0f});
        ofFloat.setDuration((long) (((float) 200) * translationY));
        ofFloat.setInterpolator(zoc.B0);
        qoc qoc = (qoc) view;
        ofFloat.addListener(new woc(qoc, this.b, this.c, this.o, this.X));
        ofFloat.addUpdateListener(new xoc(qoc, animatedFraction));
        ofFloat.start();
        return ofFloat;
    }
}
