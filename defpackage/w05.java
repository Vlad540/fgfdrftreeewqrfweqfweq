package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: w05  reason: default package */
public final class w05 implements x29 {
    public static final Parcelable.Creator<w05> CREATOR = new w33(18);
    public static final xu5 Z;
    public static final xu5 w0;
    public final byte[] X;
    public int Y;
    public final String a;
    public final String b;
    public final long c;
    public final long o;

    static {
        uu5 uu5 = new uu5();
        uu5.m = c49.l("application/id3");
        Z = uu5.a();
        uu5 uu52 = new uu5();
        uu52.m = c49.l("application/x-scte35");
        w0 = uu52.a();
    }

    public w05(String str, String str2, long j, long j2, byte[] bArr) {
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
        if (obj == null || w05.class != obj.getClass()) {
            return false;
        }
        w05 w05 = (w05) obj;
        return this.c == w05.c && this.o == w05.o && oze.a(this.a, w05.a) && oze.a(this.b, w05.b) && Arrays.equals(this.X, w05.X);
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

    public final xu5 k() {
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
        return "EMSG: scheme=" + this.a + ", id=" + this.o + ", durationMs=" + this.c + ", value=" + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.o);
        parcel.writeByteArray(this.X);
    }

    public w05(Parcel parcel) {
        String readString = parcel.readString();
        int i = oze.a;
        this.a = readString;
        this.b = parcel.readString();
        this.c = parcel.readLong();
        this.o = parcel.readLong();
        this.X = parcel.createByteArray();
    }
}
