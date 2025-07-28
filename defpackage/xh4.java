package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: xh4  reason: default package */
public final /* synthetic */ class xh4 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai4 b;

    public /* synthetic */ xh4(ai4 ai4, int i) {
        this.a = i;
        this.b = ai4;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new zh4(this.b);
            case 1:
                ai4 ai4 = this.b;
                return ai4.a.n(ai4.f);
            case 2:
                ai4 ai42 = this.b;
                return ai42.a.n(ai42.g);
            default:
                ai4 ai43 = this.b;
                Map map = ai43.h;
                if (map == null) {
                    return iw4.a;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(ju7.S(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ai43.a.n((sh4) entry.getValue()));
                }
                return linkedHashMap;
        }
    }

    public /* synthetic */ xh4(ai4 ai4, zh4 zh4) {
        this.a = 3;
        this.b = ai4;
    }
}
