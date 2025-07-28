package defpackage;

import android.animation.ValueAnimator;

/* renamed from: dg  reason: default package */
public final /* synthetic */ class dg implements ValueAnimator.DurationScaleChangeListener {
    public final /* synthetic */ afc a;

    public /* synthetic */ dg(afc afc) {
        this.a = afc;
    }

    public final void onChanged(float f) {
        ((fg) this.a.b).g = f;
    }
}
