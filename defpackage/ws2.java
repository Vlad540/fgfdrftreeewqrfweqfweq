package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ws2  reason: default package */
public final class ws2 extends l5e implements i26 {
    public is2 X;
    public long Y;
    public int Z;
    public /* synthetic */ Object w0;
    public final /* synthetic */ bt2 x0;
    public final /* synthetic */ String y0;
    public final /* synthetic */ List z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ws2(bt2 bt2, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.x0 = bt2;
        this.y0 = str;
        this.z0 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ws2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ws2 ws2 = new ws2(this.x0, this.y0, this.z0, continuation);
        ws2.w0 = obj;
        return ws2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: ou3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Z
            jue r3 = defpackage.jue.a
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0027
            if (r2 != r5) goto L_0x001f
            long r1 = r0.Y
            is2 r6 = r0.X
            java.lang.Object r7 = r0.w0
            ou3 r7 = (defpackage.ou3) r7
            defpackage.wx3.H(r17)
            r8 = r1
            r11 = r6
            r2 = r17
            goto L_0x00a2
        L_0x001f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0027:
            defpackage.wx3.H(r17)
            java.lang.Object r2 = r0.w0
            r7 = r2
            ou3 r7 = (defpackage.ou3) r7
            bt2 r2 = r0.x0
            grd r2 = r2.I0
            java.lang.Object r2 = r2.getValue()
            js2 r2 = (defpackage.js2) r2
            java.lang.String r2 = r2.b
            java.lang.String r6 = r0.y0
            boolean r2 = defpackage.hhd.f(r2, r6)
            if (r2 != 0) goto L_0x0044
            return r3
        L_0x0044:
            java.util.List r2 = r0.z0
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x0051
            is2 r2 = defpackage.is2.o
        L_0x004f:
            r6 = r2
            goto L_0x0054
        L_0x0051:
            is2 r2 = defpackage.is2.X
            goto L_0x004f
        L_0x0054:
            long r8 = java.lang.System.nanoTime()
            bt2 r2 = r0.x0
            java.lang.String r2 = r2.N0
            java.lang.String r10 = "chats search: start UI mapping"
            defpackage.udd.H(r2, r10, r4)
            java.util.List r2 = r0.z0
            bt2 r10 = r0.x0
            hu3 r11 = r0.b
            kotlinx.coroutines.internal.ContextScope r11 = defpackage.n1g.a(r11)
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = defpackage.q23.H(r2, r13)
            r12.<init>(r13)
            java.util.Iterator r2 = r2.iterator()
        L_0x007a:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto L_0x0092
            java.lang.Object r13 = r2.next()
            vs2 r14 = new vs2
            r14.<init>(r13, r4, r10)
            r13 = 3
            zc4 r13 = defpackage.xs7.d(r11, r4, r14, r13)
            r12.add(r13)
            goto L_0x007a
        L_0x0092:
            r0.w0 = r7
            r0.X = r6
            r0.Y = r8
            r0.Z = r5
            java.lang.Object r2 = defpackage.lp.c(r12, r0)
            if (r2 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            r11 = r6
        L_0x00a2:
            java.util.List r2 = (java.util.List) r2
            bt2 r1 = r0.x0
            java.lang.String r1 = r1.N0
            fn6 r6 = defpackage.udd.e
            if (r6 != 0) goto L_0x00ad
            goto L_0x00cf
        L_0x00ad:
            boolean r10 = r6.c()
            if (r10 == 0) goto L_0x00cf
            tn7 r10 = tn7.Y
            int r12 = defpackage.zp4.o
            long r12 = java.lang.System.nanoTime()
            long r12 = r12 - r8
            eq4 r8 = defpackage.eq4.NANOSECONDS
            long r8 = defpackage.mt0.Q(r12, r8)
            java.lang.String r8 = defpackage.zp4.j(r8)
            java.lang.String r9 = "chats search: UI mapping finish: "
            java.lang.String r8 = r9.concat(r8)
            r6.d(r10, r1, r8, r4)
        L_0x00cf:
            bt2 r1 = r0.x0
            grd r1 = r1.I0
            java.lang.Object r1 = r1.getValue()
            js2 r1 = (defpackage.js2) r1
            java.lang.String r1 = r1.b
            java.lang.String r6 = r0.y0
            boolean r1 = defpackage.hhd.f(r1, r6)
            if (r1 != 0) goto L_0x00e4
            return r3
        L_0x00e4:
            bt2 r1 = r0.x0
            java.lang.String r1 = r1.N0
            java.lang.String r6 = "chats search: update_search_state"
            defpackage.udd.H(r1, r6, r4)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r1 = r2.size()
            r13.<init>(r1)
            zb9 r1 = new zb9
            r1.<init>((java.lang.Object) r4)
            zb9 r6 = new zb9
            r6.<init>((java.lang.Object) r4)
            zb9 r8 = new zb9
            r8.<init>((java.lang.Object) r4)
            java.util.Iterator r9 = r2.iterator()
        L_0x0109:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x016b
            java.lang.Object r10 = r9.next()
            nrc r10 = (defpackage.nrc) r10
            boolean r12 = defpackage.n1g.A(r7)
            if (r12 == 0) goto L_0x016b
            boolean r12 = r10 instanceof defpackage.rn2
            if (r12 == 0) goto L_0x0133
            r12 = r10
            rn2 r12 = (defpackage.rn2) r12
            long r14 = r12.c
            boolean r14 = r1.d(r14)
            if (r14 != 0) goto L_0x0133
            long r14 = r12.c
            r1.a(r14)
            r13.add(r10)
            goto L_0x0109
        L_0x0133:
            boolean r12 = r10 instanceof defpackage.fn3
            if (r12 == 0) goto L_0x014b
            r12 = r10
            fn3 r12 = (defpackage.fn3) r12
            long r14 = r12.c
            boolean r14 = r6.d(r14)
            if (r14 != 0) goto L_0x014b
            long r14 = r12.c
            r6.a(r14)
            r13.add(r10)
            goto L_0x0109
        L_0x014b:
            boolean r12 = r10 instanceof defpackage.cs8
            if (r12 == 0) goto L_0x0167
            r12 = r10
            cs8 r12 = (defpackage.cs8) r12
            ym8 r14 = r12.X
            long r14 = r14.a
            boolean r14 = r8.d(r14)
            if (r14 != 0) goto L_0x0167
            ym8 r12 = r12.X
            long r14 = r12.a
            r8.a(r14)
            r13.add(r10)
            goto L_0x0109
        L_0x0167:
            r13.add(r10)
            goto L_0x0109
        L_0x016b:
            boolean r1 = defpackage.n1g.A(r7)
            if (r1 == 0) goto L_0x01fb
            bt2 r1 = r0.x0
            grd r1 = r1.I0
            java.lang.Object r1 = r1.getValue()
            js2 r1 = (defpackage.js2) r1
            java.lang.String r1 = r1.b
            java.lang.String r6 = r0.y0
            boolean r1 = defpackage.hhd.f(r1, r6)
            if (r1 != 0) goto L_0x0187
            goto L_0x01fb
        L_0x0187:
            int r1 = r13.size()
            int r6 = r2.size()
            if (r1 == r6) goto L_0x01d2
            ru.ok.tamtam.search.DuplicateDetectException r1 = new ru.ok.tamtam.search.DuplicateDetectException
            int r2 = r2.size()
            int r6 = r13.size()
            int r2 = r2 - r6
            java.lang.String r6 = "diff="
            java.lang.String r2 = wn6.h(r2, r6)
            r1.<init>(r2)
            bt2 r2 = r0.x0
            t97 r2 = r2.H0
            java.lang.Object r2 = r2.getValue()
            pv3 r2 = (pv3) r2
            java.lang.String r6 = "ONEME-15837"
            r2.a(r6, r1)
            bt2 r2 = r0.x0
            java.lang.String r2 = r2.N0
            fn6 r6 = defpackage.udd.e
            if (r6 != 0) goto L_0x01bd
            goto L_0x01d2
        L_0x01bd:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x01d2
            tn7 r7 = tn7.Z
            java.lang.String r1 = r1.getMessage()
            java.lang.String r8 = "found duplicates for ONEME-15837! "
            java.lang.String r1 = rf0.h(r8, r1)
            r6.d(r7, r2, r1, r4)
        L_0x01d2:
            bt2 r1 = r0.x0
            grd r1 = r1.I0
            java.lang.Object r2 = r1.getValue()
            r10 = r2
            js2 r10 = (defpackage.js2) r10
            dp6 r12 = defpackage.dp6.d
            bt2 r0 = r0.x0
            grd r0 = r0.I0
            java.lang.Object r0 = r0.getValue()
            js2 r0 = (defpackage.js2) r0
            is2 r0 = r0.a
            is2 r2 = defpackage.is2.b
            if (r0 == r2) goto L_0x01f1
        L_0x01ef:
            r14 = r5
            goto L_0x01f3
        L_0x01f1:
            r5 = 0
            goto L_0x01ef
        L_0x01f3:
            r15 = 2
            js2 r0 = defpackage.js2.a(r10, r11, r12, r13, r14, r15)
            r1.m(r4, r0)
        L_0x01fb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws2.o(java.lang.Object):java.lang.Object");
    }
}
