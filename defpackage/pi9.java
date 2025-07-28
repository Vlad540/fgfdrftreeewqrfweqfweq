package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pi9  reason: default package */
public final class pi9 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ qi9 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pi9(qi9 qi9, Continuation continuation) {
        super(2, continuation);
        this.Z = qi9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pi9 pi9 = new pi9(this.Z, continuation);
        pi9.Y = obj;
        return pi9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: rj5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            pu3 r0 = pu3.a
            int r1 = r6.X
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 == r4) goto L_0x001c
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            goto L_0x0018
        L_0x0010:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0018:
            wx3.H(r7)
            goto L_0x007c
        L_0x001c:
            java.lang.Object r1 = r6.Y
            rj5 r1 = (rj5) r1
            wx3.H(r7)     // Catch:{ all -> 0x0024 }
            goto L_0x0051
        L_0x0024:
            r7 = move-exception
            goto L_0x005a
        L_0x0026:
            wx3.H(r7)
            java.lang.Object r7 = r6.Y
            r1 = r7
            rj5 r1 = (rj5) r1
            qi9 r7 = r6.Z
            y2b r5 = r7.a
            if (r5 != 0) goto L_0x0073
            t97 r7 = r7.b     // Catch:{ all -> 0x0024 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x0024 }
            yy9 r7 = (defpackage.yy9) r7     // Catch:{ all -> 0x0024 }
            r6.Y = r1     // Catch:{ all -> 0x0024 }
            r6.X = r4     // Catch:{ all -> 0x0024 }
            t97 r7 = r7.a     // Catch:{ all -> 0x0024 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x0024 }
            sce r7 = (defpackage.sce) r7     // Catch:{ all -> 0x0024 }
            w2b r2 = defpackage.w2b.o     // Catch:{ all -> 0x0024 }
            java.lang.Object r7 = r7.e(r2, r6)     // Catch:{ all -> 0x0024 }
            if (r7 != r0) goto L_0x0051
            return r0
        L_0x0051:
            x2b r7 = (defpackage.x2b) r7     // Catch:{ all -> 0x0024 }
            java.util.List r7 = r7.c     // Catch:{ all -> 0x0024 }
            y2b r7 = a06.w(r7)     // Catch:{ all -> 0x0024 }
            goto L_0x0060
        L_0x005a:
            kcc r2 = new kcc
            r2.<init>(r7)
            r7 = r2
        L_0x0060:
            boolean r2 = r7 instanceof kcc
            r4 = 0
            if (r2 == 0) goto L_0x0066
            r7 = r4
        L_0x0066:
            y2b r7 = (defpackage.y2b) r7
            r6.Y = r4
            r6.X = r3
            java.lang.Object r6 = r1.a(r7, r6)
            if (r6 != r0) goto L_0x007c
            return r0
        L_0x0073:
            r6.X = r2
            java.lang.Object r6 = r1.a(r5, r6)
            if (r6 != r0) goto L_0x007c
            return r0
        L_0x007c:
            jue r6 = jue.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.o(java.lang.Object):java.lang.Object");
    }
}
