package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* renamed from: e6g  reason: default package */
public final class e6g extends j5g {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ a6g c;

    public e6g(a6g a6g, IBinder iBinder) {
        this.c = a6g;
        this.b = iBinder;
    }

    public final void a() {
        m3g m3g;
        a6g a6g = this.c;
        r6g r6g = (r6g) a6g.b;
        int i = c3g.d;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            m3g = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            m3g = queryLocalInterface instanceof m3g ? (m3g) queryLocalInterface : new j2g(iBinder);
        }
        r6g.m = m3g;
        r6g r6g2 = (r6g) a6g.b;
        r6g2.b.b("linkToDeath", new Object[0]);
        try {
            r6g2.m.asBinder().linkToDeath(r6g2.j, 0);
        } catch (RemoteException unused) {
            Object[] objArr = new Object[0];
            boolean isLoggable = Log.isLoggable("PlayCore", 6);
            o15 o15 = r6g2.b;
            if (isLoggable) {
                o15.c(o15.a, "linkToDeath failed", objArr);
            } else {
                o15.getClass();
            }
        }
        r6g2.g = false;
        Iterator it = r6g2.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        r6g2.d.clear();
    }
}
