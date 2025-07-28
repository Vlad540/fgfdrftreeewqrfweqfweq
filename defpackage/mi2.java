package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mi2  reason: default package */
public enum mi2 implements Parcelable {
    DEFAULT;
    
    public static final Parcelable.Creator<mi2> CREATOR = null;
    public static final gf6 b = null;
    public final r7e a;

    static {
        b = new gf6(8);
        CREATOR = new h6(25);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
