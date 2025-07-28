package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: un4  reason: default package */
public final class un4 implements Parcelable {
    public static final Parcelable.Creator<un4> CREATOR = new w33(14);
    public final byte[] X;
    public int a;
    public final UUID b;
    public final String c;
    public final String o;

    public un4(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.b = uuid;
        this.c = str;
        str2.getClass();
        this.o = str2;
        this.X = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = vu0.a;
        UUID uuid3 = this.b;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof un4)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        un4 un4 = (un4) obj;
        return mze.a(this.c, un4.c) && mze.a(this.o, un4.o) && mze.a(this.b, un4.b) && Arrays.equals(this.X, un4.X);
    }

    public final int hashCode() {
        if (this.a == 0) {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            this.a = Arrays.hashCode(this.X) + me4.d((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.o);
        }
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        parcel.writeByteArray(this.X);
    }

    public un4(Parcel parcel) {
        this.b = new UUID(parcel.readLong(), parcel.readLong());
        this.c = parcel.readString();
        String readString = parcel.readString();
        int i = mze.a;
        this.o = readString;
        this.X = parcel.createByteArray();
    }
}
