package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ud8  reason: default package */
public final class ud8 extends Binder implements pn6 {
    public final WeakReference c;
    public final Handler d;
    public final rd8 e;
    public final Set f = Collections.synchronizedSet(new HashSet());

    public ud8(vd8 vd8) {
        attachInterface(this, "androidx.media3.session.IMediaSessionService");
        this.c = new WeakReference(vd8);
        Context applicationContext = vd8.getApplicationContext();
        this.d = new Handler(applicationContext.getMainLooper());
        this.e = rd8.a(applicationContext);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [on6, pn6, java.lang.Object] */
    public static pn6 k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSessionService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof pn6)) {
            return (pn6) queryLocalInterface;
        }
        ? obj = new Object();
        obj.c = iBinder;
        return obj;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final void f0(hn6 hn6, Bundle bundle) {
        if (hn6 != null && bundle != null) {
            try {
                md3 a = md3.a(bundle);
                if (this.c.get() == null) {
                    try {
                        hn6.c(0);
                    } catch (RemoteException unused) {
                    }
                } else {
                    int callingPid = Binder.getCallingPid();
                    int callingUid = Binder.getCallingUid();
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    if (callingPid == 0) {
                        callingPid = a.d;
                    }
                    pd8 pd8 = new pd8(a.c, callingPid, callingUid);
                    boolean b = this.e.b(pd8);
                    this.f.add(hn6);
                    try {
                        this.d.post(new g88(1, this, hn6, pd8, a, b));
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            } catch (RuntimeException e2) {
                ez3.k0("Ignoring malformed Bundle for ConnectionRequest", e2);
            }
        }
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSessionService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSessionService");
            return true;
        } else if (i != 3001) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            f0(z48.k(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
    }
}
