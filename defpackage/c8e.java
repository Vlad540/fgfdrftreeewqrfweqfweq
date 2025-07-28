package defpackage;

import android.app.Notification;
import android.app.Service;

/* renamed from: c8e  reason: default package */
public abstract class c8e {
    public static void a(Service service, int i, Notification notification, int i2) {
        service.startForeground(i, notification, i2);
    }
}
