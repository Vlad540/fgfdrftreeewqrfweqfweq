package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: lef  reason: default package */
public abstract class lef {
    public static final String a = a24.e0("WakeLocks");

    public static final PowerManager.WakeLock a(Context context, String str) {
        String concat = "WorkManager: ".concat(str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, concat);
        synchronized (mef.a) {
            String str2 = (String) mef.b.put(newWakeLock, concat);
        }
        return newWakeLock;
    }
}
