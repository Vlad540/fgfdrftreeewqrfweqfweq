package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: u79  reason: default package */
public final class u79 implements x29 {
    public static final Parcelable.Creator<u79> CREATOR = new vf7(27);
    public final float a;
    public final float b;

    public u79(float f, float f2) {
        oyb.c("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.a = f;
        this.b = f2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u79.class != obj.getClass()) {
            return false;
        }
        u79 u79 = (u79) obj;
        return this.a == u79.a && this.b == u79.b;
    }

    public final int hashCode() {
        return Float.valueOf(this.b).hashCode() + ((Float.valueOf(this.a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
    }

    public u79(Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
    }
}
