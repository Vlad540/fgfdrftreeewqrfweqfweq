package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ge7  reason: default package */
public final class ge7 implements ne7, le7 {
    public static final Parcelable.Creator<ge7> CREATOR = new ze6(24);
    public final long a;
    public final String b;

    public ge7(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final String m() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
    }
}
