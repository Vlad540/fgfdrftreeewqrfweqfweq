package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: h1g  reason: default package */
public final class h1g extends o3 {
    public static final Parcelable.Creator<h1g> CREATOR = new udf(26);
    public final int a;
    public final int b;
    public final long c;
    public final long o;

    public h1g(int i, int i2, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.o = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r7 = (defpackage.h1g) r7;
        r0 = r7.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.h1g
            r1 = 0
            if (r0 == 0) goto L_0x0025
            h1g r7 = (defpackage.h1g) r7
            int r0 = r7.a
            int r2 = r6.a
            if (r2 != r0) goto L_0x0025
            int r0 = r6.b
            int r2 = r7.b
            if (r0 != r2) goto L_0x0025
            long r2 = r6.c
            long r4 = r7.c
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0025
            long r2 = r6.o
            long r6 = r7.o
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0025
            r6 = 1
            return r6
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h1g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.o), Long.valueOf(this.c)});
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        long j = this.o;
        int length3 = String.valueOf(j).length();
        long j2 = this.c;
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j2).length());
        sb.append("NetworkLocationStatus: Wifi status: ");
        sb.append(i);
        sb.append(" Cell status: ");
        sb.append(i2);
        hr1.s(sb, " elapsed time NS: ", j, " system time ms: ");
        sb.append(j2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.p0(parcel, 1, 4);
        parcel.writeInt(this.a);
        ek8.p0(parcel, 2, 4);
        parcel.writeInt(this.b);
        ek8.p0(parcel, 3, 8);
        parcel.writeLong(this.c);
        ek8.p0(parcel, 4, 8);
        parcel.writeLong(this.o);
        ek8.o0(parcel, n0);
    }
}
