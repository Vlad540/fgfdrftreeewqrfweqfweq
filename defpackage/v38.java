package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.media.session.MediaControllerCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: v38  reason: default package */
public final class v38 {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final uc8 e;

    public v38(Context context, uc8 uc8) {
        this.e = uc8;
        Object obj = uc8.b;
        obj.getClass();
        MediaController mediaController = new MediaController(context, (MediaSession.Token) obj);
        this.a = mediaController;
        if (uc8.a() == null) {
            t38 t38 = new t38((Handler) null);
            t38.b = new WeakReference(this);
            mediaController.sendCommand(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER, (Bundle) null, t38);
        }
    }

    public final void a() {
        mn6 a2 = this.e.a();
        if (a2 != null) {
            ArrayList arrayList = this.c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                s48 s48 = (s48) it.next();
                u38 u38 = new u38(s48);
                this.d.put(s48, u38);
                s48.c = u38;
                try {
                    a2.g0(u38);
                    s48.i(13, (Object) null, (Bundle) null);
                } catch (RemoteException unused) {
                }
            }
            arrayList.clear();
        }
    }

    public final void b(s48 s48) {
        MediaController mediaController = this.a;
        s38 s38 = s48.a;
        s38.getClass();
        mediaController.unregisterCallback(s38);
        synchronized (this.b) {
            mn6 a2 = this.e.a();
            if (a2 != null) {
                try {
                    u38 u38 = (u38) this.d.remove(s48);
                    if (u38 != null) {
                        s48.c = null;
                        a2.W(u38);
                    }
                } catch (RemoteException unused) {
                }
            } else {
                this.c.remove(s48);
            }
        }
    }
}
