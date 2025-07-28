package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: te3  reason: default package */
public abstract class te3 extends BroadcastReceiver {
    public static final String a = a24.e0("ConstraintProxy");

    public final void onReceive(Context context, Intent intent) {
        a24 B = a24.B();
        B.t(a, "onReceive : " + intent);
        String str = u33.X;
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
