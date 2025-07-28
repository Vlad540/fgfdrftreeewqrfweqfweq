package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* renamed from: wh9  reason: default package */
public abstract class wh9 {
    public static final String a = a24.e0("NetworkStateTracker");

    public static final uh9 a(ConnectivityManager connectivityManager) {
        boolean z;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z2 = true;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities a2 = jh9.a(connectivityManager, kh9.a(connectivityManager));
            if (a2 != null) {
                z = jh9.b(a2, 16);
                boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
                    z2 = false;
                }
                return new uh9(z3, z, isActiveNetworkMetered, z2);
            }
        } catch (SecurityException e) {
            a24.B().y(a, "Unable to validate active network", e);
        }
        z = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        z2 = false;
        return new uh9(z3, z, isActiveNetworkMetered2, z2);
    }
}
