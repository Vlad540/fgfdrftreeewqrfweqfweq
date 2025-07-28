package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.IMediaControllerCallback;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: in6  reason: default package */
public final class in6 implements jn6 {
    public IBinder c;

    public final IBinder asBinder() {
        return this.c;
    }

    public final void f(cya cya) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (cya != null) {
                obtain.writeInt(1);
                cya.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(3, obtain, (Parcel) null, 1)) {
                int i = u38.d;
            }
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public final void onQueueTitleChanged(CharSequence charSequence) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (charSequence != null) {
                obtain.writeInt(1);
                TextUtils.writeToParcel(charSequence, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(6, obtain, (Parcel) null, 1)) {
                int i = u38.d;
            }
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public final void onRepeatModeChanged(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            obtain.writeInt(i);
            if (!this.c.transact(9, obtain, (Parcel) null, 1)) {
                int i2 = u38.d;
            }
        } finally {
            obtain.recycle();
        }
    }

    public final void onSessionDestroyed() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (!this.c.transact(2, obtain, (Parcel) null, 1)) {
                int i = u38.d;
            }
        } finally {
            obtain.recycle();
        }
    }

    public final void onShuffleModeChanged(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            obtain.writeInt(i);
            if (!this.c.transact(12, obtain, (Parcel) null, 1)) {
                int i2 = u38.d;
            }
        } finally {
            obtain.recycle();
        }
    }

    public final void q(ArrayList arrayList) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            obtain.writeTypedList(arrayList);
            if (!this.c.transact(5, obtain, (Parcel) null, 1)) {
                int i = u38.d;
            }
        } finally {
            obtain.recycle();
        }
    }

    public final void t(gja gja) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (gja != null) {
                obtain.writeInt(1);
                gja.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(8, obtain, (Parcel) null, 1)) {
                int i = u38.d;
            }
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public final void y0(a88 a88) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (a88 != null) {
                obtain.writeInt(1);
                obtain.writeBundle(a88.a);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(4, obtain, (Parcel) null, 1)) {
                int i = u38.d;
            }
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
