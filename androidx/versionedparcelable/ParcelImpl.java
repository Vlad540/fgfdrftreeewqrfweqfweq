package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new ch9(19);
    public final i1f a;

    public ParcelImpl(i1f i1f) {
        this.a = i1f;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        new h1f(parcel).l(this.a);
    }

    public ParcelImpl(Parcel parcel) {
        this.a = new h1f(parcel).h();
    }
}
