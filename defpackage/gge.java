package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: gge  reason: default package */
public final class gge implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new hge(parcel.readInt());
    }

    public final Object[] newArray(int i) {
        return new hge[i];
    }
}
