package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a7d  reason: default package */
public final class a7d extends b7d {
    public static final Parcelable.Creator<a7d> CREATOR = new x3b(25);
    public final mge a;

    public a7d(mge mge) {
        this.a = mge;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7d) && hhd.f(this.a, ((a7d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("Text(text="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
