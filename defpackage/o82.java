package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o82  reason: default package */
public final class o82 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ b92 Z;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o82(b92 b92, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = b92;
        this.w0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        o82 o82 = new o82(this.Z, this.w0, continuation);
        o82.Y = obj;
        return o82;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: b92} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 3
            pu3 r1 = pu3.a
            int r2 = r8.X
            r3 = 1
            b92 r4 = r8.Z
            r5 = 2
            if (r2 == 0) goto L_0x002a
            if (r2 == r3) goto L_0x0026
            if (r2 == r5) goto L_0x001d
            if (r2 != r0) goto L_0x0015
            wx3.H(r9)
            goto L_0x006b
        L_0x0015:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x001d:
            java.lang.Object r2 = r8.Y
            r4 = r2
            b92 r4 = (defpackage.b92) r4
            wx3.H(r9)
            goto L_0x005d
        L_0x0026:
            wx3.H(r9)     // Catch:{ all -> 0x004c }
            goto L_0x004c
        L_0x002a:
            wx3.H(r9)
            java.lang.Object r9 = r8.Y
            ou3 r9 = (ou3) r9
            long r6 = r8.w0
            java.lang.String r9 = defpackage.b92.O0     // Catch:{ all -> 0x004c }
            udc r9 = r4.e()     // Catch:{ all -> 0x004c }
            r8.X = r3     // Catch:{ all -> 0x004c }
            r9.getClass()     // Catch:{ all -> 0x004c }
            ma5 r2 = new ma5     // Catch:{ all -> 0x004c }
            r2.<init>(r9, r6, r0)     // Catch:{ all -> 0x004c }
            aec r9 = r9.a     // Catch:{ all -> 0x004c }
            java.lang.Object r9 = r1g.h(r9, r2, r8)     // Catch:{ all -> 0x004c }
            if (r9 != r1) goto L_0x004c
            return r1
        L_0x004c:
            java.lang.String r9 = defpackage.b92.O0
            udc r9 = r4.e()
            r8.Y = r4
            r8.X = r5
            java.lang.Object r9 = r9.d(r8)
            if (r9 != r1) goto L_0x005d
            return r1
        L_0x005d:
            java.util.List r9 = (java.util.List) r9
            r2 = 0
            r8.Y = r2
            r8.X = r0
            java.lang.Object r8 = defpackage.b92.j(r4, r9, r3, r8)
            if (r8 != r1) goto L_0x006b
            return r1
        L_0x006b:
            jue r8 = jue.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o82.o(java.lang.Object):java.lang.Object");
    }
}
