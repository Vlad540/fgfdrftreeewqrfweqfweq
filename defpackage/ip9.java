package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* renamed from: ip9  reason: default package */
public final class ip9 {
    public static final Object c = new Object();
    public static String d;
    public static HashSet e = new HashSet();
    public static final Object f = new Object();
    public static hp9 g;
    public final Context a;
    public final NotificationManager b;

    public ip9(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(str, i, notification);
            return;
        }
        ep9 ep9 = new ep9(this.a.getPackageName(), i, str, notification);
        synchronized (f) {
            try {
                if (g == null) {
                    g = new hp9(this.a.getApplicationContext());
                }
                g.b.obtainMessage(0, ep9).sendToTarget();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        notificationManager.cancel(str, i);
    }
}
