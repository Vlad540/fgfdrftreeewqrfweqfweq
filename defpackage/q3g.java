package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.a;

/* renamed from: q3g  reason: default package */
public final class q3g extends v0g {
    public final IBinder g;
    public final /* synthetic */ a h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q3g(a aVar, int i, IBinder iBinder, Bundle bundle) {
        super(aVar, i, bundle);
        this.h = aVar;
        this.g = iBinder;
    }

    public final void b(nd3 nd3) {
        k2e k2e = this.h.D0;
        if (k2e != null) {
            ((pa6) k2e.a).k(nd3);
        }
        System.currentTimeMillis();
    }

    public final boolean c() {
        IInterface l;
        IBinder iBinder = this.g;
        try {
            a24.o(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            a aVar = this.h;
            if (aVar.p().equals(interfaceDescriptor) && (l = aVar.l(iBinder)) != null && (a.u(aVar, 2, 4, l) || a.u(aVar, 3, 4, l))) {
                aVar.H0 = null;
                sbf sbf = aVar.C0;
                if (sbf == null) {
                    return true;
                }
                ((oa6) sbf.a).onConnected();
                return true;
            }
        } catch (RemoteException unused) {
        }
        return false;
    }
}
