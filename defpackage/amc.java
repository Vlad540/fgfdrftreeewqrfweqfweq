package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: amc  reason: default package */
public final class amc extends bmc {
    public static final Parcelable.Creator<amc> CREATOR = new x3b(16);
    public final k04 a;
    public final boolean b;
    public final Parcelable c;

    public amc(k04 k04, boolean z, Parcelable parcelable) {
        this.a = k04;
        this.b = z;
        this.c = parcelable;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amc)) {
            return false;
        }
        amc amc = (amc) obj;
        return hhd.f(this.a, amc.a) && this.b == amc.b && hhd.f(this.c, amc.c);
    }

    public final int hashCode() {
        int f = th2.f(this.a.hashCode() * 31, 31, this.b);
        Parcelable parcelable = this.c;
        return f + (parcelable == null ? 0 : parcelable.hashCode());
    }

    public final String toString() {
        return "DelayedAttrs(sendTime=" + this.a + ", notifySender=" + this.b + ", input=" + this.c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
    }
}
