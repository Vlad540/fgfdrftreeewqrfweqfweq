package ru.ok.tamtam.workmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H@¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\b¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8DX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010'\u001a\u00020&8\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Lhh7;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lch7;", "Lgh7;", "startWork", "()Lch7;", "Ljue;", "onStopWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lzy3;", "data", "setProgress", "(Lzy3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhu5;", "foregroundInfo", "setForeground", "(Lhu5;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "Ld73;", "job", "Ld73;", "Lb4d;", "future", "Lb4d;", "Lkae;", "tamComponent$delegate", "Lt97;", "getTamComponent", "()Lkae;", "tamComponent", "Lju3;", "coroutineContext", "Lju3;", "getCoroutineContext", "()Lju3;", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public abstract class SdkCoroutineWorker extends hh7 {
    private final ju3 coroutineContext;
    /* access modifiers changed from: private */
    public final b4d future;
    private final d73 job = lp.a();
    private final t97 tamComponent$delegate;

    /* JADX WARNING: type inference failed for: r4v2, types: [b4d, l1, java.lang.Object] */
    public SdkCoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        ? obj = new Object();
        this.future = obj;
        obj.c(new pzb(8, this), (qm) getTaskExecutor().a);
        this.tamComponent$delegate = new r7e(new t2a(context, 26));
        this.coroutineContext = ((nqc) getTamComponent()).s().a();
    }

    public static void b(SdkCoroutineWorker sdkCoroutineWorker) {
        if (sdkCoroutineWorker.future.a instanceof r0) {
            sdkCoroutineWorker.job.cancel((CancellationException) null);
        }
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(SdkCoroutineWorker sdkCoroutineWorker, Continuation<? super hu5> continuation) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(Continuation continuation);

    public ju3 getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(Continuation continuation) {
        return getForegroundInfo$suspendImpl(this, continuation);
    }

    public final ch7 getForegroundInfoAsync() {
        h37 a = lp.a();
        ContextScope a2 = n1g.a(getCoroutineContext().plus(a));
        s37 s37 = new s37(a);
        xs7.E(a2, (hu3) null, (ru3) null, new oqc(s37, this, (Continuation) null), 3);
        return s37;
    }

    public final kae getTamComponent() {
        return (kae) this.tamComponent$delegate.getValue();
    }

    public Object onStopWork(Continuation<? super jue> continuation) {
        return jue.a;
    }

    public final void onStopped() {
        this.future.cancel(false);
        xs7.E(n1g.a(getCoroutineContext().plus(this.job)), (hu3) null, (ru3) null, new pqc(this, (Continuation) null), 3);
    }

    public final Object setForeground(hu5 hu5, Continuation<? super jue> continuation) {
        ch7 foregroundAsync = setForegroundAsync(hu5);
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e) {
                e = e;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                throw e;
            }
        } else {
            zv1 zv1 = new zv1(1, urd.y(continuation));
            zv1.n();
            foregroundAsync.c(new p36(zv1, 19, foregroundAsync), jh4.a);
            zv1.d(new qqc(foregroundAsync, 0));
            Object m = zv1.m();
            if (m == pu3.a) {
                return m;
            }
        }
        return jue.a;
    }

    public final Object setProgress(zy3 zy3, Continuation<? super jue> continuation) {
        ch7 progressAsync = setProgressAsync(zy3);
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e) {
                e = e;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                throw e;
            }
        } else {
            zv1 zv1 = new zv1(1, urd.y(continuation));
            zv1.n();
            progressAsync.c(new q36(zv1, 17, progressAsync), jh4.a);
            zv1.d(new qqc(progressAsync, 1));
            Object m = zv1.m();
            if (m == pu3.a) {
                return m;
            }
        }
        return jue.a;
    }

    public final ch7 startWork() {
        xs7.E(n1g.a(getCoroutineContext().plus(this.job)), (hu3) null, (ru3) null, new rqc(this, (Continuation) null), 3);
        return this.future;
    }
}
