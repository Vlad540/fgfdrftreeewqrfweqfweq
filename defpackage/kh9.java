package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: kh9  reason: default package */
public abstract class kh9 {
    public static final Network a(ConnectivityManager connectivityManager) {
        return connectivityManager.getActiveNetwork();
    }
}
