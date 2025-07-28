package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ykd  reason: default package */
public final class ykd implements w29 {
    public static final Parcelable.Creator<ykd> CREATOR = new xkd(0);
    public final float a;
    public final int b;

    public ykd(int i, float f) {
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
        if (obj == null || ykd.class != obj.getClass()) {
            return false;
        }
        ykd ykd = (ykd) obj;
        return this.a == ykd.a && this.b == ykd.b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + 527) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(this.a);
        sb.append(", svcTemporalLayerCount=");
        sb.append(this.b);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeInt(this.b);
    }

    public ykd(Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readInt();
    }
}
