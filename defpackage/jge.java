package defpackage;

import android.os.Parcel;
import java.util.List;

/* renamed from: jge  reason: default package */
public final class jge extends mge {
    public static final ige CREATOR = new Object();
    public final int b;
    public final List c;

    public jge(int i, List list) {
        this.b = i;
        this.c = list;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.jge) r5;
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
            boolean r1 = r5 instanceof defpackage.jge
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            jge r5 = (defpackage.jge) r5
            int r1 = r5.b
            int r3 = r4.b
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.util.List r4 = r4.c
            java.util.List r5 = r5.c
            boolean r4 = hhd.f(r4, r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jge.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "ResourceParams(resId=" + this.b + ", args=" + this.c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeList(this.c);
    }
}
