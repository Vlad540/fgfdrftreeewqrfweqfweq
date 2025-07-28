package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: al5  reason: default package */
public final class al5 extends l5e implements k26 {
    public l7c X;
    public k7c Y;
    public int Z;
    public /* synthetic */ Object w0;
    public /* synthetic */ Object x0;
    public final /* synthetic */ u16 y0;
    public final /* synthetic */ pj5 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public al5(je2 je2, pj5 pj5, Continuation continuation) {
        super(3, continuation);
        this.y0 = je2;
        this.z0 = pj5;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        pj5 pj5 = this.z0;
        al5 al5 = new al5(this.y0, pj5, (Continuation) obj3);
        al5.w0 = (ou3) obj;
        al5.x0 = (rj5) obj2;
        return al5.o(jue.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: l7c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: l7c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: l7c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: l7c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: l7c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: l7c} */
    /* JADX WARNING: type inference failed for: r10v8, types: [k7c, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bb, code lost:
        throw new java.lang.IllegalArgumentException("Debounce timeout should not be negative".toString());
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0127 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L_0x003b
            if (r2 == r4) goto L_0x002a
            if (r2 != r5) goto L_0x0022
            l7c r2 = r0.X
            java.lang.Object r7 = r0.x0
            n1c r7 = (defpackage.n1c) r7
            java.lang.Object r8 = r0.w0
            rj5 r8 = (defpackage.rj5) r8
            defpackage.wx3.H(r20)
        L_0x001d:
            r9 = r8
            r8 = r7
            r7 = r2
            goto L_0x0128
        L_0x0022:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002a:
            k7c r2 = r0.Y
            l7c r7 = r0.X
            java.lang.Object r8 = r0.x0
            n1c r8 = (defpackage.n1c) r8
            java.lang.Object r9 = r0.w0
            rj5 r9 = (defpackage.rj5) r9
            defpackage.wx3.H(r20)
            goto L_0x00a9
        L_0x003b:
            defpackage.wx3.H(r20)
            java.lang.Object r2 = r0.w0
            ou3 r2 = (defpackage.ou3) r2
            java.lang.Object r7 = r0.x0
            rj5 r7 = (defpackage.rj5) r7
            zk5 r8 = new zk5
            pj5 r9 = r0.z0
            r8.<init>(r9, r6)
            bw4 r9 = defpackage.bw4.a
            ru3 r10 = defpackage.ru3.a
            r11 = 4
            us0 r11 = defpackage.xs7.a(r3, r4, r11)
            hu3 r2 = defpackage.xie.x(r2, r9)
            a5b r9 = new a5b
            r9.<init>(r2, r11)
            r9.start(r10, r9, r8)
            l7c r2 = new l7c
            r2.<init>()
            r8 = r9
            r9 = r7
            r7 = r2
        L_0x006a:
            java.lang.Object r2 = r7.a
            kotlinx.coroutines.internal.Symbol r10 = defpackage.wr9.c
            if (r2 == r10) goto L_0x012b
            k7c r10 = new k7c
            r10.<init>()
            if (r2 == 0) goto L_0x00ac
            kotlinx.coroutines.internal.Symbol r11 = defpackage.wr9.a
            if (r2 != r11) goto L_0x007c
            r2 = r6
        L_0x007c:
            u16 r12 = r0.y0
            java.lang.Object r2 = r12.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            long r12 = r2.longValue()
            r10.a = r12
            r14 = 0
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x00b0
            if (r2 != 0) goto L_0x00ac
            java.lang.Object r2 = r7.a
            if (r2 != r11) goto L_0x0097
            r2 = r6
        L_0x0097:
            r0.w0 = r9
            r0.x0 = r8
            r0.X = r7
            r0.Y = r10
            r0.Z = r4
            java.lang.Object r2 = r9.a(r2, r0)
            if (r2 != r1) goto L_0x00a8
            return r1
        L_0x00a8:
            r2 = r10
        L_0x00a9:
            r7.a = r6
            r10 = r2
        L_0x00ac:
            r2 = r7
            r7 = r8
            r8 = r9
            goto L_0x00bc
        L_0x00b0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Debounce timeout should not be negative"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00bc:
            yvc r9 = new yvc
            hu3 r11 = r0.b
            r9.<init>(r11)
            java.lang.Object r11 = r2.a
            if (r11 == 0) goto L_0x00d2
            long r10 = r10.a
            k14 r12 = new k14
            r13 = 1
            r12.<init>(r8, r2, r6, r13)
            defpackage.kjd.F(r9, r10, r12)
        L_0x00d2:
            vvc r10 = r7.b()
            xk5 r15 = new xk5
            r15.<init>(r2, r8, r6)
            wvc r14 = new wvc
            b0d r10 = (defpackage.b0d) r10
            java.lang.Object r13 = r10.b
            java.lang.Object r11 = r10.o
            r16 = r11
            k26 r16 = (defpackage.k26) r16
            r17 = 0
            java.lang.Object r11 = r10.c
            r18 = r11
            k26 r18 = (defpackage.k26) r18
            java.lang.Object r10 = r10.X
            k26 r10 = (defpackage.k26) r10
            r11 = r14
            r12 = r9
            r4 = r14
            r14 = r18
            r18 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r9.f(r4, r3)
            r0.w0 = r8
            r0.x0 = r7
            r0.X = r2
            r0.Y = r6
            r0.Z = r5
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = defpackage.yvc.Y
            java.lang.Object r4 = r4.get(r9)
            boolean r4 = r4 instanceof defpackage.wvc
            if (r4 == 0) goto L_0x0121
            java.lang.Object r4 = r9.c(r0)
            goto L_0x0125
        L_0x0121:
            java.lang.Object r4 = r9.d(r0)
        L_0x0125:
            if (r4 != r1) goto L_0x001d
            return r1
        L_0x0128:
            r4 = 1
            goto L_0x006a
        L_0x012b:
            jue r0 = defpackage.jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al5.o(java.lang.Object):java.lang.Object");
    }
}
