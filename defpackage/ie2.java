package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ie2  reason: default package */
public enum ie2 implements Parcelable {
    ;
    
    public static final Parcelable.Creator<ie2> CREATOR = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Enum, ie2] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Enum, ie2] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Enum, ie2] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Enum, ie2] */
    static {
        ie2[] ie2Arr;
        o = new pz4(ie2Arr);
        CREATOR = new h6(24);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
