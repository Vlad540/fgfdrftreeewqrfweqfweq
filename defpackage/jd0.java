package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: jd0  reason: default package */
public final class jd0 implements Parcelable {
    public static final Parcelable.Creator<jd0> CREATOR = new h6(9);
    public final ArrayList a;
    public final ArrayList b;

    public jd0(Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.b = parcel.createTypedArrayList(id0.CREATOR);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeTypedList(this.b);
    }
}
