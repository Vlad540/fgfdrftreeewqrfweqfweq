package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: zjd  reason: default package */
public final class zjd implements Parcelable {
    public static final Parcelable.Creator<zjd> CREATOR = new x3b(28);
    public final long a;
    public final long b;
    public final int c;

    public zjd(long j, long j2, int i) {
        swb.e(j < j2);
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
        if (obj == null || zjd.class != obj.getClass()) {
            return false;
        }
        zjd zjd = (zjd) obj;
        return this.a == zjd.a && this.b == zjd.b && this.c == zjd.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        int i = mze.a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.a + ", endTimeMs=" + this.b + ", speedDivisor=" + this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
    }
}
