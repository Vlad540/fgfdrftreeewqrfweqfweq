package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: bi9  reason: default package */
public final class bi9 extends PhoneStateListener {
    public final /* synthetic */ ci9 a;

    public bi9(ci9 ci9) {
        this.a = ci9;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int b = telephonyDisplayInfo.getOverrideNetworkType();
        ci9.b(this.a, b == 3 || b == 4 ? 10 : 5);
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        String serviceState2 = serviceState == null ? BuildConfig.FLAVOR : serviceState.toString();
        ci9.b(this.a, serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
    }
}
