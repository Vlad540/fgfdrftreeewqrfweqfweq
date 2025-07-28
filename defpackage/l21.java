package defpackage;

import org.json.JSONObject;

/* renamed from: l21  reason: default package */
public final class l21 {
    public final kp1 a;
    public final t97 b;
    public final t97 c;

    public l21(kp1 kp1, t97 t97, t97 t972) {
        this.a = kp1;
        this.b = t97;
        this.c = t972;
    }

    public final k21 a(vk1 vk1, gpd gpd, to1 to1, f fVar) {
        long c2 = c();
        JSONObject jSONObject = new JSONObject();
        gpd gpd2 = gpd;
        jSONObject.put("is_video", gpd2.b);
        vk1 vk12 = vk1;
        return new k21(kp1.a(this.a).call(new i21(vk1, jSONObject, c2, gpd2, this, to1, fVar)), vk1, true, false);
    }

    public final k21 b(tk1 tk1, gpd gpd, to1 to1, f fVar) {
        long c2 = c();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("chat_id", tk1.c);
        gpd gpd2 = gpd;
        jSONObject.put("is_video", gpd2.b);
        return new k21(kp1.a(this.a).createConfRoom(new h21(jSONObject, c2, gpd2, this, to1, fVar, 0)), tk1, true, false);
    }

    public final long c() {
        return ((f03) ((km1) this.c.getValue()).a.getValue()).s();
    }

    public final k21 d(String str, boolean z, gpd gpd, to1 to1, f fVar) {
        String str2 = str;
        return new k21(kp1.a(this.a).joinByLink(new h21(str, c(), gpd, this, to1, fVar, 1)), new uk1(str, z), !z, false);
    }
}
