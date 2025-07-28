package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v7f  reason: default package */
public final class v7f extends w7f {
    public static final Parcelable.Creator<v7f> CREATOR = new xkd(26);
    public final qjb a;

    public v7f(qjb qjb) {
        this.a = qjb;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
    }
}
