package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b03  reason: default package */
public final class b03 extends o3 {
    public static final Parcelable.Creator<b03> CREATOR = new udf(2);
    public final int a;
    public final String b;

    public b03(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b03)) {
            return false;
        }
        b03 b03 = (b03) obj;
        return b03.a == this.a && x87.F(b03.b, this.b);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.a + ":" + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.p0(parcel, 1, 4);
        parcel.writeInt(this.a);
        ek8.k0(parcel, 2, this.b);
        ek8.o0(parcel, n0);
    }
}
