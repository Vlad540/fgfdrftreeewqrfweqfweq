package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;

/* renamed from: g94  reason: default package */
public abstract class g94 {
    public static void a(NotificationManager notificationManager, String str, String str2) {
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, 2);
        if (oze.a <= 27) {
            notificationChannel.setShowBadge(false);
        }
        notificationManager.createNotificationChannel(notificationChannel);
    }
}
