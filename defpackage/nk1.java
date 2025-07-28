package defpackage;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.StatsReport;

/* renamed from: nk1  reason: default package */
public final /* synthetic */ class nk1 implements jsd {
    public final /* synthetic */ stf a;
    public final /* synthetic */ long b;

    public /* synthetic */ nk1(stf stf, long j) {
        this.a = stf;
        this.b = j;
    }

    public final void a(StatsReport[] statsReportArr, StatsReport[] statsReportArr2, xp0[] xp0Arr, Map map, sl1 sl1) {
        stf stf = this.a;
        uwb uwb = new uwb((xwb) stf.o, statsReportArr);
        HashMap hashMap = new HashMap();
        otf otf = (otf) stf.a;
        hashMap.put("vcid", ((axb) otf.a).conversationId);
        String str = (String) uwb.d;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        hashMap.put("local_connection_type", str);
        String str3 = (String) uwb.c;
        if (str3 == null) {
            str3 = str2;
        }
        hashMap.put("remote_connection_type", str3);
        String str4 = (String) uwb.e;
        if (str4 == null) {
            str4 = str2;
        }
        hashMap.put("local_address", str4);
        String str5 = (String) uwb.f;
        if (str5 != null) {
            str2 = str5;
        }
        hashMap.put("remote_address", str2);
        hashMap.put("network_type", d59.b((ConnectivityManager) stf.b, (TelephonyManager) stf.c));
        hashMap.put("stat_time_delta", String.valueOf(this.b));
        ((axb) otf.a).log(axb.COLLECTOR_WEBRTC, "callStatConnect", (Map) hashMap);
    }
}
