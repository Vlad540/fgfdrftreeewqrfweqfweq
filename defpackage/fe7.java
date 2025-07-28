package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fe7  reason: default package */
public final class fe7 implements ne7, le7 {
    public static final Parcelable.Creator<fe7> CREATOR = new ze6(23);
    public final long a;
    public final long b;
    public final String c;

    public fe7(long j, String str, long j2) {
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final String m() {
        return this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
    }
}
