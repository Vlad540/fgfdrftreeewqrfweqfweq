package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: yh4  reason: default package */
public final /* synthetic */ class yh4 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zh4 b;
    public final /* synthetic */ ai4 c;

    public /* synthetic */ yh4(zh4 zh4, ai4 ai4, int i) {
        this.a = i;
        this.b = zh4;
        this.c = ai4;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ai4 ai4 = this.c;
                g0b g0b = ai4.b;
                qe4 c2 = g0b.c(ai4.e);
                og0 d = g0b.d();
                h25 h25 = ai4.c;
                return new ys0((cd5) this.b.a.getValue(), c2, d, h25.f(), h25.d(), ai4.d);
            case 1:
                ai4 ai42 = this.c;
                g0b g0b2 = ai42.b;
                qe4 c3 = g0b2.c(ai42.e);
                og0 d2 = g0b2.d();
                h25 h252 = ai42.c;
                return new ys0((cd5) this.b.c.getValue(), c3, d2, h252.f(), h252.d(), ai42.d);
            default:
                Map map = (Map) this.b.e.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap(ju7.S(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    ai4 ai43 = this.c;
                    g0b g0b3 = ai43.b;
                    qe4 c4 = g0b3.c(ai43.e);
                    og0 d3 = g0b3.d();
                    h25 h253 = ai43.c;
                    linkedHashMap.put(key, new ys0((cd5) entry.getValue(), c4, d3, h253.f(), h253.d(), ai43.d));
                }
                return new HashMap(linkedHashMap);
        }
    }
}
