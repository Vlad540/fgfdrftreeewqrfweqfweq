package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: v05  reason: default package */
public final class v05 implements w29 {
    public static final Parcelable.Creator<v05> CREATOR = new w33(17);
    public static final vu5 Z;
    public static final vu5 w0;
    public final byte[] X;
    public int Y;
    public final String a;
    public final String b;
    public final long c;
    public final long o;

    static {
        tu5 tu5 = new tu5();
        tu5.k = "application/id3";
        Z = tu5.a();
        tu5 tu52 = new tu5();
        tu52.k = "application/x-scte35";
        w0 = tu52.a();
    }

    public v05(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.o = j2;
        this.X = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v05.class != obj.getClass()) {
            return false;
        }
        v05 v05 = (v05) obj;
        return this.c == v05.c && this.o == v05.o && mze.a(this.a, v05.a) && mze.a(this.b, v05.b) && Arrays.equals(this.X, v05.X);
    }

    public final int hashCode() {
        if (this.Y == 0) {
            int i = 0;
            String str = this.a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            long j = this.c;
            long j2 = this.o;
            this.Y = Arrays.hashCode(this.X) + ((((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.Y;
    }

    public final vu5 k() {
        String str = this.a;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c2 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return w0;
            case 1:
            case 2:
                return Z;
            default:
                return null;
        }
    }

    public final byte[] o() {
        if (k() != null) {
            return this.X;
        }
        return null;
    }

    public final String toString() {
        String str = this.a;
        int e = me4.e(79, str);
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(me4.e(e, str2));
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(this.o);
        sb.append(", durationMs=");
        sb.append(this.c);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.o);
        parcel.writeByteArray(this.X);
    }

    public v05(Parcel parcel) {
        String readString = parcel.readString();
        int i = mze.a;
        this.a = readString;
        this.b = parcel.readString();
        this.c = parcel.readLong();
        this.o = parcel.readLong();
        this.X = parcel.createByteArray();
    }
}
