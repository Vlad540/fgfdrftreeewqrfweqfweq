package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ydf  reason: default package */
public class ydf implements x29 {
    public static final Parcelable.Creator<ydf> CREATOR = new udf(0);
    public final String a;
    public final String b;

    public ydf(String str, String str2) {
        this.a = fja.C(str);
        this.b = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ydf ydf = (ydf) obj;
        return this.a.equals(ydf.a) && this.b.equals(ydf.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + me4.d(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }

    public final void w(x78 x78) {
        String str = this.a;
        str.getClass();
        String str2 = this.b;
        char c = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                x78.c = str2;
                return;
            case 1:
                x78.a = str2;
                return;
            case 2:
                x78.g = str2;
                return;
            case 3:
                x78.d = str2;
                return;
            case 4:
                x78.b = str2;
                return;
            default:
                return;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public ydf(Parcel parcel) {
        String readString = parcel.readString();
        int i = oze.a;
        this.a = readString;
        this.b = parcel.readString();
    }
}
