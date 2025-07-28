package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bm  reason: default package */
public final class bm extends z {
    public static final Parcelable.Creator<bm> CREATOR = new y(1);
    public int X;
    public float Y;
    public boolean Z;
    public boolean c;
    public boolean o;

    public bm(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z = false;
        this.c = parcel.readByte() != 0;
        this.o = parcel.readByte() != 0;
        this.X = parcel.readInt();
        this.Y = parcel.readFloat();
        this.Z = parcel.readByte() != 0 ? true : z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.c ? (byte) 1 : 0);
        parcel.writeByte(this.o ? (byte) 1 : 0);
        parcel.writeInt(this.X);
        parcel.writeFloat(this.Y);
        parcel.writeByte(this.Z ? (byte) 1 : 0);
    }
}
