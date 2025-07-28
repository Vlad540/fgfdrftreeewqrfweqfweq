package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: akd  reason: default package */
public final class akd implements Parcelable {
    public static final Parcelable.Creator<akd> CREATOR = new x3b(29);
    public static final xb4 o = new xb4(22);
    public final long a;
    public final long b;
    public final int c;

    public akd(long j, long j2, int i) {
        oyb.d(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || akd.class != obj.getClass()) {
            return false;
        }
        akd akd = (akd) obj;
        return this.a == akd.a && this.b == akd.b && this.c == akd.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        int i = oze.a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.a + ", endTimeMs=" + this.b + ", speedDivisor=" + this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
    }
}
