package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: sze  reason: default package */
public final class sze {
    public final lh6 a;
    public final md4 b;

    public sze(lh6 lh6, md4 md4) {
        this.a = lh6;
        this.b = md4;
    }

    public final List a(List list, u16 u16, u16 u162, u16 u163, qf3 qf3, u16 u164) {
        lh6 lh6 = this.a;
        if (!lh6.e()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : list) {
            boolean n = lh6.n(((Number) u16.invoke(next)).longValue());
            if (!n && u163 != null && this.b.a() && u163.invoke(next) != ls8.DELAYED_FIRE_ERROR) {
                arrayList.add(u162.invoke(next));
            }
            if (u164 != null) {
                u164.invoke(next);
            }
            if (n) {
                arrayList2.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            udd.q("sze", "items for delete not empty, count = " + size);
            qf3.accept(arrayList);
        }
        return arrayList2;
    }
}
