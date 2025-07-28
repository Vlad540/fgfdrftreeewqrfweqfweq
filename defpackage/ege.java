package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ege  reason: default package */
public final class ege implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new fge(parcel.readArrayList(Object.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    public final Object[] newArray(int i) {
        return new fge[i];
    }
}
