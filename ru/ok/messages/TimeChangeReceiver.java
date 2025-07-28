package ru.ok.messages;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.Collections;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ok/messages/TimeChangeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "TaskTimeChangeWorker", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class TimeChangeReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/messages/TimeChangeReceiver$TaskTimeChangeWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Ln1b;", "preProcessDataCache", "Lt52;", "chatController", "Ltt0;", "uiBus", "Lxce;", "themeController", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ln1b;Lt52;Ltt0;Lxce;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
    public static final class TaskTimeChangeWorker extends Worker {
        public final xce X;
        public final n1b b;
        public final t52 c;
        public final tt0 o;

        public TaskTimeChangeWorker(Context context, WorkerParameters workerParameters, n1b n1b, t52 t52, tt0 tt0, xce xce) {
            super(context, workerParameters);
            this.b = n1b;
            this.c = t52;
            this.o = tt0;
            this.X = xce;
        }

        public final gh7 b() {
            int i = TimeChangeReceiver.a;
            udd.p("ru.ok.messages.TimeChangeReceiver", "work %s started", new Object[]{getId()});
            synchronized (xs7.c) {
                xs7.b = null;
            }
            synchronized (xs7.e) {
                xs7.d = null;
            }
            synchronized (xs7.g) {
                xs7.f = null;
            }
            synchronized (xs7.i) {
                xs7.h = null;
            }
            synchronized (xs7.k) {
                xs7.j = null;
            }
            synchronized (xs7.m) {
                xs7.l = null;
            }
            synchronized (xs7.o) {
                xs7.n = null;
            }
            synchronized (xs7.p) {
            }
            synchronized (xs7.v) {
                xs7.u = null;
            }
            synchronized (xs7.t) {
                xs7.s = null;
            }
            this.b.a();
            t52 t52 = this.c;
            if (t52.i) {
                for (i22 i22 : t52.f.values()) {
                    i22.D0 = null;
                }
                t52.m.c(new mw2(Collections.emptyList(), true));
            }
            this.o.c(new wt(12));
            this.X.f();
            new TimeChangeReceiver();
            TimeChangeReceiver.a(getApplicationContext());
            udd.p("ru.ok.messages.TimeChangeReceiver", "work %s finished", new Object[]{getId()});
            return gh7.b();
        }
    }

    public static void a(Context context) {
        mtf mtf = (mtf) vl.b().getAccessor().c(mtf.class);
        bfa bfa = new bfa(TaskTimeChangeWorker.class);
        he0 he0 = he0.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bfa backoffCriteria = bfa.setBackoffCriteria(he0, 10000, timeUnit);
        l04 g = l04.g(System.currentTimeMillis(), TimeZone.getDefault());
        long h = new l04(g.a, g.b, g.c, (Integer) null, (Integer) null, (Integer) null, (Integer) null).l(1).h(TimeZone.getDefault()) - l04.g(System.currentTimeMillis(), TimeZone.getDefault()).h(TimeZone.getDefault());
        if (h > 0) {
            backoffCriteria.setInitialDelay(h, timeUnit);
        }
        cfa build = backoffCriteria.addTag("TIME_CHANGE").build();
        UUID id = build.getId();
        udd.q("ru.ok.messages.TimeChangeReceiver", "work " + id + " try to add TIME_CHANGE request. Schedule on next date");
        mtf.b("TIME_CHANGE", a35.c, build, false).O();
    }

    public final void onReceive(Context context, Intent intent) {
        cfa build = new bfa(TaskTimeChangeWorker.class).setBackoffCriteria(he0.a, 10000, TimeUnit.MILLISECONDS).addTag("TIME_CHANGE").build();
        UUID id = build.getId();
        udd.q("ru.ok.messages.TimeChangeReceiver", "work " + id + " try to add TIME_CHANGE request. Schedule now");
        ((mtf) vl.b().getAccessor().c(mtf.class)).b("TIME_CHANGE", a35.a, build, false).O();
    }
}
