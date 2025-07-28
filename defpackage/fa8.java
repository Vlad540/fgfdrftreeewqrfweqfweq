package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: fa8  reason: default package */
public final class fa8 extends BroadcastReceiver {
    public final Context a;
    public boolean b = true;
    public final ArrayList c;

    public fa8(Context context) {
        this.a = context;
        this.c = new ArrayList();
    }

    public final void onReceive(Context context, Intent intent) {
        boolean z;
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && this.b != (!intent.getBooleanExtra("noConnectivity", false))) {
            this.b = z;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((ia8) it.next()).c();
            }
        }
    }
}
