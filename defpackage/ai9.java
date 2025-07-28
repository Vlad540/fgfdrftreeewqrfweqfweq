package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* renamed from: ai9  reason: default package */
public final class ai9 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final di9 a;

    public ai9(di9 di9) {
        this.a = di9;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int b = telephonyDisplayInfo.getOverrideNetworkType();
        int i = 5;
        boolean z = b == 3 || b == 4 || b == 5;
        di9 di9 = this.a;
        if (z) {
            i = 10;
        }
        di9.g(i, di9);
    }
}
