package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: wz1  reason: default package */
public final class wz1 extends o3 {
    public static final Parcelable.Creator<wz1> CREATOR = new h6(17);
    public final tk7 a;
    public final Uri b;

    public wz1(tk7 tk7, Uri uri) {
        this.a = tk7;
        this.b = uri;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
