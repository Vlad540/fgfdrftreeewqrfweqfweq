package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;

/* renamed from: rv7  reason: default package */
public abstract class rv7 {
    public final TimeInterpolator a;
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public gd0 f;

    public rv7(View view) {
        this.b = view;
        Context context = view.getContext();
        this.a = ct0.I(context, wlb.motionEasingStandardDecelerateInterpolator, dla.b(0.0f, 0.0f, 0.0f, 1.0f));
        this.c = ct0.H(wlb.motionDurationMedium2, 300, context);
        this.d = ct0.H(wlb.motionDurationShort3, 150, context);
        this.e = ct0.H(wlb.motionDurationShort2, 100, context);
    }
}
