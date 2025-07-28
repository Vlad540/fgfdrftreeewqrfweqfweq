package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bj  reason: default package */
public final class bj extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gj Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bj(gj gjVar, Continuation continuation) {
        super(2, continuation);
        this.Z = gjVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bj bjVar = new bj(this.Z, continuation);
        bjVar.Y = obj;
        return bjVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        r0 = r1.Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r6 = r0.a;
        r7 = new defpackage.dt(8, ((defpackage.lqc) r0.c).g.getLong("user.animojiSetsLastSync", 0), 0, 0);
        r1.Y = null;
        r1.X = 2;
        r0 = ((defpackage.gy9) r6).K(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0095, code lost:
        if (r0 != r2) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0097, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0098, code lost:
        r0 = (defpackage.vt) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            pu3 r2 = pu3.a
            int r0 = r1.X
            jue r3 = jue.a
            r4 = 0
            r5 = 1
            switch(r0) {
                case 0: goto L_0x004a;
                case 1: goto L_0x0042;
                case 2: goto L_0x003a;
                case 3: goto L_0x002f;
                case 4: goto L_0x0023;
                case 5: goto L_0x001a;
                case 6: goto L_0x0015;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0015:
            wx3.H(r17)
            goto L_0x0128
        L_0x001a:
            java.lang.Object r0 = r1.Y
            java.util.List r0 = (java.util.List) r0
            wx3.H(r17)
            goto L_0x00fd
        L_0x0023:
            java.lang.Object r0 = r1.Y
            java.util.List r0 = (java.util.List) r0
            wx3.H(r17)
            r6 = r0
            r0 = r17
            goto L_0x00e1
        L_0x002f:
            java.lang.Object r0 = r1.Y
            vt r0 = (defpackage.vt) r0
            wx3.H(r17)
            r6 = r17
            goto L_0x00cf
        L_0x003a:
            wx3.H(r17)     // Catch:{ all -> 0x0040 }
            r0 = r17
            goto L_0x0098
        L_0x0040:
            r0 = move-exception
            goto L_0x009b
        L_0x0042:
            java.lang.Object r0 = r1.Y
            ou3 r0 = (ou3) r0
            wx3.H(r17)
            goto L_0x006c
        L_0x004a:
            wx3.H(r17)
            java.lang.Object r0 = r1.Y
            ou3 r0 = (ou3) r0
            gj r6 = r1.Z
            e3 r7 = r6.l
            k77[] r8 = defpackage.gj.p
            r8 = r8[r5]
            java.lang.Object r6 = r7.T0(r6, r8)
            g37 r6 = (g37) r6
            if (r6 == 0) goto L_0x006c
            r1.Y = r0
            r1.X = r5
            java.lang.Object r0 = r6.join(r1)
            if (r0 != r2) goto L_0x006c
            return r2
        L_0x006c:
            gj r0 = r1.Z
            pk r6 = r0.a     // Catch:{ all -> 0x0040 }
            dt r15 = new dt     // Catch:{ all -> 0x0040 }
            f03 r0 = r0.c     // Catch:{ all -> 0x0040 }
            lqc r0 = (defpackage.lqc) r0     // Catch:{ all -> 0x0040 }
            java.lang.String r7 = "user.animojiSetsLastSync"
            x97 r0 = r0.g     // Catch:{ all -> 0x0040 }
            r8 = 0
            long r9 = r0.getLong(r7, r8)     // Catch:{ all -> 0x0040 }
            r11 = 0
            r13 = 0
            r8 = 8
            r7 = r15
            r7.<init>(r8, r9, r11, r13)     // Catch:{ all -> 0x0040 }
            r1.Y = r4     // Catch:{ all -> 0x0040 }
            r0 = 2
            r1.X = r0     // Catch:{ all -> 0x0040 }
            gy9 r6 = (defpackage.gy9) r6     // Catch:{ all -> 0x0040 }
            java.lang.Object r0 = r6.K(r15, r1)     // Catch:{ all -> 0x0040 }
            if (r0 != r2) goto L_0x0098
            return r2
        L_0x0098:
            vt r0 = (defpackage.vt) r0     // Catch:{ all -> 0x0040 }
            goto L_0x00a1
        L_0x009b:
            kcc r6 = new kcc
            r6.<init>(r0)
            r0 = r6
        L_0x00a1:
            boolean r6 = r0 instanceof kcc
            if (r6 == 0) goto L_0x00a6
            r0 = r4
        L_0x00a6:
            vt r0 = (defpackage.vt) r0
            if (r0 != 0) goto L_0x00c1
            gj r0 = r1.Z
            java.lang.String r0 = r0.f
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x00b3
            goto L_0x00c0
        L_0x00b3:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x00c0
            tn7 r2 = defpackage.tn7.Z
            java.lang.String r5 = "response is null"
            r1.d(r2, r0, r5, r4)
        L_0x00c0:
            return r3
        L_0x00c1:
            gj r6 = r1.Z
            r1.Y = r0
            r7 = 3
            r1.X = r7
            java.lang.Object r6 = defpackage.gj.b(r6, r0, r1)
            if (r6 != r2) goto L_0x00cf
            return r2
        L_0x00cf:
            java.util.List r6 = (java.util.List) r6
            gj r7 = r1.Z
            java.util.Map r0 = r0.w0
            r1.Y = r6
            r8 = 4
            r1.X = r8
            java.lang.Object r0 = defpackage.gj.a(r7, r0, r1)
            if (r0 != r2) goto L_0x00e1
            return r2
        L_0x00e1:
            java.util.List r0 = (java.util.List) r0
            boolean r7 = r0.isEmpty()
            r7 = r7 ^ r5
            if (r7 == 0) goto L_0x00fe
            gj r7 = r1.Z
            zb9 r0 = lp.V(r0)
            r1.Y = r6
            r8 = 5
            r1.X = r8
            java.lang.Object r0 = r7.e(r0, r1)
            if (r0 != r2) goto L_0x00fc
            return r2
        L_0x00fc:
            r0 = r6
        L_0x00fd:
            r6 = r0
        L_0x00fe:
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x0128
            gj r0 = r1.Z
            zb9 r5 = lp.V(r6)
            r1.Y = r4
            r6 = 6
            r1.X = r6
            pae r6 = r0.d
            n3a r6 = (n3a) r6
            ju3 r6 = r6.a()
            ui r7 = new ui
            r7.<init>(r0, r5, r4)
            java.lang.Object r0 = xs7.U(r6, r7, r1)
            if (r0 != r2) goto L_0x0124
            goto L_0x0125
        L_0x0124:
            r0 = r3
        L_0x0125:
            if (r0 != r2) goto L_0x0128
            return r2
        L_0x0128:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj.o(java.lang.Object):java.lang.Object");
    }
}
