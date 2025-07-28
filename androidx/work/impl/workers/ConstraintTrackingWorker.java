package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Lhh7;", "Lusf;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class ConstraintTrackingWorker extends hh7 implements usf {
    public hh7 X;
    public final WorkerParameters a;
    public final Object b = new Object();
    public volatile boolean c;
    public final b4d o = new Object();

    /* JADX WARNING: type inference failed for: r1v2, types: [b4d, java.lang.Object] */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.a = workerParameters;
    }

    public final void a(List list) {
        a24 B = a24.B();
        String str = ef3.a;
        B.t(str, "Constraints changed for " + list);
        synchronized (this.b) {
            this.c = true;
        }
    }

    public final void f(List list) {
    }

    public final void onStopped() {
        hh7 hh7 = this.X;
        if (hh7 != null && !hh7.isStopped()) {
            hh7.stop();
        }
    }

    public final ch7 startWork() {
        getBackgroundExecutor().execute(new ds1(16, this));
        return this.o;
    }
}
