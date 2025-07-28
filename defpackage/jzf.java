package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.fragment.app.a;

/* renamed from: jzf  reason: default package */
public final class jzf implements h0g {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ yha b;

    public jzf(yha yha, Bundle bundle) {
        this.b = yha;
        this.a = bundle;
    }

    public final int a() {
        return 1;
    }

    public final void b() {
        v2b v2b = (v2b) this.b.a;
        Bundle bundle = this.a;
        v2b.getClass();
        try {
            Bundle bundle2 = new Bundle();
            h2g.I(bundle, bundle2);
            Bundle bundle3 = ((a) v2b.b).Z;
            if (bundle3 != null && bundle3.containsKey("MapOptions")) {
                h2g.J(bundle2, "MapOptions", bundle3.getParcelable("MapOptions"));
            }
            s4g s4g = (s4g) v2b.c;
            Parcel G0 = s4g.G0();
            u1g.b(G0, bundle2);
            s4g.H0(G0, 3);
            h2g.I(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
