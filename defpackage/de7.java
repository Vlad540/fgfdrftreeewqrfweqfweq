package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: de7  reason: default package */
public final class de7 implements ne7 {
    public static final Parcelable.Creator<de7> CREATOR = new ze6(21);
    public final long a;
    public final String b;

    public de7(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
    }
}
