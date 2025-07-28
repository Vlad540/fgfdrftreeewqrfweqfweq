package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: o99  reason: default package */
public final class o99 extends Binder implements sn6 {
    public final /* synthetic */ MultiInstanceInvalidationService c;

    public o99(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.c = multiInstanceInvalidationService;
        attachInterface(this, sn6.b);
    }

    public final int R(rn6 rn6, String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.c;
        synchronized (multiInstanceInvalidationService.c) {
            try {
                int i2 = multiInstanceInvalidationService.a + 1;
                multiInstanceInvalidationService.a = i2;
                if (multiInstanceInvalidationService.c.register(rn6, Integer.valueOf(i2))) {
                    multiInstanceInvalidationService.b.put(Integer.valueOf(i2), str);
                    i = i2;
                } else {
                    multiInstanceInvalidationService.a--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final void h0(rn6 rn6, int i) {
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.c;
        synchronized (multiInstanceInvalidationService.c) {
            multiInstanceInvalidationService.c.unregister(rn6);
            String str = (String) multiInstanceInvalidationService.b.remove(Integer.valueOf(i));
        }
    }

    public final void k(int i, String[] strArr) {
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.c;
        synchronized (multiInstanceInvalidationService.c) {
            try {
                String str = (String) multiInstanceInvalidationService.b.get(Integer.valueOf(i));
                if (str != null) {
                    int beginBroadcast = multiInstanceInvalidationService.c.beginBroadcast();
                    for (int i2 = 0; i2 < beginBroadcast; i2++) {
                        Integer num = (Integer) multiInstanceInvalidationService.c.getBroadcastCookie(i2);
                        int intValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.b.get(num);
                        if (i != intValue && str.equals(str2)) {
                            try {
                                ((rn6) multiInstanceInvalidationService.c.getBroadcastItem(i2)).l(strArr);
                            } catch (RemoteException unused) {
                            }
                        }
                    }
                    multiInstanceInvalidationService.c.finishBroadcast();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [qn6, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [qn6, java.lang.Object] */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = sn6.b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        rn6 rn6 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                Object queryLocalInterface = readStrongBinder.queryLocalInterface(rn6.a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof rn6)) {
                    ? obj = new Object();
                    obj.c = readStrongBinder;
                    rn6 = obj;
                } else {
                    rn6 = (rn6) queryLocalInterface;
                }
            }
            int R = R(rn6, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(R);
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                Object queryLocalInterface2 = readStrongBinder2.queryLocalInterface(rn6.a);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof rn6)) {
                    ? obj2 = new Object();
                    obj2.c = readStrongBinder2;
                    rn6 = obj2;
                } else {
                    rn6 = (rn6) queryLocalInterface2;
                }
            }
            h0(rn6, parcel.readInt());
            parcel2.writeNoException();
        } else if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            k(parcel.readInt(), parcel.createStringArray());
        }
        return true;
    }
}
