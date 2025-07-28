package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class LatLngBounds extends o3 implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new o1g(13);
    public final LatLng a;
    public final LatLng b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        a24.p(latLng, "southwest must not be null.");
        a24.p(latLng2, "northeast must not be null.");
        double d = latLng.a;
        Double valueOf = Double.valueOf(d);
        double d2 = latLng2.a;
        a24.i(d2 >= d, "southern latitude exceeds northern latitude (%s > %s)", valueOf, Double.valueOf(d2));
        this.a = latLng;
        this.b = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.a.equals(latLngBounds.a) && this.b.equals(latLngBounds.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        mn mnVar = new mn((Object) this);
        mnVar.r(this.a, "southwest");
        mnVar.r(this.b, "northeast");
        return mnVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.j0(parcel, 2, this.a, i);
        ek8.j0(parcel, 3, this.b, i);
        ek8.o0(parcel, n0);
    }
}
