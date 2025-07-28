package defpackage;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: r2g  reason: default package */
public final class r2g extends bzf {
    public final /* synthetic */ int d;
    public final /* synthetic */ vde e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r2g(int i, vde vde) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks", 5);
        this.d = i;
        switch (i) {
            case 1:
                this.e = vde;
                super("com.google.android.gms.location.internal.ILocationStatusCallback", 5);
                return;
            default:
                this.e = vde;
                return;
        }
    }

    public final boolean I0(Parcel parcel, int i) {
        switch (this.d) {
            case 0:
                if (i != 1) {
                    return false;
                }
                t1g.c(parcel);
                ete.Y(((qm7) t1g.a(parcel, qm7.CREATOR)).a, new Object(), this.e);
                return true;
            default:
                if (i != 1) {
                    return false;
                }
                t1g.c(parcel);
                ete.Y((Status) t1g.a(parcel, Status.CREATOR), (Location) t1g.a(parcel, Location.CREATOR), this.e);
                return true;
        }
    }
}
