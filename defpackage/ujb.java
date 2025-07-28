package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ujb  reason: default package */
public final class ujb implements Parcelable {
    public static final Parcelable.Creator<ujb> CREATOR = new x3b(9);
    public final rjb a;

    public ujb(rjb rjb) {
        this.a = rjb;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ujb) && hhd.f(this.a, ((ujb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "QualityParc(value=" + this.a + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        rjb rjb = this.a;
        parcel.writeString(rjb.a.a);
        parcel.writeInt(rjb.b);
        parcel.writeInt(rjb.c);
        parcel.writeInt(rjb.d);
        parcel.writeLong(rjb.e);
        parcel.writeByte(rjb.f ? (byte) 1 : 0);
    }
}
