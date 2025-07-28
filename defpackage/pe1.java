package defpackage;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: pe1  reason: default package */
public final class pe1 {
    public final ke1 a;
    public final ob1 b;
    public final qe4 c;
    public final xwb d;
    public final bae e;
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final LongSparseArray h = new LongSparseArray();
    public ge1 i;
    public w2d j;
    public w2d k;

    public pe1(ke1 ke1, ob1 ob1, qe4 qe4, xwb xwb) {
        this.a = ke1;
        this.b = ob1;
        this.c = qe4;
        this.d = xwb;
        bae bae = new bae();
        bae.b = qw4.a;
        this.e = bae;
        u2d u2d = u2d.a;
        this.j = u2d;
        this.k = u2d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0095, code lost:
        r5 = (defpackage.cc9) r5.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ud a(defpackage.pja r12, defpackage.w2d r13) {
        /*
            r11 = this;
            ge1 r0 = r12.a
            ke1 r0 = r11.j(r0)
            java.util.HashMap r1 = r11.f
            java.util.HashMap r2 = r11.g
            android.util.LongSparseArray r3 = r11.h
            r4 = 1
            dja r5 = r12.d
            dja r6 = r12.c
            dja r7 = r12.b
            ge1 r8 = r12.a
            if (r0 != 0) goto L_0x0062
            ke1 r0 = new ke1
            java.lang.Object r7 = r7.i()
            wia r7 = (wia) r7
            java.lang.Object r6 = r6.i()
            ac9 r6 = (defpackage.ac9) r6
            java.lang.Object r5 = r5.i()
            cc9 r5 = (defpackage.cc9) r5
            r0.<init>(r8, r7, r6, r5)
            ge1 r5 = r0.a
            if (r5 != 0) goto L_0x0033
            goto L_0x005e
        L_0x0033:
            java.lang.Object r6 = r1.get(r13)
            if (r6 != 0) goto L_0x0041
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            r1.put(r13, r6)
        L_0x0041:
            java.util.Map r6 = (java.util.Map) r6
            r6.put(r5, r0)
            r2.put(r5, r13)
            long r1 = r5.a
            java.lang.Object r13 = r3.get(r1)
            java.util.Set r13 = (java.util.Set) r13
            if (r13 != 0) goto L_0x005b
            java.util.LinkedHashSet r13 = new java.util.LinkedHashSet
            r13.<init>()
            r3.put(r1, r13)
        L_0x005b:
            r13.add(r5)
        L_0x005e:
            r13 = 0
            r6 = r4
            goto L_0x0123
        L_0x0062:
            boolean r9 = r7.d()
            if (r9 == 0) goto L_0x0071
            java.lang.Object r7 = r7.b()
            wia r7 = (wia) r7
            r0.e(r7)
        L_0x0071:
            boolean r7 = r6.d()
            if (r7 == 0) goto L_0x008f
            java.lang.Object r6 = r6.b()
            ac9 r6 = (defpackage.ac9) r6
            k88 r7 = r6.a
            ac9 r9 = r0.b
            r9.a = r7
            k88 r7 = r6.b
            r9.b = r7
            k88 r7 = r6.c
            r9.c = r7
            k88 r6 = r6.d
            r9.d = r6
        L_0x008f:
            boolean r6 = r5.d()
            if (r6 == 0) goto L_0x00da
            java.lang.Object r5 = r5.b()
            cc9 r5 = (defpackage.cc9) r5
            cc9 r6 = r0.c
            boolean r7 = r6.e
            boolean r9 = r5.e
            if (r7 != r9) goto L_0x00c1
            boolean r7 = r6.f
            boolean r10 = r5.f
            if (r7 != r10) goto L_0x00c1
            boolean r7 = r6.b
            boolean r10 = r5.b
            if (r7 != r10) goto L_0x00c1
            boolean r7 = r6.g
            boolean r10 = r5.g
            if (r7 != r10) goto L_0x00c1
            boolean r7 = r6.c
            boolean r10 = r5.c
            if (r7 != r10) goto L_0x00c1
            boolean r7 = r6.d
            boolean r10 = r5.d
            if (r7 == r10) goto L_0x00da
        L_0x00c1:
            r6.e = r9
            boolean r7 = r5.f
            r6.f = r7
            boolean r7 = r5.b
            r6.b = r7
            boolean r7 = r5.g
            r6.g = r7
            boolean r7 = r5.c
            r6.c = r7
            boolean r5 = r5.d
            r6.d = r5
            r6.a()
        L_0x00da:
            java.lang.Object r5 = r2.get(r8)
            w2d r5 = (defpackage.w2d) r5
            if (r5 != 0) goto L_0x00e4
            w2d r5 = r11.k
        L_0x00e4:
            boolean r6 = hhd.f(r5, r13)
            r6 = r6 ^ r4
            boolean r7 = hhd.f(r5, r13)
            if (r7 != 0) goto L_0x0122
            r11.b(r8, r5)
            ge1 r7 = r0.a
            if (r7 != 0) goto L_0x00f7
            goto L_0x0122
        L_0x00f7:
            java.lang.Object r9 = r1.get(r13)
            if (r9 != 0) goto L_0x0105
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r1.put(r13, r9)
        L_0x0105:
            java.util.Map r9 = (java.util.Map) r9
            r9.put(r7, r0)
            r2.put(r7, r13)
            long r1 = r7.a
            java.lang.Object r13 = r3.get(r1)
            java.util.Set r13 = (java.util.Set) r13
            if (r13 != 0) goto L_0x011f
            java.util.LinkedHashSet r13 = new java.util.LinkedHashSet
            r13.<init>()
            r3.put(r1, r13)
        L_0x011f:
            r13.add(r7)
        L_0x0122:
            r13 = r5
        L_0x0123:
            ge1 r11 = r11.i
            if (r8 != r11) goto L_0x0129
            r0.o = r4
        L_0x0129:
            dja r11 = r12.e
            boolean r1 = r11.d()
            if (r1 == 0) goto L_0x013f
            java.lang.Object r11 = r11.b()
            java.util.List r11 = (java.util.List) r11
            java.util.ArrayList r1 = r0.d
            r1.clear()
            r1.addAll(r11)
        L_0x013f:
            dja r11 = r12.f
            boolean r1 = r11.d()
            if (r1 == 0) goto L_0x014f
            java.lang.Object r11 = r11.b()
            y41 r11 = (defpackage.y41) r11
            r0.p = r11
        L_0x014f:
            dja r11 = r12.g
            boolean r12 = r11.d()
            if (r12 == 0) goto L_0x015f
            java.lang.Object r11 = r11.b()
            java.util.List r11 = (java.util.List) r11
            r0.q = r11
        L_0x015f:
            ud r11 = new ud
            r11.<init>(r0, r6, r13)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pe1.a(pja, w2d):ud");
    }

    public final ke1 b(ge1 ge1, w2d w2d) {
        HashMap hashMap = this.g;
        w2d w2d2 = (w2d) hashMap.get(ge1);
        if (w2d2 == null) {
            return null;
        }
        if (w2d2.equals(w2d)) {
            long j2 = ge1.a;
            LongSparseArray longSparseArray = this.h;
            Set set = (Set) longSparseArray.get(j2);
            if (set != null) {
                set.remove(ge1);
                if (set.isEmpty()) {
                    longSparseArray.remove(j2);
                }
            }
            hashMap.remove(ge1);
            HashMap hashMap2 = this.f;
            Object obj = hashMap2.get(w2d);
            if (obj == null) {
                obj = new LinkedHashMap();
                hashMap2.put(w2d, obj);
            }
            return (ke1) ((Map) obj).remove(ge1);
        }
        this.d.log("CallParticipants", "Tried to remove " + ge1 + " from " + w2d + " but participant is in " + w2d2);
        return null;
    }

    public final w2d c(ge1 ge1) {
        w2d w2d = (w2d) this.g.get(ge1);
        return w2d == null ? hhd.f(ge1, this.a.a) ? this.k : u2d.a : w2d;
    }

    public final Map d(w2d w2d) {
        HashMap hashMap = this.f;
        Object obj = hashMap.get(w2d);
        if (obj == null) {
            obj = new LinkedHashMap();
            hashMap.put(w2d, obj);
        }
        return (Map) obj;
    }

    public final void e(w2d w2d, List list) {
        boolean f2 = hhd.f(w2d, this.k);
        ob1 ob1 = this.b;
        if (f2) {
            ob1.a.onActiveParticipantsChanged(new mx0(list, d(this.k).values()));
        }
        ob1.c.onCallParticipantsChanged(new re1(list));
    }

    public final ke1 f(pja pja, w2d w2d) {
        return (ke1) o23.V(g(w2d, Collections.singletonList(pja)));
    }

    public final ArrayList g(w2d w2d, List list) {
        List list2;
        ob1 ob1;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pja pja = (pja) it.next();
            w2d c2 = w2d == null ? c(pja.a) : w2d;
            ud a2 = a(pja, c2);
            ke1 ke1 = (ke1) a2.c;
            arrayList.add(ke1);
            if (a2.b) {
                Object obj = linkedHashMap.get(c2);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(c2, obj);
                }
                ((List) obj).add(ke1);
            } else {
                Object obj2 = linkedHashMap2.get(c2);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(c2, obj2);
                }
                ((List) obj2).add(ke1);
            }
            w2d w2d2 = (w2d) a2.o;
            if (w2d2 != null && !w2d2.equals(c2)) {
                Object obj3 = linkedHashMap3.get(w2d2);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap3.put(w2d2, obj3);
                }
                ((List) obj3).add(ke1);
            }
        }
        Iterator it2 = linkedHashMap3.keySet().iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            list2 = hw4.a;
            ob1 = this.b;
            if (!hasNext) {
                break;
            }
            w2d w2d3 = (w2d) it2.next();
            List list3 = (List) linkedHashMap3.get(w2d3);
            if (list3 != null) {
                list2 = list3;
            }
            if (hhd.f(w2d3, this.k)) {
                ob1.a.onActiveParticipantsRemoved(new ox0(list2, d(this.k).values()));
            }
            ob1.c.onCallParticipantsRemoved(new te1(list2));
        }
        for (w2d w2d4 : linkedHashMap.keySet()) {
            List list4 = (List) linkedHashMap.get(w2d4);
            if (list4 == null) {
                list4 = list2;
            }
            if (hhd.f(w2d4, this.k)) {
                ob1.a.onActiveParticipantsAdded(new lx0(list4, d(this.k).values()));
            }
            ob1.c.onCallParticipantsAdded(new qe1(w2d4, list4));
        }
        for (w2d w2d5 : linkedHashMap2.keySet()) {
            List list5 = (List) linkedHashMap2.get(w2d5);
            if (list5 == null) {
                list5 = list2;
            }
            e(w2d5, list5);
        }
        return arrayList;
    }

    public final void h() {
        ArrayList arrayList = new ArrayList(d(this.k).values());
        this.e.b = qw4.a;
        this.i = null;
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.b.a.onActiveParticipantsRemoved(new ox0(arrayList, hw4.a));
        this.c.t();
    }

    public final Collection i() {
        return d(this.k).values();
    }

    public final ke1 j(ge1 ge1) {
        ke1 ke1 = this.a;
        ge1 ge12 = ke1.a;
        if (ge12 != null && ge12.equals(ge1)) {
            return ke1;
        }
        w2d w2d = (w2d) this.g.get(ge1);
        if (w2d != null) {
            return (ke1) d(w2d).get(ge1);
        }
        return null;
    }

    public final boolean k(ke1 ke1) {
        if (ke1 != null) {
            ge1 ge1 = ke1.a;
            if ((ge1 != null ? j(ge1) : null) != null) {
                return true;
            }
        }
        return false;
    }

    public final void l(ge1 ge1, wia wia, String str, String str2) {
        ke1 j2 = j(ge1);
        if (j2 != null && wia != null) {
            HashMap hashMap = j2.f;
            boolean isEmpty = hashMap.isEmpty();
            hashMap.put(wia, new wia(str, str2));
            if (Objects.equals(j2.j, wia)) {
                j2.l = str;
                j2.k = str2;
            }
            if (isEmpty && j2.j == null) {
                w2d w2d = (w2d) this.g.get(ge1);
                if (w2d == null) {
                    w2d = this.k;
                }
                e(w2d, Collections.singletonList(j2));
            }
        }
    }

    public final ArrayList m(w2d w2d, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ge1 ge1 = (ge1) it.next();
            w2d c2 = w2d == null ? c(ge1) : w2d;
            ke1 b2 = b(ge1, c2);
            if (b2 != null) {
                Object obj = linkedHashMap.get(c2);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(c2, obj);
                }
                ((List) obj).add(b2);
            }
        }
        for (w2d w2d2 : linkedHashMap.keySet()) {
            hw4 hw4 = (List) linkedHashMap.get(w2d2);
            if (hw4 == null) {
                hw4 = hw4.a;
            }
            boolean f2 = hhd.f(w2d2, this.k);
            ob1 ob1 = this.b;
            if (f2) {
                ob1.a.onActiveParticipantsRemoved(new ox0(hw4, d(this.k).values()));
            }
            ob1.c.onCallParticipantsRemoved(new te1(hw4));
        }
        return q23.I(linkedHashMap.values());
    }

    public final void n(w2d w2d) {
        w2d w2d2 = this.k;
        this.k = w2d;
        if (!hhd.f(w2d2, w2d)) {
            this.b.a.onActiveParticipantUpdated(new px0(d(w2d2).values(), d(w2d).values(), w2d, w2d instanceof v2d ? this.c.y((v2d) w2d) : null, this.a));
        }
    }

    public final void o(ge1 ge1) {
        if (ge1 != this.i) {
            ArrayList arrayList = new ArrayList();
            ge1 ge12 = this.i;
            ke1 ke1 = null;
            ke1 j2 = ge12 != null ? j(ge12) : null;
            if (j2 != null) {
                boolean c2 = j2.c();
                j2.o = false;
                if (c2 != j2.c()) {
                    arrayList.add(j2);
                }
            }
            if (ge1 != null) {
                ke1 = j(ge1);
            }
            if (ke1 != null) {
                boolean c3 = ke1.c();
                ke1.o = true;
                if (c3 != ke1.c()) {
                    arrayList.add(ke1);
                }
            }
            e(this.k, arrayList);
            this.i = ge1;
        }
    }

    public final void p(w2d w2d) {
        w2d w2d2 = this.j;
        this.j = w2d;
        if (!hhd.f(w2d2, w2d)) {
            this.b.f.onCurrentParticipantInvitedToRoom(new kj1(this.a, w2d, w2d instanceof v2d ? this.c.y((v2d) w2d) : null));
        }
    }

    public final void q(ArrayList arrayList) {
        Map d2 = d(this.k);
        bae bae = this.e;
        bae.getClass();
        HashSet hashSet = new HashSet(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ke1 ke1 = (ke1) d2.get((ge1) it.next());
            if (ke1 != null) {
                boolean d3 = ke1.d();
                ke1.n = true;
                if (d3 != ke1.d()) {
                    arrayList2.add(ke1);
                }
            }
        }
        for (ge1 ge1 : (Set) bae.b) {
            ke1 ke12 = (ke1) d2.get(ge1);
            if (ke12 != null && !hashSet.contains(ge1)) {
                boolean d4 = ke12.d();
                ke12.n = false;
                if (d4 != ke12.d()) {
                    arrayList2.add(ke12);
                }
            }
        }
        bae.b = hashSet;
        e(this.k, arrayList2);
    }

    public final int r() {
        Map map = (Map) this.f.get(this.k);
        if (map != null) {
            return map.size();
        }
        return 0;
    }
}
