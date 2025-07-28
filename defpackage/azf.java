package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;

/* renamed from: azf  reason: default package */
public final class azf implements h0g {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ yha d;

    public azf(yha yha, Activity activity, Bundle bundle, Bundle bundle2) {
        this.d = yha;
        this.a = activity;
        this.b = bundle;
        this.c = bundle2;
    }

    public final int a() {
        return 0;
    }

    public final void b() {
        v2b v2b = (v2b) this.d.a;
        Activity activity = this.a;
        Bundle bundle = this.c;
        v2b.getClass();
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) this.b.getParcelable("MapOptions");
        try {
            Bundle bundle2 = new Bundle();
            h2g.I(bundle, bundle2);
            s4g s4g = (s4g) v2b.c;
            ks9 ks9 = new ks9(activity);
            Parcel G0 = s4g.G0();
            u1g.c(G0, ks9);
            u1g.b(G0, googleMapOptions);
            u1g.b(G0, bundle2);
            s4g.H0(G0, 2);
            h2g.I(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
