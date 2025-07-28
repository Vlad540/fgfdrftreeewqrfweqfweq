package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: pl4  reason: default package */
public final class pl4 implements Parcelable {
    public static final Parcelable.Creator<pl4> CREATOR = new w33(10);
    public final byte[] X;
    public final String Y;
    public final byte[] Z;
    public final String a;
    public final Uri b;
    public final String c;
    public final List o;

    public pl4(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2) {
        int J = oze.J(uri, str2);
        boolean z = true;
        if (J == 0 || J == 2 || J == 1) {
            z = str3 != null ? false : z;
            oyb.c("customCacheKey must be null for type: " + J, z);
        }
        this.a = str;
        this.b = uri;
        this.c = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.o = Collections.unmodifiableList(arrayList);
        this.X = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.Y = str3;
        this.Z = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : oze.f;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pl4)) {
            return false;
        }
        pl4 pl4 = (pl4) obj;
        return this.a.equals(pl4.a) && this.b.equals(pl4.b) && oze.a(this.c, pl4.c) && this.o.equals(pl4.o) && Arrays.equals(this.X, pl4.X) && oze.a(this.Y, pl4.Y) && Arrays.equals(this.Z, pl4.Z);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 961)) * 31;
        int i = 0;
        String str = this.c;
        int hashCode2 = str != null ? str.hashCode() : 0;
        int hashCode3 = (Arrays.hashCode(this.X) + ((this.o.hashCode() + ((hashCode + hashCode2) * 31)) * 31)) * 31;
        String str2 = this.Y;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Arrays.hashCode(this.Z) + ((hashCode3 + i) * 31);
    }

    public final String toString() {
        return this.c + ":" + this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.toString());
        parcel.writeString(this.c);
        List list = this.o;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
        parcel.writeByteArray(this.X);
        parcel.writeString(this.Y);
        parcel.writeByteArray(this.Z);
    }

    public pl4(Parcel parcel) {
        String readString = parcel.readString();
        int i = oze.a;
        this.a = readString;
        this.b = Uri.parse(parcel.readString());
        this.c = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add((izd) parcel.readParcelable(izd.class.getClassLoader()));
        }
        this.o = Collections.unmodifiableList(arrayList);
        this.X = parcel.createByteArray();
        this.Y = parcel.readString();
        this.Z = parcel.createByteArray();
    }
}
