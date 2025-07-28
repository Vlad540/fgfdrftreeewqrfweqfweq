package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: je7  reason: default package */
public final class je7 implements ne7 {
    public static final Parcelable.Creator<je7> CREATOR = new ze6(27);
    public final String a;

    public je7(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
