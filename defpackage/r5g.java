package defpackage;

import android.os.Parcel;

/* renamed from: r5g  reason: default package */
public abstract class r5g extends bzf implements x5g {
    public r5g() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 5);
    }

    public final boolean I0(Parcel parcel, int i) {
        if (i == 1) {
            t1g.c(parcel);
            h((y4g) t1g.a(parcel, y4g.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            b0();
        }
        return true;
    }
}
