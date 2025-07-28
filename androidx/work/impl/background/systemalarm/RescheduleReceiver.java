package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = a24.e0("RescheduleReceiver");

    public final void onReceive(Context context, Intent intent) {
        a24 B = a24.B();
        String str = a;
        B.t(str, "Received intent " + intent);
        try {
            itf d = itf.d(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            d.getClass();
            synchronized (itf.m) {
                BroadcastReceiver.PendingResult pendingResult = d.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                d.i = goAsync;
                if (d.h) {
                    goAsync.finish();
                    d.i = null;
                }
            }
        } catch (IllegalStateException e) {
            a24.B().y(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        } catch (Throwable th) {
            throw th;
        }
    }
}
