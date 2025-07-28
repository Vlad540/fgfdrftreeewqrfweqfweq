package defpackage;

import android.os.Process;
import com.google.gson.Gson;
import one.me.rlottie.RLottieDrawable;

/* renamed from: k30  reason: default package */
public final /* synthetic */ class k30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ k30(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    public final void run() {
        Runnable runnable = this.b;
        switch (this.a) {
            case 0:
                Process.setThreadPriority(-16);
                runnable.run();
                return;
            case 1:
                try {
                    runnable.run();
                    return;
                } catch (InterruptedException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    udd.S("Fresco", "failed to execute fresco task", e2);
                    return;
                }
            case 2:
                try {
                    runnable.run();
                    return;
                } catch (InterruptedException e3) {
                    throw e3;
                } catch (IllegalStateException e4) {
                    udd.S("Fresco", "failed to execute fresco task", e4);
                    return;
                }
            case 3:
                try {
                    runnable.run();
                    return;
                } catch (InterruptedException e5) {
                    throw e5;
                } catch (IllegalStateException e6) {
                    udd.S("Fresco", "failed to execute fresco task", e6);
                    return;
                }
            case 4:
                Gson gson = RLottieDrawable.gson;
                je.d(runnable);
                return;
            case 5:
                Gson gson2 = RLottieDrawable.gson;
                je.d(runnable);
                return;
            default:
                r7e r7e = koe.a;
                koe.a(runnable);
                return;
        }
    }
}
