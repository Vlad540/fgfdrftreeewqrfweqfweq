package one.me.sdk.tasks;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"one/me/sdk/tasks/TaskMonitor$TaskMonitorWorker", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Ljee;", "taskRepository", "Lmbe;", "schedulers", "Lluf;", "workerService", "Lf03;", "clientPrefs", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ljee;Lmbe;Lluf;Lf03;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class TaskMonitor$TaskMonitorWorker extends Worker {
    public final f03 X;
    public final ho0 Y = new CountDownLatch(1);
    public final jee b;
    public final mbe c;
    public final luf o;

    public TaskMonitor$TaskMonitorWorker(Context context, WorkerParameters workerParameters, jee jee, mbe mbe, luf luf, f03 f03) {
        super(context, workerParameters);
        this.b = jee;
        this.c = mbe;
        this.o = luf;
        this.X = f03;
    }

    /* JADX WARNING: type inference failed for: r11v10, types: [gh7, java.lang.Object] */
    public final gh7 b() {
        Boolean bool;
        udd.p("gee", "work %s started at %s", new Object[]{getId(), Integer.valueOf(System.identityHashCode(this))});
        if (!c()) {
            UUID id = getId();
            udd.q("gee", "work " + id + " No tasks to be executed");
            return gh7.b();
        }
        ((lqc) this.X).w(true);
        o1d.y(this.o);
        ajb ajb = this.b.c;
        fee fee = new fee(this);
        ajb.getClass();
        ps9 ps9 = new ps9(ajb, fee, 2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qmc qmc = (qmc) ((nbe) this.c).c.getValue();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(qmc, "scheduler is null");
        xv9 xv9 = new xv9(ps9, 15000, timeUnit, qmc);
        fee fee2 = new fee(this);
        ho0 ho0 = this.Y;
        Objects.requireNonNull(ho0, "observer is null");
        try {
            xv9.a(new bu9(ho0, fee2, 1));
            try {
                if (ho0.getCount() != 0) {
                    ho0.await();
                }
                Throwable th = ho0.b;
                if (th == null) {
                    bool = (Boolean) ho0.a;
                    if (bool == null) {
                        UUID id2 = getId();
                        udd.s("gee", "work " + id2 + " result null. Set failure state", (Throwable) null);
                        return gh7.a();
                    } else if (!bool.booleanValue()) {
                        UUID id3 = getId();
                        udd.U("gee", "work " + id3 + " Timeout. Set retry state");
                        return new Object();
                    } else {
                        UUID id4 = getId();
                        udd.q("gee", "work " + id4 + " finished");
                        return gh7.b();
                    }
                } else {
                    throw i15.f(th);
                }
            } catch (InterruptedException e) {
                ho0.f();
                throw i15.f(e);
            } catch (Throwable th2) {
                UUID id5 = getId();
                udd.s("gee", "work " + id5 + " Exception", th2);
                bool = null;
            }
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th3) {
            ek8.a0(th3);
            xs7.F(th3);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th3);
            throw nullPointerException;
        }
    }

    public final boolean c() {
        jee jee = this.b;
        int k = jee.k();
        UUID id = getId();
        udd.q("gee", "work " + id + " Task count to be executed = " + k);
        if (1 <= k && k < 10) {
            String c0 = o23.c0(jee.m(), "; ", (String) null, (String) null, new u1c(19), 30);
            UUID id2 = getId();
            udd.q("gee", "work " + id2 + " Last task to execute: " + c0);
        }
        return k > 0;
    }

    public final void onStopped() {
        UUID id = getId();
        int identityHashCode = System.identityHashCode(this);
        udd.q("gee", "work " + id + " requested to stop " + identityHashCode);
        ho0 ho0 = this.Y;
        ho0.f();
        ho0.countDown();
        UUID id2 = getId();
        int identityHashCode2 = System.identityHashCode(this);
        udd.q("gee", "work " + id2 + " stopped " + identityHashCode2);
    }
}
