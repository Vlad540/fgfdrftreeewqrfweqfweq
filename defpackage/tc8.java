package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* renamed from: tc8  reason: default package */
public final class tc8 implements Parcelable {
    public static final Parcelable.Creator<tc8> CREATOR = new vf7(13);
    public ResultReceiver a;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
    }
}
