package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.function.BiConsumer;

/* renamed from: n52  reason: default package */
public final /* synthetic */ class n52 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n52(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public final void accept(Object obj, Object obj2) {
        Long l = (Long) obj;
        switch (this.a) {
            case 0:
                i22 i22 = (i22) obj2;
                if (((zb9) this.c).d(l.longValue())) {
                    ((ArrayList) this.b).add(i22);
                    return;
                }
                return;
            case 1:
                i22 i222 = (i22) obj2;
                if (((Collection) this.c).contains(l)) {
                    ((ArrayList) this.b).add(i222);
                    return;
                }
                return;
            default:
                tf3 tf3 = (tf3) obj2;
                if (((Collection) this.c).contains(l)) {
                    ((Map) this.b).put(l, tf3);
                    return;
                }
                return;
        }
    }
}
