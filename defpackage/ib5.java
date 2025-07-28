package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: ib5  reason: default package */
public final class ib5 extends o3 {
    public static final Parcelable.Creator<ib5> CREATOR = new o1g(3);
    public final String a;
    public final int b;
    public final long c;

    public ib5(long j, String str, int i) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final long b() {
        long j = this.c;
        return j == -1 ? (long) this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ib5) {
            ib5 ib5 = (ib5) obj;
            String str = this.a;
            return ((str != null && str.equals(ib5.a)) || (str == null && ib5.a == null)) && b() == ib5.b();
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(b())});
    }

    public final String toString() {
        mn mnVar = new mn((Object) this);
        mnVar.r(this.a, "name");
        mnVar.r(Long.valueOf(b()), "version");
        return mnVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.k0(parcel, 1, this.a);
        ek8.p0(parcel, 2, 4);
        parcel.writeInt(this.b);
        long b2 = b();
        ek8.p0(parcel, 3, 8);
        parcel.writeLong(b2);
        ek8.o0(parcel, n0);
    }

    public ib5(String str, long j) {
        this.a = str;
        this.c = j;
        this.b = -1;
    }
}
