package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qk7  reason: default package */
public final class qk7 implements Parcelable {
    public static final Parcelable.Creator<qk7> CREATOR = new vf7(1);
    public final int A0;
    public final String X;
    public final String Y;
    public final int Z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int o;
    public final Rect w0;
    public final float[] x0;
    public final boolean y0;
    public final int z0;

    public qk7(pk7 pk7) {
        this.a = pk7.a;
        this.b = pk7.b;
        this.c = true;
        this.o = 0;
        this.X = pk7.c;
        this.Y = pk7.d;
        this.Z = pk7.e;
        this.w0 = null;
        this.x0 = null;
        this.y0 = true;
        this.z0 = pk7.f;
        this.A0 = pk7.g;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a ? (byte) 1 : 0);
        parcel.writeByte(this.b ? (byte) 1 : 0);
        parcel.writeByte(this.c ? (byte) 1 : 0);
        parcel.writeInt(this.o);
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeParcelable(this.w0, i);
        parcel.writeFloatArray(this.x0);
        parcel.writeByte(this.y0 ? (byte) 1 : 0);
        parcel.writeInt(this.z0);
        parcel.writeInt(this.A0);
    }

    public qk7(Parcel parcel) {
        boolean z = false;
        this.a = parcel.readByte() != 0;
        this.b = parcel.readByte() != 0;
        this.c = parcel.readByte() != 0;
        this.o = parcel.readInt();
        this.X = parcel.readString();
        this.Y = parcel.readString();
        this.Z = parcel.readInt();
        this.w0 = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.x0 = parcel.createFloatArray();
        this.y0 = parcel.readByte() != 0 ? true : z;
        this.z0 = parcel.readInt();
        this.A0 = parcel.readInt();
    }
}
