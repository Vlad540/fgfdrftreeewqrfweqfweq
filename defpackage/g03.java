package defpackage;

import java.util.Map;
import java.util.function.BiConsumer;

/* renamed from: g03  reason: default package */
public final /* synthetic */ class g03 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;

    public /* synthetic */ g03(int i, Map map) {
        this.a = i;
        this.b = map;
    }

    public final void accept(Object obj, Object obj2) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                if (str.startsWith("app.pin") && (obj2 instanceof String)) {
                    this.b.put(str, (String) obj2);
                    return;
                }
                return;
            default:
                lm3 lm3 = (lm3) obj2;
                lm3.getClass();
                ht7 ht7 = new ht7();
                ht7.put("firstName", lm3.a);
                String str2 = lm3.b;
                if (!(str2 == null || str2.length() == 0)) {
                    ht7.put("lastName", str2);
                }
                this.b.put(str, ht7.b());
                return;
        }
    }
}
