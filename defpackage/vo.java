package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: vo  reason: default package */
public final class vo implements w29 {
    public static final Parcelable.Creator<vo> CREATOR = new h6(6);
    public final int a;
    public final String b;

    public vo(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = this.b;
        StringBuilder sb = new StringBuilder(me4.e(33, str));
        sb.append("Ait(controlCode=");
        sb.append(this.a);
        sb.append(",url=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.a);
    }
}
