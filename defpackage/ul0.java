package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: ul0  reason: default package */
public final class ul0 implements Executor {
    public final /* synthetic */ int a;
    public final Handler b;

    public /* synthetic */ ul0(Handler handler) {
        this.a = 1;
        this.b = handler;
    }

    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                this.b.post(runnable);
                return;
            default:
                this.b.post(runnable);
                return;
        }
    }

    public ul0() {
        this.a = 0;
        this.b = new Handler(Looper.getMainLooper());
    }
}
