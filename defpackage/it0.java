package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: it0  reason: default package */
public final class it0 extends Binder {
    public static final int d = (oze.a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536);
    public final ws6 c;

    public it0(List list) {
        this.c = ws6.j(list);
    }

    public static ws6 a(IBinder iBinder) {
        int readInt;
        if (iBinder instanceof it0) {
            return ((it0) iBinder).c;
        }
        ts6 i = ws6.i();
        int i2 = 1;
        int i3 = 0;
        while (i2 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i3);
                iBinder.transact(1, obtain, obtain2, 0);
                while (true) {
                    readInt = obtain2.readInt();
                    if (readInt != 1) {
                        break;
                    }
                    Bundle readBundle = obtain2.readBundle();
                    readBundle.getClass();
                    i.a(readBundle);
                    i3++;
                }
                obtain2.recycle();
                obtain.recycle();
                i2 = readInt;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return i.j();
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = 0;
        if (parcel2 == null) {
            return false;
        }
        ws6 ws6 = this.c;
        int size = ws6.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < d) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) ws6.get(readInt));
            readInt++;
        }
        if (readInt < size) {
            i3 = 2;
        }
        parcel2.writeInt(i3);
        return true;
    }
}
