package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: cl0  reason: default package */
public final class cl0 extends yo6 {
    public static final Parcelable.Creator<cl0> CREATOR = new h6(13);
    public final byte[] b;

    public cl0(byte[] bArr, String str) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cl0.class != obj.getClass()) {
            return false;
        }
        cl0 cl0 = (cl0) obj;
        return this.a.equals(cl0.a) && Arrays.equals(this.b, cl0.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + me4.d(527, 31, this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cl0(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = defpackage.oze.a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cl0.<init>(android.os.Parcel):void");
    }
}
