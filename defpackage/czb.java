package defpackage;

import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;

/* renamed from: czb  reason: default package */
public final class czb implements RLottieDrawable.OnAllFramesRenderedListener {
    public boolean a;
    public final /* synthetic */ dzb b;
    public final /* synthetic */ RLottieImageView c;

    public czb(dzb dzb, RLottieImageView rLottieImageView) {
        this.b = dzb;
        this.c = rLottieImageView;
    }

    public final void onAllFramesRendered(RLottieDrawable rLottieDrawable, boolean z) {
        dzb dzb = this.b;
        String str = dzb.a;
        boolean z2 = this.a;
        udd.q(str, "Reaction effect. OnAllFramesRendered, called:" + z2);
        if (!this.a) {
            dzb.post(new px4(this, dzb, this.c, 22));
        }
    }
}
