package defpackage;

import java.util.Map;
import java.util.Set;

/* renamed from: mv2  reason: default package */
public final /* synthetic */ class mv2 implements u16 {
    public final /* synthetic */ Set X;
    public final /* synthetic */ Set Y;
    public final /* synthetic */ aw2 a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ Map o;

    public /* synthetic */ mv2(aw2 aw2, Set set, Set set2, Map map, Set set3, Set set4) {
        this.a = aw2;
        this.b = set;
        this.c = set2;
        this.o = map;
        this.X = set3;
        this.Y = set4;
    }

    public final Object invoke(Object obj) {
        boolean z;
        i22 i22 = (i22) obj;
        o62 o62 = i22.b;
        boolean contains = this.b.contains(Long.valueOf(o62.a));
        aw2 aw2 = this.a;
        Map map = this.o;
        if (contains || ((eq2) aw2.o.getValue()).a(this.c, map, i22)) {
            if (!this.X.contains(Long.valueOf(o62.a)) && !((eq2) aw2.o.getValue()).a(this.Y, map, i22)) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
