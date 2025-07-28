package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: sba  reason: default package */
public final class sba extends tba {
    public static final Parcelable.Creator<sba> CREATOR = new ch9(9);
    public static final sba b = new tba(MultiFileUploader.UPLOAD_NEXT_INTERVAL);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sba);
    }

    public final int hashCode() {
        return -950206676;
    }

    public final String toString() {
        return "Timer";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
