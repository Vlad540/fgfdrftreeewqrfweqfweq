package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: q0g  reason: default package */
public final class q0g extends o3 {
    public static final Parcelable.Creator<q0g> CREATOR = new udf(11);
    public final boolean X;
    public final int a;
    public final IBinder b;
    public final nd3 c;
    public final boolean o;

    public q0g(int i, IBinder iBinder, nd3 nd3, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = nd3;
        this.o = z;
        this.X = z2;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0g)) {
            return false;
        }
        q0g q0g = (q0g) obj;
        if (this.c.equals(q0g.c)) {
            Object obj3 = null;
            IBinder iBinder = this.b;
            if (iBinder == null) {
                obj2 = null;
            } else {
                int i = x4.d;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj2 = queryLocalInterface instanceof an6 ? (an6) queryLocalInterface : new vyf(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = q0g.b;
            if (iBinder2 != null) {
                int i2 = x4.d;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj3 = queryLocalInterface2 instanceof an6 ? (an6) queryLocalInterface2 : new vyf(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (x87.F(obj2, obj3)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.p0(parcel, 1, 4);
        parcel.writeInt(this.a);
        ek8.i0(parcel, 2, this.b);
        ek8.j0(parcel, 3, this.c, i);
        ek8.p0(parcel, 4, 4);
        parcel.writeInt(this.o ? 1 : 0);
        ek8.p0(parcel, 5, 4);
        parcel.writeInt(this.X ? 1 : 0);
        ek8.o0(parcel, n0);
    }
}
