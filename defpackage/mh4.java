package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: mh4  reason: default package */
public final class mh4 implements Executor {
    public static final /* synthetic */ mh4 X = new mh4(7);
    public static volatile mh4 b;
    public static final /* synthetic */ mh4 c = new mh4(1);
    public static final /* synthetic */ mh4 o = new mh4(2);
    public final /* synthetic */ int a;

    public /* synthetic */ mh4(int i) {
        this.a = i;
    }

    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                return;
            case 1:
                runnable.run();
                return;
            case 2:
                runnable.run();
                return;
            case 3:
                new Handler(Looper.getMainLooper()).post(runnable);
                return;
            case 4:
                new Thread(runnable).start();
                return;
            case 5:
                runnable.run();
                return;
            case 6:
                runnable.run();
                return;
            case 7:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
