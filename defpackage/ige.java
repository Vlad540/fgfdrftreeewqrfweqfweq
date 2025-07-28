package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ige  reason: default package */
public final class ige implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new jge(parcel.readInt(), parcel.readArrayList(Object.class.getClassLoader()));
    }

    public final Object[] newArray(int i) {
        return new jge[i];
    }
}
