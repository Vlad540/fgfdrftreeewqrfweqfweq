package defpackage;

import android.os.Parcel;

/* renamed from: dge  reason: default package */
public final class dge extends mge {
    public static final cge CREATOR = new Object();
    public final int b;
    public final int c;

    public dge(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.dge) r5;
        r1 = r5.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.dge
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            dge r5 = (defpackage.dge) r5
            int r1 = r5.b
            int r3 = r4.b
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r4 = r4.c
            int r5 = r5.c
            if (r4 == r5) goto L_0x001a
            return r2
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dge.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Plurals(resId=");
        sb.append(this.b);
        sb.append(", quantity=");
        return wn6.j(sb, this.c, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
