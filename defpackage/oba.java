package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: oba  reason: default package */
public final class oba implements Parcelable {
    public static final Parcelable.Creator<oba> CREATOR = new ch9(4);
    public final int a;

    public /* synthetic */ oba(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = ((defpackage.oba) r3).a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.oba
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x0010
        L_0x0006:
            oba r3 = (defpackage.oba) r3
            int r3 = r3.a
            int r2 = r2.a
            if (r2 == r3) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r1 = 1
        L_0x0010:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oba.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("ContainerGravity(value="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
