package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a6d  reason: default package */
public final class a6d implements Parcelable {
    public static final Parcelable.Creator<a6d> CREATOR = new x3b(20);
    public final int a;
    public final mge b;
    public final int c;

    public a6d(int i, int i2, mge mge) {
        this.a = i;
        this.b = mge;
        this.c = i2;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.a6d) r5;
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
            boolean r1 = r5 instanceof defpackage.a6d
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            a6d r5 = (defpackage.a6d) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            mge r1 = r4.b
            mge r3 = r5.b
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            int r4 = r4.c
            int r5 = r5.c
            if (r4 == r5) goto L_0x0025
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a6d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return hr1.t(this.c) + c3d.e(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(id=");
        sb.append(this.a);
        sb.append(", caption=");
        sb.append(this.b);
        sb.append(", type=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? "null" : "NEUTRAL" : "LINK");
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        int i2 = this.c;
        if (i2 == 1) {
            str = "LINK";
        } else if (i2 == 2) {
            str = "NEUTRAL";
        } else {
            throw null;
        }
        parcel.writeString(str);
    }
}
