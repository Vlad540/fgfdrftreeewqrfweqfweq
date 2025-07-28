package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: y29  reason: default package */
public final class y29 implements Parcelable {
    public static final Parcelable.Creator<y29> CREATOR = new vf7(20);
    public final w29[] a;

    public y29(w29... w29Arr) {
        this.a = w29Arr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y29.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((y29) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.a));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        w29[] w29Arr = this.a;
        parcel.writeInt(w29Arr.length);
        for (w29 writeParcelable : w29Arr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public y29(List list) {
        this.a = (w29[]) list.toArray(new w29[0]);
    }

    public y29(Parcel parcel) {
        this.a = new w29[parcel.readInt()];
        int i = 0;
        while (true) {
            w29[] w29Arr = this.a;
            if (i < w29Arr.length) {
                w29Arr[i] = (w29) parcel.readParcelable(w29.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }
}
