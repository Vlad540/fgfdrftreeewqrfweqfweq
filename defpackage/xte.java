package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: xte  reason: default package */
public enum xte implements Executor {
    ;
    
    public static final Handler b = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Enum, xte] */
    static {
        b = new Handler(Looper.getMainLooper());
    }

    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
