package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: u2g  reason: default package */
public final class u2g extends bzf implements m6g {
    public static final /* synthetic */ int e = 0;
    public final ud d;

    public u2g(ud udVar) {
        super("com.google.android.gms.location.ILocationCallback", 5);
        this.d = udVar;
    }

    public final boolean I0(Parcel parcel, int i) {
        ud udVar = this.d;
        if (i == 1) {
            t1g.c(parcel);
            udVar.x().b(new vle((LocationResult) t1g.a(parcel, LocationResult.CREATOR)));
        } else if (i == 2) {
            t1g.c(parcel);
            udVar.x().b(new ygd((LocationAvailability) t1g.a(parcel, LocationAvailability.CREATOR)));
        } else if (i != 3) {
            return false;
        } else {
            u();
        }
        return true;
    }

    public final void u() {
        this.d.x().b(new lyf(this));
    }
}
