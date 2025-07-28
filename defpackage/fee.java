package defpackage;

import java.util.UUID;
import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;

/* renamed from: fee  reason: default package */
public final class fee implements v1b, j26 {
    public final /* synthetic */ TaskMonitor$TaskMonitorWorker a;

    public /* synthetic */ fee(TaskMonitor$TaskMonitorWorker taskMonitor$TaskMonitorWorker) {
        this.a = taskMonitor$TaskMonitorWorker;
    }

    public Object apply(Object obj) {
        UUID id = this.a.getId();
        udd.s("gee", "work " + id + " on error", (Throwable) obj);
        return Boolean.FALSE;
    }

    public boolean test(Object obj) {
        Boolean bool = (Boolean) obj;
        TaskMonitor$TaskMonitorWorker taskMonitor$TaskMonitorWorker = this.a;
        UUID id = taskMonitor$TaskMonitorWorker.getId();
        udd.q("gee", "work " + id + " Receive task remove callback");
        return taskMonitor$TaskMonitorWorker.c();
    }
}
