package defpackage;

import android.net.ConnectivityManager;

/* renamed from: lh9  reason: default package */
public abstract class lh9 {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
