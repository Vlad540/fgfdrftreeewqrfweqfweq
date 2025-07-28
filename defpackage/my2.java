package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* renamed from: my2  reason: default package */
public final class my2 extends o3 {
    public static final Parcelable.Creator<my2> CREATOR = new o1g(2);
    public int X;
    public float Y;
    public boolean Z;
    public LatLng a;
    public double b;
    public float c;
    public int o;
    public boolean w0;
    public List x0;

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.j0(parcel, 2, this.a, i);
        double d = this.b;
        ek8.p0(parcel, 3, 8);
        parcel.writeDouble(d);
        float f = this.c;
        ek8.p0(parcel, 4, 4);
        parcel.writeFloat(f);
        int i2 = this.o;
        ek8.p0(parcel, 5, 4);
        parcel.writeInt(i2);
        int i3 = this.X;
        ek8.p0(parcel, 6, 4);
        parcel.writeInt(i3);
        float f2 = this.Y;
        ek8.p0(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z = this.Z;
        ek8.p0(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.w0;
        ek8.p0(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        ek8.m0(parcel, this.x0, 10);
        ek8.o0(parcel, n0);
    }
}
