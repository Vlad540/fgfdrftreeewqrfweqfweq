package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aa  reason: default package */
public final class aa implements Parcelable {
    public static final Parcelable.Creator<aa> CREATOR = new h6(2);
    public final int a;
    public final int b;
    public final String c;

    public aa(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.aa) r5;
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
            boolean r1 = r5 instanceof defpackage.aa
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            aa r5 = (defpackage.aa) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            java.lang.String r4 = r4.c
            java.lang.String r5 = r5.c
            boolean r4 = hhd.f(r4, r5)
            if (r4 != 0) goto L_0x0025
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int d = c3d.d(this.b, Integer.hashCode(this.a) * 31, 31);
        String str = this.c;
        return d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddLinkState(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", link=");
        return wn6.l(sb, this.c, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }
}
