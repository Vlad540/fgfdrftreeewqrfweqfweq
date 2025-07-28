package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e46  reason: default package */
public final class e46 extends o3 {
    public static final Parcelable.Creator<e46> CREATOR = new w33(26);
    public final String a;

    public e46(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e46) && hhd.f(this.a, ((e46) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("AsString(string="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
