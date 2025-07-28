package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: id3  reason: default package */
public final class id3 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ id3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void onAvailable(Network network) {
        switch (this.a) {
            case 0:
                jd3 jd3 = (jd3) this.b;
                udd.q(jd3.l, "onAvailable");
                jd3.n(hd3.a((hd3) jd3.k.get(), true, true, 28));
                return;
            default:
                super.onAvailable(network);
                return;
        }
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 0:
                jd3 jd3 = (jd3) this.b;
                jd3.getClass();
                jd3.h = jd3.j(networkCapabilities);
                jd3 jd32 = (jd3) this.b;
                String str = jd32.l;
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    tn7 tn7 = tn7.X;
                    wd3 wd3 = jd32.h;
                    fn6.d(tn7, str, "onCapabilitiesChanged, current connection is " + wd3 + ", capabilities=" + networkCapabilities, (Throwable) null);
                }
                ((jd3) this.b).o(network, networkCapabilities);
                return;
            default:
                a24 B = a24.B();
                String str2 = wh9.a;
                B.t(str2, "Network capabilities changed: " + networkCapabilities);
                vh9 vh9 = (vh9) this.b;
                vh9.q(wh9.a(vh9.Y));
                return;
        }
    }

    public final void onLost(Network network) {
        switch (this.a) {
            case 0:
                String str = ((jd3) this.b).l;
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    fn6.d(tn7.X, str, "onLost", (Throwable) null);
                }
                jd3 jd3 = (jd3) this.b;
                jd3.n(hd3.a((hd3) jd3.k.get(), false, false, 30));
                return;
            default:
                a24.B().t(wh9.a, "Network connection lost");
                vh9 vh9 = (vh9) this.b;
                vh9.q(wh9.a(vh9.Y));
                return;
        }
    }
}
