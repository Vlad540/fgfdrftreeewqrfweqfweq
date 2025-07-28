package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: poe  reason: default package */
public final class poe implements Parcelable {
    public static final Parcelable.Creator<poe> CREATOR = new xkd(19);
    public static final poe c = new poe(ooe.y0, Collections.emptyList());
    public final ooe a;
    public final List b;

    public poe(ooe ooe, List list) {
        this.a = ooe;
        this.b = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || poe.class != obj.getClass()) {
            return false;
        }
        poe poe = (poe) obj;
        if (!this.a.equals(poe.a)) {
            return false;
        }
        return this.b.equals(poe.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackContainer{videoTrack=" + this.a + ", audioTracks=" + this.b + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeTypedList(this.b);
    }

    public poe(Parcel parcel) {
        this.a = (ooe) parcel.readParcelable(ooe.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        parcel.readTypedList(arrayList, ooe.CREATOR);
    }
}
