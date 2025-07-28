package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;

/* renamed from: abc  reason: default package */
public final class abc extends ConnectivityManager.NetworkCallback {
    public boolean a;
    public boolean b;
    public final /* synthetic */ ga0 c;

    public abc(ga0 ga0) {
        this.c = ga0;
    }

    public final void onAvailable(Network network) {
        ((Handler) this.c.e).post(new zac(this, 0));
    }

    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (!z) {
            ((Handler) this.c.e).post(new zac(this, 1));
        }
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean hasCapability = networkCapabilities.hasCapability(16);
        boolean z = this.a;
        ga0 ga0 = this.c;
        if (!z || this.b != hasCapability) {
            this.a = true;
            this.b = hasCapability;
            ((Handler) ga0.e).post(new zac(this, 0));
        } else if (hasCapability) {
            ((Handler) ga0.e).post(new zac(this, 1));
        }
    }

    public final void onLost(Network network) {
        ((Handler) this.c.e).post(new zac(this, 0));
    }
}
