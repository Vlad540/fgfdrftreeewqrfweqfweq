package defpackage;

import java.util.Collections;
import java.util.Hashtable;
import org.json.JSONObject;

/* renamed from: vw0  reason: default package */
public final /* synthetic */ class vw0 implements lfd {
    public final /* synthetic */ int a;
    public final /* synthetic */ gx0 b;
    public final /* synthetic */ ge1 c;

    public /* synthetic */ vw0(gx0 gx0, ge1 ge1, int i) {
        this.a = i;
        this.b = gx0;
        this.c = ge1;
    }

    public final void k(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                gx0 gx0 = this.b;
                pe1 pe1 = gx0.t1;
                pe1.getClass();
                ke1 ke1 = (ke1) o23.X(pe1.m((w2d) null, Collections.singletonList(this.c)));
                ox3 ox3 = gx0.n1;
                if (ke1 != null) {
                    ((Hashtable) ox3.d).remove(ke1);
                    return;
                } else {
                    ox3.getClass();
                    return;
                }
            default:
                gx0 gx02 = this.b;
                if (this.c.equals(gx02.M1)) {
                    gx02.M1 = null;
                    gx02.k(g41.M0, (Object) null);
                    return;
                }
                return;
        }
    }
}
