package androidx.work;

import android.content.Context;

public abstract class Worker extends hh7 {
    public b4d a;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract gh7 b();

    /* JADX WARNING: type inference failed for: r0v0, types: [ch7, java.lang.Object] */
    public final ch7 getForegroundInfoAsync() {
        ? obj = new Object();
        getBackgroundExecutor().execute(new p36((Object) this, (Object) obj, false, 28));
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [b4d, java.lang.Object] */
    public final ch7 startWork() {
        this.a = new Object();
        getBackgroundExecutor().execute(new lde(9, (Object) this));
        return this.a;
    }
}
