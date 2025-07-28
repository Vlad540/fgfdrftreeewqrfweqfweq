package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* renamed from: u4g  reason: default package */
public final /* synthetic */ class u4g implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u4g(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void binderDied() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                f6g f6g = (f6g) obj;
                f6g.b.b("reportBinderDeath", new Object[0]);
                hr1.r(f6g.i.get());
                f6g.b.b("%s : Binder has died.", f6g.c);
                Iterator it = f6g.d.iterator();
                while (it.hasNext()) {
                    RemoteException remoteException = new RemoteException(String.valueOf(f6g.c).concat(" : Binder has died."));
                    vde vde = ((m4g) it.next()).a;
                    if (vde != null) {
                        vde.c(remoteException);
                    }
                }
                f6g.d.clear();
                synchronized (f6g.f) {
                    f6g.c();
                }
                return;
            default:
                r6g r6g = (r6g) obj;
                r6g.b.b("reportBinderDeath", new Object[0]);
                hr1.r(r6g.i.get());
                r6g.b.b("%s : Binder has died.", r6g.c);
                Iterator it2 = r6g.d.iterator();
                while (it2.hasNext()) {
                    RemoteException remoteException2 = new RemoteException(String.valueOf(r6g.c).concat(" : Binder has died."));
                    vde vde2 = ((j5g) it2.next()).a;
                    if (vde2 != null) {
                        vde2.c(remoteException2);
                    }
                }
                r6g.d.clear();
                synchronized (r6g.f) {
                    r6g.d();
                }
                return;
        }
    }
}
