package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: rw0  reason: default package */
public final /* synthetic */ class rw0 implements lfd {
    public final /* synthetic */ Runnable X;
    public final /* synthetic */ Runnable Y;
    public final /* synthetic */ gx0 a;
    public final /* synthetic */ ge1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ List o;

    public /* synthetic */ rw0(gx0 gx0, ge1 ge1, boolean z, List list, Runnable runnable, Runnable runnable2) {
        this.a = gx0;
        this.b = ge1;
        this.c = z;
        this.o = list;
        this.X = runnable;
        this.Y = runnable2;
    }

    public final void k(JSONObject jSONObject) {
        ke1 ke1;
        gx0 gx0 = this.a;
        gx0.getClass();
        if (jSONObject.optString("error").isEmpty()) {
            pe1 pe1 = gx0.t1;
            pe1.getClass();
            LinkedHashSet<ke1> linkedHashSet = new LinkedHashSet<>();
            ke1 ke12 = pe1.a;
            ge1 ge1 = ke12.a;
            ge1 ge12 = this.b;
            if (ge1 == null || !ge1.equals(ge12)) {
                Set<ge1> set = (Set) pe1.h.get(ge12.a);
                if (set != null) {
                    for (ge1 ge13 : set) {
                        w2d w2d = (w2d) pe1.g.get(ge13);
                        if (!(w2d == null || (ke1 = (ke1) pe1.d(w2d).get(ge13)) == null)) {
                            linkedHashSet.add(ke1);
                        }
                    }
                }
            } else {
                linkedHashSet.add(ke12);
            }
            if (!linkedHashSet.isEmpty()) {
                for (ke1 ke13 : linkedHashSet) {
                    boolean z = this.c;
                    List list = this.o;
                    if (z) {
                        ke13.d.removeAll(list);
                    } else {
                        ke13.d.addAll(list);
                    }
                }
                gx0.k(g41.L0, linkedHashSet);
            }
            Runnable runnable = this.X;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Runnable runnable2 = this.Y;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
