package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dca  reason: default package */
public final class dca implements eca {
    public static final Parcelable.Creator<dca> CREATOR = new ch9(18);
    public final mge a;

    public dca(mge mge) {
        this.a = mge;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dca) && hhd.f(this.a, ((dca) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("TextButton(caption="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
