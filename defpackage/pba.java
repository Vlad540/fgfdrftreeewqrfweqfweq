package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: pba  reason: default package */
public final class pba implements Parcelable {
    public static final Parcelable.Creator<pba> CREATOR = new ch9(5);
    public final int a;
    public final int b;
    public final int c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pba(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 2 : i, 0, (i3 & 4) != 0 ? 0 : i2, 0);
    }

    public static pba a(pba pba, int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = pba.a;
        }
        if ((i4 & 2) != 0) {
            i2 = pba.b;
        }
        if ((i4 & 4) != 0) {
            i3 = pba.c;
        }
        pba.getClass();
        return new pba(i, i2, i3, 0);
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.pba) r5;
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
            boolean r1 = r5 instanceof defpackage.pba
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            pba r5 = (defpackage.pba) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 != r1) goto L_0x0021
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L_0x0019
            return r2
        L_0x0019:
            int r4 = r4.c
            int r5 = r5.c
            if (r4 == r5) goto L_0x0020
            return r2
        L_0x0020:
            return r0
        L_0x0021:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pba.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + c3d.d(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder m = hr1.m("ContainerParams(gravity=", wn6.j(new StringBuilder("ContainerGravity(value="), this.a, ")"), ", topMargin=");
        m.append(this.b);
        m.append(", bottomMargin=");
        return wn6.j(m, this.c, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public pba(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
