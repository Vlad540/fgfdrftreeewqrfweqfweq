package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.Continuation;

/* renamed from: uk7  reason: default package */
public final class uk7 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wk7 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uk7(wk7 wk7, Continuation continuation) {
        super(2, continuation);
        this.Y = wk7;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((List) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uk7 uk7 = new uk7(this.Y, continuation);
        uk7.X = obj;
        return uk7;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        List<o46> list = (List) this.X;
        wk7 wk7 = this.Y;
        wk7.getClass();
        udd.q("wk7", "albums loaded");
        int S = ju7.S(q23.H(list, 10));
        if (S < 16) {
            S = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(S);
        for (Object next : list) {
            linkedHashMap.put(((o46) next).a.b(), next);
        }
        wk7.g = linkedHashMap;
        wt wtVar = new wt(6);
        tt0 tt0 = wk7.a;
        tt0.c(wtVar);
        for (o46 o46 : list) {
            tt0.c(new xk7(o46.a.b()));
        }
        g37 g37 = ((bv6) wk7.c).C0;
        if (g37 != null && g37.isCompleted()) {
            vqe vqe = new vqe(myc.P(new vqe(new es(2, list), new gw2(25, wk7)), x51.x0), new xz6(5));
            bs bsVar = new bs(0);
            myc.T(vqe, bsVar);
            pwc pwc = wk7.f;
            pwc.getClass();
            udd.q("pwc", "refreshSelectedMedias()");
            CopyOnWriteArraySet copyOnWriteArraySet = pwc.a;
            List s = ek8.s(copyOnWriteArraySet, new sic(4, bsVar));
            udd.q("pwc", "refreshSelectedMedias(), itemsForRemoveCount = " + s.size());
            copyOnWriteArraySet.removeAll(s);
            if (!s.isEmpty()) {
                pwc.n();
            }
        }
        return jue.a;
    }
}
