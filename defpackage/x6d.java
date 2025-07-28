package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x6d  reason: default package */
public final class x6d extends b7d {
    public static final Parcelable.Creator<x6d> CREATOR = new x3b(22);
    public final mge a;
    public final Integer b;

    public x6d(mge mge, Integer num) {
        this.a = mge;
        this.b = num;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6d)) {
            return false;
        }
        x6d x6d = (x6d) obj;
        return hhd.f(this.a, x6d.a) && hhd.f(this.b, x6d.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Property(text=" + this.a + ", icon=" + this.b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int intValue;
        parcel.writeParcelable(this.a, i);
        Integer num = this.b;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }
}
