package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d3g  reason: default package */
public final class d3g extends o3 {
    public static final Parcelable.Creator<d3g> CREATOR = new o1g(6);
    public final String X;
    public final int a;
    public final IBinder b;
    public final IBinder c;
    public final PendingIntent o;

    public d3g(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.a = i;
        this.b = iBinder;
        this.c = iBinder2;
        this.o = pendingIntent;
        this.X = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.p0(parcel, 1, 4);
        parcel.writeInt(this.a);
        ek8.i0(parcel, 2, this.b);
        ek8.i0(parcel, 3, this.c);
        ek8.j0(parcel, 4, this.o, i);
        ek8.k0(parcel, 6, this.X);
        ek8.o0(parcel, n0);
    }
}
