package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;

/* renamed from: at5  reason: default package */
public final /* synthetic */ class at5 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ at5(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Set set = (Set) obj;
                sg5 L = myc.L(new es(2, (List) this.b), new gw2(15, (ft5) this.c));
                bt5 bt5 = bt5.a;
                Iterator it = L.iterator();
                if (!it.hasNext()) {
                    return qw4.a;
                }
                Object invoke = bt5.invoke(it.next());
                if (!it.hasNext()) {
                    return Collections.singleton(invoke);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(invoke);
                while (it.hasNext()) {
                    linkedHashSet.add(bt5.invoke(it.next()));
                }
                return linkedHashSet;
            case 1:
                Set set2 = (Set) obj;
                Iterator it2 = ((Set) ((j54) this.b).b).iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    Set set3 = (Set) this.c;
                    if (!hasNext) {
                        return set3;
                    }
                    set3.add(new zta(((Number) it2.next()).longValue(), yta.a));
                }
            default:
                List list = (List) obj;
                List<osd> list2 = (List) this.b;
                ArrayList arrayList = new ArrayList(q23.H(list2, 10));
                for (osd q : list2) {
                    arrayList.add(cwd.q((cwd) this.c, q));
                }
                return arrayList;
        }
    }
}
