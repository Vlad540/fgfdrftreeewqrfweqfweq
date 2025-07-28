package defpackage;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;

/* renamed from: gd3  reason: default package */
public final /* synthetic */ class gd3 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jd3 b;

    public /* synthetic */ gd3(jd3 jd3, int i) {
        this.a = i;
        this.b = jd3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (ConnectivityManager) this.b.a.getSystemService("connectivity");
            default:
                return (TelephonyManager) this.b.a.getSystemService("phone");
        }
    }
}
