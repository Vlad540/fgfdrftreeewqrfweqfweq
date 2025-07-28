package defpackage;

import android.view.View;
import one.me.rlottie.RLottieDrawable;

/* renamed from: azb  reason: default package */
public final class azb implements View.OnAttachStateChangeListener {
    public final /* synthetic */ czb X;
    public final /* synthetic */ View a;
    public final /* synthetic */ dzb b;
    public final /* synthetic */ RLottieDrawable c;
    public final /* synthetic */ bzb o;

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, one.me.rlottie.RLottieImageView] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public azb(one.me.rlottie.RLottieImageView r1, defpackage.dzb r2, one.me.rlottie.RLottieDrawable r3, defpackage.bzb r4, defpackage.czb r5) {
        /*
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.o = r4
            r0.X = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azb.<init>(one.me.rlottie.RLottieImageView, dzb, one.me.rlottie.RLottieDrawable, bzb, czb):void");
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        udd.q(this.b.a, "onDetach");
        RLottieDrawable rLottieDrawable = this.c;
        rLottieDrawable.removeDrawableLoadListener(this.o);
        rLottieDrawable.removeOnAllFramesRenderedListener(this.X);
    }
}
