package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* renamed from: yme  reason: default package */
public final class yme extends BroadcastReceiver {
    public zme a;

    public final synchronized void onReceive(Context context, Intent intent) {
        zme zme = this.a;
        if (zme != null) {
            if (zme.c()) {
                zme zme2 = this.a;
                ((xme) zme2.Y).f.schedule(zme2, 0, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.a = null;
            }
        }
    }
}
