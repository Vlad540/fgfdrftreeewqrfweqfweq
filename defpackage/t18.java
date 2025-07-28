package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;

/* renamed from: t18  reason: default package */
public final class t18 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ u18 b;
    public final /* synthetic */ ResultReceiver c;
    public final /* synthetic */ x3a o;

    public t18(x3a x3a, v18 v18, String str, ResultReceiver resultReceiver) {
        this.o = x3a;
        this.b = v18;
        this.c = resultReceiver;
    }

    public final void run() {
        ResultReceiver resultReceiver = this.c;
        x3a x3a = this.o;
        u18 u18 = this.b;
        switch (this.a) {
            case 0:
                l18 l18 = (l18) ((wd8) x3a.b).X.get(((v18) u18).a.getBinder());
                if (l18 != null) {
                    wd8 wd8 = (wd8) x3a.b;
                    wd8.getClass();
                    wd8.Y = l18;
                    if (true && true) {
                        resultReceiver.send(-1, (Bundle) null);
                    } else {
                        Bundle bundle = new Bundle();
                        int i = MediaBrowserCompat.MediaItem.FLAG_BROWSABLE;
                        bundle.putParcelable("media_item", (Parcelable) null);
                        resultReceiver.send(0, bundle);
                    }
                    wd8.Y = null;
                    return;
                }
                return;
            default:
                l18 l182 = (l18) ((wd8) x3a.b).X.get(((v18) u18).a.getBinder());
                if (l182 != null) {
                    wd8 wd82 = (wd8) x3a.b;
                    wd82.getClass();
                    wd82.Y = l182;
                    resultReceiver.send(-1, (Bundle) null);
                    wd82.Y = null;
                    return;
                }
                return;
        }
    }

    public t18(x3a x3a, v18 v18, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.o = x3a;
        this.b = v18;
        this.c = resultReceiver;
    }
}
