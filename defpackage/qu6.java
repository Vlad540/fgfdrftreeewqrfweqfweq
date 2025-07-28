package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qu6  reason: default package */
public final class qu6 extends l5e implements i26 {
    public int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ o46 w0;
    public final /* synthetic */ int x0;
    public final /* synthetic */ bv6 y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qu6(o46 o46, int i, bv6 bv6, Continuation continuation) {
        super(2, continuation);
        this.w0 = o46;
        this.x0 = i;
        this.y0 = bv6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qu6 qu6 = new qu6(this.w0, this.x0, this.y0, continuation);
        qu6.Z = obj;
        return qu6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0190  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.String r1 = "getItems for album "
            pu3 r2 = pu3.a
            int r3 = r0.Y
            bv6 r12 = r0.y0
            r4 = 2
            java.lang.String r13 = ", limit = "
            int r14 = r0.x0
            r15 = 1
            o46 r11 = r0.w0
            if (r3 == 0) goto L_0x003b
            if (r3 == r15) goto L_0x0033
            if (r3 != r4) goto L_0x002b
            int r1 = r0.X
            java.lang.Object r0 = r0.Z
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            wx3.H(r20)     // Catch:{ all -> 0x0027 }
            r0 = r20
            r3 = r11
            goto L_0x00f5
        L_0x0027:
            r0 = move-exception
            r3 = r11
            goto L_0x0107
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0033:
            java.lang.Object r3 = r0.Z
            ou3 r3 = (ou3) r3
            wx3.H(r20)
            goto L_0x0079
        L_0x003b:
            wx3.H(r20)
            java.lang.Object r3 = r0.Z
            ou3 r3 = (ou3) r3
            java.lang.String r5 = defpackage.bv6.I0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "start loadMoreItems: "
            r6.<init>(r7)
            r6.append(r11)
            r6.append(r13)
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            udd.q(r5, r6)
            qod r6 = r12.G0
            if (r6 == 0) goto L_0x006a
            boolean r6 = r6.isActive()
            if (r6 != r15) goto L_0x006a
            java.lang.String r6 = "waiting for contentChangedJob"
            udd.q(r5, r6)
        L_0x006a:
            qod r5 = r12.G0
            if (r5 == 0) goto L_0x0079
            r0.Z = r3
            r0.Y = r15
            java.lang.Object r3 = r5.join(r0)
            if (r3 != r2) goto L_0x0079
            return r2
        L_0x0079:
            java.util.concurrent.ConcurrentHashMap r3 = r12.E0
            n46 r5 = r11.a
            java.lang.Object r6 = r3.get(r5)
            hw4 r7 = hw4.a
            if (r6 != 0) goto L_0x008e
            java.lang.Object r3 = r3.putIfAbsent(r5, r7)
            if (r3 != 0) goto L_0x008d
            r6 = r7
            goto L_0x008e
        L_0x008d:
            r6 = r3
        L_0x008e:
            r3 = r6
            java.util.List r3 = (java.util.List) r3
            boolean r5 = r12.b(r11)
            if (r5 != 0) goto L_0x009d
            el7 r0 = new el7
            r0.<init>(r7)
            return r0
        L_0x009d:
            int r10 = r3.size()
            int r8 = r0.x0
            dde r6 = new dde     // Catch:{ all -> 0x0100 }
            java.lang.String r5 = defpackage.bv6.I0     // Catch:{ all -> 0x0100 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0100 }
            r5.<init>(r1)     // Catch:{ all -> 0x0100 }
            r5.append(r11)     // Catch:{ all -> 0x0100 }
            r5.append(r13)     // Catch:{ all -> 0x0100 }
            r5.append(r8)     // Catch:{ all -> 0x0100 }
            java.lang.String r1 = ", offset = "
            r5.append(r1)     // Catch:{ all -> 0x0100 }
            r5.append(r10)     // Catch:{ all -> 0x0100 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0100 }
            r6.<init>(r1)     // Catch:{ all -> 0x0100 }
            n46 r5 = r11.a     // Catch:{ all -> 0x0100 }
            r0.Z = r3     // Catch:{ all -> 0x0100 }
            r0.X = r10     // Catch:{ all -> 0x0100 }
            r0.Y = r4     // Catch:{ all -> 0x0100 }
            pae r1 = r12.c     // Catch:{ all -> 0x0100 }
            n3a r1 = (n3a) r1     // Catch:{ all -> 0x0100 }
            ju3 r1 = r1.b()     // Catch:{ all -> 0x0100 }
            ku6 r9 = new ku6     // Catch:{ all -> 0x0100 }
            r16 = 0
            r17 = 1
            r4 = r9
            r7 = r12
            r15 = r9
            r9 = r10
            r18 = r10
            r10 = r17
            r20 = r3
            r3 = r11
            r11 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00fa }
            java.lang.Object r0 = xs7.U(r1, r15, r0)     // Catch:{ all -> 0x00fa }
            if (r0 != r2) goto L_0x00f1
            return r2
        L_0x00f1:
            r2 = r20
            r1 = r18
        L_0x00f5:
            cu6 r0 = (defpackage.cu6) r0     // Catch:{ all -> 0x00f8 }
            goto L_0x010d
        L_0x00f8:
            r0 = move-exception
            goto L_0x0107
        L_0x00fa:
            r0 = move-exception
        L_0x00fb:
            r2 = r20
            r1 = r18
            goto L_0x0107
        L_0x0100:
            r0 = move-exception
            r20 = r3
            r18 = r10
            r3 = r11
            goto L_0x00fb
        L_0x0107:
            kcc r4 = new kcc
            r4.<init>(r0)
            r0 = r4
        L_0x010d:
            java.lang.Throwable r4 = mcc.a(r0)
            if (r4 != 0) goto L_0x0190
            cu6 r0 = (defpackage.cu6) r0
            java.util.List r4 = r0.a
            int r4 = r4.size()
            java.util.List r0 = r0.a
            if (r4 >= r14) goto L_0x0127
            if (r1 != 0) goto L_0x0127
            int r1 = r0.size()
            r3.b = r1
        L_0x0127:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0133
            int r1 = r2.size()
            r3.b = r1
        L_0x0133:
            r1 = 1
            r3.c = r1
            java.util.ArrayList r1 = o23.i0(r2, r0)
            java.util.concurrent.ConcurrentHashMap r2 = r12.E0
            n46 r4 = r3.a
            r2.put(r4, r1)
            java.util.concurrent.ConcurrentHashMap r1 = r12.F0
            boolean r2 = r1.containsKey(r4)
            if (r2 != 0) goto L_0x0154
            java.lang.Object r2 = o23.X(r0)
            yk7 r2 = (defpackage.yk7) r2
            if (r2 == 0) goto L_0x0154
            r1.put(r4, r2)
        L_0x0154:
            java.lang.String r1 = defpackage.bv6.I0
            java.util.concurrent.ConcurrentHashMap r2 = r12.E0
            java.lang.Object r2 = r2.get(r4)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x016a
            int r2 = r2.size()
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r2)
            goto L_0x016b
        L_0x016a:
            r4 = 0
        L_0x016b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "finish loadMoreItems: "
            r2.<init>(r5)
            r2.append(r3)
            r2.append(r13)
            r2.append(r14)
            java.lang.String r3 = ", current size = "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            udd.q(r1, r2)
            el7 r1 = new el7
            r1.<init>(r0)
            return r1
        L_0x0190:
            dl7 r0 = new dl7
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu6.o(java.lang.Object):java.lang.Object");
    }
}
