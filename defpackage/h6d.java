package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: h6d  reason: default package */
public final class h6d extends l5e implements i26 {
    public final /* synthetic */ k6d X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h6d(k6d k6d, Continuation continuation) {
        super(2, continuation);
        this.X = k6d;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new h6d(this.X, continuation);
    }

    public final Object o(Object obj) {
        grd grd;
        Object value;
        LinkedHashMap linkedHashMap;
        wx3.H(obj);
        k6d k6d = this.X;
        ap3 ap3 = (ap3) k6d.o.getValue();
        ap3.getClass();
        List<tf3> j = ap3.a.j(di3.r, di3.u);
        kn3 kn3 = (kn3) k6d.Y.getValue();
        kn3.getClass();
        Collections.sort(j, new i63(2, kn3));
        do {
            grd = k6d.x0;
            value = grd.getValue();
            Map map = (Map) value;
            int S = ju7.S(q23.H(j, 10));
            if (S < 16) {
                S = 16;
            }
            linkedHashMap = new LinkedHashMap(S);
            for (tf3 tf3 : j) {
                Long l = new Long(tf3.n());
                long n = tf3.n();
                String p = tf3.p(fj0.b);
                String d = tf3.d();
                if (d == null) {
                    d = "";
                }
                linkedHashMap.put(l, new sn0(n, p, d, tf3.m()));
            }
        } while (!grd.b(value, linkedHashMap));
        return jue.a;
    }
}
