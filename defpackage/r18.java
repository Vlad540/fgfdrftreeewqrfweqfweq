package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;

/* renamed from: r18  reason: default package */
public final class r18 implements Runnable {
    public final /* synthetic */ Bundle X;
    public final /* synthetic */ x3a Y;
    public final /* synthetic */ u18 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public r18(int i, int i2, v18 v18, x3a x3a, Bundle bundle, String str) {
        this.Y = x3a;
        this.a = v18;
        this.b = str;
        this.c = i;
        this.o = i2;
        this.X = bundle;
    }

    public final void run() {
        u18 u18 = this.a;
        IBinder binder = ((v18) u18).a.getBinder();
        x3a x3a = this.Y;
        ((wd8) x3a.b).X.remove(binder);
        l18 l18 = new l18((wd8) x3a.b, this.b, this.c, this.o, (v18) u18);
        wd8 wd8 = (wd8) x3a.b;
        wd8.Y = l18;
        nu7 b2 = wd8.b(this.X);
        wd8.Y = null;
        if (b2 == null) {
            try {
                ((v18) u18).a(2, (Bundle) null);
            } catch (RemoteException unused) {
            }
        } else {
            try {
                wd8.X.put(binder, l18);
                binder.linkToDeath(l18, 0);
                uc8 uc8 = wd8.w0;
                if (uc8 != null) {
                    Bundle bundle = (Bundle) b2.b;
                    v18 v18 = (v18) u18;
                    v18.getClass();
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putInt("extra_service_version", 2);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("data_media_item_id", "androidx.media3.session.MediaLibraryService");
                    bundle2.putParcelable("data_media_session_token", wa7.a(uc8, MediaSessionCompat.Token.CREATOR));
                    bundle2.putBundle("data_root_hints", bundle);
                    v18.a(1, bundle2);
                }
            } catch (RemoteException unused2) {
                wd8.X.remove(binder);
            }
        }
    }
}
