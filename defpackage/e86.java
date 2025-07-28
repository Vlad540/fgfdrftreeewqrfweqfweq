package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: e86  reason: default package */
public final class e86 extends l5e implements i26 {
    public zc4 X;
    public boolean Y;
    public int Z;
    public /* synthetic */ Object w0;
    public final /* synthetic */ jv5 x0;
    public final /* synthetic */ g86 y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e86(jv5 jv5, g86 g86, Continuation continuation) {
        super(2, continuation);
        this.x0 = jv5;
        this.y0 = g86;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        e86 e86 = new e86(this.x0, this.y0, continuation);
        e86.w0 = obj;
        return e86;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x014c A[LOOP:3: B:48:0x0146->B:50:0x014c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0178 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 0
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            r8 = 10
            hu3 r9 = r0.b
            if (r2 == 0) goto L_0x0049
            if (r2 == r7) goto L_0x003e
            if (r2 == r6) goto L_0x0037
            if (r2 == r4) goto L_0x0028
            if (r2 != r5) goto L_0x0020
            wx3.H(r19)
            r0 = r19
            goto L_0x0179
        L_0x0020:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0028:
            boolean r2 = r0.Y
            zc4 r6 = r0.X
            java.lang.Object r7 = r0.w0
            z63 r7 = (z63) r7
            wx3.H(r19)
            r10 = r19
            goto L_0x0128
        L_0x0037:
            wx3.H(r19)
            r0 = r19
            goto L_0x00df
        L_0x003e:
            java.lang.Object r2 = r0.w0
            java.lang.Long r2 = (java.lang.Long) r2
            wx3.H(r19)
            r12 = r2
            r2 = r19
            goto L_0x009f
        L_0x0049:
            wx3.H(r19)
            java.lang.Object r2 = r0.w0
            ou3 r2 = (ou3) r2
            jv5 r10 = r0.x0
            if (r10 == 0) goto L_0x017c
            java.util.Set r11 = r10.a
            if (r11 == 0) goto L_0x017c
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x0060
            goto L_0x017c
        L_0x0060:
            boolean r12 = r10.c
            if (r12 == 0) goto L_0x0067
            java.lang.Long r12 = r10.b
            goto L_0x0068
        L_0x0067:
            r12 = r3
        L_0x0068:
            g86 r13 = r0.y0
            if (r12 == 0) goto L_0x00e2
            kotlinx.coroutines.internal.ContextScope r2 = n1g.a(r9)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r10 = q23.H(r11, r8)
            r5.<init>(r10)
            java.util.Iterator r10 = r11.iterator()
        L_0x007d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0094
            java.lang.Object r11 = r10.next()
            z76 r14 = new z76
            r14.<init>(r11, r3, r13)
            zc4 r11 = xs7.d(r2, r3, r14, r4)
            r5.add(r11)
            goto L_0x007d
        L_0x0094:
            r0.w0 = r12
            r0.Z = r7
            java.lang.Object r2 = lp.c(r5, r0)
            if (r2 != r1) goto L_0x009f
            return r1
        L_0x009f:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            zo4 r5 = new zo4
            r7 = 27
            r5.<init>(r7)
            java.util.List r2 = o23.m0(r2, r5)
            kotlinx.coroutines.internal.ContextScope r5 = n1g.a(r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = q23.H(r2, r8)
            r7.<init>(r8)
            java.util.Iterator r2 = r2.iterator()
        L_0x00bd:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x00d4
            java.lang.Object r8 = r2.next()
            a86 r9 = new a86
            r9.<init>(r8, r3, r12)
            zc4 r8 = xs7.d(r5, r3, r9, r4)
            r7.add(r8)
            goto L_0x00bd
        L_0x00d4:
            r0.w0 = r3
            r0.Z = r6
            java.lang.Object r0 = lp.c(r7, r0)
            if (r0 != r1) goto L_0x00df
            return r1
        L_0x00df:
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x00e2:
            a73 r7 = z3d.a()
            d86 r6 = new d86
            r6.<init>(r13, r7, r3)
            zc4 r6 = xs7.d(r2, r3, r6, r4)
            kotlinx.coroutines.internal.ContextScope r2 = n1g.a(r9)
            java.util.ArrayList r12 = new java.util.ArrayList
            int r14 = q23.H(r11, r8)
            r12.<init>(r14)
            java.util.Iterator r11 = r11.iterator()
        L_0x0100:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x0117
            java.lang.Object r14 = r11.next()
            b86 r15 = new b86
            r15.<init>(r14, r3, r13)
            zc4 r14 = xs7.d(r2, r3, r15, r4)
            r12.add(r14)
            goto L_0x0100
        L_0x0117:
            r0.w0 = r7
            r0.X = r6
            boolean r2 = r10.e
            r0.Y = r2
            r0.Z = r4
            java.lang.Object r10 = lp.c(r12, r0)
            if (r10 != r1) goto L_0x0128
            return r1
        L_0x0128:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            zo4 r11 = new zo4
            r12 = 28
            r11.<init>(r12)
            java.util.List r10 = o23.m0(r10, r11)
            kotlinx.coroutines.internal.ContextScope r9 = n1g.a(r9)
            java.util.ArrayList r15 = new java.util.ArrayList
            int r8 = q23.H(r10, r8)
            r15.<init>(r8)
            java.util.Iterator r8 = r10.iterator()
        L_0x0146:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x016a
            java.lang.Object r12 = r8.next()
            c86 r10 = new c86
            r13 = 0
            g86 r14 = r0.y0
            r11 = r10
            r16 = r14
            r14 = r7
            r5 = r15
            r15 = r2
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
            zc4 r10 = xs7.d(r9, r3, r10, r4)
            r5.add(r10)
            r15 = r5
            r5 = 4
            goto L_0x0146
        L_0x016a:
            r5 = r15
            r0.w0 = r3
            r0.X = r3
            r2 = 4
            r0.Z = r2
            java.lang.Object r0 = lp.c(r5, r0)
            if (r0 != r1) goto L_0x0179
            return r1
        L_0x0179:
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x017c:
            hw4 r0 = hw4.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e86.o(java.lang.Object):java.lang.Object");
    }
}
