package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bkd  reason: default package */
public final class bkd implements w29 {
    public static final Parcelable.Creator<bkd> CREATOR = new x3b(26);
    public final List a;

    public bkd(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((zjd) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                } else if (((zjd) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((zjd) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        swb.e(!z);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bkd.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((bkd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 21);
        sb.append("SlowMotion: segments=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
    }
}
