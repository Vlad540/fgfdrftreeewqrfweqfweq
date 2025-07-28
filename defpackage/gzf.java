package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: gzf  reason: default package */
public final class gzf extends BroadcastReceiver {
    public Context a;
    public final f2b b;

    public gzf(f2b f2b) {
        this.b = f2b;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        String str = null;
        if (data != null) {
            str = data.getSchemeSpecificPart();
        }
        if ("com.google.android.gms".equals(str)) {
            ((lde) this.b.c).getClass();
            throw null;
        }
    }
}
