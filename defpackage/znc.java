package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: znc  reason: default package */
public final class znc extends BroadcastReceiver {
    public final HashSet a = new HashSet();

    public znc(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                kdf kdf = (kdf) it.next();
                kdf.getClass();
                udd.q("kdf", "onScreenOff");
                if (kdf.l) {
                    kdf.l = false;
                    if (kdf.k) {
                        kdf.a();
                    }
                }
            }
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                kdf kdf2 = (kdf) it2.next();
                fn6 fn6 = udd.e;
                if (fn6 != null) {
                    kdf2.getClass();
                    if (fn6.c()) {
                        tn7 tn7 = tn7.X;
                        fn6.d(tn7, "kdf", "onScreenOn, isAppVisible=" + kdf2.k + ", isScreenOn=" + kdf2.l, (Throwable) null);
                    }
                }
                if (!kdf2.l) {
                    kdf2.l = true;
                    if (kdf2.k) {
                        kdf2.b();
                    }
                }
            }
        }
    }
}
