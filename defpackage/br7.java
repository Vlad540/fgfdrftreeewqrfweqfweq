package defpackage;

import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieFactory;
import one.me.rlottie.RLottieImageView;
import one.me.rlottie.RLottieImageViewUtils;

/* renamed from: br7  reason: default package */
public final class br7 extends RLottieImageView implements RLottieDrawable.OnNextFrameRenderedListener, RLottieDrawable.DrawableLoadListener, cr7 {
    public String B0;
    public boolean C0;
    public ar7 D0;
    public zq7 E0;

    public final void c() {
        RLottieImageViewUtils.release(this);
        this.B0 = null;
    }

    public final boolean f(int i, int i2, String str) {
        if (str == null || str.length() == 0) {
            c();
            return true;
        }
        String str2 = this.B0;
        if (str2 != null && hhd.f(str2, str)) {
            return false;
        }
        this.C0 = true;
        this.B0 = str;
        RLottieDrawable create = RLottieFactory.create(new RLottieFactory.Config.Builder().setAutoStart(true).setAutoRepeat(true).setWay(((RLottieFactory.Way.Url.Builder) new RLottieFactory.Way.Url.Builder().setUrl(str).setSize(i, i2)).setNetworkFetchEnabled(true).build()).build());
        create.addDrawableLoadListener(this);
        create.addOnNextFrameRenderedListener(this);
        RLottieImageViewUtils.setLottieDrawable(this, create);
        return true;
    }

    public final void onError(Throwable th) {
        if (this.E0 != null) {
            udd.s(gr7.class.getName(), "lottie set animation failed: ", th);
        }
    }

    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        udd.p(br7.class.getName(), "onLoaded %s", new Object[]{rLottieDrawable});
    }

    public final void onNextFrameRendered(RLottieDrawable rLottieDrawable, int i) {
        if (this.C0) {
            ar7 ar7 = this.D0;
            if (ar7 != null) {
                ar7.e();
            }
            this.C0 = false;
        }
    }

    public final void setFailureListener(zq7 zq7) {
        this.E0 = zq7;
    }

    public final void setOnFirstFrameListener(ar7 ar7) {
        this.D0 = ar7;
        this.C0 = true;
    }
}
