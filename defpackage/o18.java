package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;

/* renamed from: o18  reason: default package */
public final class o18 extends MediaBrowserService {
    public final /* synthetic */ m18 a;
    public final /* synthetic */ n18 b;
    public final /* synthetic */ p18 c;

    public o18(p18 p18, Context context) {
        this.c = p18;
        this.b = p18;
        this.a = p18;
        attachBaseContext(context);
    }

    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2;
        nu7 nu7;
        vc8.a(bundle);
        Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
        m18 m18 = this.a;
        wd8 wd8 = (wd8) m18.d;
        int i2 = -1;
        if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
            bundle2 = null;
        } else {
            bundle3.remove("extra_client_version");
            m18.c = new Messenger(wd8.Z);
            bundle2 = wn6.g(2, "extra_service_version");
            bundle2.putBinder("extra_messenger", ((Messenger) m18.c).getBinder());
            uc8 uc8 = wd8.w0;
            if (uc8 != null) {
                mn6 a2 = uc8.a();
                bundle2.putBinder("extra_session_binder", a2 == null ? null : a2.asBinder());
            } else {
                ((ArrayList) m18.a).add(bundle2);
            }
            i2 = bundle3.getInt("extra_calling_pid", -1);
            bundle3.remove("extra_calling_pid");
        }
        l18 l18 = new l18((wd8) m18.d, str, i2, i, (v18) null);
        wd8.Y = l18;
        nu7 b2 = wd8.b(bundle3);
        wd8.Y = null;
        if (b2 == null) {
            nu7 = null;
        } else {
            if (((Messenger) m18.c) != null) {
                wd8.o.add(l18);
            }
            Bundle bundle4 = (Bundle) b2.b;
            if (bundle2 == null) {
                bundle2 = bundle4;
            } else if (bundle4 != null) {
                bundle2.putAll(bundle4);
            }
            nu7 = new nu7(bundle2);
        }
        if (nu7 == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot((String) nu7.a, (Bundle) nu7.b);
    }

    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        e3 e3Var = new e3(result);
        m18 m18 = this.a;
        m18.getClass();
        wd8 wd8 = (wd8) m18.d;
        wd8.Y = wd8.c;
        e3Var.f((Object) null);
        wd8.Y = null;
    }

    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        e3 e3Var = new e3(result);
        wd8 wd8 = this.b.e;
        wd8.Y = wd8.c;
        e3Var.f((Object) null);
        wd8.Y = null;
    }

    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        vc8.a(bundle);
        p18 p18 = this.c;
        wd8 wd8 = p18.f;
        l18 l18 = wd8.c;
        e3 e3Var = new e3(result);
        wd8.Y = l18;
        e3Var.f((Object) null);
        wd8.Y = null;
        p18.f.Y = null;
    }
}
