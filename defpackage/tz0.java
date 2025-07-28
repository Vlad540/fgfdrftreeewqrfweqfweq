package defpackage;

import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;

/* renamed from: tz0  reason: default package */
public final class tz0 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public tz0(CallAnalyticsSender callAnalyticsSender, ez2 ez2, fje fje) {
        this.b = callAnalyticsSender;
        this.c = ez2;
        this.d = fje;
        this.a = true;
        this.h = new nfc(5, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List a(java.util.Collection r6, raf r7, u81 r8) {
        /*
            r5 = this;
            boolean r0 = r8.g
            raf r1 = raf.a
            hw4 r2 = hw4.a
            if (r0 != 0) goto L_0x000d
            if (r7 != r1) goto L_0x000d
        L_0x000a:
            r8 = r2
            goto L_0x007d
        L_0x000d:
            raf r3 = raf.c
            if (r0 == 0) goto L_0x002a
            if (r7 != r3) goto L_0x002a
            b65 r4 = r8.e
            boolean r4 = r4 instanceof a65
            if (r4 == 0) goto L_0x002a
            lg7 r8 = hwf.c()
            r8.addAll(r6)
            u91 r0 = u91.a
            r8.add(r0)
            lg7 r8 = hwf.a(r8)
            goto L_0x007d
        L_0x002a:
            boolean r4 = r8.l
            if (r0 == 0) goto L_0x006a
            if (r7 != r3) goto L_0x006a
            if (r4 != 0) goto L_0x006a
            lg7 r0 = hwf.c()
            r0.addAll(r6)
            ete r1 = r8.b
            if (r1 == 0) goto L_0x0065
            boolean r1 = r1 instanceof uk1
            if (r1 == 0) goto L_0x0065
            boolean r1 = r5.a
            if (r1 == 0) goto L_0x0065
            java.lang.Object r1 = r5.e
            u81 r1 = (u81) r1
            b65 r1 = r1.e
            boolean r1 = r1 instanceof x55
            if (r1 != 0) goto L_0x0065
            t91 r1 = new t91
            java.lang.String r8 = r8.k
            if (r8 == 0) goto L_0x005a
            java.lang.String r8 = at7.W(r8)
            goto L_0x005b
        L_0x005a:
            r8 = 0
        L_0x005b:
            if (r8 != 0) goto L_0x005f
            java.lang.String r8 = ""
        L_0x005f:
            r1.<init>(r8)
            r0.add(r1)
        L_0x0065:
            lg7 r8 = hwf.a(r0)
            goto L_0x007d
        L_0x006a:
            if (r0 == 0) goto L_0x0079
            if (r7 != r1) goto L_0x0079
            if (r4 != 0) goto L_0x0074
            boolean r0 = r5.a
            if (r0 != 0) goto L_0x0079
        L_0x0074:
            boolean r8 = r8.o
            if (r8 == 0) goto L_0x0079
            goto L_0x000a
        L_0x0079:
            java.util.List r8 = o23.s0(r6)
        L_0x007d:
            int r7 = r7.ordinal()
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L_0x00ae
            if (r7 == r0) goto L_0x00bd
            r6 = 2
            if (r7 != r6) goto L_0x00a8
            lg7 r6 = hwf.c()
            java.lang.Object r5 = r5.d
            t97 r5 = (t97) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.util.ArrayList r5 = au7.a(r8, r5, r0, r1)
            r6.addAll(r5)
            lg7 r2 = hwf.a(r6)
            goto L_0x00bd
        L_0x00a8:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L_0x00ae:
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L_0x00b5
            goto L_0x00bd
        L_0x00b5:
            int r5 = r6.size()
            java.util.ArrayList r2 = au7.a(r8, r5, r0, r1)
        L_0x00bd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz0.a(java.util.Collection, raf, u81):java.util.List");
    }

    public hmd b(Map map, ws7 ws7, List list, le1 le1) {
        s91 s91;
        u81 u81 = (u81) this.e;
        bga bga = null;
        if (u81.s) {
            return null;
        }
        if (u81.q == hy7.b) {
            b65 b65 = u81.e;
            if (!((b65 instanceof v55) || (b65 instanceof u55) || (b65 instanceof w55)) && !u81.g) {
                if ((((raf) this.f) == raf.a) && (s91 = (s91) map.get(le1)) != null) {
                    bga = au7.f(s91, true, u81.m, false);
                }
            }
        }
        return new hmd(list, ws7, bga);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: s91} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: s91} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: s91} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: s91} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: s91} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: s91} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: s91} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: s91} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: s91} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ws7 c(raf r24, java.util.Map r25, le1 r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r26
            java.lang.Object r3 = r0.e
            u81 r3 = (u81) r3
            y11 r3 = r3.f
            r4 = 0
            if (r3 == 0) goto L_0x003c
            java.lang.Long r5 = r3.a
            if (r5 == 0) goto L_0x001f
            long r5 = r5.longValue()
            le1 r7 = new le1
            r8 = 0
            r7.<init>(r5, r8)
            r12 = r7
            goto L_0x0020
        L_0x001f:
            r12 = r4
        L_0x0020:
            ws7 r5 = new ws7
            r18 = 0
            r19 = 0
            mc0 r10 = r3.c
            java.lang.CharSequence r11 = r3.b
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r20 = 3
            r21 = 0
            r22 = 0
            r9 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x003d
        L_0x003c:
            r5 = r4
        L_0x003d:
            java.lang.Object r3 = r0.e
            u81 r3 = (u81) r3
            java.lang.Object r6 = r0.i
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r7 = r0.h
            le1 r7 = (le1) r7
            java.lang.Object r7 = r6.get(r7)
            s91 r7 = (s91) r7
            if (r7 != 0) goto L_0x009a
            le1 r7 = r3.p
            java.lang.Object r7 = r6.get(r7)
            s91 r7 = (s91) r7
            if (r7 != 0) goto L_0x009a
            java.util.Set r7 = r6.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0063:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0085
            java.lang.Object r8 = r7.next()
            r9 = r8
            le1 r9 = (le1) r9
            qja r10 = r3.h
            if (r10 == 0) goto L_0x007b
            ne1 r10 = r10.a
            le1 r10 = r10.getId()
            goto L_0x007c
        L_0x007b:
            r10 = r4
        L_0x007c:
            boolean r9 = hhd.f(r9, r10)
            r9 = r9 ^ 1
            if (r9 == 0) goto L_0x0063
            goto L_0x0086
        L_0x0085:
            r8 = r4
        L_0x0086:
            java.lang.Object r3 = r6.get(r8)
            r7 = r3
            s91 r7 = (s91) r7
            if (r7 != 0) goto L_0x009a
            java.util.Collection r3 = r6.values()
            java.lang.Object r3 = o23.W(r3)
            r7 = r3
            s91 r7 = (s91) r7
        L_0x009a:
            java.lang.Object r3 = r0.e
            u81 r3 = (u81) r3
            ai1 r6 = r3.i
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x00a8
            goto L_0x0134
        L_0x00a8:
            raf r6 = raf.c
            if (r1 != r6) goto L_0x00ae
            goto L_0x0134
        L_0x00ae:
            raf r6 = raf.a
            java.lang.Object r8 = r0.c
            t97 r8 = (t97) r8
            boolean r3 = r3.g
            if (r3 != 0) goto L_0x00eb
            if (r1 != r6) goto L_0x00eb
            if (r2 != 0) goto L_0x00eb
            java.util.Collection r1 = r25.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x00c4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00d8
            java.lang.Object r2 = r1.next()
            r3 = r2
            s91 r3 = (s91) r3
            boolean r3 = r3.A0
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x00c4
            r4 = r2
        L_0x00d8:
            s91 r4 = (s91) r4
            if (r4 == 0) goto L_0x0124
            java.lang.Object r0 = r0.e
            u81 r0 = (u81) r0
            java.lang.Object r1 = r8.getValue()
            xk1 r1 = (xk1) r1
            ws7 r4 = au7.e(r4, r0, r1)
            goto L_0x0134
        L_0x00eb:
            if (r3 != 0) goto L_0x0122
            if (r1 != r6) goto L_0x0122
            java.util.Collection r1 = r25.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x00f7:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x010f
            java.lang.Object r3 = r1.next()
            r6 = r3
            s91 r6 = (s91) r6
            le1 r6 = r6.a
            boolean r6 = hhd.f(r6, r2)
            r6 = r6 ^ 1
            if (r6 == 0) goto L_0x00f7
            r4 = r3
        L_0x010f:
            s91 r4 = (s91) r4
            if (r4 == 0) goto L_0x0124
            java.lang.Object r0 = r0.e
            u81 r0 = (u81) r0
            java.lang.Object r1 = r8.getValue()
            xk1 r1 = (xk1) r1
            ws7 r4 = au7.e(r4, r0, r1)
            goto L_0x0134
        L_0x0122:
            if (r7 != 0) goto L_0x0126
        L_0x0124:
            r4 = r5
            goto L_0x0134
        L_0x0126:
            java.lang.Object r0 = r0.e
            u81 r0 = (u81) r0
            java.lang.Object r1 = r8.getValue()
            xk1 r1 = (xk1) r1
            ws7 r4 = au7.e(r7, r0, r1)
        L_0x0134:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz0.c(raf, java.util.Map, le1):ws7");
    }

    public tz0(t97 t97, ync ync) {
        this.b = ync;
        this.c = t97;
        this.d = ez3.O(3, new nl1(3, this));
        this.e = new u81();
        this.f = raf.a;
        this.a = true;
        this.i = iw4.a;
    }
}
