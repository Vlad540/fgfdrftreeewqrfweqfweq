package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: zie  reason: default package */
public final class zie implements Parcelable {
    public static final Parcelable.Creator<zie> CREATOR = new xkd(16);
    public final int a;
    public final String b;

    public zie(int i) {
        this.a = i;
        this.b = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zie) && this.a == ((zie) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
