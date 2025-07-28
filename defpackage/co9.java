package defpackage;

import android.app.Notification;

/* renamed from: co9  reason: default package */
public abstract class co9 {
    public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addHistoricMessage(message);
    }
}
