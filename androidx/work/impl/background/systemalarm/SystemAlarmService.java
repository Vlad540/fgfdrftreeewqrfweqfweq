package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;

public class SystemAlarmService extends qc7 implements v7e {
    public static final String o = a24.e0("SystemAlarmService");
    public w7e b;
    public boolean c;

    public final void a() {
        this.c = true;
        a24.B().t(o, "All commands completed in dispatcher");
        String str = lef.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (mef.a) {
            linkedHashMap.putAll(mef.b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                a24 B = a24.B();
                String str3 = lef.a;
                B.k0(str3, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    public final void onCreate() {
        super.onCreate();
        w7e w7e = new w7e(this);
        this.b = w7e;
        if (w7e.x0 != null) {
            a24.B().x(w7e.y0, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            w7e.x0 = this;
        }
        this.c = false;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.c = true;
        w7e w7e = this.b;
        w7e.getClass();
        a24.B().t(w7e.y0, "Destroying SystemAlarmDispatcher");
        w7e.o.e(w7e);
        w7e.x0 = null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            a24.B().P(o, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            w7e w7e = this.b;
            w7e.getClass();
            a24 B = a24.B();
            String str = w7e.y0;
            B.t(str, "Destroying SystemAlarmDispatcher");
            w7e.o.e(w7e);
            w7e.x0 = null;
            w7e w7e2 = new w7e(this);
            this.b = w7e2;
            if (w7e2.x0 != null) {
                a24.B().x(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                w7e2.x0 = this;
            }
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.b.a(intent, i2);
        return 3;
    }
}
