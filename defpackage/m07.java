package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: m07  reason: default package */
public final class m07 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;

    public m07(t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
    }

    public final void a(Collection collection) {
        Collection collection2 = collection;
        if (!collection.isEmpty()) {
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, "m07", wn6.h(collection.size(), "invalidateChatsInternal, contactsIds.size() = "), (Throwable) null);
            }
            List<i22> D = ((t52) this.a.getValue()).D(t52.I);
            n1b n1b = (n1b) this.c.getValue();
            t52 t52 = (t52) this.a.getValue();
            n1b.getClass();
            bs bsVar = new bs(collection2);
            udd.p("n1b", "invalidatePreprocessedDataByContacts, contactIds = %d", new Object[]{Integer.valueOf(bsVar.c)});
            ArrayList arrayList = new ArrayList();
            bs bsVar2 = new bs(0);
            for (Map.Entry value : n1b.c.entrySet()) {
                o1b o1b = (o1b) value.getValue();
                boolean contains = bsVar.contains(Long.valueOf(o1b.d.Y));
                vo8 vo8 = o1b.d;
                if (contains) {
                    arrayList.add(vo8);
                    bsVar2.add(Long.valueOf(vo8.b));
                }
                vo8 vo82 = vo8.G0;
                if (vo82 != null && bsVar.contains(Long.valueOf(vo82.Y))) {
                    arrayList.add(vo8);
                    bsVar2.add(Long.valueOf(vo8.b));
                }
                t00 f = vo8.f();
                if (f != null) {
                    if (!bsVar.contains(Long.valueOf(f.b))) {
                        Iterator it = f.c.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (bsVar.contains((Long) it.next())) {
                                    arrayList.add(vo8);
                                    bsVar2.add(Long.valueOf(vo8.b));
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } else {
                        arrayList.add(vo8);
                        bsVar2.add(Long.valueOf(vo8.b));
                    }
                }
            }
            udd.p("n1b", "invalidated messages count = %d", new Object[]{Integer.valueOf(arrayList.size())});
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                vo8 vo83 = (vo8) it2.next();
                i22 B = t52.B(vo83.x0);
                if (B == null) {
                    udd.U("n1b", "don't create and put preprocessed data, because chat is null");
                } else {
                    n1b.b(B, vo83);
                    long j = vo83.x0;
                    long j2 = vo83.b;
                    ove ove = r11;
                    ove ove2 = new ove(j, j2, 0);
                    n1b = n1b;
                    n1b.a.c(ove);
                }
            }
            Set unmodifiableSet = Collections.unmodifiableSet(bsVar2);
            zb9 zb9 = new zb9((Object) null);
            for (i22 i22 : D) {
                ArrayList i = i22.i();
                bs bsVar3 = new bs(0);
                Iterator it3 = i.iterator();
                while (it3.hasNext()) {
                    bsVar3.add(Long.valueOf(((tf3) it3.next()).n()));
                }
                if (!Collections.disjoint(collection2, bsVar3)) {
                    zb9.a(i22.b.a);
                    i22.l0((di3) this.b.getValue());
                }
                xm8 xm8 = i22.c;
                if (xm8 != null && unmodifiableSet.contains(Long.valueOf(xm8.a.b))) {
                    ((t52) this.a.getValue()).k0(i22.a, i22.c.a, true);
                    zb9.a(i22.b.a);
                }
            }
            if (zb9.j()) {
                ((p7a) this.d.getValue()).g(zb9);
            }
        }
    }
}
