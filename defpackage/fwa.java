package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: fwa  reason: default package */
public final class fwa extends BroadcastReceiver {
    public final Context a;
    public final jwa b;
    public final IntentFilter c;
    public boolean d = false;

    public fwa(Context context, jwa jwa) {
        this.a = context;
        this.b = jwa;
        IntentFilter intentFilter = new IntentFilter();
        this.c = intentFilter;
        intentFilter.addAction("ru.ok.video.ACTION_VIDEO_PLAY");
        intentFilter.addAction("ru.ok.video.ACTION_VIDEO_PAUSE");
        intentFilter.addAction("ru.ok.video.ACTION_VIDEO_STOP");
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null && this.c.hasAction(action)) {
            jwa jwa = this.b;
            char c2 = 65535;
            switch (action.hashCode()) {
                case -1627595769:
                    if (action.equals("ru.ok.video.ACTION_VIDEO_PLAY")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1627498283:
                    if (action.equals("ru.ok.video.ACTION_VIDEO_STOP")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 1083830115:
                    if (action.equals("ru.ok.video.ACTION_VIDEO_PAUSE")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    jwa.b(1);
                    return;
                case 1:
                    jwa.b(3);
                    return;
                case 2:
                    jwa.b(2);
                    return;
                default:
                    return;
            }
        }
    }
}
