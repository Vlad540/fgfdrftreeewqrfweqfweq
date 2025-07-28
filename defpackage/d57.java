package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: d57  reason: default package */
public final class d57 extends l5e implements i26 {
    public os0 X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ e57 w0;
    public final /* synthetic */ i26 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d57(e57 e57, jjf jjf, Continuation continuation) {
        super(2, continuation);
        this.w0 = e57;
        this.x0 = jjf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        d57 d57 = new d57(this.w0, this.x0, continuation);
        d57.Z = obj;
        return d57;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b A[Catch:{ all -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056 A[Catch:{ all -> 0x0067 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            pu3 r0 = pu3.a
            int r1 = r6.Y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0029
            if (r1 == r3) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            os0 r1 = r6.X
            java.lang.Object r4 = r6.Z
            i26 r4 = (i26) r4
            wx3.H(r7)     // Catch:{ all -> 0x0067 }
        L_0x0015:
            r7 = r4
            goto L_0x003e
        L_0x0017:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x001f:
            os0 r1 = r6.X
            java.lang.Object r4 = r6.Z
            i26 r4 = (i26) r4
            wx3.H(r7)     // Catch:{ all -> 0x0067 }
            goto L_0x004e
        L_0x0029:
            wx3.H(r7)
            java.lang.Object r7 = r6.Z
            ou3 r7 = (ou3) r7
            e57 r7 = r6.w0
            us0 r7 = r7.a     // Catch:{ all -> 0x0067 }
            r7.getClass()     // Catch:{ all -> 0x0067 }
            os0 r1 = new os0     // Catch:{ all -> 0x0067 }
            r1.<init>(r7)     // Catch:{ all -> 0x0067 }
            i26 r7 = r6.x0
        L_0x003e:
            r6.Z = r7     // Catch:{ all -> 0x0067 }
            r6.X = r1     // Catch:{ all -> 0x0067 }
            r6.Y = r3     // Catch:{ all -> 0x0067 }
            java.lang.Object r4 = r1.b(r6)     // Catch:{ all -> 0x0067 }
            if (r4 != r0) goto L_0x004b
            return r0
        L_0x004b:
            r5 = r4
            r4 = r7
            r7 = r5
        L_0x004e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0067 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0067 }
            if (r7 == 0) goto L_0x0067
            java.lang.Object r7 = r1.c()     // Catch:{ all -> 0x0067 }
            r6.Z = r4     // Catch:{ all -> 0x0067 }
            r6.X = r1     // Catch:{ all -> 0x0067 }
            r6.Y = r2     // Catch:{ all -> 0x0067 }
            java.lang.Object r7 = r4.invoke(r7, r6)     // Catch:{ all -> 0x0067 }
            if (r7 != r0) goto L_0x0015
            return r0
        L_0x0067:
            jue r6 = jue.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d57.o(java.lang.Object):java.lang.Object");
    }
}
