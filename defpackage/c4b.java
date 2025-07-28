package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c4b  reason: default package */
public final class c4b extends pmd {
    public static final Parcelable.Creator<c4b> CREATOR = new x3b(3);
    public final long a;
    public final long b;
    public final byte[] c;

    public c4b(long j, byte[] bArr, long j2) {
        this.a = j2;
        this.b = j;
        this.c = bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.a);
        sb.append(", identifier= ");
        return wn6.k(sb, this.b, " }");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeByteArray(this.c);
    }

    public c4b(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i = oze.a;
        this.c = createByteArray;
    }
}
