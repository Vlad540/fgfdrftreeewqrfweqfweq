package androidx.work;

import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lhh7;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 7, 1})
public abstract class CoroutineWorker extends hh7 {
    public final h37 a = lp.a();
    public final b4d b;
    public final ha4 c;

    /* JADX WARNING: type inference failed for: r2v2, types: [b4d, l1, java.lang.Object] */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        ? obj = new Object();
        this.b = obj;
        obj.c(new ds1(18, this), (qm) ((duf) getTaskExecutor()).a);
        this.c = oi4.a;
    }

    public abstract Object doWork(Continuation continuation);

    public final ch7 getForegroundInfoAsync() {
        h37 a2 = lp.a();
        ContextScope a3 = n1g.a(this.c.plus(a2));
        s37 s37 = new s37(a2);
        xs7.E(a3, (hu3) null, (ru3) null, new su3(s37, this, (Continuation) null), 3);
        return s37;
    }

    public final void onStopped() {
        this.b.cancel(false);
    }

    public final ch7 startWork() {
        xs7.E(n1g.a(this.c.plus(this.a)), (hu3) null, (ru3) null, new tu3(this, (Continuation) null), 3);
        return this.b;
    }
}
