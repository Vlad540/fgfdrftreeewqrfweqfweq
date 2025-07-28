package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.UUID;

public class SystemForegroundService extends qc7 implements a8e {
    public static final String Y = a24.e0("SystemFgService");
    public NotificationManager X;
    public Handler b;
    public boolean c;
    public b8e o;

    public final void a() {
        this.b = new Handler(Looper.getMainLooper());
        this.X = (NotificationManager) getApplicationContext().getSystemService("notification");
        b8e b8e = new b8e(getApplicationContext());
        this.o = b8e;
        if (b8e.x0 != null) {
            a24.B().x(b8e.y0, "A callback already exists.");
        } else {
            b8e.x0 = this;
        }
    }

    public final void onCreate() {
        super.onCreate();
        a();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.o.g();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.c;
        String str = Y;
        if (z) {
            a24.B().P(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.o.g();
            a();
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        b8e b8e = this.o;
        b8e.getClass();
        String action = intent.getAction();
        boolean equals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = b8e.y0;
        if (equals) {
            a24 B = a24.B();
            B.P(str2, "Started foreground service " + intent);
            b8e.b.c(new p36((Object) b8e, (Object) intent.getStringExtra("KEY_WORKSPEC_ID"), false, 25));
            b8e.e(intent);
            return 3;
        } else if ("ACTION_NOTIFY".equals(action)) {
            b8e.e(intent);
            return 3;
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            a24 B2 = a24.B();
            B2.P(str2, "Stopping foreground work for " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            UUID fromString = UUID.fromString(stringExtra);
            itf itf = b8e.a;
            itf.getClass();
            itf.d.c(new sv1(itf, fromString));
            return 3;
        } else if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        } else {
            a24.B().P(str2, "Stopping foreground service");
            a8e a8e = b8e.x0;
            if (a8e == null) {
                return 3;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) a8e;
            systemForegroundService.c = true;
            a24.B().t(str, "All commands completed.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
            return 3;
        }
    }
}
