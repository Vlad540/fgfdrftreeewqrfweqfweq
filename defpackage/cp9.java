package defpackage;

import android.app.NotificationManager;

/* renamed from: cp9  reason: default package */
public abstract class cp9 {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static int b(NotificationManager notificationManager) {
        return notificationManager.getImportance();
    }
}
