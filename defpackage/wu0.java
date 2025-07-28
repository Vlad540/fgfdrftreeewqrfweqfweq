package defpackage;

import org.json.JSONObject;

/* renamed from: wu0  reason: default package */
public final class wu0 implements lfd {
    public final /* synthetic */ mfd a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ mfd c;

    public wu0(mfd mfd, pzb pzb) {
        this.c = mfd;
        this.b = pzb;
        this.a = mfd;
    }

    public final void k(JSONObject jSONObject) {
        this.c.c.removeCallbacks(this.b);
        this.a.g();
    }
}
