package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: kod  reason: default package */
public final class kod implements Parcelable {
    public static final Parcelable.Creator<kod> CREATOR = new xkd(9);
    public int X;
    public int[] Y;
    public List Z;
    public int a;
    public int b;
    public int c;
    public int[] o;
    public boolean w0;
    public boolean x0;
    public boolean y0;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        if (this.c > 0) {
            parcel.writeIntArray(this.o);
        }
        parcel.writeInt(this.X);
        if (this.X > 0) {
            parcel.writeIntArray(this.Y);
        }
        parcel.writeInt(this.w0 ? 1 : 0);
        parcel.writeInt(this.x0 ? 1 : 0);
        parcel.writeInt(this.y0 ? 1 : 0);
        parcel.writeList(this.Z);
    }
}
