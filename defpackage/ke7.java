package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ke7  reason: default package */
public final class ke7 implements ne7 {
    public static final Parcelable.Creator<ke7> CREATOR = new ze6(28);
    public final long a;

    public ke7(long j) {
        this.a = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
    }
}
