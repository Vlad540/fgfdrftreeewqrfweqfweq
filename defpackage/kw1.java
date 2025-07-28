package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: kw1  reason: default package */
public class kw1 extends o3 {
    public static final Parcelable.Creator<kw1> CREATOR = new udf(27);
    public final int a;
    public final lhd b;
    public final Float c;

    public kw1(int i, lhd lhd, Float f) {
        boolean z = true;
        boolean z2 = f != null && f.floatValue() > 0.0f;
        if (i == 3) {
            z = (lhd == null || !z2) ? false : z;
            i = 3;
        }
        a24.h("Invalid Cap: type=" + i + " bitmapDescriptor=" + lhd + " bitmapRefWidth=" + f, z);
        this.a = i;
        this.b = lhd;
        this.c = f;
    }

    public final kw1 b() {
        int i = this.a;
        if (i == 0) {
            return new ut0();
        }
        boolean z = true;
        if (i == 1) {
            return new ut0(1, (lhd) null, (Float) null, 2);
        }
        if (i == 2) {
            return new ut0(2, (lhd) null, (Float) null, 1);
        }
        if (i != 3) {
            return this;
        }
        lhd lhd = this.b;
        a24.q("bitmapDescriptor must not be null", lhd != null);
        Float f = this.c;
        if (f == null) {
            z = false;
        }
        a24.q("bitmapRefWidth must not be null", z);
        return new gx3(lhd, f.floatValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.kw1) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.kw1
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            kw1 r5 = (defpackage.kw1) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 != r1) goto L_0x0027
            lhd r1 = r4.b
            lhd r3 = r5.b
            boolean r1 = x87.F(r1, r3)
            if (r1 == 0) goto L_0x0027
            java.lang.Float r4 = r4.c
            java.lang.Float r5 = r5.c
            boolean r4 = x87.F(r4, r5)
            if (r4 == 0) goto L_0x0027
            return r0
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    public String toString() {
        return wn6.j(new StringBuilder("[Cap: type="), this.a, "]");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.p0(parcel, 2, 4);
        parcel.writeInt(this.a);
        lhd lhd = this.b;
        ek8.i0(parcel, 3, lhd == null ? null : ((un6) lhd.b).asBinder());
        ek8.h0(parcel, 4, this.c);
        ek8.o0(parcel, n0);
    }
}
