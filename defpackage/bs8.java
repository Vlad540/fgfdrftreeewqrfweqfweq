package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: bs8  reason: default package */
public final class bs8 {
    public static final xb4 e = new xb4(9);
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;

    public bs8(t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = t973;
        this.b = t972;
        this.c = t97;
        this.d = t974;
    }

    public static Set a(yr8 yr8, yr8 yr82) {
        qw4 qw4 = qw4.a;
        if (yr82 == null) {
            return qw4;
        }
        List list = yr82.a;
        if (yr8 != null) {
            List list2 = yr8.a;
            if (!list2.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object next : list2) {
                    if (((xr8) next).a.a == zyb.EMOJI) {
                        arrayList.add(next);
                    }
                }
                Iterator it = myc.L(myc.L(new es(2, list), new xz6(19)), new gh6(1, arrayList)).iterator();
                if (!it.hasNext()) {
                    return qw4;
                }
                ryb ryb = ((xr8) it.next()).a.b;
                if (!it.hasNext()) {
                    return Collections.singleton(ryb);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(ryb);
                while (it.hasNext()) {
                    linkedHashSet.add(((xr8) it.next()).a.b);
                }
                return linkedHashSet;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : list) {
            if (((xr8) next2).a.a == zyb.EMOJI) {
                arrayList2.add(next2);
            }
        }
        ArrayList arrayList3 = new ArrayList(q23.H(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((xr8) it2.next()).a.b);
        }
        return o23.w0(arrayList3);
    }

    public static void c(ArrayList arrayList, yyb yyb) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (hhd.f(((xr8) it.next()).a, yyb)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            xr8 xr8 = (xr8) arrayList.get(i);
            int i2 = xr8.b;
            if (i2 == 1) {
                arrayList.remove(i);
                return;
            }
            arrayList.set(i, new xr8(xr8.a, i2 - 1));
        }
    }

    public final to8 b() {
        return (to8) this.a.getValue();
    }

    public final void d(Long l, vo8 vo8, Set set, boolean z) {
        udd.p("bs8", us8.k("reactions, offline, messageServerId = %d,  reactionsDiff = %s, reactionsChanged = ", z), new Object[]{Long.valueOf(vo8.b), set});
        ((tt0) this.c.getValue()).c(new ove(l.longValue(), vo8.b, set, z));
    }

    public final jue e(long j, long j2, yyb yyb) {
        vo8 q;
        List list;
        i22 i22 = (i22) ((aw2) ((bv2) this.b.getValue())).m(j).a.getValue();
        jue jue = jue.a;
        if (i22 == null || (q = b().q(j2)) == null || q.z0 == ls8.DELETED) {
            return jue;
        }
        int i = 0;
        yr8 yr8 = q.W0;
        int i2 = yr8 != null ? yr8.b : 0;
        yyb yyb2 = yr8 != null ? yr8.c : null;
        ArrayList arrayList = (yr8 == null || (list = yr8.a) == null) ? new ArrayList() : new ArrayList(list);
        udd.p("bs8", "reactions, offline, updateMessageYourReaction, current: totalCount = %d, yourReaction = %s, reactions = %s", new Object[]{new Integer(i2), yyb2, arrayList});
        if (hhd.f(yyb2, yyb)) {
            udd.q("bs8", "reactions, offline, cancel case");
            c(arrayList, yyb2);
            int i3 = i2 - 1;
            if (i3 >= 0) {
                i = i3;
            }
            yyb = null;
        } else {
            udd.q("bs8", "reactions, offline, add case");
            if (yyb2 != null) {
                c(arrayList, yyb2);
                i2--;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (hhd.f(((xr8) it.next()).a, yyb)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                arrayList.add(new xr8(yyb, 1));
            } else {
                xr8 xr8 = (xr8) arrayList.get(i);
                arrayList.set(i, new xr8(xr8.a, xr8.b + 1));
            }
            i = i2 + 1;
        }
        t23.J(arrayList, e);
        yr8 yr82 = new yr8(arrayList, i, yyb);
        udd.q("bs8", "reactions, offline, newReactionsData = " + yr82);
        b().h(Collections.singletonMap(new Long(q.c), yr82));
        d(new Long(i22.a), q, a(yr8, yr82), hhd.f(yr82, yr8) ^ true);
        return jue;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: yr8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: yyb} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(long r13, java.util.Map r15) {
        /*
            r12 = this;
            to8 r0 = r12.b()
            java.util.Set r1 = r15.keySet()
            java.util.ArrayList r0 = r0.k(r13, r1)
            java.util.List r0 = o23.T(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r0.next()
            r3 = r2
            vo8 r3 = (defpackage.vo8) r3
            ls8 r3 = r3.z0
            ls8 r4 = defpackage.ls8.DELETED
            if (r3 == r4) goto L_0x001b
            r1.add(r2)
            goto L_0x001b
        L_0x0032:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r2 = r1.iterator()
        L_0x003b:
            boolean r3 = r2.hasNext()
            t97 r4 = r12.d
            if (r3 == 0) goto L_0x00b5
            java.lang.Object r3 = r2.next()
            vo8 r3 = (defpackage.vo8) r3
            java.lang.Object r4 = r4.getValue()
            zr8 r4 = (defpackage.zr8) r4
            long r5 = r3.c
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r5 = r15.get(r5)
            vr8 r5 = (defpackage.vr8) r5
            r4.getClass()
            r6 = 0
            if (r5 == 0) goto L_0x009f
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            java.util.List r9 = r5.a
            int r8 = q23.H(r9, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r9.iterator()
        L_0x0072:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x008f
            java.lang.Object r9 = r8.next()
            sr8 r9 = (defpackage.sr8) r9
            xr8 r10 = new xr8
            rr8 r11 = r9.a
            yyb r11 = r4.d(r11)
            int r9 = r9.b
            r10.<init>(r11, r9)
            r7.add(r10)
            goto L_0x0072
        L_0x008f:
            rr8 r8 = r5.c
            if (r8 == 0) goto L_0x0097
            yyb r6 = r4.d(r8)
        L_0x0097:
            yr8 r4 = new yr8
            int r5 = r5.b
            r4.<init>(r7, r5, r6)
            r6 = r4
        L_0x009f:
            yr8 r4 = r3.W0
            boolean r5 = hhd.f(r4, r6)
            if (r5 != 0) goto L_0x003b
            java.util.Set r4 = a(r4, r6)
            long r5 = r3.b
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r0.put(r3, r4)
            goto L_0x003b
        L_0x00b5:
            java.lang.Object r2 = r4.getValue()
            zr8 r2 = (defpackage.zr8) r2
            java.util.LinkedHashMap r15 = r2.c(r15)
            to8 r2 = r12.b()
            r2.h(r15)
            java.util.Iterator r15 = r1.iterator()
        L_0x00ca:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x00f4
            java.lang.Object r1 = r15.next()
            vo8 r1 = (defpackage.vo8) r1
            long r2 = r1.b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L_0x00ca
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            r4 = 0
            r12.d(r3, r1, r2, r4)
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            r12.g(r3, r1, r2, r4)
            goto L_0x00ca
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs8.f(long, java.util.Map):void");
    }

    public final void g(Long l, vo8 vo8, Set set, boolean z) {
        udd.p("bs8", "reactions, offline, messageServerId = %d,  reactionsDiff = %s", new Object[]{Long.valueOf(vo8.b), set});
        ((tt0) this.c.getValue()).c(new sj9(l.longValue(), z, vo8.b, vo8.o, set));
    }
}
