package defpackage;

import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bp9  reason: default package */
public abstract class bp9 {
    public static List<StatusBarNotification> a(NotificationManager notificationManager) {
        StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
        return activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
    }

    public static int b(NotificationManager notificationManager) {
        return notificationManager.getCurrentInterruptionFilter();
    }
}
