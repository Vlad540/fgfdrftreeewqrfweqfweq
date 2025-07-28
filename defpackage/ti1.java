package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: ti1  reason: default package */
public final class ti1 extends l5e implements p26 {
    public /* synthetic */ bka X;
    public /* synthetic */ le1 Y;
    public /* synthetic */ boolean Z;
    public /* synthetic */ b65 w0;
    public /* synthetic */ boolean x0;
    public final /* synthetic */ aj1 y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ti1(aj1 aj1, Continuation continuation) {
        super(6, continuation);
        this.y0 = aj1;
    }

    public final void k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        boolean booleanValue2 = ((Boolean) obj5).booleanValue();
        ti1 ti1 = new ti1(this.y0, (Continuation) obj6);
        ti1.X = (bka) obj;
        ti1.Y = (le1) obj2;
        ti1.Z = booleanValue;
        ti1.w0 = (b65) obj4;
        ti1.x0 = booleanValue2;
        ti1.o(jue.a);
    }

    public final Object o(Object obj) {
        aj1 aj1;
        Object value;
        wx3.H(obj);
        bka bka = this.X;
        le1 le1 = this.Y;
        boolean z = this.Z;
        b65 b65 = this.w0;
        boolean z2 = this.x0;
        Map map = bka.c;
        Map map2 = bka.g;
        Set<le1> v0 = o23.v0(o23.m0(map2.keySet(), new d15(1, map2)));
        ht7 ht7 = new ht7();
        qja qja = bka.a;
        ht7.put(qja.a.getId(), qja);
        qja qja2 = (qja) map.get(le1);
        if (qja2 != null) {
            ne1 ne1 = qja2.a;
            ht7.put(ne1.getId(), qja2);
            v0.remove(ne1.getId());
        }
        for (le1 le12 : v0) {
            qja qja3 = (qja) map.get(le12);
            if (qja3 != null) {
                ht7.put(le12, qja3);
            }
        }
        qja qja4 = (qja) map.get(bka.a());
        if (qja4 != null) {
            qja qja5 = (qja) ht7.put(qja4.a.getId(), qja4);
        }
        for (Map.Entry entry : map.entrySet()) {
            le1 le13 = (le1) entry.getKey();
            qja qja6 = (qja) entry.getValue();
            if (!ht7.containsKey(le13)) {
                ht7.put(le13, qja6);
            }
        }
        Collection values = ht7.b().values();
        int S = ju7.S(q23.H(values, 10));
        if (S < 16) {
            S = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(S);
        Iterator it = ((jt7) values).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            aj1 = this.y0;
            if (!hasNext) {
                break;
            }
            qja qja7 = (qja) it.next();
            linkedHashMap.put(qja7.a.getId(), au7.c(qja7, qja7.a.o(), z, z2, aj1.Y, b65, le1));
        }
        grd grd = aj1.H0;
        do {
            value = grd.getValue();
            Map map3 = (Map) value;
        } while (!grd.b(value, linkedHashMap));
        return jue.a;
    }
}
