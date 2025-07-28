package defpackage;

import android.app.Notification;
import android.app.Person;

/* renamed from: so9  reason: default package */
public abstract class so9 {
    public static Notification.Builder a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, int i) {
        return builder.setSemanticAction(i);
    }
}
