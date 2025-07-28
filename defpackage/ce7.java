package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ce7  reason: default package */
public final class ce7 implements ne7 {
    public static final Parcelable.Creator<ce7> CREATOR = new ze6(20);
    public final String a;

    public ce7(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
