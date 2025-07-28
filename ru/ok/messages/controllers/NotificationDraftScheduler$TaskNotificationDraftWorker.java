package ru.ok.messages.controllers;

import android.content.Context;
import android.content.Intent;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ru/ok/messages/controllers/NotificationDraftScheduler$TaskNotificationDraftWorker", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lqm4;", "draftsNotifications", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqm4;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class NotificationDraftScheduler$TaskNotificationDraftWorker extends Worker {
    public final qm4 b;

    public NotificationDraftScheduler$TaskNotificationDraftWorker(Context context, WorkerParameters workerParameters, qm4 qm4) {
        super(context, workerParameters);
        this.b = qm4;
    }

    public final gh7 b() {
        String str;
        Intent k;
        int i = xy6.f;
        UUID id = getId();
        udd.q("xy6", "work " + id + " started");
        rm4 rm4 = (rm4) this.b;
        rm4.getClass();
        udd.q("rm4", "notifyDrafts");
        ArrayList arrayList = new ArrayList();
        yz yzVar = t52.I;
        ArrayList C = rm4.e.C(t52.M, true, (w1b) null);
        Collections.sort(C, yzVar);
        for (i22 i22 : Collections.unmodifiableList(C)) {
            j4a j4a = i22.b.f0;
        }
        if (arrayList.isEmpty()) {
            udd.q("rm4", "notifyDrafts: no drafts");
        } else {
            j2b j2b = rm4.b;
            j2b.a.i("app.draftsChanged", false);
            int size = arrayList.size();
            o7a o7a = rm4.c;
            Context context = rm4.a;
            if (size > 1) {
                udd.q("rm4", "notifyDrafts: multiple chats");
                str = String.format(context.getString(cic.H1), new Object[]{Integer.valueOf(arrayList.size())});
                k = o7a.f(false);
            } else {
                i22 i222 = (i22) arrayList.get(0);
                if (!i222.J() || i222.k() == null) {
                    udd.q("rm4", "notifyDrafts: chat");
                    String string = context.getString(cic.F1);
                    String str2 = i222.b.g;
                    int i2 = che.a;
                    str = String.format(string, new Object[]{(str2 == null || str2.length() == 0) ? "" : wn6.i("\"", str2, "\"")});
                } else {
                    udd.q("rm4", "notifyDrafts: dialog");
                    str = String.format(context.getString(cic.G1), new Object[]{i222.k().d()});
                }
                o7a.getClass();
                sr7.c.getClass();
                k = o7a.k(new a34(wn6.k(new StringBuilder(":chats?id="), i222.a, "&type=local")));
            }
            Intent intent = k;
            rm4.d.getClass();
            j2b.c.getClass();
            un9 h = o7a.h("ru.oneme.app.misc", false, false);
            h.e(str);
            sn9 sn9 = new sn9(0);
            sn9.f = un9.c(str);
            h.q(sn9);
            ((h7a) o7a.d.getValue()).getClass();
            o7a.l(h, intent, (Intent) null, 2, (String) null);
        }
        int i3 = xy6.f;
        UUID id2 = getId();
        udd.q("xy6", "work " + id2 + " finished");
        return gh7.b();
    }
}
