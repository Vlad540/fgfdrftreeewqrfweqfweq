package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: he7  reason: default package */
public final class he7 implements ne7, le7 {
    public static final Parcelable.Creator<he7> CREATOR = new ze6(25);
    public final long a;
    public final String b;
    public final String c;

    public he7(long j, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final String m() {
        return this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
