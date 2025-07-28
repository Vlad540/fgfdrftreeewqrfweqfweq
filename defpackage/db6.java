package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: db6  reason: default package */
public final class db6 extends BroadcastReceiver {
    public final /* synthetic */ eb6 a;

    public db6(eb6 eb6) {
        this.a = eb6;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            Status status = extras != null ? (Status) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS") : null;
            eb6 eb6 = this.a;
            if (status == null || status.a != 0) {
                String str = eb6.e;
                Set<String> keySet = extras != null ? extras.keySet() : null;
                udd.u(str, new Error("onMessageReceived: error; status = " + status + ", " + keySet), (String) null, new Object[0]);
                return;
            }
            xs7.E(eb6.d, (hu3) null, (ru3) null, new cb6(eb6, extras, (Continuation) null), 3);
        }
    }
}
