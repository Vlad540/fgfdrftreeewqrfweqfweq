package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b4b  reason: default package */
public final class b4b extends omd {
    public static final Parcelable.Creator<b4b> CREATOR = new x3b(2);
    public final long a;
    public final long b;
    public final byte[] c;

    public b4b(long j, byte[] bArr, long j2) {
        this.a = j2;
        this.b = j;
        this.c = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeByteArray(this.c);
    }

    public b4b(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i = mze.a;
        this.c = createByteArray;
    }
}
