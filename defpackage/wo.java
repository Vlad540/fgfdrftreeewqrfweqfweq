package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: wo  reason: default package */
public final class wo implements x29 {
    public static final Parcelable.Creator<wo> CREATOR = new h6(7);
    public final int a;
    public final String b;

    public wo(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.a);
        sb.append(",url=");
        return wn6.l(sb, this.b, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.a);
    }
}
