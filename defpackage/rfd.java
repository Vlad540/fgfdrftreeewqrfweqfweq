package defpackage;

import org.json.JSONObject;

/* renamed from: rfd  reason: default package */
public final class rfd implements pfd {
    public final yfd a;
    public final boolean b;
    public final boolean c;

    public rfd(yfd yfd, boolean z, boolean z2) {
        this.a = yfd;
        this.b = z;
        this.c = z2;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", (Object) "change-media-settings");
        jSONObject.put("mediaSettings", (Object) x87.s(this.a, this.b, this.c));
        return jSONObject;
    }
}
