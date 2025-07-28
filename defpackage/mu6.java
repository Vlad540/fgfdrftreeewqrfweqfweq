package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mu6  reason: default package */
public final class mu6 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ bv6 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mu6(bv6 bv6, Continuation continuation) {
        super(2, continuation);
        this.Z = bv6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mu6 mu6 = new mu6(this.Z, continuation);
        mu6.Y = obj;
        return mu6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: ou3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            pu3 r0 = pu3.a
            int r1 = r9.X
            r2 = 2
            r3 = 1
            r4 = 0
            bv6 r5 = r9.Z
            if (r1 == 0) goto L_0x0023
            if (r1 == r3) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            wx3.H(r10)
            goto L_0x0080
        L_0x0013:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x001b:
            java.lang.Object r1 = r9.Y
            ou3 r1 = (ou3) r1
            wx3.H(r10)
            goto L_0x0043
        L_0x0023:
            wx3.H(r10)
            java.lang.Object r10 = r9.Y
            r1 = r10
            ou3 r1 = (ou3) r1
            r9.Y = r1
            r9.X = r3
            pae r10 = r5.c
            n3a r10 = (n3a) r10
            ju3 r10 = r10.b()
            eu6 r3 = new eu6
            r3.<init>(r5, r4)
            java.lang.Object r10 = xs7.U(r10, r3, r9)
            if (r10 != r0) goto L_0x0043
            return r0
        L_0x0043:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r3 = new java.util.ArrayList
            r6 = 10
            int r6 = q23.H(r10, r6)
            r3.<init>(r6)
            java.util.Iterator r10 = r10.iterator()
        L_0x0054:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x0075
            java.lang.Object r6 = r10.next()
            o46 r6 = (defpackage.o46) r6
            pae r7 = r5.c
            n3a r7 = (n3a) r7
            ju3 r7 = r7.b()
            lu6 r8 = new lu6
            r8.<init>(r5, r6, r4)
            zc4 r6 = xs7.d(r1, r7, r8, r2)
            r3.add(r6)
            goto L_0x0054
        L_0x0075:
            r9.Y = r4
            r9.X = r2
            java.lang.Object r10 = lp.c(r3, r9)
            if (r10 != r0) goto L_0x0080
            return r0
        L_0x0080:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            d15 r9 = new d15
            r0 = 2
            r9.<init>(r0, r5)
            java.util.List r9 = o23.m0(r10, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu6.o(java.lang.Object):java.lang.Object");
    }
}
