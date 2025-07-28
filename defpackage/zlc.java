package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: zlc  reason: default package */
public final class zlc extends bmc {
    public static final Parcelable.Creator<zlc> CREATOR = new x3b(15);
    public final Parcelable a;

    public zlc(Parcelable parcelable) {
        this.a = parcelable;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zlc) && hhd.f(this.a, ((zlc) obj).a);
    }

    public final int hashCode() {
        Parcelable parcelable = this.a;
        if (parcelable == null) {
            return 0;
        }
        return parcelable.hashCode();
    }

    public final String toString() {
        return "Close(input=" + this.a + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
