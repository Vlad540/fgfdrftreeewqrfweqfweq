package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.notifications.messages.tracker.NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker;

/* renamed from: up9  reason: default package */
public final class up9 extends er3 {
    public final /* synthetic */ NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public up9(NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker notificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker, Continuation continuation) {
        super(continuation);
        this.X = notificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.doWork(this);
    }
}
