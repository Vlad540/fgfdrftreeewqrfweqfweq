package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class CameraPosition extends o3 implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new udf(12);
    public final LatLng a;
    public final float b;
    public final float c;
    public final float o;

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        a24.p(latLng, "camera target must not be null.");
        boolean z = false;
        if (f2 >= 0.0f && f2 <= 90.0f) {
            z = true;
        }
        a24.i(z, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.a = latLng;
        this.b = f;
        this.c = f2 + 0.0f;
        this.o = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.a.equals(cameraPosition.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(cameraPosition.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(cameraPosition.c) && Float.floatToIntBits(this.o) == Float.floatToIntBits(cameraPosition.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.o)});
    }

    public final String toString() {
        mn mnVar = new mn((Object) this);
        mnVar.r(this.a, "target");
        mnVar.r(Float.valueOf(this.b), "zoom");
        mnVar.r(Float.valueOf(this.c), "tilt");
        mnVar.r(Float.valueOf(this.o), "bearing");
        return mnVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.j0(parcel, 2, this.a, i);
        ek8.p0(parcel, 3, 4);
        parcel.writeFloat(this.b);
        ek8.p0(parcel, 4, 4);
        parcel.writeFloat(this.c);
        ek8.p0(parcel, 5, 4);
        parcel.writeFloat(this.o);
        ek8.o0(parcel, n0);
    }
}
