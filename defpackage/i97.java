package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: i97  reason: default package */
public final class i97 extends o3 {
    public static final Parcelable.Creator<i97> CREATOR = new udf(15);
    public final long a;
    public final int b;
    public final boolean c;
    public final a3g o;

    public i97(long j, int i, boolean z, a3g a3g) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.o = a3g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i97)) {
            return false;
        }
        i97 i97 = (i97) obj;
        return this.a == i97.a && this.b == i97.b && this.c == i97.c && x87.F(this.o, i97.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str;
        StringBuilder l = hr1.l("LastLocationRequest[");
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            l.append("maxAge=");
            g3g.a(j, l);
        }
        int i = this.b;
        if (i != 0) {
            l.append(", ");
            if (i == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i == 1) {
                str = "GRANULARITY_COARSE";
            } else if (i == 2) {
                str = "GRANULARITY_FINE";
            } else {
                throw new IllegalArgumentException();
            }
            l.append(str);
        }
        if (this.c) {
            l.append(", bypass");
        }
        a3g a3g = this.o;
        if (a3g != null) {
            l.append(", impersonation=");
            l.append(a3g);
        }
        l.append(']');
        return l.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.p0(parcel, 1, 8);
        parcel.writeLong(this.a);
        ek8.p0(parcel, 2, 4);
        parcel.writeInt(this.b);
        ek8.p0(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ek8.j0(parcel, 5, this.o, i);
        ek8.o0(parcel, n0);
    }
}
