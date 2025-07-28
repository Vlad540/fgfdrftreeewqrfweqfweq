package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: k34  reason: default package */
public final class k34 implements Parcelable {
    public static final Parcelable.Creator<k34> CREATOR = new w33(9);
    public final Uri a;

    public /* synthetic */ k34(Uri uri) {
        this.a = uri;
    }

    public static final String a(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            path = BuildConfig.FLAVOR;
        }
        return h0e.k0(path, "/");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k34)) {
            return false;
        }
        return hhd.f(this.a, ((k34) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
