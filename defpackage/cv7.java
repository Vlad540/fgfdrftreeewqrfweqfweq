package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: cv7  reason: default package */
public class cv7 extends o3 {
    public static final Parcelable.Creator<cv7> CREATOR = new o1g(17);
    public float A0;
    public float B0;
    public float C0;
    public int D0;
    public View E0;
    public int F0;
    public String G0;
    public float H0;
    public float X;
    public float Y;
    public boolean Z;
    public LatLng a;
    public String b;
    public String c;
    public lhd o;
    public boolean w0;
    public boolean x0;
    public float y0;
    public float z0;

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.j0(parcel, 2, this.a, i);
        ek8.k0(parcel, 3, this.b);
        ek8.k0(parcel, 4, this.c);
        lhd lhd = this.o;
        ek8.i0(parcel, 5, lhd == null ? null : ((un6) lhd.b).asBinder());
        float f = this.X;
        ek8.p0(parcel, 6, 4);
        parcel.writeFloat(f);
        float f2 = this.Y;
        ek8.p0(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z = this.Z;
        ek8.p0(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.w0;
        ek8.p0(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        ek8.p0(parcel, 10, 4);
        parcel.writeInt(this.x0 ? 1 : 0);
        ek8.p0(parcel, 11, 4);
        parcel.writeFloat(this.y0);
        ek8.p0(parcel, 12, 4);
        parcel.writeFloat(this.z0);
        ek8.p0(parcel, 13, 4);
        parcel.writeFloat(this.A0);
        ek8.p0(parcel, 14, 4);
        parcel.writeFloat(this.B0);
        float f3 = this.C0;
        ek8.p0(parcel, 15, 4);
        parcel.writeFloat(f3);
        ek8.p0(parcel, 17, 4);
        parcel.writeInt(this.D0);
        ek8.i0(parcel, 18, new ks9(this.E0));
        int i2 = this.F0;
        ek8.p0(parcel, 19, 4);
        parcel.writeInt(i2);
        ek8.k0(parcel, 20, this.G0);
        ek8.p0(parcel, 21, 4);
        parcel.writeFloat(this.H0);
        ek8.o0(parcel, n0);
    }
}
