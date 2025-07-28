package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o9c  reason: default package */
public final class o9c extends l5e implements i26 {
    public l7c X;
    public l7c Y;
    public int Z;
    public final /* synthetic */ pc7 w0;
    public final /* synthetic */ ob7 x0;
    public final /* synthetic */ ou3 y0;
    public final /* synthetic */ i26 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o9c(pc7 pc7, ob7 ob7, ou3 ou3, i26 i26, Continuation continuation) {
        super(2, continuation);
        this.w0 = pc7;
        this.x0 = ob7;
        this.y0 = ou3;
        this.z0 = i26;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o9c) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new o9c(this.w0, this.x0, this.y0, this.z0, continuation);
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [l7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v1, types: [l7c, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Z
            jue r3 = defpackage.jue.a
            r4 = 0
            pc7 r5 = r0.w0
            r6 = 1
            if (r2 == 0) goto L_0x0024
            if (r2 != r6) goto L_0x001c
            l7c r1 = r0.Y
            l7c r2 = r0.X
            defpackage.wx3.H(r18)     // Catch:{ all -> 0x0019 }
            goto L_0x00a0
        L_0x0019:
            r0 = move-exception
            goto L_0x00b5
        L_0x001c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            defpackage.wx3.H(r18)
            ob7 r2 = r5.d
            ob7 r7 = defpackage.ob7.a
            if (r2 != r7) goto L_0x002e
            return r3
        L_0x002e:
            l7c r2 = new l7c
            r2.<init>()
            l7c r7 = new l7c
            r7.<init>()
            ob7 r8 = r0.x0     // Catch:{ all -> 0x00b3 }
            ou3 r11 = r0.y0     // Catch:{ all -> 0x00b3 }
            i26 r15 = r0.z0     // Catch:{ all -> 0x00b3 }
            r0.X = r2     // Catch:{ all -> 0x00b3 }
            r0.Y = r7     // Catch:{ all -> 0x00b3 }
            r0.Z = r6     // Catch:{ all -> 0x00b3 }
            zv1 r14 = new zv1     // Catch:{ all -> 0x00b3 }
            kotlin.coroutines.Continuation r0 = defpackage.urd.y(r17)     // Catch:{ all -> 0x00b3 }
            r14.<init>(r6, r0)     // Catch:{ all -> 0x00b3 }
            r14.n()     // Catch:{ all -> 0x00b3 }
            lb7 r0 = defpackage.nb7.Companion     // Catch:{ all -> 0x00b3 }
            r0.getClass()     // Catch:{ all -> 0x00b3 }
            int r0 = r8.ordinal()     // Catch:{ all -> 0x00b3 }
            r6 = 4
            r9 = 3
            r10 = 2
            if (r0 == r10) goto L_0x006a
            if (r0 == r9) goto L_0x0067
            if (r0 == r6) goto L_0x0064
            r0 = r4
            goto L_0x006c
        L_0x0064:
            nb7 r0 = defpackage.nb7.ON_RESUME     // Catch:{ all -> 0x00b3 }
            goto L_0x006c
        L_0x0067:
            nb7 r0 = defpackage.nb7.ON_START     // Catch:{ all -> 0x00b3 }
            goto L_0x006c
        L_0x006a:
            nb7 r0 = defpackage.nb7.ON_CREATE     // Catch:{ all -> 0x00b3 }
        L_0x006c:
            int r8 = r8.ordinal()     // Catch:{ all -> 0x00b3 }
            if (r8 == r10) goto L_0x007f
            if (r8 == r9) goto L_0x007c
            if (r8 == r6) goto L_0x0078
            r12 = r4
            goto L_0x0082
        L_0x0078:
            nb7 r6 = defpackage.nb7.ON_PAUSE     // Catch:{ all -> 0x00b3 }
        L_0x007a:
            r12 = r6
            goto L_0x0082
        L_0x007c:
            nb7 r6 = defpackage.nb7.ON_STOP     // Catch:{ all -> 0x00b3 }
            goto L_0x007a
        L_0x007f:
            nb7 r6 = defpackage.nb7.ON_DESTROY     // Catch:{ all -> 0x00b3 }
            goto L_0x007a
        L_0x0082:
            tc9 r6 = defpackage.uc9.a()     // Catch:{ all -> 0x00b3 }
            n9c r13 = new n9c     // Catch:{ all -> 0x00b3 }
            r8 = r13
            r9 = r0
            r10 = r2
            r0 = r13
            r13 = r14
            r16 = r14
            r14 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00b3 }
            r7.a = r0     // Catch:{ all -> 0x00b3 }
            r5.a(r0)     // Catch:{ all -> 0x00b3 }
            java.lang.Object r0 = r16.m()     // Catch:{ all -> 0x00b3 }
            if (r0 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r1 = r7
        L_0x00a0:
            java.lang.Object r0 = r2.a
            g37 r0 = (defpackage.g37) r0
            if (r0 == 0) goto L_0x00a9
            r0.cancel(r4)
        L_0x00a9:
            java.lang.Object r0 = r1.a
            dc7 r0 = (defpackage.dc7) r0
            if (r0 == 0) goto L_0x00b2
            r5.f(r0)
        L_0x00b2:
            return r3
        L_0x00b3:
            r0 = move-exception
            r1 = r7
        L_0x00b5:
            java.lang.Object r2 = r2.a
            g37 r2 = (defpackage.g37) r2
            if (r2 == 0) goto L_0x00be
            r2.cancel(r4)
        L_0x00be:
            java.lang.Object r1 = r1.a
            dc7 r1 = (defpackage.dc7) r1
            if (r1 == 0) goto L_0x00c7
            r5.f(r1)
        L_0x00c7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9c.o(java.lang.Object):java.lang.Object");
    }
}
