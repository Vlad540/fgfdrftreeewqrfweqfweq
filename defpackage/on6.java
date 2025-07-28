package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: on6  reason: default package */
public final class on6 implements pn6 {
    public IBinder c;

    public final IBinder asBinder() {
        return this.c;
    }

    public final void f0(hn6 hn6, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSessionService");
            obtain.writeStrongInterface(hn6);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.c.transact(3001, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
