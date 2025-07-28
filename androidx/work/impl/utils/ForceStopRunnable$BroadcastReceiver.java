package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    public static final String a = a24.e0("ForceStopRunnable$Rcvr");

    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            a24.B().j0();
            du5.c(context);
        }
    }
}
