package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cge  reason: default package */
public final class cge implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new dge(parcel.readInt(), parcel.readInt());
    }

    public final Object[] newArray(int i) {
        return new dge[i];
    }
}
