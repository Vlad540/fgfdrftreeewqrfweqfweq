package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: wdf  reason: default package */
public class wdf implements w29 {
    public static final Parcelable.Creator<wdf> CREATOR = new xkd(28);
    public final String a;
    public final String b;

    public wdf(String str, String str2) {
        this.a = str;
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
        wdf wdf = (wdf) obj;
        return this.a.equals(wdf.a) && this.b.equals(wdf.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + me4.d(527, 31, this.a);
    }

    public final void p(w78 w78) {
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
                w78.c = str2;
                return;
            case 1:
                w78.a = str2;
                return;
            case 2:
                w78.g = str2;
                return;
            case 3:
                w78.d = str2;
                return;
            case 4:
                w78.b = str2;
                return;
            default:
                return;
        }
    }

    public final String toString() {
        String str = this.a;
        int e = me4.e(5, str);
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(me4.e(e, str2));
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public wdf(Parcel parcel) {
        String readString = parcel.readString();
        int i = mze.a;
        this.a = readString;
        this.b = parcel.readString();
    }
}
