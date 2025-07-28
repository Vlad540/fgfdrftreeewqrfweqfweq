package defpackage;

import org.json.JSONObject;

/* renamed from: qfd  reason: default package */
public final class qfd implements pfd {
    public final kp0 a;

    public qfd(kp0 kp0) {
        this.a = kp0;
    }

    public final JSONObject a() {
        JSONObject put = new JSONObject().put("command", (Object) "update-media-modifiers");
        kp0 kp0 = this.a;
        kp0.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("denoise", kp0.a);
            jSONObject.put("denoiseAnn", kp0.b);
        } catch (Exception unused) {
        }
        return put.put("mediaModifiers", (Object) jSONObject);
    }
}
