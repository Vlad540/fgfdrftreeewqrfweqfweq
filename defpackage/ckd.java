package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ckd  reason: default package */
public final class ckd implements x29 {
    public static final Parcelable.Creator<ckd> CREATOR = new x3b(27);
    public final List a;

    public ckd(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((akd) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                } else if (((akd) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((akd) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        oyb.d(!z);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ckd.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ckd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
    }
}
