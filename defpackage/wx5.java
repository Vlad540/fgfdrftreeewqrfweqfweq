package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: wx5  reason: default package */
public final class wx5 implements Parcelable {
    public static final Parcelable.Creator<wx5> CREATOR = new w33(23);
    public String X = null;
    public ArrayList Y = new ArrayList();
    public ArrayList Z = new ArrayList();
    public ArrayList a;
    public ArrayList b;
    public id0[] c;
    public int o;
    public ArrayList w0;

    public wx5(Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.b = parcel.createStringArrayList();
        this.c = (id0[]) parcel.createTypedArray(id0.CREATOR);
        this.o = parcel.readInt();
        this.X = parcel.readString();
        this.Y = parcel.createStringArrayList();
        this.Z = parcel.createTypedArrayList(jd0.CREATOR);
        this.w0 = parcel.createTypedArrayList(qx5.CREATOR);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.o);
        parcel.writeString(this.X);
        parcel.writeStringList(this.Y);
        parcel.writeTypedList(this.Z);
        parcel.writeTypedList(this.w0);
    }
}
