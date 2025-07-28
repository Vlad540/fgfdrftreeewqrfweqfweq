package defpackage;

import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;

/* renamed from: bzb  reason: default package */
public final class bzb implements RLottieDrawable.DrawableLoadListener {
    public boolean a;
    public final /* synthetic */ dzb b;
    public final /* synthetic */ RLottieImageView c;

    public bzb(dzb dzb, RLottieImageView rLottieImageView) {
        this.b = dzb;
        this.c = rLottieImageView;
    }

    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        String str = this.b.a;
        boolean z = this.a;
        udd.q(str, "Reaction effect. OnLoaded, called:" + z);
        if (!this.a) {
            this.a = true;
            this.c.playAnimation();
        }
    }
}
