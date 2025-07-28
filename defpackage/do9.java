package defpackage;

import android.app.Notification;
import android.app.Person;

/* renamed from: do9  reason: default package */
public abstract class do9 {
    public static Notification.MessagingStyle a(Person person) {
        return new Notification.MessagingStyle(person);
    }

    public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z) {
        return messagingStyle.setGroupConversation(z);
    }
}
