package defpackage;

import org.json.JSONObject;

/* renamed from: sw0  reason: default package */
public final /* synthetic */ class sw0 implements lfd {
    public final /* synthetic */ gx0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ge1 c;
    public final /* synthetic */ w2d o;

    public /* synthetic */ sw0(gx0 gx0, boolean z, ge1 ge1, w2d w2d) {
        this.a = gx0;
        this.b = z;
        this.c = ge1;
        this.o = w2d;
    }

    public final void k(JSONObject jSONObject) {
        gx0 gx0 = this.a;
        gx0.getClass();
        if (jSONObject.optString("error").isEmpty()) {
            boolean z = this.b;
            ge1 ge1 = this.c;
            ge1 ge12 = z ? ge1 : null;
            w2d w2d = this.o;
            if (w2d instanceof v2d) {
                gx0.c2.b(!z, ge1, (v2d) w2d);
            } else {
                gx0.M1 = ge12;
            }
            gx0.k(g41.N0, ge12);
        }
    }
}
