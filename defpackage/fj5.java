package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fj5  reason: default package */
public final class fj5 implements Parcelable {
    public static final Parcelable.Creator<fj5> CREATOR = new w33(21);
    public int a;
    public int b;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
        sb.append(this.a);
        sb.append(", mAnchorOffset=");
        return hr1.h(sb, this.b, '}');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
