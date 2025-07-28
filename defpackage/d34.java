package defpackage;

import android.os.Bundle;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import one.me.deeplink.InvalidDeeplinkNamingException;

/* renamed from: d34  reason: default package */
public final class d34 {
    public final String a = d34.class.getName();
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final ArrayList f;
    public boolean g;

    public d34(t97 t97, r7e r7e, t97 t972, t97 t973) {
        this.b = t972;
        this.c = t973;
        this.d = t97;
        this.e = r7e;
        this.f = new ArrayList();
    }

    public final v24 a() {
        return (v24) this.c.getValue();
    }

    public final boolean b(String str, Bundle bundle) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("try to open new screen from background thread".toString());
        } else if (h0e.s0(str, ':')) {
            return c(am7.d(str, "max", (String) null), bundle);
        } else {
            udd.s(this.a, "Trying to open invalid app route=".concat(str), (Throwable) null);
            throw new InvalidDeeplinkNamingException(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: m0a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: m0a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: m0a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: m0a} */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0315, code lost:
        if (r3.d != false) goto L_0x032c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0518  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(android.net.Uri r19, android.os.Bundle r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r5 = r20
            java.lang.String r2 = r19.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "goto = "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = ", bundle = "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "DeepLinkRouter"
            defpackage.udd.p(r3, r2, new java.lang.Object[0])
            t97 r2 = r0.d
            java.lang.Object r2 = r2.getValue()
            y24 r2 = (defpackage.y24) r2
            wia r2 = r2.a(r1)
            if (r2 == 0) goto L_0x0547
            java.lang.Object r3 = r2.a
            c34 r3 = (defpackage.c34) r3
            java.lang.Object r2 = r2.b
            z24 r2 = (defpackage.z24) r2
            java.lang.String r4 = r19.getQuery()
            r6 = 61
            r7 = 38
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L_0x008a
            boolean r10 = defpackage.h0e.c0(r4)
            if (r10 == 0) goto L_0x004e
            goto L_0x008a
        L_0x004e:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>(r8)
            r11 = r9
        L_0x0054:
            r12 = 4
            int r13 = defpackage.h0e.Z(r4, r7, r11, r9, r12)
            r14 = -1
            if (r13 != r14) goto L_0x0060
            int r13 = r4.length()
        L_0x0060:
            int r12 = defpackage.h0e.Z(r4, r6, r11, r9, r12)
            if (r12 > r13) goto L_0x0068
            if (r12 != r14) goto L_0x0069
        L_0x0068:
            r12 = r13
        L_0x0069:
            java.lang.String r11 = r4.substring(r11, r12)
            int r12 = r12 + r8
            if (r12 <= r13) goto L_0x0071
            r12 = r13
        L_0x0071:
            java.lang.String r12 = r4.substring(r12, r13)
            java.lang.String r11 = android.net.Uri.decode(r11)
            java.lang.String r12 = android.net.Uri.decode(r12)
            r10.put(r11, r12)
            int r11 = r13 + 1
            int r12 = r4.length()
            if (r11 < r12) goto L_0x0054
            r4 = r10
            goto L_0x008c
        L_0x008a:
            iw4 r4 = defpackage.iw4.a
        L_0x008c:
            java.util.Set r10 = r4.keySet()
            java.util.Set r11 = r3.c
            boolean r10 = r10.containsAll(r11)
            if (r10 == 0) goto L_0x053f
            java.util.Set r10 = r3.e
            if (r10 == 0) goto L_0x0101
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto L_0x00a3
            goto L_0x0101
        L_0x00a3:
            if (r5 == 0) goto L_0x00af
            java.util.Set r12 = r20.keySet()
            boolean r10 = r12.containsAll(r10)
            if (r10 != 0) goto L_0x0101
        L_0x00af:
            one.me.deeplink.MissedRequiredBundleException r0 = new one.me.deeplink.MissedRequiredBundleException
            if (r5 == 0) goto L_0x00b9
            java.util.Set r2 = r20.keySet()
            r4 = r2
            goto L_0x00ba
        L_0x00b9:
            r4 = 0
        L_0x00ba:
            java.lang.String r2 = r19.toString()
            java.util.Set r5 = r3.e
            r8 = 0
            r10 = 63
            r6 = 0
            r7 = 0
            r9 = 0
            java.lang.String r10 = defpackage.o23.c0(r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x00d7
            r7 = 0
            r9 = 63
            r5 = 0
            r6 = 0
            r8 = 0
            java.lang.String r11 = defpackage.o23.c0(r4, r5, r6, r7, r8, r9)
            goto L_0x00d8
        L_0x00d7:
            r11 = 0
        L_0x00d8:
            java.lang.String r1 = r19.toString()
            java.lang.String r4 = "Bundle required for "
            java.lang.String r5 = " not contains all params! requiredParams = "
            java.lang.String r6 = ", bundleKeys = "
            java.lang.StringBuilder r2 = c3d.j(r4, r2, r5, r10, r6)
            r2.append(r11)
            java.lang.String r4 = ", uri="
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = ", route = "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0101:
            if (r5 != 0) goto L_0x0109
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            goto L_0x010a
        L_0x0109:
            r10 = r5
        L_0x010a:
            java.util.Set r12 = r4.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x0112:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x012e
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r14 = r13.getKey()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r13 = r13.getValue()
            java.lang.String r13 = (java.lang.String) r13
            r10.putString(r14, r13)
            goto L_0x0112
        L_0x012e:
            t97 r12 = r0.b
            java.lang.Object r12 = r12.getValue()
            f34 r12 = (defpackage.f34) r12
            a4a r12 = (defpackage.a4a) r12
            r12.getClass()
            int[] r13 = defpackage.z3a.$EnumSwitchMapping$0
            int r14 = r3.b
            int r14 = defpackage.hr1.t(r14)
            r13 = r13[r14]
            if (r13 != r8) goto L_0x0154
            t97 r12 = r12.a
            java.lang.Object r12 = r12.getValue()
            zy9 r12 = (zy9) r12
            boolean r12 = r12.d()
            goto L_0x0155
        L_0x0154:
            r12 = r8
        L_0x0155:
            java.lang.String r13 = ":login"
            if (r12 != 0) goto L_0x016b
            t97 r1 = r0.b
            java.lang.Object r1 = r1.getValue()
            f34 r1 = (defpackage.f34) r1
            a4a r1 = (defpackage.a4a) r1
            r1.getClass()
            boolean r0 = r0.b(r13, r10)
            return r0
        L_0x016b:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder
            r12.<init>()
            android.net.Uri r14 = r3.a
            java.lang.String r15 = defpackage.k34.a(r14)
            android.net.Uri$Builder r12 = r12.encodedPath(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.util.Set r8 = r3.c
            java.util.Iterator r16 = r8.iterator()
        L_0x0185:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x01ae
            java.lang.Object r17 = r16.next()
            r11 = r17
            java.lang.String r11 = (java.lang.String) r11
            r15.append(r11)
            r15.append(r6)
            java.lang.Object r11 = r4.get(r11)
            if (r11 == 0) goto L_0x01a8
            java.lang.String r11 = (java.lang.String) r11
            r15.append(r11)
            r15.append(r7)
            goto L_0x0185
        L_0x01a8:
            one.me.deeplink.MissedRequiredQueryParamsException r0 = new one.me.deeplink.MissedRequiredQueryParamsException
            r0.<init>(r14, r4, r8)
            throw r0
        L_0x01ae:
            java.lang.String r6 = r15.toString()
            java.lang.String r7 = "&"
            java.lang.String r6 = defpackage.h0e.l0(r6, r7)
            android.net.Uri$Builder r6 = r12.encodedQuery(r6)
            android.net.Uri r6 = r6.build()
            java.lang.String r6 = r6.toString()
            j34 r2 = r2.b(r6, r3, r10)     // Catch:{ all -> 0x0530 }
            if (r2 == 0) goto L_0x0522
            boolean r1 = r0.g
            java.lang.String r4 = ""
            if (r1 != 0) goto L_0x0296
            v24 r1 = r18.a()
            java.util.ArrayList r1 = r1.a()
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L_0x01e0
            goto L_0x0296
        L_0x01e0:
            java.util.Iterator r1 = r1.iterator()
        L_0x01e4:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0296
            java.lang.Object r5 = r1.next()
            w3a r5 = (defpackage.w3a) r5
            vgc r5 = r5.a
            java.lang.String r5 = r5.b
            if (r5 != 0) goto L_0x01f7
            r5 = r4
        L_0x01f7:
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x01e4
            v24 r0 = r18.a()
            y3a r0 = (defpackage.y3a) r0
            ygc r1 = r0.f()
            sgc r1 = r1.C()
            java.util.ArrayList r1 = r1.e()
            bs r3 = new bs
            r3.<init>((int) r9)
            adc r4 = new adc
            r4.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L_0x021d:
            r5 = r4
            zcc r5 = (defpackage.zcc) r5
            java.util.ListIterator r6 = r5.b
            boolean r6 = r6.hasPrevious()
            java.lang.String r7 = r2.a
            if (r6 == 0) goto L_0x023e
            java.util.ListIterator r5 = r5.b
            java.lang.Object r5 = r5.previous()
            vgc r5 = (defpackage.vgc) r5
            java.lang.String r6 = r5.b
            boolean r6 = defpackage.hhd.f(r6, r7)
            if (r6 != 0) goto L_0x023e
            r3.add(r5)
            goto L_0x021d
        L_0x023e:
            r1.removeAll(r3)
            int r3 = r1.size()
            java.util.ListIterator r3 = r1.listIterator(r3)
        L_0x0249:
            boolean r4 = r3.hasPrevious()
            if (r4 == 0) goto L_0x025f
            java.lang.Object r4 = r3.previous()
            r5 = r4
            vgc r5 = (defpackage.vgc) r5
            java.lang.String r5 = r5.b
            boolean r5 = defpackage.hhd.f(r5, r7)
            if (r5 == 0) goto L_0x0249
            goto L_0x0260
        L_0x025f:
            r4 = 0
        L_0x0260:
            vgc r4 = (defpackage.vgc) r4
            if (r4 == 0) goto L_0x0288
            rr3 r3 = r4.a
            if (r3 != 0) goto L_0x0269
            goto L_0x0288
        L_0x0269:
            boolean r4 = r3 instanceof one.me.sdk.arch.Widget
            if (r4 == 0) goto L_0x0271
            r4 = r3
            one.me.sdk.arch.Widget r4 = (one.me.sdk.arch.Widget) r4
            goto L_0x0272
        L_0x0271:
            r4 = 0
        L_0x0272:
            android.os.Bundle r2 = r2.c
            if (r4 == 0) goto L_0x027a
            r4.updateArgs(r2)
            goto L_0x0288
        L_0x027a:
            android.os.Bundle r4 = r3.getArgs()
            r4.clear()
            android.os.Bundle r3 = r3.getArgs()
            r3.putAll(r2)
        L_0x0288:
            ygc r0 = r0.f()
            sgc r0 = r0.C()
            r2 = 0
            r0.P(r1, r2)
            r5 = 1
            return r5
        L_0x0296:
            r5 = 1
            boolean r1 = r0.g
            if (r1 == 0) goto L_0x02a1
            java.util.ArrayList r0 = r0.f
            r0.add(r2)
            return r5
        L_0x02a1:
            v24 r1 = r18.a()
            int r1 = r1.b()
            r5 = 2
            if (r1 != 0) goto L_0x02ae
            goto L_0x032c
        L_0x02ae:
            android.net.Uri r1 = r3.a
            java.lang.String r1 = defpackage.k34.a(r1)
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x032c
            t97 r1 = r0.b
            java.lang.Object r1 = r1.getValue()
            f34 r1 = (defpackage.f34) r1
            a4a r1 = (defpackage.a4a) r1
            java.util.LinkedHashSet r1 = r1.b
            boolean r6 = r1 instanceof java.util.Collection
            if (r6 == 0) goto L_0x02d1
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L_0x02d1
            goto L_0x0318
        L_0x02d1:
            java.util.Iterator r1 = r1.iterator()
        L_0x02d5:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0318
            java.lang.Object r6 = r1.next()
            c34 r6 = (defpackage.c34) r6
            v24 r7 = r18.a()
            android.net.Uri r6 = r6.a
            java.lang.String r6 = defpackage.k34.a(r6)
            java.util.ArrayList r8 = r7.a()
            int r8 = r8.size()
            r10 = 1
            if (r8 != r10) goto L_0x02d5
            java.util.ArrayList r7 = r7.a()
            java.lang.Object r7 = defpackage.o23.V(r7)
            w3a r7 = (defpackage.w3a) r7
            vgc r7 = r7.a
            java.lang.String r7 = r7.b
            if (r7 != 0) goto L_0x0307
            r7 = r4
        L_0x0307:
            java.lang.String r8 = "?"
            java.lang.String r7 = defpackage.h0e.w0(r7, r8)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x02d5
            boolean r1 = r3.d
            if (r1 == 0) goto L_0x0318
            goto L_0x032c
        L_0x0318:
            t97 r1 = r0.e
            java.lang.Object r1 = r1.getValue()
            g34 r1 = (defpackage.g34) r1
            java.util.LinkedHashSet r1 = r1.a
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x032a
            r1 = 3
            goto L_0x032d
        L_0x032a:
            r1 = r5
            goto L_0x032d
        L_0x032c:
            r1 = 1
        L_0x032d:
            java.lang.String r3 = r0.a
            fn6 r4 = defpackage.udd.e
            if (r4 != 0) goto L_0x0334
            goto L_0x0365
        L_0x0334:
            boolean r6 = r4.c()
            if (r6 == 0) goto L_0x0365
            tn7 r6 = tn7.X
            java.lang.String r7 = r2.a
            java.lang.String r8 = "show, screen="
            java.lang.String r10 = ", mode="
            java.lang.StringBuilder r7 = defpackage.hr1.m(r8, r7, r10)
            r8 = 1
            if (r1 == r8) goto L_0x0358
            r8 = 2
            if (r1 == r8) goto L_0x0355
            r8 = 3
            if (r1 == r8) goto L_0x0352
            java.lang.String r8 = "null"
            goto L_0x035a
        L_0x0352:
            java.lang.String r8 = "BOTTOM_BAR_NAVIGATION"
            goto L_0x035a
        L_0x0355:
            java.lang.String r8 = "PUSH"
            goto L_0x035a
        L_0x0358:
            java.lang.String r8 = "SET_ROOT"
        L_0x035a:
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r8 = 0
            r4.d(r6, r3, r7, r8)
        L_0x0365:
            int r1 = defpackage.hr1.t(r1)
            if (r1 == 0) goto L_0x0518
            r3 = 1
            if (r1 == r3) goto L_0x045a
            if (r1 != r5) goto L_0x0454
            v24 r0 = r18.a()
            y3a r0 = (defpackage.y3a) r0
            ygc r1 = r0.f()
            sgc r1 = r1.C()
            r1.getClass()
            ct0.i()
            ct0.i()
            ie0 r3 = r1.a
            java.util.ArrayDeque r4 = r3.a
            int r4 = r4.size()
            r5 = 1
            if (r4 <= r5) goto L_0x03cc
            java.util.ArrayDeque r3 = r3.a
            boolean r4 = r3 instanceof java.util.List
            if (r4 == 0) goto L_0x03ab
            java.util.List r3 = (java.util.List) r3
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x03a1
            goto L_0x03b5
        L_0x03a1:
            int r4 = r3.size()
            int r4 = r4 - r5
            java.lang.Object r3 = r3.get(r4)
            goto L_0x03c7
        L_0x03ab:
            java.util.Iterator r3 = r3.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L_0x03b7
        L_0x03b5:
            r3 = 0
            goto L_0x03c7
        L_0x03b7:
            java.lang.Object r4 = r3.next()
        L_0x03bb:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x03c6
            java.lang.Object r4 = r3.next()
            goto L_0x03bb
        L_0x03c6:
            r3 = r4
        L_0x03c7:
            vgc r3 = (defpackage.vgc) r3
            r1.E(r3)
        L_0x03cc:
            ygc r1 = r0.f()
            sgc r1 = r1.C()
            java.util.ArrayList r1 = r1.e()
            int r3 = r1.size()
            if (r3 <= 0) goto L_0x0450
            java.lang.Object r1 = defpackage.o23.V(r1)
            vgc r1 = (defpackage.vgc) r1
            rr3 r1 = r1.a
            boolean r3 = r1 instanceof one.me.main.MainScreen
            if (r3 == 0) goto L_0x03ed
            one.me.main.MainScreen r1 = (one.me.main.MainScreen) r1
            goto L_0x03ee
        L_0x03ed:
            r1 = 0
        L_0x03ee:
            if (r1 != 0) goto L_0x03f3
            r8 = r9
            goto L_0x0521
        L_0x03f3:
            ls7 r3 = r1.q0()
            java.util.List r3 = r3.c
            java.util.Iterator r3 = r3.iterator()
        L_0x03fd:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x041c
            java.lang.Object r4 = r3.next()
            r5 = r4
            m0a r5 = (defpackage.m0a) r5
            java.lang.String r5 = r5.d
            c34 r6 = r2.b
            android.net.Uri r6 = r6.a
            java.lang.String r6 = defpackage.k34.a(r6)
            boolean r5 = defpackage.hhd.f(r5, r6)
            if (r5 == 0) goto L_0x03fd
            r11 = r4
            goto L_0x041d
        L_0x041c:
            r11 = 0
        L_0x041d:
            m0a r11 = (defpackage.m0a) r11
            if (r11 != 0) goto L_0x0439
            java.lang.Class<one.me.main.MainScreen> r1 = one.me.main.MainScreen.class
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "invalid screen! "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            defpackage.udd.T(r1, r2, new java.lang.Object[0])
            goto L_0x043c
        L_0x0439:
            r1.r0(r11)
        L_0x043c:
            e3 r0 = r0.e
            if (r0 == 0) goto L_0x044d
            java.lang.Object r0 = r0.a
            t97 r0 = (defpackage.t97) r0
            java.lang.Object r0 = r0.getValue()
            pv3 r0 = (pv3) r0
            r0.getClass()
        L_0x044d:
            r8 = 1
            goto L_0x0521
        L_0x0450:
            r0.c(r2)
            goto L_0x044d
        L_0x0454:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x045a:
            v24 r0 = r18.a()
            y3a r0 = (defpackage.y3a) r0
            r0.getClass()
            int r1 = r2.d
            int r1 = defpackage.hr1.t(r1)
            if (r1 == 0) goto L_0x049c
            i34 r2 = r2.f
            r3 = 1
            if (r1 == r3) goto L_0x048c
            if (r1 != r5) goto L_0x0486
            java.lang.Object r1 = r2.a()
            e8 r1 = (e8) r1
            ygc r2 = r0.f()
            sgc r2 = r2.C()
            r1.a(r2)
            r1 = 1
            goto L_0x0505
        L_0x0486:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x048c:
            java.lang.Object r1 = r2.a()
            defpackage.hr1.r(r1)
            ygc r0 = r0.f()
            r0.C()
            r0 = 0
            throw r0
        L_0x049c:
            android.os.Bundle r1 = r2.c
            java.lang.String r3 = "no_anim"
            java.lang.Boolean r3 = x87.s0(r3, r1)
            if (r3 == 0) goto L_0x04ab
            boolean r3 = r3.booleanValue()
            goto L_0x04ac
        L_0x04ab:
            r3 = r9
        L_0x04ac:
            java.lang.String r4 = "replace_top"
            java.lang.Boolean r1 = x87.s0(r4, r1)
            if (r1 == 0) goto L_0x04b8
            boolean r9 = r1.booleanValue()
        L_0x04b8:
            r1 = 1
            r3 = r3 ^ r1
            vgc r2 = r0.d(r2, r3)
            boolean r3 = r0.b
            if (r3 == 0) goto L_0x04c8
            java.util.LinkedList r0 = r0.c
            r0.add(r2)
            goto L_0x0516
        L_0x04c8:
            rr3 r3 = r2.a
            one.me.sdk.arch.Widget r3 = (one.me.sdk.arch.Widget) r3
            boolean r3 = r3.isDialog()
            if (r3 == 0) goto L_0x04ec
            if (r9 == 0) goto L_0x04e0
            ygc r3 = r0.f()
            sgc r3 = r3.S()
            r3.L(r2)
            goto L_0x0505
        L_0x04e0:
            ygc r3 = r0.f()
            sgc r3 = r3.S()
            r3.G(r2)
            goto L_0x0505
        L_0x04ec:
            if (r9 == 0) goto L_0x04fa
            ygc r3 = r0.f()
            sgc r3 = r3.C()
            r3.L(r2)
            goto L_0x0505
        L_0x04fa:
            ygc r3 = r0.f()
            sgc r3 = r3.C()
            r3.G(r2)
        L_0x0505:
            e3 r0 = r0.e
            if (r0 == 0) goto L_0x0516
            java.lang.Object r0 = r0.a
            t97 r0 = (defpackage.t97) r0
            java.lang.Object r0 = r0.getValue()
            pv3 r0 = (pv3) r0
            r0.getClass()
        L_0x0516:
            r8 = r1
            goto L_0x0521
        L_0x0518:
            r1 = 1
            v24 r0 = r18.a()
            r0.c(r2)
            goto L_0x0516
        L_0x0521:
            return r8
        L_0x0522:
            one.me.deeplink.FailedCreateScreenException r7 = new one.me.deeplink.FailedCreateScreenException
            r8 = 0
            r0 = r7
            r1 = r19
            r2 = r6
            r5 = r20
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            throw r7
        L_0x0530:
            r0 = move-exception
            r7 = r0
            one.me.deeplink.FailedCreateScreenException r8 = new one.me.deeplink.FailedCreateScreenException
            r0 = r8
            r1 = r19
            r2 = r6
            r5 = r20
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            throw r8
        L_0x053f:
            one.me.deeplink.MissedRequiredQueryParamsException r0 = new one.me.deeplink.MissedRequiredQueryParamsException
            java.util.Set r2 = r3.c
            r0.<init>(r1, r4, r2)
            throw r0
        L_0x0547:
            one.me.deeplink.MissedDeeplinkFactoryException r0 = new one.me.deeplink.MissedDeeplinkFactoryException
            java.lang.String r1 = r19.toString()
            java.lang.String r2 = "Missed factory or route for uri="
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d34.c(android.net.Uri, android.os.Bundle):boolean");
    }

    public final boolean d() {
        vgc vgc;
        if (a().b() <= 1) {
            return false;
        }
        y3a y3a = (y3a) a();
        if (y3a.b) {
            LinkedList linkedList = y3a.c;
            if (!linkedList.isEmpty()) {
                linkedList.removeLast();
            }
            return true;
        } else if (y3a.b() <= 1 || (vgc = (vgc) o23.f0(y3a.f().C().e())) == null || vgc.a == null) {
            return false;
        } else {
            return y3a.f().C().C();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void e(s16 s16) {
        Object obj;
        this.g = true;
        ArrayList arrayList = this.f;
        arrayList.clear();
        try {
            s16.invoke();
            this.g = false;
            v24 a2 = a();
            List<j34> s0 = o23.s0(arrayList);
            y3a y3a = (y3a) a2;
            y3a.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (j34 d2 : s0) {
                try {
                    obj = y3a.d(d2, true);
                } catch (Throwable th) {
                    obj = new kcc(th);
                }
                if (obj instanceof kcc) {
                    obj = null;
                }
                vgc vgc = (vgc) obj;
                if (vgc != null) {
                    arrayList2.add(vgc);
                }
            }
            y3a.f().C().P(arrayList2, y3a.e());
            arrayList.clear();
        } catch (Throwable th2) {
            this.g = false;
            throw th2;
        }
    }
}
