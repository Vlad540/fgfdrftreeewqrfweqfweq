package defpackage;

import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Looper;
import android.telephony.TelephonyManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: d59  reason: default package */
public abstract class d59 {
    public static final boolean a = (Build.MANUFACTURER + " " + Build.MODEL + " " + Build.DEVICE).equalsIgnoreCase(new String[]{"HUAWEI CHM-U01 hwCHM-H"}[0]);

    public static Point a(int i, int i2) {
        if (i <= 1280 && i2 <= 720) {
            return new Point(i, i2);
        }
        int max = Math.max(i, i2);
        if (max > 1280) {
            float f = 1280.0f / ((float) max);
            i = Math.round(((float) i) * f);
            i2 = Math.round(((float) i2) * f);
        }
        return new Point(i, i2);
    }

    public static String b(ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        String str = "unknown";
        if (connectivityManager == null) {
            return str;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            str = activeNetworkInfo.getType() == 0 ? activeNetworkInfo.getSubtypeName() : activeNetworkInfo.getTypeName();
        }
        if (telephonyManager == null) {
            return str;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.getType() == 1) {
            return str;
        }
        StringBuilder n = me4.n(str, ".");
        n.append(telephonyManager.getNetworkOperatorName());
        return n.toString();
    }

    public static String c(Object obj) {
        if (obj == null) {
            return "Ø";
        }
        return obj.getClass().getSimpleName() + '@' + System.identityHashCode(obj);
    }

    public static void d(axb axb, String str, String str2) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("param", str + "_" + str2);
        axb.log(axb.COLLECTOR_WEBRTC, "callSpecError", (Map) hashMap);
    }

    public static void e() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Main (UI) thread expected");
        }
    }
}
