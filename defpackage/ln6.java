package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;

/* renamed from: ln6  reason: default package */
public final class ln6 implements nn6 {
    public IBinder c;

    public final void A0(hn6 hn6, int i, int i2, int i3, int i4) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeInt(i4);
            this.c.transact(3023, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void B(hn6 hn6, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            a06.b(obtain, bundle);
            this.c.transact(3048, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void C(hn6 hn6, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            this.c.transact(3041, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void C0(hn6 hn6, int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.c.transact(3022, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void D0(hn6 hn6, int i, int i2, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            a06.b(obtain, bundle);
            this.c.transact(3055, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void E(hn6 hn6, int i, int i2, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            a06.b(obtain, bundle);
            this.c.transact(3030, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void E0(hn6 hn6, int i, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            this.c.transact(3018, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void F(hn6 hn6, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.c.transact(3052, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void G(hn6 hn6, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            this.c.transact(3040, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void I(hn6 hn6, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.c.transact(3053, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void J(hn6 hn6, int i, IBinder iBinder, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeStrongBinder(iBinder);
            obtain.writeInt(z ? 1 : 0);
            this.c.transact(3011, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void K(hn6 hn6, int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.c.transact(3020, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void L(hn6 hn6, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.c.transact(3019, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void N(hn6 hn6, int i, int i2, int i3, IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeStrongBinder(iBinder);
            this.c.transact(3056, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void O(hn6 hn6, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            this.c.transact(3047, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void P(hn6 hn6, int i, int i2, long j) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeLong(j);
            this.c.transact(3039, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void Q(hn6 hn6, int i, IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeStrongBinder(iBinder);
            this.c.transact(3031, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void S(hn6 hn6, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            this.c.transact(3036, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void U(hn6 hn6, int i, int i2, IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeStrongBinder(iBinder);
            this.c.transact(3032, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void V(hn6 hn6, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            this.c.transact(3042, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void X(hn6 hn6, int i, long j) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeLong(j);
            this.c.transact(3038, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void Y(hn6 hn6, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            this.c.transact(3026, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void Z(hn6 hn6, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.c.transact(3037, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void a(hn6 hn6, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            a06.b(obtain, bundle);
            this.c.transact(3014, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void a0(hn6 hn6, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            this.c.transact(3005, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.c;
    }

    public final void c0(hn6 hn6, int i, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            this.c.transact(3013, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void d(hn6 hn6, int i, Bundle bundle, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            a06.b(obtain, bundle);
            obtain.writeInt(z ? 1 : 0);
            this.c.transact(3057, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void d0(hn6 hn6, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            a06.b(obtain, bundle);
            this.c.transact(3007, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void e(hn6 hn6, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            this.c.transact(3025, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void e0(hn6 hn6, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            this.c.transact(3035, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void i(hn6 hn6, int i, Bundle bundle, long j) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            a06.b(obtain, bundle);
            obtain.writeLong(j);
            this.c.transact(3008, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void i0(hn6 hn6, int i, Surface surface) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            a06.b(obtain, surface);
            this.c.transact(3044, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void j0(hn6 hn6, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            a06.b(obtain, bundle);
            this.c.transact(3015, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void l0(hn6 hn6, int i, Bundle bundle, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            a06.b(obtain, bundle);
            obtain.writeInt(z ? 1 : 0);
            this.c.transact(3009, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void m0(hn6 hn6) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            this.c.transact(3045, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void n0(hn6 hn6, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.c.transact(3003, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void o0(hn6 hn6, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            a06.b(obtain, bundle);
            this.c.transact(3027, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void p(hn6 hn6, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            this.c.transact(3024, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void p0(hn6 hn6, int i, Bundle bundle, Bundle bundle2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            a06.b(obtain, bundle);
            a06.b(obtain, bundle2);
            this.c.transact(3016, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void r0(hn6 hn6, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            this.c.transact(3021, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void s(hn6 hn6, int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.c.transact(3051, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void s0(hn6 hn6, int i, boolean z, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(i2);
            this.c.transact(3054, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void u0(hn6 hn6, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            a06.b(obtain, bundle);
            this.c.transact(3033, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void v(hn6 hn6, int i, IBinder iBinder, int i2, long j) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeStrongBinder(iBinder);
            obtain.writeInt(i2);
            obtain.writeLong(j);
            this.c.transact(3012, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void v0(hn6 hn6, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            this.c.transact(3046, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void w(hn6 hn6, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            this.c.transact(3043, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void w0(hn6 hn6, int i, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            this.c.transact(3006, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void x(hn6 hn6, int i, float f) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeFloat(f);
            this.c.transact(3028, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void x0(hn6 hn6, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            this.c.transact(3034, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void y(hn6 hn6, int i, float f) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeFloat(f);
            this.c.transact(3002, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void z(hn6 hn6, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            this.c.transact(3004, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void z0(hn6 hn6, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(hn6);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.c.transact(3017, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
