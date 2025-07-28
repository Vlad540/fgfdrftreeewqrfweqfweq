package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* renamed from: n2g  reason: default package */
public final class n2g extends bzf {
    public a d;
    public final int e;

    public n2g(a aVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 4);
        this.d = aVar;
        this.e = i;
    }

    public final boolean H0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            e2g.b(parcel);
            a24.p(this.d, "onPostInitComplete can be called only once per call to getRemoteService");
            a aVar = this.d;
            aVar.getClass();
            q3g q3g = new q3g(aVar, parcel.readInt(), parcel.readStrongBinder(), (Bundle) e2g.a(parcel, Bundle.CREATOR));
            p1g p1g = aVar.X;
            p1g.sendMessage(p1g.obtainMessage(1, this.e, -1, q3g));
            this.d = null;
        } else if (i == 2) {
            parcel.readInt();
            Bundle bundle = (Bundle) e2g.a(parcel, Bundle.CREATOR);
            e2g.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else if (i != 3) {
            return false;
        } else {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            p4g p4g = (p4g) e2g.a(parcel, p4g.CREATOR);
            e2g.b(parcel);
            a aVar2 = this.d;
            a24.p(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            a24.o(p4g);
            aVar2.J0 = p4g;
            if (aVar2.t()) {
                ud3 ud3 = p4g.o;
                nfc o = nfc.o();
                ofc ofc = ud3 == null ? null : ud3.a;
                synchronized (o) {
                    if (ofc == null) {
                        ofc = nfc.o;
                    } else {
                        ofc ofc2 = (ofc) o.b;
                        if (ofc2 != null) {
                            if (ofc2.a < ofc.a) {
                            }
                        }
                    }
                    o.b = ofc;
                }
            }
            Bundle bundle2 = p4g.a;
            a24.p(this.d, "onPostInitComplete can be called only once per call to getRemoteService");
            a aVar3 = this.d;
            aVar3.getClass();
            q3g q3g2 = new q3g(aVar3, readInt, readStrongBinder, bundle2);
            p1g p1g2 = aVar3.X;
            p1g2.sendMessage(p1g2.obtainMessage(1, this.e, -1, q3g2));
            this.d = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
