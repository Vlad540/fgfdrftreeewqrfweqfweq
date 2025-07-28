package ru.ok.messages;

import android.content.Context;
import androidx.work.WorkerParameters;
import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;
import ru.ok.messages.TimeChangeReceiver;
import ru.ok.messages.analytics.DailyAnalyticsWorker;
import ru.ok.messages.controllers.NotificationDraftScheduler$TaskNotificationDraftWorker;
import ru.ok.messages.location.StopLiveLocationSchedulerImpl$StopLiveLocationSchedulerWorker;
import ru.ok.tamtam.android.notifications.messages.tracker.NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker;
import ru.ok.tamtam.android.services.HeartbeatScheduler$TaskHeartbeatWorker;

public final class a extends iuf {
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public final t97 h;
    public final t97 i;
    public final t97 j;
    public final t97 k;
    public final t97 l;
    public final t97 m;
    public final t97 n;
    public final t97 o;
    public final t97 p;
    public final t97 q;
    public final t97 r;

    public a(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977, t97 t978, t97 t979, t97 t9710, t97 t9711, t97 t9712, t97 t9713, t97 t9714, t97 t9715, t97 t9716, t97 t9717) {
        this.b = t9717;
        this.c = t97;
        this.d = t972;
        this.e = t973;
        this.f = t974;
        this.g = t975;
        this.h = t976;
        this.i = t977;
        this.j = t978;
        this.k = t979;
        this.l = t9710;
        this.m = t9711;
        this.n = t9712;
        this.o = t9713;
        this.p = t9714;
        this.q = t9715;
        this.r = t9716;
    }

    public final hh7 a(Context context, String str, WorkerParameters workerParameters) {
        boolean equals = str.equals(DailyAnalyticsWorker.class.getName());
        t97 t97 = this.d;
        if (equals) {
            return new DailyAnalyticsWorker(context, workerParameters, (bd) this.c.getValue(), (fp) t97.getValue(), (ed3) this.e.getValue(), (tf4) this.f.getValue(), (ezd) this.g.getValue(), (mna) this.r.getValue(), this.b);
        }
        boolean equals2 = str.equals(TaskMonitor$TaskMonitorWorker.class.getName());
        t97 t972 = this.h;
        if (equals2) {
            i03 i03 = ((j2b) ((g2b) t972.getValue())).a;
            return new TaskMonitor$TaskMonitorWorker(context, workerParameters, (jee) this.i.getValue(), (mbe) this.q.getValue(), (luf) this.j.getValue(), i03);
        } else if (str.equals(HeartbeatScheduler$TaskHeartbeatWorker.class.getName())) {
            return new HeartbeatScheduler$TaskHeartbeatWorker(context, workerParameters, (mf6) this.k.getValue());
        } else {
            if (str.equals(TimeChangeReceiver.TaskTimeChangeWorker.class.getName())) {
                return new TimeChangeReceiver.TaskTimeChangeWorker(context, workerParameters, (n1b) this.l.getValue(), (t52) this.m.getValue(), (zs7) this.n.getValue(), (xce) this.o.getValue());
            } else if (str.equals(NotificationDraftScheduler$TaskNotificationDraftWorker.class.getName())) {
                return new NotificationDraftScheduler$TaskNotificationDraftWorker(context, workerParameters, (qm4) ((fp) t97.getValue()).m.getValue());
            } else {
                if (str.equals(StopLiveLocationSchedulerImpl$StopLiveLocationSchedulerWorker.class.getName())) {
                    return new StopLiveLocationSchedulerImpl$StopLiveLocationSchedulerWorker(context, workerParameters, (di7) this.p.getValue());
                }
                if (str.equals(NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker.class.getName())) {
                    return new NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker(context, workerParameters, (mr9) ((fp) t97.getValue()).h.getValue(), ((j2b) ((g2b) t972.getValue())).a);
                }
                return null;
            }
        }
    }
}
