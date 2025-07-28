package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: z6d  reason: default package */
public final class z6d extends b7d {
    public static final Parcelable.Creator<z6d> CREATOR = new x3b(24);
    public boolean a;
    public final boolean b;

    public z6d(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6d)) {
            return false;
        }
        z6d z6d = (z6d) obj;
        return this.a == z6d.a && this.b == z6d.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        boolean z = this.a;
        return "Switch(isChecked=" + z + ", isEnabled=" + this.b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
