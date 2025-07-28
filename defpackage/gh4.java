package defpackage;

import android.os.Handler;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.PeerConnection;

/* renamed from: gh4  reason: default package */
public final /* synthetic */ class gh4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ih4 b;

    public /* synthetic */ gh4(ih4 ih4, int i) {
        this.a = i;
        this.b = ih4;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ih4 ih4 = this.b;
                for (zla zla : ih4.O0.values()) {
                    ih4.Z(zla, zla.C());
                }
                return;
            default:
                ih4 ih42 = this.b;
                if (ih42.I()) {
                    for (Map.Entry entry : ih42.O0.entrySet()) {
                        ge1 ge1 = (ge1) entry.getKey();
                        if (((zla) entry.getValue()).C() != PeerConnection.IceConnectionState.CONNECTED) {
                            ke1 z = ih42.z(ge1);
                            ih42.b = true;
                            d59.d(ih42.X, "DIRECT_CONNECTION_TIMEOUT", z != null ? z.k : null);
                            rl1 rl1 = ih42.C0;
                            if (rl1 != null) {
                                gx0 gx0 = (gx0) rl1;
                                if (ih42.H(ane.b)) {
                                    gx0.Z0.log("OKRTCCall", "onTopologyUpgradeProposed");
                                    mfd mfd = gx0.Z;
                                    x66 d = x87.d((JSONObject) null, "switch-topology");
                                    JSONObject jSONObject = d.a;
                                    try {
                                        jSONObject.put("topology", (Object) "SERVER");
                                        jSONObject.put("force", false);
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                    mfd.i(d);
                                    Handler handler = gx0.w0;
                                    lde lde = gx0.N0;
                                    handler.removeCallbacks(lde);
                                    gx0.y0.b.getClass();
                                    handler.postDelayed(lde, (long) 30000);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
