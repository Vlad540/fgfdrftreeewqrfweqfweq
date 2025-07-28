package ru.ok.tamtam.android.notifications.messages.tracker;

import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"ru/ok/tamtam/android/notifications/messages/tracker/NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lmr9;", "notificationsTracker", "Lf03;", "clientPrefs", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lmr9;Lf03;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker extends SdkCoroutineWorker {
    public final mr9 a;
    public final f03 b;
    public final ju3 c = ((nqc) getTamComponent()).s().b();

    public NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker(Context context, WorkerParameters workerParameters, mr9 mr9, f03 f03) {
        super(context, workerParameters);
        this.a = mr9;
        this.b = f03;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.up9
            if (r0 == 0) goto L_0x0013
            r0 = r9
            up9 r0 = (defpackage.up9) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            up9 r0 = new up9
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            wx3.H(r9)
            goto L_0x0061
        L_0x0027:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x002f:
            wx3.H(r9)
            f03 r9 = r8.b
            lqc r9 = (defpackage.lqc) r9
            long r4 = r9.m()
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.DAYS
            r6 = 7
            long r6 = r9.toMillis(r6)
            long r4 = r4 - r6
            r0.Y = r3
            mr9 r8 = r8.a
            pae r9 = r8.a
            n3a r9 = (n3a) r9
            ju3 r9 = r9.b()
            kr9 r2 = new kr9
            r3 = 0
            r2.<init>(r4, r8, r3)
            java.lang.Object r8 = xs7.U(r9, r2, r0)
            if (r8 != r1) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            jue r8 = jue.a
        L_0x005e:
            if (r8 != r1) goto L_0x0061
            return r1
        L_0x0061:
            fh7 r8 = gh7.b()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.android.notifications.messages.tracker.NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ju3 getCoroutineContext() {
        return this.c;
    }
}
