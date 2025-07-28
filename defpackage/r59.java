package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: r59  reason: default package */
public final class r59 implements pp7 {
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final ku3 a;
    public final t97 b;
    public final t97 c;
    public final t97 o;
    public final tc9 w0 = uc9.a();
    public final bs x0 = new bs(0);
    public final dn7 y0;

    public r59(t97 t97, t97 t972, ku3 ku3, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977) {
        this.a = ku3;
        this.b = t972;
        this.c = t973;
        this.o = t974;
        this.X = t975;
        this.Y = t976;
        this.Z = t977;
        this.y0 = new dn7(t97);
        ((yk9) t977.getValue()).c.d = new e59(this, (Continuation) null);
    }

    public static void e(ym8 ym8, zb9 zb9, zb9 zb92, int i, boolean z) {
        ym8 ym82;
        zb9.a(ym8.o);
        zy zyVar = ym8.w0;
        if (!zyVar.isEmpty()) {
            Iterator it = zyVar.iterator();
            while (it.hasNext()) {
                fy fyVar = (fy) it.next();
                e00 e00 = fyVar.a;
                int i2 = e00 == null ? -1 : f59.$EnumSwitchMapping$0[e00.ordinal()];
                if (i2 == 1) {
                    gr3 gr3 = (gr3) fyVar;
                    Long l = gr3.X;
                    if (l != null) {
                        zb9.a(l.longValue());
                    }
                    List<Long> list = gr3.Y;
                    if (list != null) {
                        for (Long l2 : list) {
                            if (l2 != null) {
                                zb9.a(l2.longValue());
                            }
                        }
                    }
                } else if (i2 == 2) {
                    List<Long> list2 = ((oz0) fyVar).x0;
                    if (list2 != null) {
                        for (Long longValue : list2) {
                            zb9.a(longValue.longValue());
                        }
                    }
                } else if (i2 == 3) {
                    zb9.a(((yf3) fyVar).X);
                }
            }
        }
        rq8 rq8 = ym8.x0;
        if (rq8 != null && (ym82 = rq8.c) != null && i > 0) {
            if (z) {
                e(ym82, zb92, zb92, i - 1, true);
            } else {
                e(ym82, zb9, zb92, i - 1, true);
            }
        }
    }

    public static void f(vo8 vo8, zb9 zb9, zb9 zb92, int i, boolean z) {
        List<Number> list;
        q00 q00;
        zb9.a(vo8.Y);
        jj7 jj7 = vo8.D0;
        if (jj7 != null) {
            int v = jj7.v();
            for (int i2 = 0; i2 < v; i2++) {
                o10 u = jj7.u(i2);
                if (u != null) {
                    j10 j10 = u.a;
                    int i3 = j10 == null ? -1 : f59.$EnumSwitchMapping$1[j10.ordinal()];
                    if (i3 == 1) {
                        t00 t00 = u.c;
                        if (t00 != null) {
                            zb9.a(t00.b);
                            Iterator it = t00.c.iterator();
                            while (it.hasNext()) {
                                zb9.a(((Number) it.next()).longValue());
                            }
                        }
                    } else if (i3 == 2) {
                        o00 o00 = u.i;
                        if (!(o00 == null || (list = o00.f) == null)) {
                            for (Number longValue : list) {
                                zb9.a(longValue.longValue());
                            }
                        }
                    } else if (i3 == 3 && (q00 = u.k) != null) {
                        zb9.a(q00.b);
                    }
                }
            }
        }
        vo8 vo82 = vo8.G0;
        if (vo82 == null || i <= 0) {
            return;
        }
        if (z) {
            f(vo82, zb92, zb92, i - 1, true);
        } else {
            f(vo82, zb9, zb92, i - 1, true);
        }
    }

    public final void a() {
    }

    public final List b(zb9 zb9) {
        zb9 zb92 = zb9;
        boolean i = i();
        hw4 hw4 = hw4.a;
        if (i && !zb9.i()) {
            zb9 zb93 = new zb9((Object) null);
            long[] jArr = zb92.b;
            long[] jArr2 = zb92.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr2[i2];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                long j2 = jArr[(i2 << 3) + i5];
                                if (!((Boolean) this.y0.invoke(Long.valueOf(j2))).booleanValue()) {
                                    zb93.a(j2);
                                }
                                i3 = 8;
                            }
                            j >>= i3;
                        }
                        if (i4 != i3) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            zb92.m(zb93);
            if (i() && !zb9.i()) {
                return lp.U(zb9);
            }
        }
        return hw4;
    }

    public final void c(zb9 zb9, j22 j22, zb9 zb92) {
        boolean z = j22.b1 == 2;
        for (Long longValue : j22.o.keySet()) {
            long longValue2 = longValue.longValue();
            if (z) {
                zb9.a(longValue2);
            } else {
                zb92.a(longValue2);
            }
        }
        Map map = j22.Q0;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                zb92.a(((Long) entry.getKey()).longValue());
                zb92.a(((ga) entry.getValue()).c);
            }
        }
        ym8 ym8 = j22.x0;
        if (ym8 != null) {
            e(ym8, zb9, zb92, 5, false);
        }
        ym8 ym82 = j22.L0;
        if (ym82 != null) {
            e(ym82, zb9, zb92, 5, false);
        }
        zb92.a(j22.c);
    }

    public final zb9 d(List list, zb9 zb9) {
        zb9 zb92 = new zb9(list.size());
        if (list.isEmpty()) {
            return zb92;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c(zb92, (j22) it.next(), zb9);
        }
        return zb92;
    }

    public final void g(List list, zb9 zb9, zb9 zb92) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e((ym8) it.next(), zb9, zb92, 5, false);
            }
        }
    }

    public final yk9 h() {
        return (yk9) this.Z.getValue();
    }

    public final boolean i() {
        return !(((h3d) ((f3d) ((ad3) this.Y.getValue()).d.getValue())).h == 1);
    }

    public final Object j(long j, List list, Continuation continuation) {
        return n1g.f(new j59(list, this, j, (Continuation) null), continuation);
    }

    public final void k(j22 j22) {
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, "MissedContactsController", "requestForChat: chat=" + j22, (Throwable) null);
        }
        zb9 zb9 = new zb9((Object) null);
        zb9 d = d(Collections.singletonList(j22), zb9);
        h().c(zb9);
        if (!d.i()) {
            List b2 = b(d);
            if (!b2.isEmpty()) {
                xs7.N(new k59(this, b2, (Continuation) null));
            }
        }
    }

    public final Object l(f92 f92, long j, Continuation continuation) {
        Object j2;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            j22 j22 = f92.o;
            Long l = j22 != null ? new Long(j22.a) : null;
            fn6.d(tn7, "MissedContactsController", "requestForChatHistory: response=" + l, (Throwable) null);
        }
        zb9 zb9 = new zb9((Object) null);
        zb9 zb92 = new zb9((Object) null);
        g(f92.c, zb9, zb92);
        j22 j222 = f92.o;
        if (j222 != null) {
            c(zb9, j222, zb92);
        }
        h().c(zb92);
        List b2 = b(zb9);
        boolean isEmpty = b2.isEmpty();
        jue jue = jue.a;
        return (!isEmpty && (j2 = j(j, b2, continuation)) == pu3.a) ? j2 : jue;
    }

    public final void m(n92 n92) {
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, "MissedContactsController", "requestForChatInfo: response=" + n92, (Throwable) null);
        }
        zb9 zb9 = new zb9((Object) null);
        zb9 d = d(n92.c, zb9);
        j22 j22 = n92.o;
        if (j22 != null) {
            c(d, j22, zb9);
        }
        h().c(zb9);
        if (!d.i()) {
            List b2 = b(d);
            if (!b2.isEmpty()) {
                xs7.N(new l59(this, b2, (Continuation) null));
            }
        }
    }

    public final void n(List list) {
        if (list != null && !list.isEmpty()) {
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, "MissedContactsController", "requestForChats: chats=".concat(o23.c0(list, (String) null, (String) null, (String) null, (u16) null, 63)), (Throwable) null);
            }
            zb9 zb9 = new zb9((Object) null);
            zb9 d = d(list, zb9);
            h().c(zb9);
            if (!d.i()) {
                List b2 = b(d);
                if (!b2.isEmpty()) {
                    xs7.N(new m59(this, b2, (Continuation) null));
                }
            }
        }
    }

    public final Object o(i22 i22, Continuation continuation) {
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, "MissedContactsController", "requestForChat: chat=" + i22, (Throwable) null);
        }
        zb9 zb9 = new zb9((Object) null);
        zb9 zb92 = new zb9((Object) null);
        boolean J = i22.J();
        for (Long longValue : i22.b.e.keySet()) {
            long longValue2 = longValue.longValue();
            if (J) {
                zb92.a(longValue2);
            } else {
                zb9.a(longValue2);
            }
        }
        Map map = i22.b.R;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                zb9.a(((Long) entry.getKey()).longValue());
                zb9.a(((x52) entry.getValue()).c);
            }
        }
        xm8 xm8 = i22.c;
        if (xm8 != null) {
            f(xm8.a, zb92, zb9, 5, false);
        }
        xm8 xm82 = i22.X;
        if (xm82 != null) {
            f(xm82.a, zb92, zb9, 5, false);
        }
        zb9.a(i22.b.d);
        h().c(zb9);
        boolean i = zb92.i();
        jue jue = jue.a;
        if (i) {
            return jue;
        }
        List b2 = b(zb92);
        if (b2.isEmpty()) {
            return jue;
        }
        int i2 = zp4.o;
        Object j = j(mt0.P(10, eq4.o), b2, continuation);
        return j == pu3.a ? j : jue;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p(defpackage.jo7 r8, long r9, kotlin.coroutines.Continuation r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.n59
            if (r0 == 0) goto L_0x0013
            r0 = r11
            n59 r0 = (defpackage.n59) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            n59 r0 = new n59
            r0.<init>(r7, r11)
        L_0x0018:
            java.lang.Object r11 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            zb9 r7 = r0.X
            r59 r8 = r0.o
            wx3.H(r11)
            r2 = r7
            r7 = r8
            goto L_0x00b4
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            wx3.H(r11)
            java.lang.String r11 = "requestForLogin"
            java.lang.String r2 = "MissedContactsController"
            udd.q(r2, r11)
            java.util.ArrayList r11 = r8.c()
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = q23.H(r11, r4)
            r2.<init>(r4)
            java.util.Iterator r11 = r11.iterator()
        L_0x0053:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x006a
            java.lang.Object r4 = r11.next()
            uj3 r4 = (defpackage.uj3) r4
            long r4 = r4.a
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            r2.add(r6)
            goto L_0x0053
        L_0x006a:
            zb9 r11 = lp.V(r2)
            zb9 r2 = new zb9
            r4 = 0
            r2.<init>(r4)
            java.util.List r4 = r8.o
            zb9 r4 = r7.d(r4, r2)
            java.util.Map r5 = r8.y0
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        L_0x0084:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0094
            java.lang.Object r6 = r5.next()
            java.util.List r6 = (java.util.List) r6
            r7.g(r6, r4, r2)
            goto L_0x0084
        L_0x0094:
            r4.m(r11)
            uj3 r8 = r8.c
            if (r8 == 0) goto L_0x00a0
            long r5 = r8.a
            r4.l(r5)
        L_0x00a0:
            r2.m(r11)
            java.util.List r8 = r7.b(r4)
            r0.o = r7
            r0.X = r2
            r0.w0 = r3
            java.lang.Object r8 = r7.j(r9, r8, r0)
            if (r8 != r1) goto L_0x00b4
            return r1
        L_0x00b4:
            yk9 r7 = r7.h()
            r7.c(r2)
            jue r7 = jue.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r59.p(jo7, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void q(cm9 cm9) {
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, "MissedContactsController", "requestForNotifMessage: response=" + cm9, (Throwable) null);
        }
        zb9 zb9 = new zb9((Object) null);
        zb9 zb92 = new zb9((Object) null);
        e(cm9.X, zb9, zb92, 5, false);
        j22 j22 = cm9.o;
        if (j22 != null) {
            c(zb9, j22, zb92);
        }
        h().c(zb92);
        if (!zb9.i()) {
            List b2 = b(zb9);
            if (!b2.isEmpty()) {
                xs7.N(new o59(this, b2, (Continuation) null));
            }
        }
    }

    public final void r(tm9 tm9) {
        long j = tm9.o;
        zb9 zb9 = tq7.a;
        zb9 zb92 = new zb9(1);
        zb92.b[zb92.e(j)] = j;
        List b2 = b(zb92);
        if (!b2.isEmpty()) {
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                tn7 tn7 = tn7.X;
                Object V = o23.V(b2);
                fn6.d(tn7, "MissedContactsController", "requestForTyping: id=#" + V, (Throwable) null);
            }
            h().d(b2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        r5 = j(r8, r6, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(long r6, long r8, kotlin.coroutines.Continuation r10) {
        /*
            r5 = this;
            fn6 r0 = udd.e
            if (r0 != 0) goto L_0x0005
            goto L_0x0019
        L_0x0005:
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x0019
            tn7 r1 = defpackage.tn7.X
            java.lang.String r2 = "requestForUser: id=#"
            java.lang.String r2 = defpackage.us8.i(r6, r2)
            r3 = 0
            java.lang.String r4 = "MissedContactsController"
            r0.d(r1, r4, r2, r3)
        L_0x0019:
            zb9 r0 = tq7.a
            zb9 r0 = new zb9
            r1 = 1
            r0.<init>(r1)
            int r1 = r0.e(r6)
            long[] r2 = r0.b
            r2[r1] = r6
            java.util.List r6 = r5.b(r0)
            boolean r7 = r6.isEmpty()
            jue r0 = jue.a
            if (r7 == 0) goto L_0x0036
            return r0
        L_0x0036:
            java.lang.Object r5 = r5.j(r8, r6, r10)
            pu3 r6 = pu3.a
            if (r5 != r6) goto L_0x003f
            return r5
        L_0x003f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r59.s(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object t(zb9 zb9, long j, Continuation continuation) {
        List b2 = b(zb9);
        boolean isEmpty = b2.isEmpty();
        jue jue = jue.a;
        if (isEmpty) {
            return jue;
        }
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, "MissedContactsController", wn6.i("requestForUsers: ids=[", o23.c0(b2, (String) null, (String) null, (String) null, (u16) null, 63), "]"), (Throwable) null);
        }
        Object j2 = j(j, b2, continuation);
        return j2 == pu3.a ? j2 : jue;
    }

    public final void u(s2f s2f) {
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, "MissedContactsController", "requestForVideoConference: videoConference=" + s2f, (Throwable) null);
        }
        uj3 uj3 = s2f.a;
        if (uj3 != null) {
            h().b(uj3.a);
        }
    }
}
