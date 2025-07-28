package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: i18  reason: default package */
public final class i18 implements Parcelable {
    public static final Parcelable.Creator<i18> CREATOR = new vf7(9);
    public final int a;
    public final c58 b;

    public i18(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = c58.CREATOR.createFromParcel(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        this.b.writeToParcel(parcel, i);
    }
}
