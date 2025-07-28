package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;

/* renamed from: k04  reason: default package */
public final class k04 implements Parcelable {
    public static final Parcelable.Creator<k04> CREATOR = new w33(6);
    public final v04 a;
    public final zie b;
    public final zie c;

    public k04(v04 v04, zie zie, zie zie2) {
        this.a = v04;
        this.b = zie;
        this.c = zie2;
    }

    public static k04 a(k04 k04, v04 v04, zie zie, zie zie2, int i) {
        if ((i & 1) != 0) {
            v04 = k04.a;
        }
        if ((i & 2) != 0) {
            zie = k04.b;
        }
        if ((i & 4) != 0) {
            zie2 = k04.c;
        }
        return new k04(v04, zie, zie2);
    }

    public final long b() {
        Calendar instance = Calendar.getInstance();
        v04 v04 = this.a;
        instance.set(1, v04.o);
        instance.set(2, v04.c);
        instance.set(5, v04.b);
        instance.set(11, this.b.a);
        instance.set(12, this.c.a);
        instance.set(13, 0);
        instance.set(14, 0);
        udd.q("DateTime", instance.getTime().toString());
        return instance.getTimeInMillis();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k04)) {
            return false;
        }
        k04 k04 = (k04) obj;
        return hhd.f(this.a, k04.a) && hhd.f(this.b, k04.b) && hhd.f(this.c, k04.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a) + c3d.d(this.b.a, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DateTime(day=" + this.a + ", hour=" + this.b + ", minutes=" + this.c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
    }
}
