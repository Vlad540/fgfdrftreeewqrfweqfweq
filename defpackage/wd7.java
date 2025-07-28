package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: wd7  reason: default package */
public final class wd7 implements ne7 {
    public static final Parcelable.Creator<wd7> CREATOR = new ze6(14);
    public final long a;
    public final String b;
    public final boolean c;
    public final String o;

    public wd7(long j, String str, String str2, boolean z) {
        this.a = j;
        this.b = str;
        this.c = z;
        this.o = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.o);
    }
}
