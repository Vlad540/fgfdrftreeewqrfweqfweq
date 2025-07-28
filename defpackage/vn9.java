package defpackage;

import android.app.Notification;

/* renamed from: vn9  reason: default package */
public abstract class vn9 {
    public static Notification.Builder a(Notification.Builder builder, String str) {
        return builder.addPerson(str);
    }

    public static Notification.Builder b(Notification.Builder builder, String str) {
        return builder.setCategory(str);
    }
}
