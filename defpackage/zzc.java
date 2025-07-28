package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: zzc  reason: default package */
public final class zzc {
    public final /* synthetic */ int a;
    public final Map b;

    public zzc() {
        this.a = 1;
        this.b = new LinkedHashMap();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                JSONObject jSONObject = new JSONObject((Map<?, ?>) this.b);
                return "ServerSettings(" + jSONObject + ")";
            default:
                return super.toString();
        }
    }

    public zzc(Map map) {
        this.a = 0;
        this.b = map;
        boolean z = map.get("chats-list-promo-link-enabled") instanceof Boolean;
    }
}
