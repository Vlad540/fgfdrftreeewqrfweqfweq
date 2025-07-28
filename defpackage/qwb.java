package defpackage;

import com.google.gson.Gson;
import one.me.rlottie.RLottie;
import one.me.rlottie.RLottieDrawable;

/* renamed from: qwb  reason: default package */
public final /* synthetic */ class qwb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RLottieDrawable b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ qwb(RLottieDrawable rLottieDrawable, Runnable runnable, int i) {
        this.a = i;
        this.b = rLottieDrawable;
        this.c = runnable;
    }

    public final void run() {
        Runnable runnable = this.c;
        RLottieDrawable rLottieDrawable = this.b;
        switch (this.a) {
            case 0:
                Gson gson = RLottieDrawable.gson;
                rLottieDrawable.getClass();
                try {
                    rn0 rn0 = rLottieDrawable.w1;
                    if (rn0 != null) {
                        rn0.b();
                    }
                } catch (Throwable th) {
                    RLottie.getLogger().o(th);
                }
                je.d(new qwb(rLottieDrawable, runnable, 1));
                return;
            default:
                Gson gson2 = RLottieDrawable.gson;
                rLottieDrawable.getClass();
                runnable.run();
                if (rLottieDrawable.K0 != null) {
                    rLottieDrawable.K0 = null;
                    rn0.c();
                    return;
                }
                return;
        }
    }
}
