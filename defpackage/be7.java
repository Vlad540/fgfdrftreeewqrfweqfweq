package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: be7  reason: default package */
public final class be7 implements ne7 {
    public static final Parcelable.Creator<be7> CREATOR = new ze6(19);
    public final Uri a;

    public be7(Uri uri) {
        this.a = uri;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof be7) && hhd.f(this.a, ((be7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenBrowser(uri=" + this.a + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
