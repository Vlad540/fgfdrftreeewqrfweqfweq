package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: i9d  reason: default package */
public final class i9d extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ t9d Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i9d(t9d t9d, Continuation continuation) {
        super(2, continuation);
        this.Z = t9d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((r5d) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        i9d i9d = new i9d(this.Z, continuation);
        i9d.Y = obj;
        return i9d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: t1d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: t1d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: t1d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: t1d} */
    /* JADX WARNING: type inference failed for: r8v6, types: [sg9, w5d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            pu3 r0 = pu3.a
            int r1 = r8.X
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x001a
            if (r1 == r3) goto L_0x0015
            if (r1 != r2) goto L_0x000d
            goto L_0x0015
        L_0x000d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0015:
            wx3.H(r9)
            goto L_0x00f9
        L_0x001a:
            wx3.H(r9)
            java.lang.Object r9 = r8.Y
            r5d r9 = (defpackage.r5d) r9
            boolean r1 = r9 instanceof defpackage.q5d
            r4 = 0
            t9d r5 = r8.Z
            if (r1 == 0) goto L_0x009a
            q5d r9 = (defpackage.q5d) r9
            t3d r1 = r9.a
            long r1 = r1.a
            java.lang.Long r6 = r5.I0
            if (r6 != 0) goto L_0x0034
            goto L_0x00f9
        L_0x0034:
            long r6 = r6.longValue()
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x00f9
            r5.I0 = r4
            t3d r9 = r9.a
            java.util.List r9 = r9.b
            java.util.Iterator r1 = r9.iterator()
        L_0x0046:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0058
            java.lang.Object r2 = r1.next()
            r6 = r2
            t1d r6 = (defpackage.t1d) r6
            boolean r6 = r6.X
            if (r6 == 0) goto L_0x0046
            r4 = r2
        L_0x0058:
            t1d r4 = (defpackage.t1d) r4
            r5.K0 = r4
            java.util.ArrayList r1 = r5.L0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0067:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x007d
            java.lang.Object r4 = r9.next()
            r6 = r4
            t1d r6 = (defpackage.t1d) r6
            boolean r6 = r6.X
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x0067
            r2.add(r4)
            goto L_0x0067
        L_0x007d:
            vg0 r9 = new vg0
            r4 = 26
            r9.<init>(r4)
            if4 r4 = new if4
            r6 = 2
            r4.<init>(r9, r6)
            java.util.List r9 = o23.m0(r2, r4)
            r1.addAll(r9)
            r8.X = r3
            java.lang.Object r8 = defpackage.t9d.q(r5, r8)
            if (r8 != r0) goto L_0x00f9
            return r0
        L_0x009a:
            boolean r1 = r9 instanceof defpackage.n5d
            if (r1 != 0) goto L_0x0102
            boolean r1 = r9 instanceof defpackage.p5d
            if (r1 == 0) goto L_0x00c3
            p5d r9 = (defpackage.p5d) r9
            r3d r9 = r9.a
            long r3 = r9.a
            java.lang.Long r9 = r5.J0
            if (r9 != 0) goto L_0x00ad
            goto L_0x00f9
        L_0x00ad:
            long r6 = r9.longValue()
            int r9 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x00f9
            java.util.ArrayList r9 = r5.L0
            r9.clear()
            r8.X = r2
            java.lang.Object r8 = defpackage.t9d.q(r5, r8)
            if (r8 != r0) goto L_0x00f9
            return r0
        L_0x00c3:
            boolean r8 = r9 instanceof defpackage.o5d
            if (r8 == 0) goto L_0x00fc
            o5d r9 = (defpackage.o5d) r9
            long r8 = r9.a
            java.lang.Long r0 = r5.J0
            if (r0 != 0) goto L_0x00d0
            goto L_0x00ea
        L_0x00d0:
            long r0 = r0.longValue()
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00ea
            r5.J0 = r4
            w5d r8 = new w5d
            int r9 = defpackage.xaa.x
            hge r0 = new hge
            r0.<init>(r9)
            r8.<init>(r0)
            r5.w(r8)
            goto L_0x00f9
        L_0x00ea:
            java.lang.Long r0 = r5.I0
            if (r0 != 0) goto L_0x00ef
            goto L_0x00f9
        L_0x00ef:
            long r0 = r0.longValue()
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x00f9
            r5.I0 = r4
        L_0x00f9:
            jue r8 = jue.a
            return r8
        L_0x00fc:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L_0x0102:
            n5d r9 = (defpackage.n5d) r9
            r9.getClass()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i9d.o(java.lang.Object):java.lang.Object");
    }
}
