package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: zkd  reason: default package */
public final class zkd implements x29 {
    public static final Parcelable.Creator<zkd> CREATOR = new xkd(1);
    public final float a;
    public final int b;

    public zkd(int i, float f) {
        this.a = f;
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zkd.class != obj.getClass()) {
            return false;
        }
        zkd zkd = (zkd) obj;
        return this.a == zkd.a && this.b == zkd.b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeInt(this.b);
    }

    public zkd(Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readInt();
    }
}
