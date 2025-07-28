package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: o2g  reason: default package */
public final class o2g implements r3g, IInterface {
    public final IBinder c;

    public o2g(IBinder iBinder) {
        this.c = iBinder;
    }

    public final IBinder asBinder() {
        return this.c;
    }

    public final Parcel k(Parcel parcel, int i) {
        parcel = Parcel.obtain();
        try {
            this.c.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
