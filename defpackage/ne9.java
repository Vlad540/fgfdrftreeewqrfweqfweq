package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ne9  reason: default package */
public final class ne9 implements Parcelable {
    public static final Parcelable.Creator<ne9> CREATOR = new vf7(29);
    public final int a;
    public final boolean b;
    public final boolean c;

    public ne9(me9 me9) {
        this.a = me9.a;
        this.b = me9.b;
        this.c = me9.c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeByte(this.b ? (byte) 1 : 0);
        parcel.writeByte(this.c ? (byte) 1 : 0);
    }

    public ne9(Parcel parcel) {
        this.a = parcel.readInt();
        boolean z = false;
        this.b = parcel.readByte() != 0;
        this.c = parcel.readByte() != 0 ? true : z;
    }
}
