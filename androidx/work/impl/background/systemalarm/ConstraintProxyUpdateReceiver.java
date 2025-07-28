package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a = a24.e0("ConstrntProxyUpdtRecvr");

    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            a24.B().t(a, rf0.h("Ignoring unknown action ", action));
        } else {
            itf.d(context).d.c(new ue3(intent, context, goAsync(), 0));
        }
    }
}
