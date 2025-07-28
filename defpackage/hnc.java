package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import scout.exception.ElementCreationFailedException;
import scout.exception.MissingObjectFactoryException;
import scout.exception.ObjectCreationFailedException;
import scout.exception.ObjectNullabilityException;

/* renamed from: hnc  reason: default package */
public final class hnc {
    public final String a;
    public final List b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final Set f;
    public final w4 g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final int l;

    public hnc(String str, List list, Map map, Map map2, Map map3, Set set) {
        List list2;
        this.a = str;
        this.b = list;
        this.c = map;
        this.d = map2;
        this.e = map3;
        this.f = set;
        this.g = swb.i ? new eh4(this, 0) : new eh4(this, 1);
        boolean isEmpty = list.isEmpty();
        List list3 = hw4.a;
        if (isEmpty) {
            list2 = list3;
        } else {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (int A = p23.A(list); A >= 0; A--) {
                hnc hnc = (hnc) list.get(A);
                if (hashSet.add(hnc)) {
                    arrayList.add(hnc);
                }
                for (hnc hnc2 : hnc.h) {
                    if (hashSet.add(hnc2)) {
                        arrayList.add(hnc2);
                    }
                }
            }
            list2 = Collections.unmodifiableList(arrayList);
        }
        this.h = list2;
        List<hnc> list4 = this.b;
        if (!list4.isEmpty()) {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (hnc hnc3 : list4) {
                for (hnc hnc4 : hnc3.i) {
                    if (hashSet2.add(hnc4)) {
                        arrayList2.add(hnc4);
                    }
                }
                if (hashSet2.add(hnc3)) {
                    arrayList2.add(hnc3);
                }
            }
            list3 = Collections.unmodifiableList(arrayList2);
        }
        this.i = list3;
        List list5 = this.h;
        this.j = list5;
        this.k = list3;
        this.l = list5.size();
    }

    public static final void b(StringBuilder sb, hnc hnc, int i2) {
        sb.append(10);
        int i3 = i2 + 1;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append("   ");
        }
        sb.append("⌞ " + hnc + " (object factories: " + hnc.c.size() + ", collection factories: " + hnc.d.size() + ", association factories: " + hnc.e.size() + ", allowed object overrides: " + hnc.f.size() + ')');
        for (hnc b2 : hnc.j) {
            b(sb, b2, i3);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTree of scopes:");
        b(sb, this, 0);
        return sb.toString();
    }

    public final ArrayList c(Class cls) {
        List list;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.l;
            list = hw4.a;
            if (i3 >= i4) {
                break;
            }
            hnc hnc = (hnc) this.k.get(i3);
            List list2 = (List) hnc.d.get(cls);
            if (list2 != null) {
                list = list2;
            }
            int size = list.size();
            int i5 = 0;
            while (i5 < size) {
                try {
                    arrayList.add(((wy6) list.get(i5)).a(hnc.g));
                    i5++;
                } catch (Exception e2) {
                    throw new ElementCreationFailedException(cls, this, e2);
                }
            }
            i3++;
        }
        List list3 = (List) this.d.get(cls);
        if (list3 != null) {
            list = list3;
        }
        int size2 = list.size();
        while (i2 < size2) {
            try {
                arrayList.add(((wy6) list.get(i2)).a(this.g));
                i2++;
            } catch (Exception e3) {
                throw new ElementCreationFailedException(cls, this, e3);
            }
        }
        arrayList.isEmpty();
        return arrayList;
    }

    public final Object d(Class cls, boolean z) {
        wy6 wy6 = (wy6) this.c.get(cls);
        if (wy6 != null) {
            try {
                Object a2 = wy6.a(this.g);
                if (a2 != null || !z) {
                    return a2;
                }
                throw new ObjectNullabilityException(cls, this);
            } catch (Exception e2) {
                throw new ObjectCreationFailedException(cls, this, e2);
            }
        } else {
            int i2 = 0;
            while (i2 < this.l) {
                hnc hnc = (hnc) this.j.get(i2);
                wy6 wy62 = (wy6) hnc.c.get(cls);
                if (wy62 != null) {
                    try {
                        Object a3 = wy62.a(hnc.g);
                        if (a3 != null || !z) {
                            return a3;
                        }
                        throw new ObjectNullabilityException(cls, this);
                    } catch (Exception e3) {
                        throw new ObjectCreationFailedException(cls, this, e3);
                    }
                } else {
                    i2++;
                }
            }
            if (!z) {
                return null;
            }
            throw new MissingObjectFactoryException(cls, this);
        }
    }

    public final String toString() {
        return wn6.l(new StringBuilder("Scope(name=\""), this.a, "\")");
    }
}
