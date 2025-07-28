package defpackage;

import android.graphics.drawable.Drawable;
import one.me.rlottie.RLottieDrawable;

/* renamed from: wj  reason: default package */
public final class wj implements RLottieDrawable.DrawableLoadListener {
    public final /* synthetic */ zj a;
    public final /* synthetic */ String b;

    public wj(zj zjVar, String str) {
        this.a = zjVar;
        this.b = str;
    }

    public final void onError(Throwable th) {
        zj zjVar = this.a;
        udd.s(zjVar.w0, "Animoji lottie download. Fail", th);
        String str = this.b;
        if (str == null || str.length() == 0) {
            zjVar.e(uj.a);
        } else {
            zjVar.c(str);
        }
        RLottieDrawable rLottieDrawable = zjVar.B0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback((Drawable.Callback) null);
        }
        zjVar.B0 = null;
    }

    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        String str = this.a.w0;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            String currentUrl = rLottieDrawable.getCurrentUrl();
            fn6.d(tn7, str, "Animoji lottie download. Success, url:" + currentUrl + ", class: " + rLottieDrawable, (Throwable) null);
        }
        rLottieDrawable.setCallback(this.a.x0);
        zj zjVar = this.a;
        zjVar.B0 = rLottieDrawable;
        zjVar.e(uj.c);
        if (!rLottieDrawable.isRunning() && n1g.A(this.a.C0)) {
            rLottieDrawable.start();
        }
        if (rLottieDrawable.getBounds().isEmpty() && !this.a.getBounds().isEmpty()) {
            rLottieDrawable.setBounds(this.a.getBounds());
        }
        rLottieDrawable.invalidateInternal();
        rLottieDrawable.removeDrawableLoadListener(this);
    }
}
