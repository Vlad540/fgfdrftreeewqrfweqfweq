package defpackage;

import android.app.Notification;

/* renamed from: mo9  reason: default package */
public abstract class mo9 {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
        return builder.setAuthenticationRequired(z);
    }
}
