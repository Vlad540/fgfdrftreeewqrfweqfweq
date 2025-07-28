package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uk9  reason: default package */
public final class uk9 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ vk9 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uk9(vk9 vk9, Continuation continuation) {
        super(2, continuation);
        this.Z = vk9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uk9 uk9 = new uk9(this.Z, continuation);
        uk9.Y = obj;
        return uk9;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059 A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            pu3 r0 = pu3.a
            int r1 = r10.X
            r2 = 2
            r3 = 1
            vk9 r4 = r10.Z
            if (r1 == 0) goto L_0x0028
            if (r1 == r3) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            java.lang.Object r1 = r10.Y
            ou3 r1 = (ou3) r1
            wx3.H(r11)
            r11 = r1
            goto L_0x002f
        L_0x0017:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x001f:
            java.lang.Object r1 = r10.Y
            ou3 r1 = (ou3) r1
            wx3.H(r11)
            r11 = r1
            goto L_0x004c
        L_0x0028:
            wx3.H(r11)
            java.lang.Object r11 = r10.Y
            ou3 r11 = (ou3) r11
        L_0x002f:
            k77[] r1 = defpackage.vk9.i
            boolean r1 = r4.e()
            if (r1 == 0) goto L_0x00bf
            boolean r1 = n1g.A(r11)
            if (r1 == 0) goto L_0x00bf
            long r5 = r4.b()
            r10.Y = r11
            r10.X = r3
            java.lang.Object r1 = defpackage.ek8.r(r5, r10)
            if (r1 != r0) goto L_0x004c
            return r0
        L_0x004c:
            java.util.concurrent.locks.ReentrantLock r1 = r4.f
            zb9 r5 = r4.e
            r1.lock()
            boolean r6 = r5.i()     // Catch:{ all -> 0x0061 }
            if (r6 != 0) goto L_0x0063
            zb9 r6 = lp.h(r5)     // Catch:{ all -> 0x0061 }
            r5.c()     // Catch:{ all -> 0x0061 }
            goto L_0x0064
        L_0x0061:
            r10 = move-exception
            goto L_0x00bb
        L_0x0063:
            r6 = 0
        L_0x0064:
            r1.unlock()
            if (r6 == 0) goto L_0x002f
            boolean r1 = r6.i()
            if (r1 == 0) goto L_0x0070
            goto L_0x002f
        L_0x0070:
            k77[] r1 = defpackage.vk9.i
            r7 = 0
            r1 = r1[r7]
            e3 r7 = r4.g
            java.lang.Object r1 = r7.T0(r4, r1)
            g37 r1 = (g37) r1
            java.util.concurrent.locks.ReentrantLock r7 = r4.f
            if (r1 == 0) goto L_0x00ab
            boolean r1 = r1.isActive()
            if (r1 != 0) goto L_0x00ab
            r7.lock()
            int r1 = zp4.o     // Catch:{ all -> 0x00a6 }
            long r8 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00a6 }
            eq4 r1 = eq4.b     // Catch:{ all -> 0x00a6 }
            long r8 = mt0.Q(r8, r1)     // Catch:{ all -> 0x00a6 }
            r4.h = r8     // Catch:{ all -> 0x00a6 }
            r7.unlock()
            r10.Y = r11
            r10.X = r2
            java.lang.Object r1 = r4.c(r6, r10)
            if (r1 != r0) goto L_0x002f
            return r0
        L_0x00a6:
            r10 = move-exception
            r7.unlock()
            throw r10
        L_0x00ab:
            r7.lock()
            r5.b(r6)     // Catch:{ all -> 0x00b6 }
            r7.unlock()
            goto L_0x002f
        L_0x00b6:
            r10 = move-exception
            r7.unlock()
            throw r10
        L_0x00bb:
            r1.unlock()
            throw r10
        L_0x00bf:
            jue r10 = jue.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk9.o(java.lang.Object):java.lang.Object");
    }
}
