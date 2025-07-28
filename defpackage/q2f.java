package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: q2f  reason: default package */
public final class q2f extends r2f {
    public static final Parcelable.Creator<q2f> CREATOR = new xkd(24);
    public final n2f a;

    public q2f(n2f n2f) {
        this.a = n2f;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
    }
}
