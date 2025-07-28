package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: t04  reason: default package */
public final class t04 implements Parcelable {
    public static final Parcelable.Creator<t04> CREATOR = new w33(7);
    public final long a;

    public t04(long j) {
        this.a = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t04)) {
            return false;
        }
        return this.a == ((t04) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
    }
}
