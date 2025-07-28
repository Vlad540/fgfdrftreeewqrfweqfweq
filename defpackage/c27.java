package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: c27  reason: default package */
public final class c27 implements Executor {
    public static volatile c27 c;
    public final /* synthetic */ int a;
    public final Object b;

    public c27(ExecutorService executorService) {
        this.a = 2;
        this.b = executorService;
    }

    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((ExecutorService) this.b).execute(runnable);
                return;
            case 1:
                ((Handler) this.b).post(runnable);
                return;
            case 2:
                ((Executor) this.b).execute(new kjc(runnable, 0));
                return;
            default:
                ((z59) this.b).post(runnable);
                return;
        }
    }

    public c27(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new Handler(Looper.getMainLooper());
                return;
            case 3:
                z59 z59 = new z59(Looper.getMainLooper(), 3, false);
                Looper.getMainLooper();
                this.b = z59;
                return;
            default:
                this.b = Executors.newFixedThreadPool(2, new l30(3));
                return;
        }
    }
}
