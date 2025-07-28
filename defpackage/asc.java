package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: asc  reason: default package */
public final class asc implements csc {
    public final t52 a;
    public final di3 b;
    public final kn3 c;
    public final gsc d;
    public final boolean e;

    public asc(t52 t52, di3 di3, kn3 kn3, gsc gsc, boolean z) {
        this.a = t52;
        this.b = di3;
        this.c = kn3;
        this.d = gsc;
        this.e = z;
    }

    public final List a(String str) {
        List list;
        gsc gsc;
        zb9 zb9 = new zb9((Object) null);
        boolean z = this.e;
        t52 t52 = this.a;
        if (z) {
            yz yzVar = t52.I;
            ArrayList C = t52.C(t52.M, true, (w1b) null);
            Collections.sort(C, yzVar);
            list = Collections.unmodifiableList(C);
        } else {
            list = t52.D(t52.I);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            gsc = this.d;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            if (gsc.f((i22) next, str)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 1) {
            t23.J(arrayList, new gu6(13));
        }
        ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            i22 i22 = (i22) it2.next();
            tf3 k = i22.k();
            if (k != null) {
                zb9.a(k.n());
            }
            arrayList2.add(gsc.a(i22, str));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        List k2 = this.b.k();
        ArrayList arrayList4 = new ArrayList();
        for (Object next2 : k2) {
            tf3 tf3 = (tf3) next2;
            if (!zb9.d(tf3.n()) && gsc.g(tf3, str)) {
                arrayList4.add(next2);
            }
        }
        kn3 kn3 = this.c;
        kn3.getClass();
        t23.J(arrayList4, new i63(2, kn3));
        ArrayList arrayList5 = new ArrayList(q23.H(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(gsc.b((tf3) it3.next(), str));
        }
        arrayList3.addAll(arrayList5);
        return arrayList3;
    }
}
