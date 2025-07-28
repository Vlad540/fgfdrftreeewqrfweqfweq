package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;

/* renamed from: trc  reason: default package */
public final class trc implements Parcelable {
    public static final Parcelable.Creator<trc> CREATOR = new x3b(18);
    public final ForegroundColorSpan a;
    public final BackgroundColorSpan b;

    public trc(ForegroundColorSpan foregroundColorSpan, BackgroundColorSpan backgroundColorSpan) {
        this.a = foregroundColorSpan;
        this.b = backgroundColorSpan;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
