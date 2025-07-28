package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ej5  reason: default package */
public final class ej5 extends n6c implements bj5 {
    public static final Parcelable.Creator<ej5> CREATOR = new w33(20);
    public int A0;
    public boolean B0;
    public float X;
    public float Y;
    public int Z;
    public float w0;
    public int x0;
    public int y0;
    public int z0;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.X);
        parcel.writeFloat(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeFloat(this.w0);
        parcel.writeInt(this.x0);
        parcel.writeInt(this.y0);
        parcel.writeInt(this.z0);
        parcel.writeInt(this.A0);
        parcel.writeByte(this.B0 ? (byte) 1 : 0);
        parcel.writeInt(this.bottomMargin);
        parcel.writeInt(this.leftMargin);
        parcel.writeInt(this.rightMargin);
        parcel.writeInt(this.topMargin);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
    }
}
