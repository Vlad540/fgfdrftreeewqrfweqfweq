package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: d8e  reason: default package */
public abstract class d8e {
    public static void a(Service service, int i, Notification notification, int i2) {
        try {
            service.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            a24.B().l0(SystemForegroundService.Y, "Unable to start foreground service", e);
        }
    }
}
