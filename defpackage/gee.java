package defpackage;

import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;

/* renamed from: gee  reason: default package */
public final class gee {
    public static final /* synthetic */ int b = 0;
    public final mtf a;

    public gee(mtf mtf) {
        this.a = mtf;
        yma build = new xma(TaskMonitor$TaskMonitorWorker.class, 6, TimeUnit.HOURS).setConstraints(new if3(1, false, true, false, false, -1, -1, o23.w0(new LinkedHashSet()))).addTag("TASK_MONITOR_PERIODIC_TASK").build();
        UUID id = build.getId();
        udd.q("gee", "work " + id + " try to add TASK_MONITOR_PERIODIC_TASK request");
        mtf.e(mtf, "TASK_MONITOR_PERIODIC_TASK", 2, build, false, 24);
    }

    public final void a() {
        cfa build = new bfa(TaskMonitor$TaskMonitorWorker.class).setBackoffCriteria(he0.a, 10000, TimeUnit.MILLISECONDS).addTag("TASK_MONITOR_ONE_TIME_TASK").build();
        UUID id = build.getId();
        udd.q("gee", "work " + id + " try to add TASK_MONITOR_ONE_TIME_TASK request");
        this.a.b("TASK_MONITOR_ONE_TIME_TASK", a35.b, build, false).O();
    }
}
