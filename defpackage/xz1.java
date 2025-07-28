package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: xz1  reason: default package */
public final class xz1 extends o3 {
    public static final Parcelable.Creator<xz1> CREATOR = new h6(18);
    public final tk7 a;
    public final String b;

    public xz1(tk7 tk7, String str) {
        this.a = tk7;
        this.b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }
}
