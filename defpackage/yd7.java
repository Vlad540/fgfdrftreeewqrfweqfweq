package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: yd7  reason: default package */
public final class yd7 implements ne7, le7 {
    public static final Parcelable.Creator<yd7> CREATOR = new ze6(16);
    public final Uri a;
    public final String b;

    public yd7(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final String m() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new k34(this.a), i);
        parcel.writeString(this.b);
    }
}
