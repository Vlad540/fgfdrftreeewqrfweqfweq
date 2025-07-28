package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ei5  reason: default package */
public final class ei5 implements Parcelable {
    public static final Parcelable.Creator<ei5> CREATOR = new w33(19);
    public final String a;
    public final fx5 b;

    public ei5(String str, fx5 fx5) {
        this.a = str;
        this.b = fx5;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public ei5(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readParcelable(fx5.class.getClassLoader());
    }
}
